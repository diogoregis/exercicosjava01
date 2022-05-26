package atividade02;

public class Main {
    public static void main(String[] args) {
        double media, media2, soma, medias;

        media =  (8 + 9 + 7)/3;
        media2 = (4 + 5 + 6)/3;
        soma = media + media2;
        medias = soma/2;

        System.out.println("Dados os numeros: 8, 9, 7");
        System.out.println("Informe a media:");
        System.out.println("Media = "+ media);
        System.out.println("-------------------------");
        System.out.println("Dados os numeros: 4, 5, 6");
        System.out.println("Informe a media:");
        System.out.println("Media = "+ media2);
        System.out.println("-------------------------");
        System.out.println("A SOMA das medias é: " + soma);
        System.out.println("-------------------------");
        System.out.println("A MEDIA das somas é: " + medias);
    }
}
