public class TransporteTerrestre extends Transportadora{

    @Override
    public double calculaFrete(int altura, int largura){
        return (altura / largura) * 0.2;
    }

}
