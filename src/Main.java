public class Main {
    public static void main(String[] args) {
        Pato marreco = new Pato();
        marreco.setEnergia(20);

        Aviao boeing = new Aviao();
        boeing.setHorasDeVoo(26);

        SuperHomem clark = new SuperHomem();
        clark.setExperiencia(25);

        TorreDeControle torre = new TorreDeControle();

        torre.adicionarVoador(marreco);
        torre.adicionarVoador(boeing);
        torre.adicionarVoador(clark);

        torre.voemTodos();

    }
}
