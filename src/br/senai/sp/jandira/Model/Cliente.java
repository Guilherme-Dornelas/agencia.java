package br.senai.sp.jandira.Model;

import java.util.Scanner;

public class Cliente {

    String Nome, Email, Endereco;
    String dataNascimento;
    long telefone, cpf, rg;

     double dinheiroDisponivel;

    public void CadastroClient() {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Cadastar Cliente!");
        System.out.print("informe seu nome: ");
        Nome = teclado.next();
        System.out.print("informe seu cpf: ");
        cpf = teclado.nextLong();
        System.out.print("informe seu rg: ");
        rg = teclado.nextLong();
        System.out.print("informe a Data de nascimento: ");
        dataNascimento = teclado.next();

        System.out.print("infrome seu email: ");
        Email = teclado.next();
        System.out.print("imforme seu endereco: ");
        Endereco = teclado.next();
        System.out.print("imforme seu telefone: ");
        telefone = teclado.nextLong();
        System.out.println("Quanto tem para gastar?");
        dinheiroDisponivel = teclado.nextDouble();
        teclado.nextLine();

        System.out.print("cadastro finalizado!");
    }
}
