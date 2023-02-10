package estruturaDeDecisao;
/*
*
Faça um programa para o cálculo de uma folha de pagamento, sabendo que os descontos são do Imposto de Renda,
* que depende do salário bruto (conforme tabela abaixo) e 3% para o Sindicato e que o FGTS corresponde a 11% do Salário Bruto,
*mas não é descontado (é a empresa que deposita). O Salário Líquido corresponde ao Salário Bruto menos os
* descontos. O programa deverá pedir ao usuário o valor da sua hora e a quantidade de horas trabalhadas no mês.
Desconto do IR:
* Salário Bruto até 900 (inclusive) - isento
Salário Bruto até 1500 (inclusive) - desconto de 5%
Salário Bruto até 2500 (inclusive) - desconto de 10%
* Salário Bruto acima de 2500 - desconto de 20% Imprima na tela as informações, dispostas conforme o exemplo abaixo
*  No exemplo o valor da hora é 5 e a quantidade de hora é 220.
*
*Salário Bruto: (5 * 220)        : R$ 1100,00
        (-) IR (5%)                     : R$   55,00
        (-) INSS ( 10%)                 : R$  110,00
        FGTS (11%)                      : R$  121,00
        Total de descontos              : R$  165,00
        Salário Liquido                 : R$  935,00
* */
import java.util.Scanner;

public class CalculatorWage {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double salaryHour;
        int hours;
        double nSS=0;
        double ir=0;
        double fgts=0.11;

        System.out.println("Enger the salary");
        salaryHour = scan.nextDouble();

        System.out.println("Enger the hours");
        hours = scan.nextInt();

        double valueTotal = calulatorValue(salaryHour,hours);
        System.out.println("Salário Bruto: " + valueTotal);

        double fGts = fGTS(valueTotal,fgts);


        //dynamic conditional
        if(valueTotal>900&&valueTotal<=1500){
            nSS= 0.1;
            ir=0.05;

            double valueTotalINSS = iNSS(valueTotal,nSS);
            System.out.println("INSS: " + valueTotalINSS);

            double valueTotalIr = iRenda(valueTotal,ir);
            System.out.println("IR: " + valueTotalIr);

            System.out.println("FGTS:" +fGts);

            double desconto = descontValue(valueTotalIr,valueTotalINSS);
            System.out.println("Total de descontos: " + desconto);

            double total = finalValue(valueTotal,desconto);
            System.out.println("Salário líquido: " +total);
        }else if(valueTotal>1500 && valueTotal<=2500){
            nSS= 0.1;
            ir=0.10;

            double valueTotalINSS = iNSS(valueTotal,nSS);
            System.out.println("INSS: " + valueTotalINSS);

            double valueTotalIr = iRenda(valueTotal,ir);
            System.out.println("IR: " + valueTotalIr);

            System.out.println("FGTS:" +fGts);

            double desconto = descontValue(valueTotalIr,valueTotalINSS);
            System.out.println("Total de descontos: " + desconto);

            double total = finalValue(valueTotal,desconto);
            System.out.println("Salário líquido: " +total);

        }else if(valueTotal>=2500){
            nSS= 0.1;
            ir=0.2;

            double valueTotalINSS = iNSS(valueTotal,nSS);
            System.out.println("INSS: " + valueTotalINSS);

            double valueTotalIr = iRenda(valueTotal,ir);
            System.out.println("IR: " + valueTotalIr);

            System.out.println("FGTS:" +fGts);

            double desconto = descontValue(valueTotalIr,valueTotalINSS);
            System.out.println("Total de descontos: " + desconto);

            double total = finalValue(valueTotal,desconto);
            System.out.println("Salário líquido: " +total);

        }


    }

    //6 methods
    public static double calulatorValue(double salaryHour,int hours){
        return  salaryHour * hours;

    }

    //method IMPOSTO RENDA
    public static double iRenda(double valueTotal,double porcent){
         return  valueTotal = (valueTotal*porcent);
    }

    public static double iNSS(double valueToal,double nSS){
        return  valueToal =(valueToal*nSS);
    }

    public static double fGTS(double valueTotal, double fgts){
        return  valueTotal =(valueTotal * fgts);

    }

    public static double descontValue(double ir,double valueTotalINSS){
        return  ir + valueTotalINSS;
    }
    public static  double finalValue(double valueTotal, double desconto){
        return  valueTotal - desconto;
    }
}