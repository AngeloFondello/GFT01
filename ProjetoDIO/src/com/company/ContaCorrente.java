package com.company;

public class ContaCorrente extends Conta {


    @Override
    public void imprimirExtrato(double valor) {
        System.out.println("=== Extrato de Conta Corrente ==");
        super.imprimirDados();

    }


}
