
The application is a Sudoku solver, created using a backtracking algorithm. It consists of 4 classes: Generator, Grid, Solver, and Coordinate. 

The generator class takes the input (format given below) and populates a 2d array with the values to form a half filled, unsolved sudoku. It then passes the half filled grid to the Solver class, where the solve function uses a backtracking algorithm to find the values to solve the Sudoku. This solved Sudoku is then passed to the Grid class and calls its print function to print out the solved Sudoku puzzle. 

Inputs:
The program takes command line input of the format:  0 0 1, to represent the value 1 being placed in the space with row number 0 and column number 0
Number of inputs taken is according to the size of the graph- i.e exactly half of the number of total squares in the graph. In the test cases, a 9x9 sudoku is considered and 40 inputs are given to the program.
For an empty space in the input, 0 is used

Test Inputs:

TEST 1
0 0 3
0 1 0
0 2 6
0 3 5
0 4 0
0 5 8
0 6 4
0 7 0
0 8 0
1 0 5
1 1 2
1 2 0
1 3 0
1 4 0
1 5 0
1 6 0
1 7 0
1 8 0
2 0 0
2 1 8
2 2 7 
2 3 0
2 4 0
2 5 0
2 6 0
2 7 3
2 8 1
3 0 0
3 1 0
3 2 3
3 3 0
3 4 1
3 5 0
3 6 0
3 7 8
3 8 0 
4 0 9
4 1 0
4 2 0
4 3 8

TEST 2
0 0 3
0 2 6
0 3 5
0 5 8
0 6 4
1 0 5
1 1 2
2 1 8
2 2 7 
2 7 3
2 8 1
3 2 3
3 4 1
3 7 8
4 0 9
4 3 8
4 4 6 
4 5 3
4 8 5
5 1 5
5 4 9
5 6 6
6 0 1
6 1 3
6 6 2
6 7 5
7 1 0
7 2 0
7 3 0
7 4 0
7 5 0 
7 6 0 
7 7 7
7 8 4
8 0 0
8 1 0
8 2 5
8 3 2
8 5 6
8 6 3

2X2 TEST CASES
0 0 4
0 1 3
1 0 1
1 1 2
1 2 3
2 3 2
3 0 2
3 1 1

0 1 2
0 2 4
1 0 1
1 3 3
2 0 4
2 3 2
3 1 1
3 2 3