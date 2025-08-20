
import java.util.Scanner;

public class Soma{
    public static void main (String[] args){
        Scanner sc = new Scanner (System.in);

        System.out.println ("Digite um número");
        double numero1 = sc.nextDouble();

        System.out.println("Digite outro número");
        double numero2 = sc.nextDouble();

        double soma = numero1 + numero2;

        System.out.println("A soma de "+ numero1 + " e " +numero2+" é " +soma);
    }
}