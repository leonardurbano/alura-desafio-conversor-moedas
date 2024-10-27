package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("""
                ************* CONVERSOR DE MOEDAS *************
                ** (1) 'Dolar' Estados Unidos =>> 'Real' Brasil
                ** (2) 'Dolar' Canada         =>> 'Real' Brasil
                ** (3) 'Libra' Reino Unido    =>> 'Real' Brasil
                ** (4) 'Euro' União Europeia  =>> 'Real' Brasil
                ** (5) 'Peso' Argentina       =>> 'Real' Brasil
                ** (6) 'Ienes' Japão          =>> 'Real' Brasil
                ** (7) =>> SAIR
                ************************************************""");
        System.out.print("Escolha a opção (1-7): ");
        int i = Integer.parseInt(sc.nextLine());
        System.out.println("************************************************");
        System.out.print("Valor para conversão(Ex.:'10.0 ou 10'): ");
        double value = sc.nextDouble();
        System.out.println("************************************************");
        System.out.printf("Valor sem conversão: R$ %.2f\n", value);
        System.out.println("************************************************");
    }
}
