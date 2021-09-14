import java.util.Scanner;

public class AbhilashDog {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int minutesLeft = scan.nextInt();
        int totalTasks = scan.nextInt();
        int[] taskTimes = new int[totalTasks];
        for (int i = 0; i < taskTimes.length; i++) {
            taskTimes[i] = scan.nextInt();
        }
        scan.close();
        int counter = 0;
        if (minutesLeft > 0) {
            for (int i = 0; i < taskTimes.length; i++) {

                minutesLeft -= taskTimes[i];

                if (minutesLeft < 0) {
                    break;
                }
                counter++;
            }
        }
        System.out.println(counter);
    }
}