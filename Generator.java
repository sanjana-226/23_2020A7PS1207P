//package sudoku;

import java.util.*;

public class Generator {
    public static void main(String[] args) {
        int size = 9;
        int[][] cellValues = new int[size][size];
        System.out.println("Enter the data for a half filled, unsolved sudoku. \n" +
                "The inputs are of format 0 0 1, representing row column value \n" +
                "The program takes inputs for half filled- i.e for a 9x9 sudoku, 40 inputs are taken in");

        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < size * size / 2; i++) {
            int a = scan.nextInt();
            int b = scan.nextInt();
            int x = scan.nextInt();
            cellValues[a][b] = x;
        }

        Grid grid = new Grid(cellValues);
        Solver solver = new Solver(grid);

        if (solver.solve()) {
            grid.print();
        } else {
            System.out.println("Failed to solve problem");
        }
    }
}
