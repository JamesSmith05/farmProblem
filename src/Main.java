import java.util.Scanner;

public class Main {
    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("animals(" + (chickenLeg() + cowLeg() + pigLeg()) + ")");
    }

    public static int cowLeg() {
        System.out.println("how many cows you got? ");
        return (input.nextInt() * 4);
    }

    public static int pigLeg() {
        System.out.println("how many pigs you got? ");
        return (input.nextInt() * 4);
    }

    public static int chickenLeg() {
        System.out.println("how many chickens you got? ");
        return (input.nextInt() * 2);
    }
}