import java.util.Scanner;

public class ParOuImpar{
    public static void main (String[] args){
        Scanner sc = new Scanner (System.in);

        System.out.println("escreva um número");
        int numero = sc.nextInt();

        if (numero % 2 == 0){
            System.out.println("O número é PAR");
        }
        else
            System.out.println("O número é ÍMPAR");
}
