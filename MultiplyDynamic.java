import java.util.Scanner;

public class MultiplyDynamic {
    public static void main(String[] args) {
    
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        float num1 = scanner.nextFloat();

        System.out.print("Enter the second number: ");
        float num2 = scanner.nextFloat();

        float product = num1 * num2;
        System.out.println("The product is: " + product);
        scanner.close();
    }
}
