package main;

import java.util.Scanner;

import entities.Retangulo;

public class App {
    

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        double x, y;//lados
        System.out.println("Escolha os lados do retângulo");
        x= sc.nextDouble();
        y= sc.nextDouble();
        
        Retangulo ret = new Retangulo(x, y);
        System.out.println(ret); 


        
    }
}
