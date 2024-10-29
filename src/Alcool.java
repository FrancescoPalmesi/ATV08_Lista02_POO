public class Alcool extends Substancia {
    @Override
    public void entrarPontoDeEbulicao(double pontoDeEbulicao) {
        setPontoDeEbulicao(78.4);
    }

    @Override
    public void entrarPontoDeFusao(double pontoDeFusao) {
        setPontoDeFusao(0.0);
    }
}
