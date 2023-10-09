package com.example.desafio_banco_sintaxe;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        int numeroConta;
        String agencia, nomeCliente;
        double saldo;

        System.out.println("Bem vindo ao banco santander, por favor insira o número da sua conta:");
        numeroConta = teclado.nextInt();
        teclado.nextLine();
        System.out.println("Agora digite o número da sua agência:");
        agencia = teclado.nextLine();
        teclado.nextLine();

        System.out.println("Digite o seu nome completo: ");
        nomeCliente = teclado.nextLine();
        teclado.nextLine();

        System.out.println("Insira o valor do saldo da sua conta: ");
        saldo = teclado.nextDouble();
        teclado.nextLine();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numeroConta + " e seu saldo de R$" + saldo +" já está disponível para saque! :)");


    }
}
