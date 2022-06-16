public class Main {

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        double sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum =sum+ 1f/numbers[i];
        }
        double harm;
        System.out.println(sum);
        harm=(numbers.length)/sum;
        System.out.println(harm);

    }
}
