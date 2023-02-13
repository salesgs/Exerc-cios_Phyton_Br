package estruturaDeDecisao;

import java.util.Scanner;

/*
* Faça um Programa que peça um número correspondente a um determinado ano e em seguida informe se este ano é ou não bissexto.*/
public class Ano_Bissexto {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o ano");
        int number = scan.nextInt();

        if(number%4==0){
            System.out.println("Esse ano é Bissexto");
        }else{
            System.out.println("Esse ano não é Bissexto");
        }

    }
}
