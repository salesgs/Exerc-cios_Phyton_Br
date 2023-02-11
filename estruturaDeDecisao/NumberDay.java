package estruturaDeDecisao;

/*
* Faça um Programa que leia um número e exiba o dia correspondente da semana
* (1-Domingo, 2- Segunda, etc.), se digitar outro valor deve aparecer valor inválido.
*
* */

import java.util.Scanner;

public class NumberDay {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numberDay;

        System.out.println("Enter number");
        numberDay = scan.nextInt();

        while(numberDay<0 || numberDay>8){
            System.out.println("Valor inválido");
                System.out.println("Enter number");
                numberDay = scan.nextInt();
                    if(numberDay>0 && numberDay<=8){
                        switch (numberDay){
                            case 1:
                                System.out.println("Domingo");
                                break;
                            case 2:
                                System.out.println("Segunda");
                                break;
                            case 3:
                                System.out.println("Terça-Feira");
                                break;
                            case 4:
                                System.out.println("Quarta-Feira");
                                break;
                            case 5:
                                System.out.println("Quinta-Feira");
                                break;
                            case 6:
                                System.out.println("Sexta-Feira");
                                break;
                            case 7:
                                System.out.println("Sábado");
                                break;

                        }
                            numberDay=11;
                        break;

                    }

        }
        switch (numberDay){
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda");
                break;
            case 3:
                System.out.println("Terça-Feira");
                break;
            case 4:
                System.out.println("Quarta-Feira");
                break;
            case 5:
                System.out.println("Quinta-Feira");
                break;
            case 6:
                System.out.println("Sexta-Feira");
                break;
            case 7:
                System.out.println("Sábado");
                break;
            default:

                break;
        }


    }


}
