package br.com.fiap.entity;

public final class ContaPoupanca extends Conta{

    @Override
    public double verificarSaldo() {
        return saldo;
    }
}
