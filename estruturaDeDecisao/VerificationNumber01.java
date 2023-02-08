package estruturaDeDecisao;

import java.util.Scanner;

/*
* Faça um Programa que leia três números e mostre o maior e o menor deles.
* */
public class VerificationNumber01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number1,number2,number3;

        System.out.println("Enter number 01");
        number1 = scan.nextInt();

        System.out.println("Enter number 02");
        number2 = scan.nextInt();

        System.out.println("Enter number 03");
        number3 = scan.nextInt();

       if((number1>number2 && number1>number3)&&(number2>number3)){
        System.out.print(number1+"|"+number3);
       } else if((number1>number2 && number1>number3)&&(number3>number2)) {
           System.out.print(number1+"|"+number2);
       }else if((number2>number1 && number2>number3)&&(number1<number3)) {
           System.out.print(number2+"|"+number1);
       }
       else if((number2>number1 &&number2>number3 )&&(number1>number3)) {
           System.out.print(number2+"|"+number3);
       }else if((number3>number2 &&number3>number1 )&&(number2>number1)) {
           System.out.print(number3+"|"+number1);
       }else if((number3>number1 &&number3>number2 )&&(number2<number1)) {
           System.out.print(number3+"|"+number2);
       }
        }

    }

