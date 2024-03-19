package br.com.targettrust.snack.domain;

import br.com.targettrust.snack.enumerations.EnumFileiraStatus;

public class Fileira {

    private Long id;
    private Produto produto;
    private EnumFileiraStatus status;

    public Fileira(Long id, Produto produto, EnumFileiraStatus status) {
        this.id = id;
        this.produto = produto;
        this.status = status;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public EnumFileiraStatus getStatus() {
        return status;
    }

    public void setStatus(EnumFileiraStatus status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Fileira{" +
                "id=" + id +
                ", produto=" + produto +
                ", status=" + status +
                '}';
    }
}
