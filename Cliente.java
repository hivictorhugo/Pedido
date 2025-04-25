import java.util.Observable;
import java.util.Observer;

public class Cliente implements Observer{

    private String nome;
    private String ultimaNotificacao;

    public Cliente(String nome){
        this.nome = nome;
    }

    public  String getUltimaNotificacao(){
        return this.ultimaNotificacao;
    }

    public void escolhe(Pedido pedido){
        pedido.addObserver(this);
    }

    public void update(Observable pedido, Object arg1){
        this.ultimaNotificacao = this.nome + ", Fez um Pedido" + pedido.toString();

    }

}
