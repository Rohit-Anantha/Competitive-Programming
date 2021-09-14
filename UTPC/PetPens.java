import java.util.Scanner;

public class PetPens {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numberOfRectangles = scan.nextInt();

        double totalArea = 0;
        for (int i = 0; i < numberOfRectangles; i++) {
            int height = scan.nextInt();
            int length = scan.nextInt();

            double radius = pythagoreans(height, length);

            double area = circleArea(radius);

            totalArea += area;
        }

        System.out.println(totalArea);
        scan.close();
    }

    private static double circleArea(double radius) {
        double area = radius * radius;
        area *= Math.PI;

        return area;
    }

    private static double pythagoreans(int height, int length) {

        double halfHeight = height / 2.0;
        double halfLength = length / 2.0;

        double hypotenuse = (halfHeight * halfHeight) + (halfLength * halfLength);
        hypotenuse = Math.sqrt(hypotenuse);

        return hypotenuse;
    }
}
