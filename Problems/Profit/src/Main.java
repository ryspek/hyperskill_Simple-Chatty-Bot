import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double m = scanner.nextInt();
        double p = scanner.nextInt();
        int k = scanner.nextInt();
        int years = 0;
        while (m < k) {
            years++;
            m = m + m * p / 100;
        }
        System.out.println(years);
    }
}