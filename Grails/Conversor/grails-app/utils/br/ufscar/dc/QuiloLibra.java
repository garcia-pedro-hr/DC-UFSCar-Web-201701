package br.ufscar.dc;

public class QuiloLibra {
    private double quilos;
    private double libras;

    public QuiloLibra() {}

    public double getQuilos () {
        return this.quilos;
    }

    public void setQuilos(double quilos) {
        this.quilos = quilos;
        this.libras = quilos * 2.2046;
    }

    public double getLibras() {
        return this.libras;
    }

    public void setLibras(double libras) {
        this.libras = libras;
        this.quilos = libras/2.2046;
    }
}
