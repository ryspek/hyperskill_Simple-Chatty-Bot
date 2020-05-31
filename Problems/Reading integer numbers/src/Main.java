import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner sc = new Scanner(System.in);
        String nums = sc.nextLine();
        String[] s = nums.split(" +");
        for (String str : s) {
            System.out.println(str.trim());
        }
    }
}
