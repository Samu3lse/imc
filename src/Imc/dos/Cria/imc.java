package Imc.dos.Cria;

import java.util.Scanner;

public class imc {
    public static void main(String[] args) {

        Scanner nq = new Scanner(System.in);

        System.out.println("Insira seu peso ");
        double peso = nq.nextDouble();

        System.out.println("Insira sua altura");
        double altura = nq.nextDouble();

        double imc = peso /(altura * altura);
        System.out.println(imc);


        if (imc < 18.5) {
            System.out.println("Magreza : Obesidade grau : 0");
        } else if (imc >= 18.5 && imc <=24.4) {
            System.out.println("Normal : Obesidade grau : 0");

        } else if (imc >= 25.0 && imc <= 29.9) {
            System.out.println(imc+" Sobrepeso : Obesidade grau : I ");

        } else if (imc > 30.0 && imc <= 39.9) {
            System.out.println("Obesidade : Obesidade grau II ");

        } else System.out.println("Obesidade Grave : Obesidade grau III");

    }
}


