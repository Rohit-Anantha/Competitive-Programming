import java.util.Scanner;

public class PetPens2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int petPens = scanner.nextInt();

        long totalSide = 0;
        long maxSide = 0;

        for (int i = 0; i < petPens; i++) {
            int one = scanner.nextInt();
            int two = scanner.nextInt();

            if (one > two) {
                totalSide += two;
                if (one > maxSide) {
                    maxSide = one;
                }
            } else {
                totalSide += one;
                if (two > maxSide) {
                    maxSide = two;
                }
            }
        }
        System.out.println(totalSide > maxSide ? totalSide : maxSide);
    }
}
