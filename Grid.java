//package sudoku;

public class Grid {
    final int[][] cellValues;
    private final int gridSize;

    public Grid(int[][] cellValues) {
        this.cellValues = cellValues;
        this.gridSize = cellValues.length;
    }

    /**
     * Print the grid to System.out in a simple tabular layout
     */
    public void print() {
        for (int r = 0; r < getGridSize(); r++) {
            for (int d = 0; d < getGridSize(); d++) {
                System.out.print(cellValues[r][d]);
                System.out.print(" ");
            }
            System.out.print("\n");

            if ((r + 1) % (int) Math.sqrt(getGridSize()) == 0) {
                System.out.print("");
            }
        }
    }

    public boolean isValid(Coordinate firstNonEmptyCell, int num) {
        return isValid(firstNonEmptyCell.getRow(), firstNonEmptyCell.getCol(), num);
    }

    /**
     * Verify if a particular cell in the grid is valid.
     */
    public boolean isValid(int row, int col, int num) {
        for (int i = 0; i < getGridSize(); i++) {
            if (cellValues[row][i] == num) {
                return false;
            }
        }

        for (int i = 0; i < cellValues.length; i++) {
            if (cellValues[i][col] == num) {
                return false;
            }
        }

        int boxSize = (int) Math.sqrt(getGridSize());
        int boxRowStart = row - (row % boxSize);
        int boxColStart = col - (col % boxSize);

        for (int i = boxRowStart; i < boxRowStart + boxSize; i++) {
            for (int j = boxColStart; j < boxColStart + boxSize; j++) {
                if (cellValues[i][j] == num) {
                    return false;
                }
            }
        }
        return true;
    }

    public Coordinate getFirstEmptyCell() {
        for (int i = 0; i < getGridSize(); i++) {
            for (int j = 0; j < getGridSize(); j++) {
                if (cellValues[i][j] == 0) {
                    return new Coordinate(i, j);
                }
            }
        }
        return null;
    }

    public void set(Coordinate firstNonEmptyCell, int num) {
        cellValues[firstNonEmptyCell.getRow()][firstNonEmptyCell.getCol()] = num;
    }

    public int getGridSize() {
        return gridSize;
    }
}