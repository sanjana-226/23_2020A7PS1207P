//package sudoku;

public class Solver {
    Grid grid;

    public Solver(Grid grid) {
        this.grid = grid;
    }

    public boolean solve() {
        Coordinate cellToFill = grid.getFirstEmptyCell();
        if (cellToFill == null) { // no empty cells found -> all cells filled successfully
            return true;
        }

        for (int val = 1; val <= grid.getGridSize(); val++) {
            if (grid.isValid(cellToFill, val)) {
                grid.set(cellToFill, val);
                if (solve()) { //yay!
                    return true;
                } else { //backtrack
                    grid.set(cellToFill, 0);
                }
            }
        }
        return false;
    }
}