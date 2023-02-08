package estruturaDeDecisao;
/*
* Faça um programa que pergunte o preço de três produtos e informe qual produto você deve comprar
*sabendo que a decisão é sempre pelo mais barato.
* */
import java.util.Scanner;

public class Product {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

       int product1,product2,product3;
       System.out.println("Enter product  value");
       product1 = scan.nextInt();

        System.out.println("Enter product value");
        product2 = scan.nextInt();

        System.out.println("Enter product value");
        product3 = scan.nextInt();

        if(product1<product2&&product1<product3){
            System.out.println(" Promotion "+product1);
        }else if(product2 < product1 && product2 < product3){
            System.out.println(" Promotion "+product2);
        }
        else {
            System.out.println(" Promotion "+product3);
        }
    }
}
