import java.util.Scanner;

public class PlayJogo extends EstruturasDoJogo {

    public static void main(String[] args) {

        int jogarNovamente;
        do {
            Scanner sc = new Scanner(System.in);
            char[][] mesa = {{' ', ' ', ' '},
                    {' ', ' ', ' '},
                    {' ', ' ', ' '}};

            imprimirMesa(mesa);

            while (true) {
                jogadaDoUsuario(mesa, sc);
                if (fimDeJogo(mesa)) {
                    break;
                }
                imprimirMesa(mesa);
                computadorJogar(mesa);
                if (fimDeJogo(mesa)) {
                    break;
                }
                imprimirMesa(mesa);
            }
            System.out.println("Deseja jogar novamente?[1]-SIM");
            jogarNovamente = sc.nextInt();
        } while (jogarNovamente == 1);
        System.out.println("Fim de jogo!");
    }
}