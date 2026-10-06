package org.example;

public class VendaB2B extends TipoVenda {

    public VendaB2B(float valorBase) {
        super(valorBase);
    }

    public float calcularValor() {
        return this.valorBase * 0.9f * (1 + this.segmento.percentualBonus());
    }
}