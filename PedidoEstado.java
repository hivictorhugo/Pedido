
public abstract class PedidoEstado {

    public abstract String getEstado();

    public boolean pedidoRecebido(Pedido pedido){
        return false;
    }

    public boolean pedidoPreparo(Pedido pedido){
        return false;
    }

    public boolean pedidoEntregue(Pedido pedido){
        return false;
    }
}
