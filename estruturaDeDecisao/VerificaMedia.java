package estruturaDeDecisao;

import java.util.Scanner;

/*
* Faça um Programa para leitura de três notas parciais de um aluno.
* O programa deve calcular a média alcançada por aluno e presentar.
* A mensagem "Aprovado", se a média for maior ou igual a 7, com a respectiva média alcançada;
* A mensagem "Reprovado", se a média for menor do que 7, com a respectiva média alcançada;
* A mensagem "Aprovado com Distinção", se a média for igual a 10.
 * */
public class VerificaMedia {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("informe a primeira nota: ");
        double nota1 = scan.nextDouble();


        System.out.println("informe a segunda nota : ");
        double nota2 = scan.nextDouble();

        System.out.println("informe a tereceira nota: ");
        double nota3 = scan.nextDouble();

        double valueFinal = calculator(nota1,nota2,nota3);

         if(valueFinal>=7)System.out.println(" Aprovado ");
         else{
             System.out.println(" Reprovado ");
         }
    }

    public static double calculator(double nota1, double nota2, double nota3){
        return  (nota1 + nota2 +nota3) /3;
    }
}
