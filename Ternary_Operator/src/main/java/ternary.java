import java.util.Scanner;
public class ternary {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = input.nextInt();
        String ageInput = input.nextLine();
        String ter = age >= 18 ? "You are Eligible to vote" : "You are not eligible to vote";
        System.out.println(ter);
    }}

