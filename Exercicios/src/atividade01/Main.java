package atividade01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ano, mes, dia;

        System.out.println("Digite a quantidade de Ano(s): ");
        ano = sc.nextInt();
        System.out.println("Digite a quantidade de Mes(es): ");
        mes = sc.nextInt();
        System.out.println("Digite a quantidade de Dia(s): ");
        dia = sc.nextInt();

        System.out.println("Foram exatos "+ conta(ano, mes, dia) +" dias.");

        sc.close();
    }
    public static int conta (int ano, int mes, int dia){
        int dias;
        dias = (dia + (mes*30)+(ano*365));
        return dias;
    }
}
