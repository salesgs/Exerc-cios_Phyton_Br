/*
* Faça um Programa que verifique se uma letra digitada é vogal ou consoante.
* */

package estruturaDeDecisao;

import java.util.Scanner;

public class VerificationLetter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Letter");
        String letter = scan.next();

        switch (letter){
            case "a":
            case "e":
            case "i":
            case "o":
            case "u":
                System.out.print("Vogal");
                break;
            default:
                System.out.print("Consoante");
                break;
        }
    }
}
