package edu.jsu.mcis; 

import java.awt.Point;
import java.util.Scanner;

public class Main {
    private static final Scanner keyboard = new Scanner(System.in);

    private static Point getUserMove() {
        System.out.print("Enter location: ");
        int row = keyboard.nextInt();
        int col = keyboard.nextInt(); 
        return new Point(row, col);
    }
    
    private static void controlModel(TicTacToeModel model) {

    }
    
    private static void viewModel(TicTacToeModel model) {
        System.out.println("Model: " + "\n" + model + "\n");
    }

	public static void main(String[] args) {
        TicTacToeModel model = new TicTacToeModel();

        viewModel(model);
        controlModel(model);

        String conclusion = "The game is a tie.";
        System.out.println(conclusion);
	}
}














