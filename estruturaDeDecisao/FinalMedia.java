package estruturaDeDecisao;

import java.util.Scanner;

/*
* Faça um programa que lê as duas notas parciais obtidas por um aluno numa disciplina ao longo de um semestre,
*  e calcule a sua média. A atribuição de conceitos obedece à tabela abaixo:
* Média de Aproveitamento  Conceito
  Entre 9.0 e 10.0        A
  Entre 7.5 e 9.0         B
  Entre 6.0 e 7.5         C
  Entre 4.0 e 6.0         D
  Entre 4.0 e zero        E
* */
public class FinalMedia {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter note");
        double note1 = scan.nextDouble();


        System.out.println("Enter note");
        double note2 = scan.nextDouble();

        double finall = calculator(note1,note2);
        System.out.println("Value final:" +finall);

        if(finall>=9 && finall<=10){
            System.out.println(" Conceito A  "+" Média " + finall+" Aporvado ");
        } else if(finall>=7.5 && finall<=9){
            System.out.println(" Conceito B "+" Média "  + finall +" Aporvado ");
        } else if(finall>=6 && finall<=7.5){
            System.out.println(" Conceito C "+" Média " + finall+" Aporvado ");
        } else if(finall>=4 && finall<=6){
            System.out.println(" Conceito D "+ " Média " + finall +" Reprovado ");
        } else if (finall>=4 && finall<=0) {
            System.out.println(" Conceito E" + " Média " + finall +" Reprovado ");
        }
    }

    public static double calculator(double note1, double note2){
        return( note1 + note2)/2;
    }
}
