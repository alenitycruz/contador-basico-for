package exercicio.revisao.repetica;

/*
Faça um programa que imprima na tela os números de 1 a 20, um abaixo do outro.
Depois modifique o programa para que ele mostre os números um ao lado do outro.
 */

public class Main {
    public static void main(String[] args) {
        for (int i = 1 ; i <= 20 ; i++){
            System.out.println(i);
        }

        for (int y = 1 ; y <= 20 ; y++) {
            System.out.print(y + " ");
        }
    }
}
