import java.util.*;

public class Main {
    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);
        String[] strArr = sc.nextLine().split("\\s+");
        int n = sc.nextInt();
        int[] arr = new int[strArr.length];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(strArr[i]);
        }
        int delta = Math.abs(n - arr[0]);
        for (int i = 1; i < arr.length; i++) {
            delta = Math.min(Math.abs(n - arr[i]), delta);
        }
//        System.out.println(delta);
        Arrays.sort(arr);
        for (int num : arr) {
            if (n + delta == num  || n - delta == num) {
                System.out.print(num + " ");
            }
        }
    }
}
