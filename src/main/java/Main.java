import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        while (true) {
            System.out.println("enter your name");
            String name = new Scanner(System.in).nextLine();
            System.out.println("Enter your number");
            long number = new Scanner(System.in).nextLong();
            System.out.println("Your number is save");
        }
    }
}