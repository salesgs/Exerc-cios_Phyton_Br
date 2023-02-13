package estruturaDeDecisao;

import java.util.Scanner;

/*
* Faça um Programa que peça uma data no formato dd/mm/aaaa e determine se a mesma é uma data válida.
* */
public class DiaMes_Ano {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o dia");
        int dia = scan.nextInt();
        while(dia<0 || dia>=32){
            System.out.println("Dia do mês inválido");
            System.out.println("Digite o dia novamente");
                 dia = scan.nextInt();
                if(dia>=0 && dia<=31){
                    break;
                }
        }
        System.out.println("Digite o mês");
         int mes = scan.nextInt();
         while (mes<0 || mes>12){
             System.out.println("Mês inválido digite novamente");
             mes = scan.nextInt();
              if(mes>=0 && mes<=12){
                  break;
              }
         }
         System.out.println("Informe o ano");
         int ano = scan.nextInt();
          while (ano<1000){
              System.out.println("ano incorreto digite novamente");
              ano = scan.nextInt();
               if(ano>=1000){
                   break;
               }
          }
        System.out.println(dia +" / "+mes+""+" / "+ano);
    }
}
