package br.com.targettrust.snack;

import br.com.targettrust.snack.interfaces.IAdquirente;

public class Getnet implements IAdquirente {
    @Override
    public void processarTransacao(String numeroCartao, String ccv, String dataValidade) {
        //TODO implementar transação com a Getnet
        System.out.println("Transacao via Getnet");
    }
}
