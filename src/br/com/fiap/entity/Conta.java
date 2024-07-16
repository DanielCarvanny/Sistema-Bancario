package br.com.fiap.entity;

import br.com.fiap.exception.SaldoInsuficienteException;

public abstract class Conta {
    protected double saldo;

    public void sacar(double valor) throws SaldoInsuficienteException{
        if (valor > saldo){
            throw new SaldoInsuficienteException();
        }

        saldo = saldo- valor;
    }

    public abstract double verificarSaldo();
}
