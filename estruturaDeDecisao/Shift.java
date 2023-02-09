package estruturaDeDecisao;

import java.util.Scanner;

/*
* Faça um Programa que pergunte em que turno você estuda.
* Peça para digitar M-matutino ou V-Vespertino ou N- Noturno.
* Imprima a mensagem "Bom Dia!", "Boa Tarde!" ou "Boa Noite!" ou "Valor Inválido!", conforme o caso.
* */
public class Shift {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("what shift do you study ?");
        String letter1 = scan.next();

        switch (letter1){
            case "m":
            case "M":
                System.out.println("Bom Dia");
                break;
            case "v":
            case "V":
                System.out.println("Boa Tarde");
                break;
            case "N":
            case "n":
                System.out.println("Boa Noite");
                break;
            default:

                System.out.println("Valor inválido");
                break;
        }


    }
}
