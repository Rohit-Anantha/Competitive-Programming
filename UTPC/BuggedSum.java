import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

//does not work for larger test cases

public class BuggedSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> leftArrayList = new ArrayList<>();
        ArrayList<Integer> rightArrayList = new ArrayList<>();
        int numbers = scanner.nextInt();
        int buggedSum = scanner.nextInt();
        boolean overallBugged = false;

        for (int i = 0; i < numbers; i++) {
            int current = scanner.nextInt();
            if (!leftArrayList.contains(buggedSum - current)) {
                leftArrayList.add(current);
                continue;
            } else if (!rightArrayList.contains(buggedSum - current)) {
                rightArrayList.add(current);
                continue;
            } else {
                overallBugged = true;
                break;
            }
        }
        if (overallBugged) {
            System.out.println("no");
        } else {
            System.out.println("yes");
        }
    }
}