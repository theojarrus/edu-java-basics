public class Lesson6 {

    public static void main(String[] args) {
        int[][] matrix1 = new int[3][3];
        int[][] matrix2 = {
                {0, 0, 0},
                {0, 0, 0},
                {0, 0, 0}
                // {0, 0, 0, 0}
        };

        // System.out.println(matrix2[0][1]);

        for (int i = 0; i < matrix2.length; i++) {
            for (int j = 0; j < matrix2[i].length; j++) {
                if (i == j) {
                    matrix2[i][j] = 3;
                } else if (i < j) {
                    matrix2[i][j] = 1;
                } else {
                    matrix2[i][j] = 2;
                }
            }
        }

        for (int[] row : matrix2) {
            System.out.println();
            for (int item : row) {
                System.out.print(item + " ");
            }
        }
    }
}
