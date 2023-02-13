package estruturaDeDecisao;
/*
*
Faça um Programa que leia um número inteiro menor que 1000 e imprima a quantidade de centenas, dezenas e unidades do mesmo.
Observando os termos no plural a colocação do "e", da vírgula entre outros. Exemplo:
* 326 = 3 centenas, 2 dezenas e 6 unidades
*
* */
import java.util.Scanner;
//OBS: AINDA INCOMPLETO
public class UnidadeDezenaCentena {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o número");
        int numero = scan.nextInt();

        if(numero<=9){
            System.out.println("Unidades");
        } else if (numero>=10 && numero<=99) {
            System.out.println("Dezena");
        }else if(numero>=100 && numero<=999){
            System.out.println("Centena");
        }
    }

}
