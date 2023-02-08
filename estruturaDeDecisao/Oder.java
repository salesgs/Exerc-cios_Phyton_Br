package estruturaDeDecisao;

import java.util.Scanner;

/*
* Faça um Programa que leia três números e mostre-os em ordem decrescente.
* */
public class Oder {
    public static void main(String[] args) {

        int number1,number2,number3;
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter value 01");
        number1 = scan.nextInt();

        System.out.println("Enter value 02");
        number2 = scan.nextInt();

        System.out.println("Enter value 03");
        number3 = scan.nextInt();

        if((number1>number2 && number1>number3)&&(number2>number3)){
            System.out.print(number1+"|"+number2+"|"+number3);
        }
        else if((number1>number2 && number1>number3)&&(number3>number2)){
            System.out.print(number1+"|"+number3+"|"+number2);
        }
        else if((number2>number3 && number2>number1)&&(number3>number1)){
            System.out.print(number2+"|"+number3+"|"+number1);

        }else if((number2>number3 && number2>number1)&&(number1>number3)){
            System.out.print(number2+"|"+number1+"|"+number3);
        }else if((number3>number1 && number3>number2)&&(number2>number1)){
            System.out.print(number3+"|"+number2+"|"+number1);
        }else if((number3>number2 && number3>number1)&&(number1>number2)){
            System.out.print(number3+"|"+number1+"|"+number2);
        }

    }
}
