import java.util.Scanner;

public class Problem2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        char[] arr = input.toCharArray();
        String magic = "abcdefghijklmnopqrstuvwxyz";

        long counter =  1;

        for (char c : arr) {
            counter *= (1 + c - 97);
        }

        counter %= (Math.pow(10, 9) + 7);

        System.out.println(counter);
        scan.close();
    }
}
