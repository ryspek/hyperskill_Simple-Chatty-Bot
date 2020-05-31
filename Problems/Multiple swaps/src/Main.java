import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner sc = new Scanner(System.in);
        List<String> list = Arrays
                .stream(sc.nextLine().split("\\s+"))
                .collect(Collectors.toList());
        int swapNum = sc.nextInt();
        for (int i = 0; i < swapNum; i++) {
            int left = sc.nextInt();
            int right = sc.nextInt();
            Collections.swap(list, left, right);
        }
        list.forEach(s -> System.out.print(s + " "));
    }
}