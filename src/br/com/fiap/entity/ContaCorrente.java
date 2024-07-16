package br.com.fiap.entity;

import br.com.fiap.exception.SaldoInsuficienteException;

public class ContaCorrente extends Conta {
    protected double saldo;
    public static final int BANCO = 33;

    @Override
    public void sacar (double valor) throws SaldoInsuficienteException{
        if (valor > saldo) {
            throw new SaldoInsuficienteException ();
        }
        saldo = saldo - valor;
    }

    @Override
    public double verificarSaldo() {
        return saldo;
    }
//Gets e Sets
}
