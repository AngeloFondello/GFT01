package com.company;

public class ContaPoupanca extends Conta {

    @Override
    public void imprimirExtrato(double valor) {
        System.out.println("=== Extrato de Conta Poupanca ==");
        super.imprimirDados();

    }

}
