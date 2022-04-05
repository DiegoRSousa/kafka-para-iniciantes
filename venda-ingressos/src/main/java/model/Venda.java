package model;

import java.math.BigDecimal;

public class Venda {
    private Long operacao;
    private Integer cliente;
    private Integer quantidadeIngressos;
    private BigDecimal valorIngresso;
    private BigDecimal valorTotal;
    private String status;

    public Venda(Long operacao, Integer cliente, Integer quantidadeIngressos,
                 BigDecimal valorIngresso) {
        this.operacao = operacao;
        this.cliente = cliente;
        this.quantidadeIngressos = quantidadeIngressos;
        this.valorIngresso = valorIngresso;
        this.valorTotal = valorIngresso.multiply(BigDecimal.valueOf(quantidadeIngressos));
    }

    public Long getOperacao() {
        return operacao;
    }

    public Integer getCliente() {
        return cliente;
    }

    public Integer getQuantidadeIngressos() {
        return quantidadeIngressos;
    }

    public BigDecimal getValorIngresso() {
        return valorIngresso;
    }

    public BigDecimal getValorTotal() {
        return valorTotal;
    }

    public String getStatus() {
        return status;
    }

    @Override
    public String toString() {
        return "Venda{" +
                "operacao=" + operacao +
                ", cliente=" + cliente +
                ", quantidadeIngressos=" + quantidadeIngressos +
                ", ValorIngresso=" + valorIngresso +
                ", ValorTotal=" + valorTotal +
                ", status='" + status + '\'' +
                '}';
    }
}