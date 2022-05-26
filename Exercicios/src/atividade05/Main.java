package atividade05;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double slMinimo = 788.00, slUser, salarios;
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o valor do seu salario (utilize . no lugar da ,)");
        slUser = sc.nextDouble();
        salarios = slUser/slMinimo;
        System.out.println("----------------------------------");
        System.out.printf("O USUARIO recebe: %.1f salarios minimos.",salarios);

        sc.close();
    }
}
