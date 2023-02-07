/*
*Faça um programa para a leitura de duas notas parciais de um aluno.
* O programa deve calcular a média alcançada por aluno e apresentar:
* A mensagem "Aprovado", se a média alcançada for maior ou igual a sete;
A mensagem "Reprovado", se a média for menor do que sete;
* A mensagem "Aprovado com Distinção", se a média for igual a dez.
* * */
package estruturaDeDecisao;

import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter note");
        double number1 = scan.nextDouble();

        System.out.println("Enter note");
        double number2 = scan.nextDouble();

        //methods invocation
        double value = calculator(number1,number2);
        //methods invocation
        if(value>=7&&value<=9){
            System.out.println("APROVADO");
        } else if (value<7) {
            System.out.println("REPROVADO");
        }else if (value==10){
            System.out.println("APROVADO COM DISTINÇÃO");
        }

    }
    public static double calculator(double number1,double number2){
        return  (number1 + number2)/2;
    }


}