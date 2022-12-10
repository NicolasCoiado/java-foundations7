public class Monitor {
    public void iniciar(){
        System.out.println("INSIRA UM CARTÃO PARA INICIAR...");
        System.out.println("* Digite 2 para confirmar inserção de 2 cartões.");
    }
    public void iniciado(){
        System.out.println("---------------------------");
        System.out.println("Cartões inseridos!");
        System.out.println("---------------------------");
    }
    public void opcoes(){
        System.out.println("---------------------------");
        System.out.println("DIGITE O (N°) DA OPÇÃO QUE DESEJA:");
        System.out.println("    (1) Jogar");
        System.out.println("    (2) Retirar prêmio");
        System.out.println("    (3) Consultar cartões");
        System.out.println("    (4) Carregar cartão");
        System.out.println("    (5) Transferir saldo");
        System.out.println("    (0) Sair");
    }

    public void apresentar(Cartao cartao1, Cartao cartao2){
        System.out.println("CARTÃO 1:");
        System.out.println("    Número do cartão:"+cartao1.getNumeroCartao());
        System.out.println("    Crédito disponível:"+cartao1.getSaldoAtual());
        System.out.println("    Saldo de tickets:"+cartao1.getSaldoTiquetes());
        System.out.println("CARTÃO 2:");
        System.out.println("    Número do cartão:"+cartao2.getNumeroCartao());
        System.out.println("    Crédito disponível:"+cartao2.getSaldoAtual());
        System.out.println("    Saldo de tickets:"+cartao2.getSaldoTiquetes());
    }

    public void jogos(){
        System.out.println("---------------------------");
        System.out.println("DIGITE O (N°) DO JOGO QUE DESEJA JOGAR:");
        System.out.println("    (1) Asteroids");
        System.out.println("    (2) Pong");
        System.out.println("    (0) <Voltar>");;
    }
    public void cartoes(){
        System.out.println("---------------------------");
        System.out.println("DIGITE O (N°) DO CARTAO QUE DESEJA USAR PARA USAR:");
        System.out.println("    (1) Cartão 1");
        System.out.println("    (2) Cartão 2");
        System.out.println("    (0) <Voltar>");;
    }
    public void premios(){
        System.out.println("---------------------------");
        System.out.println("DIGITE O (N°) DO PRÊMIO QUE DESEJA:");
        System.out.println("    (1) Ursinho Puff");
        System.out.println("    (2) Boné Arcade");
        System.out.println("    (0) <Voltar>");;
    }
    public void jogou(int numeroCartao, int ticketsGanhos, int saldoTickets, int saldoAtual){
        System.out.println("    Número do cartão:"+numeroCartao);
        System.out.println("    Tickets ganhos:"+ ticketsGanhos);
        System.out.println("    Novo saldo de Tickets:"+ saldoTickets);
        System.out.println("    Novo saldo de Créditos:"+ saldoAtual);
    }
    public void transferir(){
        System.out.println("---------------------------");
        System.out.println("DIGITE O (N°) DE ACORDO COM A TRANSFERÊNCIA QUE DESEJA REALIZAR:");
        System.out.println("    (1) Cartão 1 para Cartão 2");
        System.out.println("    (2) Cartão 2 para Cartão 1");;
        System.out.println("    (0) Sair");
    }
}
