package org.example;

public class SegmentoFactory {

    public static Segmento obterSegmento(String tipo) {
        Class classe = null;
        Object objeto = null;
        try {
            classe = Class.forName("org.example." + tipo);
            objeto = classe.newInstance();
        } catch (Exception ex) {
            throw new IllegalArgumentException("Segmento inexistente");
        }
        if (!(objeto instanceof Segmento)) {
            throw new IllegalArgumentException("Segmento inválido");
        }
        return (Segmento) objeto;
    }
}