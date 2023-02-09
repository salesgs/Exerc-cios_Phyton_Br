package estruturaDeDecisao;

import java.util.Scanner;

/*
* As Organizações Tabajara resolveram dar um aumento de salário aos seus colaboradores
*  lhe contraram para desenvolver o programa que calculará os reajustes
* Faça um programa que recebe o salário de um colaborador e o reajuste segundo o seguinte critério, baseado no salário atual:
* salários até R$ 280,00 (incluindo) : aumento de 20%
salários entre R$ 280,00 e R$ 700,00 : aumento de 15%
salários entre R$ 700,00 e R$ 1500,00 : aumento de 10%
salários de R$ 1500,00 em diante : aumento de 5% Após o aumento ser realizado, informe na tela:
o salário antes do reajuste;
o percentual de aumento aplicado;
o valor do aumento;
o novo salário, após o aumento.
 * */
public class Calculator {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double value,total;

        System.out.println("Informe o salário");
        value = scan.nextDouble();
        if(value<=280){
           System.out.println("Aumento de 20%");
            double calc = value *0.2;
            System.out.println(" Valor de aumento " + calc);
            value = value +calc;
            System.out.println(" Valor total " + value);
        }
       else if(value>=280 && value<=700){
            System.out.println("Aumento de 15%");
            double calc = value *0.15;
            System.out.println(" Valor de aumento " + calc);
            value = value +calc;
            System.out.println(" Valor total " + value);
        }else if(value>=700 && value<=1500){
            System.out.println("Aumento de 15%");
            double calc = value *0.1;
            System.out.println(" Valor de aumento " + calc);
            value = value +calc;
            System.out.println(" Valor total " + value);
        }else {
            System.out.println("Aumento de 15%");
            double calc = value *0.5;
            System.out.println(" Valor de aumento " + calc);
            value = value +calc;
            System.out.println(" Valor total " + value);
        }

    }
}
