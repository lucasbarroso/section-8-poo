package main;

import java.util.Scanner;

import entities.CurrencyConverter;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Qual o nome da moeda?");
        String aux_nome = sc.next();
        
        System.out.println("Qual o imposto, em porcentagem, sobre operação desta moeda?");
        Double aux_iof = sc.nextDouble();
        
        System.out.println("Quanto é o valor equivalente a um dolar desta moeda?");
        double aux_relacionado = sc.nextDouble();

        System.out.println("Qual a quantidade de dolares que gostaria de obter?");
        Double aux_quantidade = sc.nextDouble();

        CurrencyConverter conversao = new CurrencyConverter(aux_nome,aux_iof,aux_relacionado,aux_quantidade);
        
        conversao.calculaValor();
        

    }
}
