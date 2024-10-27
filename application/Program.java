package application;

import entities.CurrencyId;
import utilities.CurrencyCalc;
import utilities.ExchangerateHttp;
import utilities.ExchangerateKey;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        ExchangerateHttp eh = new ExchangerateHttp();
        CurrencyCalc cc = new CurrencyCalc();
        CurrencyId ci = new CurrencyId();
        ExchangerateKey key = new ExchangerateKey();
        int option;

        do {
            System.out.println("""
                    ************* CONVERSOR DE MOEDAS **************
                    ** (1) 'Dolar' Estados Unidos =>> 'Real' Brasil
                    ** (2) 'Dolar' Canada         =>> 'Real' Brasil
                    ** (3) 'Libra' Reino Unido    =>> 'Real' Brasil
                    ** (4) 'Euro' União Europeia  =>> 'Real' Brasil
                    ** (5) 'Peso' Argentina       =>> 'Real' Brasil
                    ** (6) 'Ienes' Japão          =>> 'Real' Brasil
                    ** (7) =>> SAIR
                    ************************************************""");
            System.out.print("Escolha a opção (1-7): ");
            String value;

            try {
                option = sc.nextInt();
                if (option == 7) {
                    System.out.println("Programa finalizado...");
                    break;
                }
                value = eh.getCurrencyId(option).conversion_rate();
            } catch (InputMismatchException e) {
                System.out.println("Formato incorreto");
                break;
            } catch (NullPointerException e) {
                break;
            }

            double oneValue = Double.parseDouble(value);
            System.out.println("************************************************");
            System.out.print("Digite o valor em " + ci.getCurrency(option) + " para \nconversão:(Ex.:'10.0 ou 10') = ");
            double twoValue = sc.nextDouble();
            System.out.println("************************************************");
            System.out.printf("Valor em Reais: R$ %.2f\n", cc.resultValue(oneValue, twoValue));
            System.out.println("************************************************");

        } while (option > 0 && option < 7);
    }
}