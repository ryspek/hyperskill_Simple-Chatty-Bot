import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int low = scanner.nextInt();
        int high = scanner.nextInt();
        long result = 1;
        for (int i = low; i < high; i++) {
            result *= i;
        }
        System.out.println(result);
    }
}
