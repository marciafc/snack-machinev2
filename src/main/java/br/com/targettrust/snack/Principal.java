package br.com.targettrust.snack;

import br.com.targettrust.snack.domain.Produto;


import java.util.List;

public class Principal {

    public static void main(String[] args) {

        FluxoRecarga recarga = new FluxoRecarga();
        try {
            List<Produto> produtoLista =  recarga.executar();

            for(Produto produto : produtoLista) {
                System.out.println(produto.getCodigo() + " " + produto.getDescricao());
            }
            FluxoAtendimento fluxoAtendimento = new FluxoAtendimento();
            fluxoAtendimento.executar(produtoLista);

        } catch (Exception e) {
            System.err.println("Ocorreu um erro inesperado: " + e.getMessage());
        }


    }
}
