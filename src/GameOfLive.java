import java.util.Random;

import static java.lang.reflect.Array.set;

public class GameOfLive {

    int M = 30, N = 30;

    public static int[][] createMatrix(int x, int y) {

        int M = 30, N = 30;

        Random rnd = new Random();
        int[][] matrix = new int[x][y];

        // Matrix and 1st Gerenation
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = rnd.nextInt(10);

                if ((matrix[i][j]) % 2 == 0) {
                    System.out.print('*');
                } else {
                    System.out.print(' ');
                }
            }
            System.out.println("");
            nextGeneration(matrix, M, N);
        }

        return matrix;
    }

    public static void nextGeneration ( int createMatrix[][], int M, int N){

        int[][] future = new int[M][N];

        for (int l = 1; l < M; l++) {
            for (int k = 0; k < N; k++) {

                int aliveNeighbours = 0;

                for (int i = -1; i <= 1; i++) {
                    for (int j = -1; j <= 1; j++) {
                        aliveNeighbours += createMatrix[l + i][k + j];
                        aliveNeighbours -= createMatrix[l][k];


                        // Rules of Life

                        if ((createMatrix[l][k] == 1) && (aliveNeighbours < 2)) future[l][k] = 0;
                        else if ((createMatrix[l][k] == 1) && (aliveNeighbours > 3)) future[l][k] = 0;
                        else if ((createMatrix[l][k] == 1) && (aliveNeighbours == 3)) future[l][k] = 1;
                        else future[l][k] = createMatrix[l][k];
                    }
                }

                System.out.print("New Generation");

                for (int i = 0; i < M; i++) {
                    for (int j = 0; j < N; j++) {
                        if (future[i][j] == 0) System.out.print('.');
                        else System.out.print('*');
                    }
                    System.out.println();
                }

            }
        }
    }

    public static void main(String[] args) {

        int[][] addMatrix = createMatrix(10, 10);

    }

}