package br.com.targettrust.snack.interfaces;

public interface IAdquirente {

    void processarTransacao(String numeroCartao, String ccv, String dataValidade);
}
