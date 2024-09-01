import java.util.Scanner;

public class FibonacciChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("*****  - Sequência Fibonacci - *****");
        System.out.println("------------------------------------");
        System.out.print("Digite o número inicial: ");
        int startValue = scanner.nextInt();
        
       
        int numA = 0;
        int numB = 1;
        
        
        boolean isInSequence = false;

        
        System.out.println("Sequência de Fibonacci a partir de " + startValue + ":");
        while (numA <= startValue) {
            
            if (numA == startValue) {
                isInSequence = true;
            }
            
            
            System.out.println(numA);
            
            
            int temp = numA;
            numA = numB;
            numB = temp + numB;
        }

        
        if (isInSequence) {
            System.out.println(startValue + " pertence à sequência de Fibonacci.");
        } else {
            System.out.println(startValue + " não pertence à sequência de Fibonacci.");
        }
        
        scanner.close();
    }
}


