package br.com.fiap.entity;

import br.com.fiap.exception.SaldoInsuficienteException;

public class ContaCorrenteEspecial extends ContaCorrente implements Transferivel {
    private double limite;

    @Override
    public void sacar (double valor) throws SaldoInsuficienteException {
        if (valor > saldo + limite) {
            throw new SaldoInsuficienteException();
        }
        saldo = saldo - valor;
    }

    @Override
    public double verificarSaldo() {
        return saldo;
    }

    @Override
    public boolean realizarDoc(int nrBanco, int nrAgencia, int nrConta, double valor) {
        return false;
    }

    @Override
    public boolean realizarTed(int nrBanco, int nrAgencia, int nrConta, double valor) {
        return false;
    }
}
