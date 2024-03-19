package br.com.targettrust.snack;

import br.com.targettrust.snack.interfaces.IAdquirente;

import java.util.Scanner;

public class Cartao extends FormaPagamento {

    @Override
    public void realizarPagamento(Float valor) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Informe os dados do seu cartão");
        System.out.println("Número do cartão");
        String numeroCartao = teclado.next();
        System.out.println("CCV");
        String ccv = teclado.next();
        System.out.println("Validade do cartão [MM/YYYY]");
        String validade = teclado.next();

        System.out.println("Qual a maquininha que vc deseja efetuar o pagamento?");
        System.out.println("1 - Getnet");
        System.out.println("2 - Rede");
        int opcaoMaquininha = teclado.nextInt();

        IAdquirente adquirente = null;
        if(opcaoMaquininha == 1) {
            adquirente = new Getnet();
        } else if(opcaoMaquininha == 2) {
            adquirente = new Rede();
        }

        adquirente.processarTransacao(numeroCartao, ccv, validade);

    }
}
