package org.ceylan.resul.islands;

public class IslandFinder {

    private boolean canVisit(char[][] grid, int row, int column) {
        int rowCount = grid.length;
        int columnCount = grid[0].length;
        return (row >= 0 && row < rowCount) &&
                (column >= 0 && column < columnCount) &&
                grid[row][column] == '1';
    }

    private void markVisited(char[][] grid, int row, int column) {
        if (canVisit(grid, row - 1, column)) {
            grid[row - 1][column] = 'v';
            markVisited(grid, row - 1, column);
        }
        if (canVisit(grid, row + 1, column)) {
            grid[row + 1][column] = 'v';
            markVisited(grid, row + 1, column);
        }
        if (canVisit(grid, row, column - 1)) {
            grid[row][column - 1] = 'v';
            markVisited(grid, row, column - 1);
        }
        if (canVisit(grid, row, column + 1)) {
            grid[row][column + 1] = 'v';
            markVisited(grid, row, column + 1);
        }
    }

    public int numIslands(char[][] grid) {
        int count = 0;
        int rows = grid.length;
        int columns = grid[0].length;
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < columns; j++)
                if (grid[i][j] == '1') {
                    count++;
                    grid[i][j] = 'v';
                    markVisited(grid, i, j);
                }
        return count;
    }

}
