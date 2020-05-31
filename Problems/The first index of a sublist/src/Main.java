import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner sc = new Scanner(System.in);
        List<String> firstSeq = Arrays
                .stream(sc.nextLine().split("\\s+"))
                .collect(Collectors.toList());
        List<String> secondSeq = Arrays
                .stream(sc.nextLine().split("\\s+"))
                .collect(Collectors.toList());
        int firstOccur = Collections.indexOfSubList(firstSeq, secondSeq);
        int secondOccur = Collections.lastIndexOfSubList(firstSeq, secondSeq);
        System.out.print(firstOccur + " ");
        System.out.print(secondOccur);
    }
}