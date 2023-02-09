package estruturaDeDecisao;

import java.util.Scanner;

/*
* Faça um Programa que leia três difernetes  e mostre-os em ordem decrescente.
* */
public class OrderReverse {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number3;
        System.out.println("Enter number 01");
        int number1 = scan.nextInt();


        System.out.println("Enter number 02");
        int number2 = scan.nextInt();

          while (number1==number2){
              System.out.println("Erro");

              System.out.println("Enter number 02");
               number2 = scan.nextInt();
              if(number2!=number1){
                  break;
              }
          }
         System.out.println("Enter number 03");
          number3 = scan.nextInt();
          while (number3==number1||number3==number2){
              System.out.println("Erro");
              System.out.println("Enter number 03");
              number3 = scan.nextInt();
                if(number3!=number1 && number3!=number2 ){
                    break;
                }
          }
            System.out.println("Order Reverse");

        if((number1>number2 && number1>number3)&&(number2>number3)){
            System.out.print(number1 +" | "+ number2 + " | "+number3);
        } else if((number1>number3 && number1>number2)&&(number3>number2)){
            System.out.print(number1 +" | "+ number3 + " | "+number2);
        } else if((number2>number1 && number2>number3)&&(number1>number3)){
            System.out.print(number2 +" | "+ number1 + " | "+number3);
        } else if((number2>number1 && number2>number3)&&(number1<number3)){
            System.out.print(number2 +" | "+ number3 + " | "+number1);
        }else if((number3>number1 && number2<number3)&&(number1<number2)){
            System.out.print(number3 +" | "+ number2 + " | "+number1);
        }else if((number3>number1 && number2<number3)&&(number1>number2)){
            System.out.print(number3 +" | "+ number1 + " | "+number2);
        }
    }
}
