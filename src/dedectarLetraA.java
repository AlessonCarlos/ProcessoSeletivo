
import java.util.Scanner;
public class dedectarLetraA {       

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("**********************************");
        System.out.println(" Quantas vezes aparece a letra A ");
        System.out.println("**********************************");
        System.out.print("Digite uma Frase: ");
        String input = scanner.nextLine();

        
        int count = 0;

     
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);

            
            if (c == 'a' || c == 'A') {
                count++;
            }
        }

        
        if (count > 0) {
            System.out.println("A letra 'a' (maiúscula ou minúscula) aparece " + count + " vez(es) na no texto.");
        } else {
            System.out.println("A letra 'a' (maiúscula ou minúscula) não aparece no texto.");
        }

        scanner.close();
    }
}
    
    
     
    
