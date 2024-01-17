// Cole Sieper
// 1/16/24
// Project 3: Tic Tac Toe

import java.util.Scanner;


public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner in = new Scanner(System.in);
        
        // variables and lists

        int row;
        int col;
        int Turn = 1; 
        

        char[][] board = {
            {'*','*','*'},
            {'*','*','*'},
            {'*','*','*'}
        };

        char[] player = {'O','X'};

        // 0 = Player O || 1 = Player X
        while (true) {
        
        
        char currentPlayer = '*';

            printBoard(board);


            if (Turn % 2 == 1) 
                currentPlayer = player[0];
            else
                currentPlayer = player[1];


            System.out.println();
            System.out.println("Player "+ currentPlayer + "'s Turn");
            System.out.println();

            System.out.print("Enter row (0, 1, or 2): ");
            row = in.nextInt();

            if (row == 0 || row == 1 || row == 2) {
            } else {
            System.out.println("ERROR: INVALID INPUT (Only 0, 1, or 2 allowed)");
            System.out.print("Enter row (0, 1, or 2): ");
            row = in.nextInt();
            }

            System.out.print("Enter column (0, 1, or 2): ");
            col = in.nextInt();

            if (col == 0 || col == 1 || col == 2) {
            } else {
            System.out.println("ERROR: INVALID INPUT (Only 0, 1, or 2 allowed)");
            System.out.print("Enter column (0, 1, or 2): ");
            col = in.nextInt();
            }

            if (board[row][col] == 'X' || board[row][col] == 'O') {

                printBoard(board);

                System.out.println("ERROR: LOCATION FILLED");
                System.out.println("Player "+ currentPlayer + "'s Turn");
                System.out.println();

                System.out.print("Enter row (0, 1, or 2): ");
                row = in.nextInt();
                System.out.print("Enter column (0, 1, or 2): ");
                col = in.nextInt();

            }


            board[row][col] = currentPlayer; 

            printBoard(board);

            // Check win
            if (checkWin(board) == true) {
            System.out.println("PLAYER "+ currentPlayer+" WINS!!!");
             break;
            }


            Turn++;


        }
    }


    public static boolean checkWin (char[][] board) {
        for (int i = 0; i < 3; i++) {
            if (board[i][0] != '*' && board[i][0] == board[i][1] && board[i][1] == board[i][2]) {
                return true; // Check rows
            }
            if (board[0][i] != '*' && board[0][i] == board[1][i] && board[1][i] == board[2][i]) {
                return true; // Check columns
            }
        }
        if (board[0][0] != '*' && board[0][0] == board[1][1] && board[1][1] == board[2][2]) {
            return true; // Check main diagonal
        }
        if (board[0][2] != '*' && board[0][2] == board[1][1] && board[1][1] == board[2][0]) {
            return true; // Check anti-diagonal
        }
        return false;
    }




    public static void clearScreen() {
        System.out.print("\033[H\033[2J");  
        System.out.flush();  
    }




    public static void printBoard(char[][] chart) {

        clearScreen();

        for (int row = 0; row < chart.length; row++) {
            for (int col = 0; col < chart[0].length; col++) {
                System.out.print(chart[row][col]);
                // only print a comma if it's not the last column.
                if (col < chart[0].length - 1) {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }





    }
        
}
