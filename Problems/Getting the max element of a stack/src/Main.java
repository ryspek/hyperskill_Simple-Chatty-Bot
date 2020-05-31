import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        Deque<Integer> mainStack = new ArrayDeque<>();
        Deque<Integer> maxStack = new ArrayDeque<>();
        int commandsNum = scanner.nextInt();
        for (int i = 0; i < commandsNum; i++) {
            String command = scanner.next();
            switch (command) {
                case "push":
                    int num = scanner.nextInt();
                    mainStack.offerLast(num);
                    int max = Math.max(num,  maxStack.size() == 0 ? num : maxStack.peekLast());
                    maxStack.offerLast(max);
                    break;
                case "max":
                    System.out.println(maxStack.peekLast());
                    break;
                case "pop":
                    mainStack.pollLast();
                    maxStack.pollLast();
                    break;
            }
        }
    }
}