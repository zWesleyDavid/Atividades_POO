public class TransporteNautico extends Transportadora {

    @Override
    public double calculaFrete(int altura, int largura){
        return (altura + largura) * 0.1;
    }
}
