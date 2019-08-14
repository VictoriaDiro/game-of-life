import java.util.Random;

public class GameOfLifeTorous {

    public static void main(String[] args) throws InterruptedException {

        int x = 30;
        int y = 30;

        boolean[][] theMatrix = firstGeneration(x, y);

        for (int i = 0; i < 10; i++) {
            theMatrix = nextGeneration(theMatrix);
            Thread.sleep(50);
        }
    }

    static boolean[][] firstGeneration(int x, int y) {

        boolean[][] matrix = new boolean[x][y];

        Random rnd = new Random();

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {

                matrix[i][j] = rnd.nextInt() < 0.5;

                printMatrix(matrix[i][j]);
            }
            System.out.println("");

        }
        return matrix;
    }

    /*
    getElementAt(double[] arr, int index) {

        index = index % arr.length;
        index = index + arr.length; // If index is negative, modulus division gives us negative result, so this makes it positive.
        index = index % arr.length; // In case the previous step made index >= n
        return arr[index];

    }

    Si n es arr.length entonces

    0 <= index < n Será como lo normal.

    n <= index se ajustará a la lista (p arr[n] == arr[0], arr[n+1] == arr[1], etc.)

    index < 0 se ajustará a la lista en la otra dirección (p arr[-1] == arr[n-1], arr[-2] == arr[n-2], etc.)

     */

    static boolean[][] nextGeneration(boolean[][] theMatrix) {

        boolean[][] nextMatrix = new boolean[theMatrix.length][theMatrix[0].length];

        for (int i = 0; i < theMatrix.length; i++) {
            for (int j = 0; j < theMatrix[i].length; j++) {

                int aliveNeighbours = 0;

                for (int iAux = i - 1; iAux <= i + 1; iAux++) {
                    if (iAux > 0 && iAux < theMatrix.length) {

                        for (int jAux = j - 1; jAux <= j + 1; jAux++) {
                            if (jAux > 0 && jAux < theMatrix[i].length) {

                                if (iAux != i || jAux != j) {
                                    if (theMatrix[iAux][jAux]) {
                                        aliveNeighbours += 1;
                                    }
                                }

                                if (theMatrix[i][j]) {
                                    if (aliveNeighbours == 2 || aliveNeighbours == 3) {
                                        nextMatrix[i][j] = true;
                                    } else {
                                        nextMatrix[i][j] = false;
                                    }
                                } else {
                                    if (aliveNeighbours == 3) {
                                        nextMatrix[i][j] = true;
                                    } else {
                                        nextMatrix[i][j] = false;
                                    }
                                }
                            }
                        }
                    }
                }
                printMatrix(nextMatrix[i][j]);
            }
            System.out.println("");
        }
        return nextMatrix;
    }


    static void printMatrix(boolean value) {
        if (value) {
            System.out.print("⬛️");
        } else {
            System.out.print("⬜️");
        }
    }
}
