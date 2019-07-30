import java.util.Random;

import static java.lang.reflect.Array.set;

public class GameOfLive {


    public static int[][] createMatrix(int x, int y) {
        Random rnd = new Random();
        int[][] matrix = new int[x][y];

        // Matrix and 1st Gerenation
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = rnd.nextInt(10);
                System.out.print(matrix[i][j]);
            }
            System.out.println("");
        }
        return matrix;
    }

    public static void nextGeneration(int createMatrix[][], int m, int n) {
        int[][] future = new int[m][n];

        for (int l = 1; l < m; l++) {
            for (int k = 0; k < n; k++) {

                int aliveNeighbours = 0;
                for (int i = 1; i <= 1; i++) {
                    for (int j = 1; j <= 1; j++) {
                        aliveNeighbours += createMatrix[l + i][m + j];
                        aliveNeighbours -= createMatrix[l + i][m + j];

                        if ((createMatrix[l][m] == 1) && (aliveNeighbours < 2)) future[l][m] = 0;
                        else if ((createMatrix[l][m] == 1) && (aliveNeighbours > 3)) future[l][m] = 0;
                        else if ((createMatrix[l][m] == 1) && (aliveNeighbours == 3)) future[l][m] = 1;
                        else future[l][m] = createMatrix[l][m];
                    }
                }
                for (int i = 0; i < m; i++) {
                    for (int j = 0; j < k; j++) {
                        if (future[i][j] == 0) System.out.print('.');
                        else System.out.print('*');
                    }
                    System.out.println();
                }

            }
            System.out.println("");
        }

        public static void main (String[]args){

            int[][] addMatrix = createMatrix(30, 30);

        }
    }
}

