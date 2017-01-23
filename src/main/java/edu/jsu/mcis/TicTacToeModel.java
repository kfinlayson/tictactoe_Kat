package edu.jsu.mcis; 

public class TicTacToeModel { 
    public enum Mark { EMPTY, X, O };
    public enum Result { NONE, XWIN, OWIN, TIE };
    private Mark[][] board;
    private boolean xTurn;
    
    public TicTacToeModel() {
        board = new Mark[3][3];
        for(int i = 0; i < 3; i++) { 
            for(int j = 0; j < 3; j++) {
                board[i][j] = Mark.EMPTY;
            }
        }
        xTurn = true;
    }
    
    public Mark getMark(int row, int col) {
        return board[row][col];
    }
    
    public void setMark(int row, int col) { 
        Mark m = (xTurn)? Mark.X : Mark.O;
        if(board[row][col] == Mark.EMPTY) {
            board[row][col] = m;
            xTurn = !xTurn;
        }
    }

    public Result getResult() { 

        if(board[0][0] == board[0][1] && board[0][1] == board[0][2] && board[0][0] == Mark.X) return Result.XWIN; 

        else if(board[1][0] == board[1][1] && board[1][1] == board[1][2] && board[1][0] == Mark.X) return Result.XWIN;

        else if(board[2][0] == board[2][1] && board[2][1] == board[2][2] && board[2][0] == Mark.X) return Result.XWIN;

        else if(board[0][0] == board[1][0] && board[1][0] == board[2][0] && board[0][0] == Mark.X) return Result.XWIN;

        else if(board[0][1] == board[1][1] && board[1][1] == board[2][1] && board[0][1] == Mark.X) return Result.XWIN;

        else if(board[0][2] == board[1][2] && board[1][2] == board[1][2] && board[2][2] == Mark.X) return Result.XWIN;

        else if(board[0][0] == board[1][1] && board[1][1] == board[2][2] && board[0][0] == Mark.X) return Result.XWIN;

        else if(board[0][2] == board[1][1] && board[1][1] == board[2][0] && board[0][2] == Mark.X) return Result.XWIN;

        else if(board[0][0] == board[0][1] && board[0][1] == board[0][2] && board[0][0] == Mark.O) return Result.OWIN; 

        else if(board[1][0] == board[1][1] && board[1][1] == board[1][2] && board[1][0] == Mark.O) return Result.OWIN;
        
        else if(board[2][0] == board[2][1] && board[2][1] == board[2][2] && board[2][0] == Mark.O) return Result.OWIN;

        else if(board[0][0] == board[1][0] && board[1][0] == board[2][0] && board[0][0] == Mark.O) return Result.OWIN;

        else if(board[0][1] == board[1][1] && board[1][1] == board[2][1] && board[0][1] == Mark.O) return Result.OWIN;
    
        else if(board[0][2] == board[1][2] && board[1][2] == board[1][2] && board[2][2] == Mark.O) return Result.OWIN;

        else if(board[0][0] == board[1][1] && board[1][1] == board[2][2] && board[0][0] == Mark.O) return Result.OWIN;
       
        else if(board[0][2] == board[1][1] && board[1][1] == board[2][0] && board[0][2] == Mark.O) return Result.OWIN;

        for( int row = 0; row < 3; row++ ) {
            for( int col = 0; col < 3; col++ ) {
                if(!(board[row][col] == Mark.X || board[row][col] == Mark.O)) {
                return Result.NONE;
                }
            }
        }

        return Result.TIE;

        }

} 







