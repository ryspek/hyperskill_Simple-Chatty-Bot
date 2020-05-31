import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int height = scanner.nextInt();
        int up = scanner.nextInt();
        int down = scanner.nextInt();
        int count = 0;
        int result = 0;
        while (count + up < height) {
            count += up;
            count -= down;
            result++;
        }
        result++;
        System.out.println(result);
    }
}
