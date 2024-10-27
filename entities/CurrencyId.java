package entities;

public class CurrencyId {

    public String currencySelect(int option) {
        return switch (option) {
            case 1 -> "/pair/USD/BRL/";
            case 2 -> "/pair/CAD/BRL/";
            case 3 -> "/pair/GBP/BRL/";
            case 4 -> "/pair/EUR/BRL/";
            case 5 -> "/pair/ARS/BRL/";
            case 6 -> "/pair/JPY/BRL/";
            default -> "/Opcao+invalida/";
        };
    }

    public String getCurrency(int option){
        return switch (option) {
            case 1 -> "Dolar (Estados Unidos)";
            case 2 -> "Dolar (Canadá)";
            case 3 -> "Libra (Reino Unido)";
            case 4 -> "EURO (União Europeia)";
            case 5 -> "Peso (Argentina)";
            case 6 -> "Ienes (Japão)";
            default -> "/Opcao+invalida/";
        };
    }

}
