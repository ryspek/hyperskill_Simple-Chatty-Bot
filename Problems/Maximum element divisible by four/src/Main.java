import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int result = 0;
        for (int i = 0; i < n; i++) {
            int num = scanner.nextInt();
            if (num % 4 == 0) {
                result = Math.max(result, num);
            }
        }
        System.out.println(result);
    }
}