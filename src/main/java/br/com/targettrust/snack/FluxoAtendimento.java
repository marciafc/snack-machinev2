package br.com.targettrust.snack;

import br.com.targettrust.snack.domain.Produto;
import br.com.targettrust.snack.exceptions.ProdutoNaoEncontradoException;

import java.util.List;
import java.util.Optional;
import java.util.Scanner;

public class FluxoAtendimento {

    public void executar(List<Produto> produtos) {

        System.out.println("## Fluxo de atendimento:");
        System.out.println("Informe o código do produto");

        Scanner scanner = new Scanner(System.in);
        Long codigo = scanner.nextLong();
        Optional<Produto> produto = produtos.stream()
                .filter(p -> p.getCodigo().equals(codigo))
                .findFirst();

        Produto produtoDesejado = produto.orElseThrow(() ->
                (new ProdutoNaoEncontradoException("Produto não encontrado!")));

        System.out.println("R$ " + produtoDesejado.getPreco());

        System.out.println("Qual será a forma de pagamento?");
        System.out.println("Se for cartão de crédito/débito, informe 1");
        System.out.println("Se for dinheiro, informe 2");
        int opcaoPagamento = scanner.nextInt();

        FormaPagamento formaPagamento = null;
        if(opcaoPagamento == 1) {
            formaPagamento = new Cartao();
        } else if(opcaoPagamento == 2) {
            formaPagamento = new Dinheiro();
        }
        formaPagamento.realizarPagamento(produtoDesejado.getPreco());

    }
}
