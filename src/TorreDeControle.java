public class TorreDeControle {
    public Voador[] arrrayDeVoadores = new Voador[3];
    private int posicaoVaga = -1;

    public void voemTodos() {
        for(int i = 0; i <= posicaoVaga; i++) {
            arrrayDeVoadores[i].voar();
            System.out.println("");
        }
    }

    public void adicionarVoador(Voador umVoador){
        posicaoVaga++;
        arrrayDeVoadores[posicaoVaga] = umVoador;
    }

}
