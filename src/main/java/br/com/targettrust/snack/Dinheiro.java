package br.com.targettrust.snack;

public class Dinheiro extends FormaPagamento {

    @Override
    public void realizarPagamento(Float valor) {

        System.out.println("Inserir o dinheiro na máquina");
        //TODO calcular troco
    }
}
