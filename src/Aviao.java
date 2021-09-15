public class Aviao implements Voador{
    private double horasDeVoo;

    public double getHorasDeVoo() {
        return horasDeVoo;
    }

    public void setHorasDeVoo(double horasDeVoo) {
        this.horasDeVoo = horasDeVoo;
    }

    @Override
    public void voar() {
        horasDeVoo += 13;
        System.out.println("Estou voando como um avião. Meu tempo de voo está em: " + horasDeVoo + " h");

    }
}
