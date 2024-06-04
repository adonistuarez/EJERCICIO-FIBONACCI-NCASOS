import java.util.Scanner;

public class SeriedeFibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number");
        int n = scanner.nextInt();
        int num1 = 0;
        int acum = 0;
        int num2 = 1;
        System.out.print( num1 + "  " );
        System.out.print( num2 + "  " );
        for (int i = 0; i <= n; i++ ) {
            acum = (num1 + num2);
            System.out.print( acum + "  " );
            num1 = num2;
            num2 = acum;

        }

    }
}
