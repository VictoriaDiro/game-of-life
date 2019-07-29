public class GameOfLive {

    public static void main(String[] args) {

        boolean cell;
        int limitInteractions = 500;

        int matrix[][] = new int [10][10];

        int randomNumber = (int)Math.floor(Math.random());

        if (randomNumber%2 == 0) {
            for (int x = 0; x < matrix.length; x++) {
                for (int y = 0; y < matrix.length; y++) {
                    System.out.print(matrix[x][y]);
                   
                }

                System.out.println("");
            }
        }



    }
}
