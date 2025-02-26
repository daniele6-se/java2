//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
class Poligono {
    public double area() {
        return 0;
    }

    public double perimetro() {
        return 0;
    }
}

class Rettangolo extends Poligono {
    private double base;
    private double altezza;

    public Rettangolo(double base, double altezza) {
        this.base = base;
        this.altezza = altezza;
    }

    @Override
    public double area() {
        return base * altezza;
    }

    @Override
    public double perimetro() {
        return 2 * (base + altezza);
    }
}

class Quadrato extends Rettangolo {
    public Quadrato(double lato) {
        super(lato, lato);
    }
}

public class Main {
    public static void main(String[] args) {
        Rettangolo rettangolo = new Rettangolo(5, 10);
        Quadrato quadrato = new Quadrato(4);

        System.out.println("Rettangolo - Area: " + rettangolo.area() + ", Perimetro: " + rettangolo.perimetro());
        System.out.println("Quadrato - Area: " + quadrato.area() + ", Perimetro: " + quadrato.perimetro());
    }
}













