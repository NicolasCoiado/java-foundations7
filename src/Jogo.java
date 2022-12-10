import java.util.Random;
public class Jogo {
    Monitor lcd = new Monitor();
    private String nomeJogo;
    private int quantidadeCreditos;
    Random gerador = new Random();

    public String getNomeJogo() {
        return nomeJogo;
    }
    public void setNomeJogo(String nomeJogo) {
        this.nomeJogo = nomeJogo;
    }

    public int getQuantidadeCreditos() {
        return quantidadeCreditos;
    }
    public void setQuantidadeCreditos(int quantidadeCreditos) {
        this.quantidadeCreditos = quantidadeCreditos;
    }

    public void passarCartaoParaJogar(Cartao cartao){
        int saldoDoCartao = cartao.getSaldoAtual();
        if(saldoDoCartao >= quantidadeCreditos){
            cartao.setSaldoAtual(saldoDoCartao-quantidadeCreditos);
            int ticketsGanhos = gerador.nextInt(20);
            int saldoTickets = cartao.getSaldoTiquetes()+ticketsGanhos;
            cartao.setSaldoTiquetes(saldoTickets);
            lcd.jogou(cartao.getNumeroCartao(), ticketsGanhos, cartao.getSaldoTiquetes(), cartao.getSaldoAtual() );
        }else{
            System.out.print("Créditos insuficientes");
        }
    }
}
