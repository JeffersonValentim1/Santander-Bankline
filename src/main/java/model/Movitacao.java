package model;

import java.time.LocalDateTime;

public class Movitacao {

    private  Integer id;
    private LocalDateTime dataHora; // usado parado representar data e hora contemporaneamente
    private String descricao;
    private  Double valor;
    private  MovimentacaoTpo tipo; // a do enum






    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public LocalDateTime getDataHora() {
        return dataHora;
    }

    public void setDataHora(LocalDateTime dataHora) {
        this.dataHora = dataHora;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public MovimentacaoTpo getTipo() {
        return tipo;
    }

    public void setTipo(MovimentacaoTpo tipo) {
        this.tipo = tipo;
    }
}
