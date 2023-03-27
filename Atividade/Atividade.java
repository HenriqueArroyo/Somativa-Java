package Atividade;

import java.util.Scanner;

/**
 * Atividade1
 */
public class Atividade {
    Scanner sc = new Scanner(System.in);

    public void Exercicio1() {
        System.out.println(
                "Informe Qual Operação Aritmética, Você irá utilizar (Adição = 1, Subtração = 2, Multiplicação = 3, Divisão = 4).");
        int operacao = sc.nextInt();
        System.out.println("Informe o Primeiro Número.");
        double num1 = sc.nextDouble();
        System.out.println("Informe o Segundo Número.");
        double num2 = sc.nextDouble();
        double total;
        if (operacao == 1) {
            total = num1 + num2;
            System.out.println("O resultado soma foi " + total + ".");
        } else if (operacao == 2) {
            total = num1 - num2;
            System.out.println("O resultado da subtração foi de" + total + ". ");
        } else if (operacao == 3) {
            total = num1 * num2;
            System.out.println("O resultado da multiplicação foi de " + total + ".");
        } else if (operacao == 4) {
            total = num1 / num2;
            System.out.println("O resultado da divisão foi " + total + ".");
        } else {
            System.out.println("Operação inválida");
        }
    }

    public void Exercicio2() {
        System.out.println("Informe o Número da Matrícula:");
        int matricula = sc.nextInt();
        double total = matricula % 4;
        if (total == 0) {
            System.out.println("O Estudante se encontra no time Chris.");
        } else if (total == 1) {
            System.out.println("O Estudante se encotra no time Greg.");
        } else if (total == 2) {
            System.out.println("O Estudante se encontra no time Caruso. ");
        } else if (total == 3) {
            System.out.println("O Estudante se encontra no time Jerome");
        } else {
            System.out.println("Matrícula");
        }
    }

    public void Exercicio3() {
        System.out.println("Informe o Peso(Em Quilos) dos Morangos Adquiridos: ");
        double pesoMorangos = sc.nextDouble();
        System.out.println("Informe o Peso(Em Quilos) das Maçãs Adquiridas:");
        double pesoMacas = sc.nextDouble();
        System.out.println("Informe o Peso(Em Quilos) das Bananas Adquiridas:");
        double pesoBananas = sc.nextDouble();

        double precoMorangos = pesoMorangos * 3.50;
        double precoBananas = pesoBananas * 1.80;
        double precoMacas = pesoMacas * 2.30;
        double totalPreco = precoBananas + precoMacas + precoMorangos;
        double totalPeso = pesoBananas + pesoMacas + pesoMorangos;
        double desconto;
        double precoFinal;
        if (totalPreco >= 30 && totalPeso >= 15) {
            desconto = totalPreco / 10;
            precoFinal = totalPreco - desconto;
            System.out.println("O preço total a ser pago foi de " + precoFinal);
        } else if (totalPreco >= 30) {
            desconto = totalPreco / 10;
            precoFinal = totalPreco - desconto;
            System.out.println("O preço total a ser pago foi de " + precoFinal);
        } else if (totalPeso >= 15) {
            desconto = totalPreco / 10;
            precoFinal = totalPreco - desconto;
            System.out.println("O preço total a ser pago foi de " + precoFinal);
        }
        else {System.out.println("O preço total a ser pago foi de "+totalPreco);}
    }
}