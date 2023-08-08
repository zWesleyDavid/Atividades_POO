public class Main {
    public static void main(String[] args) {
        Transportadora transporteNautico = new TransporteNautico();
        Transportadora transporteTerrestre = new TransporteTerrestre();

        System.out.println("Transporte Náutico: " + transporteNautico.calculaFrete(180, 150));
        System.out.println("Transporte Terrestre: " + transporteTerrestre.calculaFrete(290, 186));
    }
}