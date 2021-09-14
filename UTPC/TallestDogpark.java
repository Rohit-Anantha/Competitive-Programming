import java.util.Scanner;

public class TallestDogpark {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int dogParkLength = scan.nextInt();
        System.out.println((dogParkLength - 1)/2);
    }
}
