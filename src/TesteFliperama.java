import java.util.Random;
public class TesteFliperama {
    public static void main(String[] args) {
        Random idCart = new Random();
        Terminal t1 = new Terminal();

        t1.ler();

        //CARTÕES
        Cartao cartao1 = new Cartao();
        Cartao cartao2 = new Cartao();

        cartao1.setSaldoAtual(0);
        cartao2.setSaldoAtual(0);
        cartao1.setNumeroCartao(idCart.nextInt(10000));
        cartao2.setNumeroCartao(idCart.nextInt(10000));

        //JOGOS
        Jogo asteroids = new Jogo();
        Jogo pong = new Jogo();

        asteroids.setNomeJogo("Asteroids Atari");
        asteroids.setQuantidadeCreditos(50);

        pong.setNomeJogo("PONG");
        asteroids.setQuantidadeCreditos(10);

        //PRÊMIOS
        CategoriaPremio ursinho = new CategoriaPremio();
        CategoriaPremio bone = new CategoriaPremio();

        ursinho.setNome("Ursinho Puff");
        ursinho.setQuantidadeTicketsTroca(100);
        ursinho.setQuatidadePremiosDisponiveis(2);

        bone.setNome("Boné Arcade");
        bone.setQuantidadeTicketsTroca(50);
        bone.setQuatidadePremiosDisponiveis(30);

        t1.consultarCartoes(cartao1, cartao2, asteroids, pong, ursinho, bone);
        t1.opcoes(cartao1, cartao2, asteroids, pong, ursinho, bone);
    }
}
