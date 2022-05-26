package atividade04;

public class Main {
    public static void main(String[] args) {
        int cod01 = 1, quantidade01 = 10, cod02 = 2, quantidade02 = 15;
        double valor01 = 15.25, valor02 = 98.90, ipi = 18.50, total;

        System.out.println("-> INSERINDO DADOS AUTOMATICOS <-");
        System.out.println(">>> ITEM 01:");
        System.out.println("CODIGO: 01");
        System.out.println("QUANTIDADE: 10");
        System.out.println("VALOR: R$ 15,25");
        System.out.println("---------------------------------");
        System.out.println(">>> ITEM 02:");
        System.out.println("CODIGO: 02");
        System.out.println("QUANTIDADE: 15");
        System.out.println("VALOR: R$ 98,90");
        System.out.println("---------------------------------");

        total = ((valor02*quantidade02)+(valor01*quantidade01))*(ipi/100+1);

        System.out.println("VALOR TOTAL A SER PAGO = R$ " + total);

    }
}
