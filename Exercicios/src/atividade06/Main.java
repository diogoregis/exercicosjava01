package atividade06;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;

        System.out.println("DIGITE SEU NUMERO INTEIRO MAIOR QUE ZERO");
        num = sc.nextInt();
        System.out.println("---------------------------------------");
        System.out.println("ANTECESSOR = "+ (num-1));
        System.out.println("SEU NUMERO = "+ num);
        System.out.println("POSTERIOR  = "+ (num+1));


        sc.close();
    }
}
