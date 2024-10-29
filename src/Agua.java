public class Agua extends Substancia {
    @Override
    public void entrarPontoDeEbulicao(double pontoDeEbulicao) {
        setPontoDeEbulicao(100.0);
    }

    @Override
    public void entrarPontoDeFusao(double pontoDeFusao) {
        setPontoDeFusao(0.0);
    }
}
