public class JavaUtils {
    public static int findMaxElement(int[] array){
        int max = array[0];

        for (int i : array) {
            if(i > max){
                max = i;
            }
        }

        return max;
    }

    public static void main(String[] args) {
        int[] array = {4,6,8,43,6,99,2};

        System.out.println("Max Element: " + JavaUtils.findMaxElement(array));
    }
}
