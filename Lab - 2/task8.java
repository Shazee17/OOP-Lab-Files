public class task8 {
    public static void main(String[] args) {
        for (int i = 1; i < 600; i++) {
            int count = 0;

            //Checking for factors
            for (int j = 1; j <= i / 2; j++) {
                if (i % j == 0) {
                    count++;
                }
            }

            boolean isPrime = (count == 1);

            if (isPrime) {
                System.out.print(i + " ");
            }
        }
    }
}
