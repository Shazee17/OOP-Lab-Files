public class task7 {
    public static void main(String[] args) {
        
        int[] odds = new int[15];
        int index = 0;

        for (int i = 0; i < 30; i++) {
            if (i % 2 != 0) {
                odds[index] = i;
                index++;
            }
        }

        System.out.println("Odd numbers between 1 and 30:");
        for (int i = 0; i < index; i++) {
            System.out.println(odds[i]);
        }
    }
}
