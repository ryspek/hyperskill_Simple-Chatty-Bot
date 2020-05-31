import java.util.*;

public class Main {

    public static void processIterator(String[] array) {
        // write your code here
        List<String> strs = Arrays.asList(array);
        ListIterator<String> iterator = strs.listIterator();
        List<String> result = new ArrayList<>();
        while (iterator.hasNext()) {
            StringBuilder sb = new StringBuilder(iterator.next());
            if (sb.charAt(0) == 'J') {
                sb.deleteCharAt(0);
                result.add(sb.toString());
            }
        }
        ListIterator<String> iterator2 = result.listIterator();
        while (iterator2.hasNext()) {
            iterator2.next();
        }
        while (iterator2.hasPrevious()) {
            System.out.println(iterator2.previous());
        }
    }

    /* Do not change code below */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        processIterator(scanner.nextLine().split(" "));
    }
}