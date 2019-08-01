import java.util.Random;

import static java.lang.reflect.Array.set;

public class GameOfLive {

    public static void main(String[] args) {

        // Declaración de  tablero inicial
        int x = 10;
        int y = 10;

        Random rnd = new Random();

        int[][] matrix = new int[x][y];

        System.out.println("");
        System.out.println("1st Generation");
        System.out.println("==============");

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

            // nextGeneration(matrix, M, N);
            // Thread.sleep(100);
        }
    }

    static void nextGeneration ( int createMatrix[][], int M, int N) {

        int[][] future = new int[M][N];



    }
}


/*

---> MAIN
- tratar de crear todo con booleano
- declarar tablero inicial
- asignarle jugar al juego
- crear juego
- crear nuevo tablero
- comprobar los vecinos
- comprobar numero de vecinos
- devolver celulas vivas


 */



/*

for (int l = 1; l < M; l++) {
  for (int m = 0; m < N -1; m++) {

      int aliveNeighbours = 0;

      for (int i = -1; i <= 1; i++) {
          for (int j = -1; j <= 1; j++) {
              int row = l + i;
              int col = m + i;

              //aliveNeighbours += createMatrix[l + i][m + j];
              //aliveNeighbours -= createMatrix[l][m];

              // RULES OF LIFE

              private static boolean canAccess(createMatrix, col) {

                  if(row !=0 && col != 0) {
                      aliveNeighbours += createMatrix[row][col];
                  }
              }

              if(canAccess(createMatrix, row) && canAccess(createMatrix[row], col) && i != 0 && i != 0){
                  aliveNeighbours += createMatrix[row][col];
              }

              if ((createMatrix[l][m] == 1) && (aliveNeighbours < 2)) future[l][m] = 0;
              else if ((createMatrix[l][m] == 1) && (aliveNeighbours > 3)) future[l][m] = 0;
              else if ((createMatrix[l][m] == 1) && (aliveNeighbours == 3)) future[l][m] = 1;
              else future[l][m] = createMatrix[l][m];
          }
      }

      System.out.println("New Generation");

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

 */