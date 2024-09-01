public class somaValores {

    //Resumo
    /*O código soma todos os inteiros começando de 2 (já que K é incrementado logo no início do loop) até o número imediatamente antes do 12, resultando em 77. Se você deseja somar apenas até o número 11, deve garantir que INDICE seja ajustado conforme necessário.*/
    public static void main(String[] args) {
        
        int INDICE = 12;
        int SOMA = 0;
        int K = 1;

        
        while (K < INDICE) {
            K = K + 1; 
            SOMA = SOMA + K; 
        }

        
        System.out.println(SOMA);
    }
}
