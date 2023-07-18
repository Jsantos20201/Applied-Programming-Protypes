import java.util.Scanner;

public class TicTacToe {
    private char[][] board;
    private char currentPlayer;
    private char opponentPlayer;

    public TicTacToe() {
        board = new char[3][3];
        currentPlayer = 'X';
        opponentPlayer = 'O';
        initializeBoard();
    }

    public void initializeBoard() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = '-';
            }
        }
    }

    public void printBoard() {
        System.out.println("   1   2   3");
        System.out.println(" -------------");
        for (int i = 0; i < 3; i++) {
            System.out.print(i + 1 + "| ");
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + " | ");
            }
            System.out.println();
            System.out.println(" -------------");
        }
    }

    public boolean isBoardFull() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == '-') {
                    return false;
                }
            }
        }
        return true;
    }

    public boolean makeMove(int row, int col, char player) {
        if (row >= 0 && row < 3 && col >= 0 && col < 3 && board[row][col] == '-') {
            board[row][col] = player;
            return true;
        }
        return false;
    }

    public boolean checkWin(char player) {
        // Check rows
        for (int i = 0; i < 3; i++) {
            if (board[i][0] == player && board[i][1] == player && board[i][2] == player) {
                return true;
            }
        }

        // Check columns
        for (int i = 0; i < 3; i++) {
            if (board[0][i] == player && board[1][i] == player && board[2][i] == player) {
                return true;
            }
        }

        // Check diagonals
        if (board[0][0] == player && board[1][1] == player && board[2][2] == player) {
            return true;
        }
        if (board[0][2] == player && board[1][1] == player && board[2][0] == player) {
            return true;
        }

        return false;
    }

    public void playAgainstComputer() {
        Scanner scanner = new Scanner(System.in);
        boolean gameOver = false;

        while (!gameOver) {
            if (currentPlayer == 'X') {
                System.out.println("Your turn (X)");
                System.out.print("Enter row (1-3): ");
                int row = scanner.nextInt() - 1; // Adjusting input to 0-based index
                System.out.print("Enter column (1-3): ");
                int col = scanner.nextInt() - 1; // Adjusting input to 0-based index

                if (makeMove(row, col, currentPlayer)) {
                    printBoard();
                    if (checkWin(currentPlayer)) {
                        System.out.println("You win!");
                        gameOver = true;
                    } else if (isBoardFull()) {
                        System.out.println("It's a draw!");
                        gameOver = true;
                    } else {
                        currentPlayer = opponentPlayer;
                    }
                } else {
                    System.out.println("Invalid move. Please try again.");
                }
            } else {
                System.out.println("Computer's turn (O)");
                makeComputerMove();
                printBoard();
                if (checkWin(opponentPlayer)) {
                    System.out.println("Computer wins!");
                    gameOver = true;
                } else if (isBoardFull()) {
                    System.out.println("It's a draw!");
                    gameOver = true;
                } else {
                    currentPlayer = 'X';
                }
            }
        }
        scanner.close();
    }

    public void makeComputerMove() {
        // Simple AI strategy: Randomly choose an empty position for the computer's move

        int row, col;
        do {
            row = (int) (Math.random() * 3);
            col = (int) (Math.random() * 3);
        } while (!makeMove(row, col, opponentPlayer));
    }

    public static void main(String[] args) {
        TicTacToe game = new TicTacToe();
        game.playAgainstComputer();
    }
}
