import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();
        int x = 0;
        for (int i = 1; i < 1000; i++) {
            x = i;
            int xQuad = x * x;
            int xCube = x * x * x;
            if (a * xCube + b * xQuad + c * x + d == 0) {
                System.out.println(x);
            }
        }
    }
}