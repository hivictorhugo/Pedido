import java.util.Observable;
import java.util.Observer;

public class Cliente implements Observer {

    private String nome;
    private String ultimaNotificacao;

    public Cliente(String nome) {
        this.nome = nome;
    }

    public String getUltimaNotificacao() {
        return this.ultimaNotificacao;
    }

    public void escolhe(Pedido pedido) {
        pedido.addObserver(this); //
    }

    @Override
    public void update(Observable pedido, Object arg1) {
        if (pedido instanceof Pedido) {
            Pedido p = (Pedido) pedido;
            this.ultimaNotificacao = this.nome + ", o estado do pedido mudou para: " + p.getEstadoNome();
        }
    }
}
