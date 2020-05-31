import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner sc = new Scanner(System.in);
        char[] chArr = sc.next().toCharArray();
        for (int i = 0; i < chArr.length; i++) {
            if (chArr[i] == 'a') {
                chArr[i] = 'b';
            }
            System.out.print(chArr[i]);
        }
    }
}
