public class SeriesSum {
    public static void main(String[] args) {
        double sum = 0.0; // use double because factorial grows fast and we need fractions

        for (int i = 1; i <= 7; i++) {
            int fact = 1;
            // compute factorial of i
            for (int j = 1; j <= i; j++) {
                fact = fact * j;
            }
            sum = sum + (double) i / fact;
        }

        System.out.println("The sum of the first 7 terms is: " + sum);
    }
}
