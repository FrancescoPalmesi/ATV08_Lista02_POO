public abstract class Substancia {
    private double pontoDeEbulicao;
    private double pontoDeFusao;

    public abstract void entrarPontoDeEbulicao(double pontoDeEbulicao);
    public abstract void entrarPontoDeFusao(double pontoDeFusao);

    public double getPontoDeEbulicao() {
        return pontoDeEbulicao;
    }

    public void setPontoDeEbulicao(double pontoDeEbulicao) {
        this.pontoDeEbulicao = pontoDeEbulicao;
    }

    public double getPontoDeFusao() {
        return pontoDeFusao;
    }

    public void setPontoDeFusao(double pontoDeFusao) {
        this.pontoDeFusao = pontoDeFusao;
    }
}
