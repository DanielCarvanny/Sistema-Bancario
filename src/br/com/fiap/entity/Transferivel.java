package br.com.fiap.entity;

public interface Transferivel {

    public boolean realizarDoc(int nrBanco, int nrAgencia, int nrConta, double valor);

    public boolean realizarTed(int nrBanco, int nrAgencia, int nrConta, double valor);

    default boolean realizarTransferenciaInterna (int nrBanco, int nrAgencia, int nrConta, double valor){
        // regra de negócio
        return true;
    }

}
