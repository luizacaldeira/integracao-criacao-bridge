package org.example;

public class VendaB2C extends TipoVenda {

    public VendaB2C(float valorBase) {
        super(valorBase);
    }

    public float calcularValor() {
        return this.valorBase * (1 + this.segmento.percentualBonus());
    }
}