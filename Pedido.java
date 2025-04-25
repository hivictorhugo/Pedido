import java.util.Observable;

public class Pedido extends Observable {

    private String nomePedido;

    public Pedido(String nomePedido){
        this.nomePedido = nomePedido;
    }

    public void pedidoEnviado(){
        setChanged();
        notifyObservers();
    }

    @Override
    public String toString(){
        return "Pedido{" +
                "nomePedido=" + nomePedido +
                "}";
    }

}
