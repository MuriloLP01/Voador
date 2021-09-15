public class TorreDeControle {
    public static Voador[] arrrayDeVoadores = new Voador[3];
    private static int posicaoVaga = -1;

    public static void voemTodos() {
        for(int i = 0; i <= posicaoVaga; i++) {
            arrrayDeVoadores[i].voar();
            System.out.println("");
        }
    }

    public static void adicionarVoador(Voador umVoador){
        posicaoVaga++;
        arrrayDeVoadores[posicaoVaga] = umVoador;
    }

}
