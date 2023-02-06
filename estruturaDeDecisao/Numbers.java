package estruturaDeDecisao;

import java.util.Scanner;

/*
* Faça um Programa que peça dois números e imprima o maior deles.
* */
public class Numbers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int  number1,number2;

        System.out.println("enter the first number");
        number1 = scan.nextInt();

        System.out.println("enter the second number");
        number2 = scan.nextInt();

        if(number1>number2){
            System.out.println("bigger is: " + number1);
        }else
            System.out.println("bigger is: " + number2);


    }
}
