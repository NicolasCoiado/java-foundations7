public class CategoriaPremio {
    private String nome;
    private int quantidadeTicketsTroca;
    private int quatidadePremiosDisponiveis;

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQuantidadeTicketsTroca() {
        return quantidadeTicketsTroca;
    }
    public void setQuantidadeTicketsTroca(int quantidadeTicketsTroca) {
        this.quantidadeTicketsTroca = quantidadeTicketsTroca;
    }

    public int getQuatidadePremiosDisponiveis() {
        return quatidadePremiosDisponiveis;
    }
    public void setQuatidadePremiosDisponiveis(int quatidadePremiosDisponiveis) {
        this.quatidadePremiosDisponiveis = quatidadePremiosDisponiveis;
    }

    public void retirarPremio(Cartao cartao){
        System.out.println("Quantidade de "+getNome()+" disponíveis:"+getQuatidadePremiosDisponiveis());
        if(getQuatidadePremiosDisponiveis()>=1) {
            cartao.setSaldoAtual(cartao.getSaldoTiquetes() - getQuantidadeTicketsTroca());
            System.out.println("Você retirou "+getNome());
            setQuatidadePremiosDisponiveis(getQuatidadePremiosDisponiveis()-1);
            System.out.println("Nova quantidade de "+getNome()+" disponíveis:"+getQuatidadePremiosDisponiveis());
        }else {
            System.out.println("Não temos esse prêmio em estoque");
        }
    }
}
