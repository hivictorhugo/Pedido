import java.util.Observable;

public class Pedido extends Observable {

    private String nomePedido;
    private PedidoEstado estadoAtual;

    public Pedido(String nomePedido) {
        this.nomePedido = nomePedido;
        this.estadoAtual = PedidoEstadoRecebido.getInstance(); // Estado inicial
    }

    public void setEstado(PedidoEstado estado) {
        this.estadoAtual = estado;
        setChanged();
        notifyObservers(); // Notificar observadores sobre a mudança de estado
    }

    public boolean pedidoRecebido() {
        return estadoAtual.pedidoRecebido(this);
    }

    public boolean pedidoPreparo() {
        return estadoAtual.pedidoPreparo(this);
    }

    public boolean pedidoEntregue() {
        return estadoAtual.pedidoEntregue(this);
    }

    public String getEstadoNome() {
        return estadoAtual.getEstado();
    }

    @Override
    public String toString() {
        return "Pedido{" +
                "nomePedido=" + nomePedido +
                "}";
    }
}
