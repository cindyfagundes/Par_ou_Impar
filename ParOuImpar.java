import java.util.Scanner;

public class ParOuImpar { //Programa para decobrir se o numero e par ou impar

    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        
        int numero, resto;
     
        
        System.out.println("DESCUBRA SE O NUMERO E PAR OU IMPAR");
        System.out.print("Digite um numero: ");
        numero = entrada.nextInt();
        
        resto = numero%2;
        
        if (resto == 0){
            System.out.println("Esse numero e par");
        }
        else{
            System.out.println("Esse numero e impar");
        }
        
        
    }
}
