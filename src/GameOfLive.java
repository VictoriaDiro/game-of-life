import java.util.Random;

public class GameOfLive {

    public static void theMatrix(int x, int y) {

        Random rnd = new Random();
        int[][] matrix = new int[x][y];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = rnd.nextInt(10);
                System.out.print(matrix[i][j]);
            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {

        theMatrix(30, 30);

        // boolean cell;
        // int limitInteractions = 500;

        // int matrix[][] = new int [10][10];

        /* int randomNumber = (int)Math.floor(Math.random()*10);


        if (randomNumber%2 == 0) {
            for (int x = 0; x < matrix.length; x++) {
                for (int y = 0; y < matrix.length; y++) {
                    System.out.print(matrix[x][y] = randomNumber);
                }

                System.out.println("");
            }
        } */
    }
}
