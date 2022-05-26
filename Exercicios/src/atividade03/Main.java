package atividade03;

public class Main {
    public static void main(String[] args) {
        double saldo;

        saldo = 1280;

        System.out.println("SALDO INICIAL = R$ " + saldo );
        saldo = saldo*1.01;
        System.out.println("SALDO FINAL COM REAJUSTE DE 1% = R$ " + saldo );
    }
}
