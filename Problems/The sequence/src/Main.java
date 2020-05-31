import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        int inc = 1;
        while (count < n) {
            for (int j = 0; j < inc; j++) {
                if (count < n) {
                    System.out.print(inc + " ");
                }
                count++;
            }
            inc++;
        }
    }
}
