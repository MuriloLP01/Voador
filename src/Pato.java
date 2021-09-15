public class Pato implements Voador{
    private double energia;

    public double getEnergia() {
        return energia;
    }

    public void setEnergia(double energia) {
        this.energia = energia;
    }

    @Override
    public void voar() {
        energia -= 5;
        System.out.println("Estou voando como um pato. Minha energia está em: " + energia);

    }
}
