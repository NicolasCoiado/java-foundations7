import java.util.Scanner;
public class Terminal {
    Leitor leitor = new Leitor();
    Monitor lcd = new Monitor();
    public void ler() {

        int nCartoes = leitor.inserirCartao();

        if(nCartoes == 2){
            lcd.iniciado();
        }else {
            System.out.println("Insira novamente o cartão");
            System.exit(0);
        }

    }

    public void opcoes(Cartao cartao1, Cartao cartao2, Jogo asteroids, Jogo pong, CategoriaPremio ursinho, CategoriaPremio bone) {
        Monitor lcd = new Monitor();
        lcd.opcoes();
        Scanner leitor = new Scanner(System.in);
        int opcao = leitor.nextInt();
        int jogo=0;
        int cartao=0;
        int premio=0;

        if(opcao==1){
            lcd.jogos();
            jogo = leitor.nextInt();
                if(jogo==1){
                    lcd.cartoes();
                    cartao = leitor.nextInt();
                    if(cartao==1){
                        System.out.println("VOCÊ JOGOU ASTEROIDS!");
                        asteroids.passarCartaoParaJogar(cartao1);
                    }else if(cartao==2){
                        System.out.println("VOCÊ JOGOU ASTEROIDS!");
                        asteroids.passarCartaoParaJogar(cartao2);
                    }else{
                        opcoes(cartao1, cartao2, asteroids, pong, ursinho, bone);
                    }
                } else if (jogo==2) {
                    lcd.cartoes();
                    cartao = leitor.nextInt();
                    if(cartao==1){
                        System.out.println("VOCÊ JOGOU PONG!");
                        pong.passarCartaoParaJogar(cartao1);
                    }else if(cartao==2){
                        System.out.println("VOCÊ JOGOU PONG!");
                        pong.passarCartaoParaJogar(cartao2);
                    }else{
                        opcoes(cartao1, cartao2, asteroids, pong, ursinho, bone);
                    }
                }else {
                    opcoes(cartao1, cartao2, asteroids, pong, ursinho, bone);
                }
            opcoes(cartao1, cartao2, asteroids, pong, ursinho, bone);
        } else if(opcao==2){
            lcd.premios();
            premio = leitor.nextInt();

            if(premio==1){
                lcd.cartoes();
                cartao = leitor.nextInt();
                if(cartao==1){
                    if(cartao1.getSaldoAtual()>=ursinho.getQuantidadeTicketsTroca()) {
                        ursinho.retirarPremio(cartao1);
                        opcoes(cartao1, cartao2, asteroids, pong, ursinho, bone);
                    }else {
                        System.out.println("Sem saldo para retirar prêmio.");
                        opcoes(cartao1, cartao2, asteroids, pong, ursinho, bone);
                    }
                }else if(cartao==2){
                    if(cartao2.getSaldoAtual()>=ursinho.getQuantidadeTicketsTroca()) {
                        ursinho.retirarPremio(cartao2);
                        opcoes(cartao1, cartao2, asteroids, pong, ursinho, bone);
                    }else {
                        System.out.println("Sem saldo para retirar prêmio.");
                        opcoes(cartao1, cartao2, asteroids, pong, ursinho, bone);
                    }
                }else{
                    opcoes(cartao1, cartao2, asteroids, pong, ursinho, bone);
                }
            }else if(premio==2){
                lcd.cartoes();
                cartao = leitor.nextInt();
                if(cartao==1){
                    if(cartao1.getSaldoAtual()>=bone.getQuantidadeTicketsTroca()) {
                        bone.retirarPremio(cartao1);
                        opcoes(cartao1, cartao2, asteroids, pong, ursinho, bone);
                    }else {
                        System.out.println("Sem saldo para retirar prêmio.");
                        opcoes(cartao1, cartao2, asteroids, pong, ursinho, bone);
                    }
                }else if(cartao==2){
                    if(cartao2.getSaldoAtual()>=bone.getQuantidadeTicketsTroca()) {
                        bone.retirarPremio(cartao2);
                        opcoes(cartao1, cartao2, asteroids, pong, ursinho, bone);
                    }else {
                        System.out.println("Sem saldo para retirar prêmio.");
                        opcoes(cartao1, cartao2, asteroids, pong, ursinho, bone);
                    }
                }else{
                    opcoes(cartao1, cartao2, asteroids, pong, ursinho, bone);
                }
            }else{
                opcoes(cartao1, cartao2, asteroids, pong, ursinho, bone);
            }

        }else if(opcao==3){
            consultarCartoes(cartao1, cartao2, asteroids, pong, ursinho, bone);
        }else if(opcao==4){
            inserirDinheiro(cartao1, cartao2, asteroids, pong, ursinho, bone);
        }else if(opcao==5){
            transferirCredito(cartao1, cartao2, asteroids, pong, ursinho, bone);
        }else{
            System.out.println("---------------------------");
            System.out.println("FIM DA SESSÃO");
            System.exit(0);
        }
    }
    public void consultarCartoes(Cartao cartao1, Cartao cartao2, Jogo asteroids, Jogo pong, CategoriaPremio ursinho, CategoriaPremio bone) {
        Monitor lcd = new Monitor();
        lcd.apresentar(cartao1, cartao2);
        opcoes(cartao1, cartao2, asteroids, pong, ursinho, bone);
    }


