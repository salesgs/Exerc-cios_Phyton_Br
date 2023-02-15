package estruturaDeDecisao;

import java.util.Scanner;

/*
* Faça um Programa que peça os 3 lados de um triângulo
* O programa deverá informar se os valores podem ser um triângulo.
* Indique, caso os lados formem um triângulo, se o mesmo é: equilátero, isósceles ou escaleno.
* */
public class Triangulo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int maior;

        System.out.println("Informe o lado A");
        int a = scan.nextInt();

        System.out.println("Informe o lado B");
        int b = scan.nextInt();

        System.out.println("Informe o lado C");
        int c = scan.nextInt();

        if(a>b && a>c){
           maior =+ a;
           if(b+c>maior){
                System.out.println("É um triângulo");
           }
        }else if(b>a && b >c){
            maior =+ b;
            if(a+c> maior){
                System.out.println("É um triângulo");
            }
        }else{
            maior =+ c;
            if(b+a> maior){
                System.out.println("É um triângulo");
            }
        }

        if((a==b && a==c)&&(b==c)){
            System.out.println(" Equilatero");
        } else if ((a==b || b==c)||(c==b ||c==a)) {
            System.out.println("Isóceles");

        }else {
            System.out.println("Escaleno");
        }

    }

}
