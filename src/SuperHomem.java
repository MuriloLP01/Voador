public class SuperHomem implements Voador{
    private double experiencia;

    public double getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(double experiencia) {
        this.experiencia = experiencia;
    }

    @Override
    public void voar() {
        experiencia += 5;
        System.out.println("Estou voando como um campeão. Minha experiência está em " + experiencia);

    }
}
