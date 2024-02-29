public class task1 {
    public static void main(String[] args) {
        
        int[][] array1 = {
            {1, 2, 3, 1},
            {4, 5, 6, 4},
            {7, 8, 9, 7},
            {3, 2, 1, 4}
        };

        int[][] array2 = {
            {9, 8, 7, 1},
            {6, 5, 4, 2},
            {3, 2, 1, 4},
            {4, 5, 2, 1}
        };

        System.out.println("Addition: ");
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array1[0].length; j++) {
                System.out.print(" " + (array1[i][j] + array2[i][j]));
            }
            System.err.println();
        }

        System.out.println();
        System.out.println("Multiplication: ");
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array2[0].length; j++) {
                int sum = 0;
                for (int k = 0; k < array1[0].length; k++) {
                    sum += array1[i][k] * array2[k][j];
                }
                System.out.print(" " + sum);
            }
            System.err.println();
        }

        System.out.println();
        System.out.println("Subtraction: ");
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array1[0].length; j++) {
                System.out.print(" " + (array1[i][j] - array2[i][j]));
            }
            System.err.println();
        }
    }
}
