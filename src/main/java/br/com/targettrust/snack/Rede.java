package br.com.targettrust.snack;

import br.com.targettrust.snack.interfaces.IAdquirente;

public class Rede implements IAdquirente {

    @Override
    public void processarTransacao(String numeroCartao, String ccv, String dataValidade) {
        //TODO implementar transação com a Rede
        System.out.println("Transacao via Rede");

    }
}
