package estruturaDeDecisao;

/*
* Faça um Programa que peça um valor e mostre na tela se o valor é positivo ou negativo.
* */
import java.util.Scanner;

public class PositeveOrNegative {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter first number");
        int value = scan.nextInt();

        if(value<0){
            System.out.println(value+":  This number is negative " );
        }else
            System.out.println(value+":  This number is positive " );
    }



}
