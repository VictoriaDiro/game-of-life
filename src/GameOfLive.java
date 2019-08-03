import java.util.Random;

public class GameOfLive {

    public static void main(String[] args) throws InterruptedException {

        int x = 10;
        int y = 10;

        boolean[][] theMatrix = firstGeneration(x, y);

        for (int i = 0; i < 500; i++) {
           theMatrix = nextGeneration(theMatrix);
           Thread.sleep(200);
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
            System.out.print('*');
        } else {
            System.out.print(' ');
        }
    }
}
