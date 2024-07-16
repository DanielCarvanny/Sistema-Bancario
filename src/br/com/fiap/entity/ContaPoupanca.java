package br.com.fiap.entity;

public class ContaPoupanca extends Conta{

    @Override
    public double verificarSaldo() {
        return saldo;
    }
}
