import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        while (a == b) {
            b = sc.nextInt();
        }
        boolean increase = a < b;
        boolean result = true;
        while (sc.hasNext()) {
            int c = sc.nextInt();
            if (c == 0) {
                break;
            }
            if (increase) {
                if (c < b) {
                    result = false;
                    break;
                }
            } else {
                if (c > b) {
                    result = false;
                    break;
                }
            }
            b = c;
        }
        System.out.println(result);
    }
}