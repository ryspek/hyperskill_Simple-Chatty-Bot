import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int start = 0;
        int end = scanner.nextInt();
        int num;
        int result = 0;
        while (start < end) {
            num = scanner.nextInt();
            if (num % 4 == 0 && num > result) {
                result = num;
            }
            start++;
        }
        System.out.println(result);
    }
}