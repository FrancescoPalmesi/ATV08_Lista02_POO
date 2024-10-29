public class Main {
    public static void main(String[] args) {
        Substancia agua = new Agua();
        Substancia amonia = new Amonia();
        Substancia alcool = new Alcool();

        agua.entrarPontoDeEbulicao(0);
        agua.entrarPontoDeFusao(0);
        System.out.println("Água - Ponto de Ebulição: " + agua.getPontoDeEbulicao() + " °C, Ponto de Fusão: " + agua.getPontoDeFusao() + " °C");

        amonia.entrarPontoDeEbulicao(0);
        amonia.entrarPontoDeFusao(0);
        System.out.println("Amônia - Ponto de Ebulição: " + amonia.getPontoDeEbulicao() + " °C, Ponto de Fusão: " + amonia.getPontoDeFusao() + " °C");

        alcool.entrarPontoDeEbulicao(0);
        alcool.entrarPontoDeFusao(0);
        System.out.println("Álcool - Ponto de Ebulição: " + alcool.getPontoDeEbulicao() + " °C, Ponto de Fusão: " + alcool.getPontoDeFusao() + " °C");
    }
}
