/*
*Faça um Programa que leia três números e mostre o maior deles.
* */

package estruturaDeDecisao;

import java.util.Scanner;

public class VerificationNumber {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int number1,number2,number3;

        System.out.println("Enter number");
        number1 = scan.nextInt();

        System.out.println("Enter number");
        number2 = scan.nextInt();

        System.out.println("Enter number");
        number3 = scan.nextInt();

        if(number1>number2 && number1>number3){
            System.out.println(" Bigger value " + number1);
        }else if(number2>number1 && number2>number3){
            System.out.println(" Bigger value " + number2);
        }else{
            System.out.println(" Bigger value " + number3);
        }
    }
}
