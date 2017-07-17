package br.ufscar.dc;

public class CelsiusFahrenheit {
    private double fahrenheit;
    private double celsius;

    public CelsiusFahrenheit() {
    }

    public double getCelsius(){
        return this.celsius;
    }

    public void setCelsius(double celsius) {
        this.celsius = celsius;
        this.fahrenheit = 9/5.0 * celsius + 32;
    }

    public double getFahrenheit(){
        return this.fahrenheit;
    }

    public void setFahrenheit(double fahrnheit) {
        this.fahrenheit = fahrnheit;
        this.celsius = 5/9.0 * fahrnheit - 20;
    }
}