    public void transferirCredito(Cartao c1, Cartao c2, Jogo asteroids, Jogo pong, CategoriaPremio ursinho, CategoriaPremio bone){
        Scanner scn = new Scanner(System.in);
        System.out.print("Digite o valor que deseja tranferir de um cartão para o outro");
        int creditos = scn.nextInt();
        int saldoDoCartoC1 = c1.getSaldoAtual();
        int saldoDoCartoC2 = c2.getSaldoAtual();
        lcd.transferir();
        int operacao = scn.nextInt();
        if(operacao==1) {
            if (saldoDoCartoC1 >= creditos) {
                c1.setSaldoAtual(saldoDoCartoC1 - creditos);
                c2.setSaldoAtual(saldoDoCartoC2 + creditos);
                System.out.println();
                System.out.println("Sem saldo para retirar prêmio.");
                opcoes(c1, c2, asteroids, pong, ursinho, bone);
            } else {
                System.out.println("Tranferência não realizada");
                opcoes(c1, c2, asteroids, pong, ursinho, bone);
            }
        }else if(operacao==2){
            if (saldoDoCartoC2 >= creditos) {
                c2.setSaldoAtual(saldoDoCartoC2 - creditos);
                c1.setSaldoAtual(saldoDoCartoC1 + creditos);
                System.out.println();
                System.out.println("Sem saldo para retirar prêmio.");
                opcoes(c1, c2, asteroids, pong, ursinho, bone);
            } else {
                System.out.println("Tranferência não realizada");
                opcoes(c1, c2, asteroids, pong, ursinho, bone);
            }
        }else{
            opcoes(c1, c2, asteroids, pong, ursinho, bone);
        }
    }

    public void inserirDinheiro(Cartao cartao1, Cartao cartao2, Jogo asteroids, Jogo pong, CategoriaPremio ursinho, CategoriaPremio bone){
        Scanner scn = new Scanner(System.in);
        System.out.print("Digite quantos dólares você deseja colocar em seu cartão: ");
        int dolares = scn.nextInt();
        lcd.cartoes();
        int cartao = scn.nextInt();
        if(cartao==1){
            cartao1.setSaldoAtual(cartao1.getSaldoAtual()+(dolares/2));
            consultarCartoes(cartao1, cartao2, asteroids, pong, ursinho, bone);
            opcoes(cartao1, cartao2, asteroids, pong, ursinho, bone);
        } else if (cartao==2) {
            cartao2.setSaldoAtual(cartao2.getSaldoAtual()+(dolares/2));
            consultarCartoes(cartao1, cartao2, asteroids, pong, ursinho, bone);
            opcoes(cartao1, cartao2, asteroids, pong, ursinho, bone);
        }else {
            opcoes(cartao1, cartao2, asteroids, pong, ursinho, bone);
        }
    }
}
