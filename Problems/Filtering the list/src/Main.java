import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner sc = new Scanner(System.in);

        List<String> strList = Arrays
                .stream(sc.nextLine().split("\\s+"))
                .collect(Collectors.toList());
        for (int i = strList.size() - 1; i >= 0; i--) {
            if (i % 2 != 0) {
                System.out.print(strList.get(i) + " ");
            }
        }
    }
}