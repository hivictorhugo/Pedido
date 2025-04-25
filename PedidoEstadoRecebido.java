public class PedidoEstadoRecebido extends PedidoEstado{

    PedidoEstadoRecebido() {};
    private static PedidoEstadoRecebido instance = new PedidoEstadoRecebido();
    public static PedidoEstadoRecebido getInstance() {
        return instance;
    }

    public String getEstado(){
        return "Recebido";
    }

    public boolean pedidoPreparo(Pedido pedido){
        pedido.setEstado(PedidoEstadoPreparo.getInstance());
        return true;
    }

    public boolean pedidoEntregue(Pedido pedido){
        pedido.setEstado(PedidoEstadoEntregue.getInstance());
        return true;
    }
}
