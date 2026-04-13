# AP-CSA-SUDOKU-PROJECT-GENERATOR

STUDENT NAME: LEON ENG

This Java console program generates and prints a solved sudoku puzzle (9 by 9 Sudoku Board). The board follows all Sudoku rules.

This includes:
- Each row contains the numbers 1 through 9 exactly once.
- Each column contains the numbers 1 through 9 exactly once.
- Each 3x3 subgrid contains the numbers 1 through 9 exactly once.

The program uses a 2D array to store the Sudoku board and simple methods to fill, swap rows and columns, and print the board neatly.

HOW TO RUN IT:
1. Compile the program in the console (MAKE SURE YOU NAME THE FILE CORRECTLY TO ITS CORRESPONDING MAIN FILE NAME)
2. Run the program
3. A randomely solved Sudoku board will appear in the console.

HOW IS THE SUDOKU BOARD GENERATED?
- The board is first filled with a based pattern that ensures each row, column, and 3x3 block has numbers 1-9.
- The rows then are swapped within each 3-row block to add various possibilities
- Columns then are swapped within each 3-column block to further randomize the board
- The final board will then be guaranteed to be a valid Sudoku puzzle.
  
