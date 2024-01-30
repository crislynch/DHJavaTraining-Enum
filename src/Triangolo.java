public class Triangolo extends Forma {
    private double base;

    private double altezza;

    public Triangolo(double base, double altezza) {
        this.base = base;
        this.altezza = altezza;
        super.setTipo(TipoForma.Triangolo);
    }

    @Override
    public void calcolaArea() {
        double area = (base * altezza) / 2;
        System.out.println("Triangolo con area di: " + area);
    }
}
