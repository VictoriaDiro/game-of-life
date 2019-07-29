import java.util.Random;

import static java.lang.reflect.Array.set;

public class GameOfLive {


    public static int[][] createMatrix(int x, int y) {
        Random rnd = new Random();
        int[][] matrix = new int[x][y];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = rnd.nextInt(10);
                System.out.print(matrix[i][j]);
            }
            System.out.println("");
        }
        return matrix;
    }

    public static void theMatrix(int x, int y) {

        if(x%2 == 0 || y%2 == 0) {
            // Si es par la celula está viva
        } else {
            // La celula está muerta
        }
    }

    public static void main(String[] args) {

        int[][] addMatrix = createMatrix(30, 30);

        boolean cell;
        int limitInteractions = 500;


    }
}
