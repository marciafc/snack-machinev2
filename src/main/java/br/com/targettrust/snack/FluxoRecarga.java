package br.com.targettrust.snack;

import br.com.targettrust.snack.domain.Produto;

import java.io.*;
import java.util.LinkedList;
import java.util.List;

public class FluxoRecarga {

    public List<Produto> executar() throws Exception {

        String path = System.getProperty("user.dir");
        String caminhoArquivo = path + File.separator + "snack.txt";

        FileReader fileReader = new FileReader(caminhoArquivo);
        BufferedReader br = new BufferedReader(fileReader);

        System.out.println("## Fluxo de recarga");
        System.out.println("Atendente fazendo a recarga da Snack Machine");
        List<Produto> produtos = new LinkedList<>();
        try {
            String linha;
            while ((linha = br.readLine()) != null) {
                //System.out.println(linha);
                //10;Salgadinho Ruffles;2.76;5
                String[] informacoes = linha.split(";");
                Produto produto = new Produto(Long.valueOf(informacoes[0]), informacoes[1]);
                produto.setPreco(Float.valueOf(informacoes[2]));
                produto.setQuantidade(Long.valueOf(informacoes[3]));
                produtos.add(produto);
            }
        } finally {
            br.close();
            fileReader.close();
        }

        return produtos;

    }
}
