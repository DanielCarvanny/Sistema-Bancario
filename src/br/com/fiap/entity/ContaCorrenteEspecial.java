package br.com.fiap.entity;

import br.com.fiap.exception.SaldoInsuficienteException;

public class ContaCorrenteEspecial extends ContaCorrente {
    private double limite;

    @Override
    public void sacar (double valor) throws SaldoInsuficienteException {
        if (valor > saldo + limite) {
            throw new SaldoInsuficienteException();
        }
        saldo = saldo - valor;
    }
}
