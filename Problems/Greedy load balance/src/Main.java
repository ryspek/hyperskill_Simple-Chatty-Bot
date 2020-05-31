import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner sc = new Scanner(System.in);
        int tasksNum = sc.nextInt();
        int count1 = 0;
        int count2 = 0;
        Queue<Integer> queue1 = new LinkedList<>();
        Queue<Integer> queue2 = new LinkedList<>();
        for (int i = 0; i < tasksNum; i++) {
            int id = sc.nextInt();
            int load = sc.nextInt();
            if (count1 <= count2) {
                queue1.offer(id);
                count1 += load;
            } else {
                queue2.offer(id);
                count2 += load;
            }
        }
        for (Integer n : queue1) {
            System.out.print(n + " ");
        }
        System.out.println();
        for (Integer n : queue2) {
            System.out.print(n + " ");
        }
    }
}
