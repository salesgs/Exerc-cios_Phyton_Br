package estruturaDeDecisao;
/*
* Faça um Programa que verifique se uma letra digitada é "F" ou "M"
*Conforme a letra escrever: F - Feminino, M - Masculino, Sexo Inválido
* */
import java.util.Scanner;

public class Verification {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        System.out.println("Enter letter");
        String letter = scan.next();

        if (letter.equalsIgnoreCase("f")) {
            System.out.print("Femenine");
        } else if (letter.equalsIgnoreCase("m")){
            System.out.print("Masculine");
        }else{
            System.out.print( letter + "invallide");
        }
    }
}