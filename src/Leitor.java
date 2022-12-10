import java.util.Scanner;

public class Leitor {
    Monitor lcd = new Monitor();
    public int inserirCartao(){
        lcd.iniciar();
        Scanner leitor = new Scanner(System.in);
        int numCartoes = leitor.nextInt();
        return numCartoes;
    }
}
