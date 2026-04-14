import java.util.*;

public class SudokuGenerator {

    private int[][] board = new int[9][9];
    private Random rand = new Random();

    public static void main(String[] args) {
        SudokuGenerator sg = new SudokuGenerator();
        sg.generateBoard();
        sg.printBoard();
    }

    // this generates the board
    public void generateBoard() {
        fillBoard(0, 0);
    }

    // this is the recursive method 
    private boolean fillBoard(int row, int col) {

        // this moves to next row if column ends
        if (col == 9) {
            row++;
            col = 0;
        }

        // when the board is finished entirely
        if (row == 9) {
            return true;
        }

        // this allows shuffling from numbers 1-9
        ArrayList<Integer> nums = new ArrayList<>();
        for (int i = 1; i <= 9; i++) {
            nums.add(i);
        }
        Collections.shuffle(nums);

        // this checks each number
        for (int num : nums) {
            if (isValid(row, col, num)) {
                board[row][col] = num;

                if (fillBoard(row, col + 1)) {
                    return true;
                }
                board[row][col] = 0;
            }
        }
        return false;
    }

    // this determines if a number is valid
    private boolean isValid(int row, int col, int num) {

        // checks for rows
        for (int i = 0; i < 9; i++) {
            if (board[row][i] == num) 
            return false;
        }

        // checks for columns
        for (int i = 0; i < 9; i++) {
            if (board[i][col] == num) 
            return false;
        }

        // checks for 3 by 3 boxes
        int startRow = row - row % 3;
        int startCol = col - col % 3;

        for (int r = startRow; r < startRow + 3; r++) {
            for (int c = startCol; c < startCol + 3; c++) {
                if (board[r][c] == num) return false;
            }
        }

        return true;
    }
    
    // this is used for the design of the Sudoku board
    public void printBoard() {
        for (int row = 0; row < 9; row++) {
            if (row % 3 == 0 && row != 0) {
                System.out.println("---------------------");
            }
    
            for (int col = 0; col < 9; col++) {
                if (col % 3 == 0 && col != 0) {
                    System.out.print("| ");
                }
                System.out.print(board[row][col] + " ");
            }
            System.out.println();
        }
    }
}