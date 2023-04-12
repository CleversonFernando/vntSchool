import java.util.Random;
import java.util.Scanner;

public class EstruturasDoJogo {

    protected static void imprimirMesa(char[][] mesa) {

        System.out.println(mesa[0][0] + "|" + mesa[0][1] + "|" + mesa[0][2]);
        System.out.println("-+-+-");
        System.out.println(mesa[1][0] + "|" + mesa[1][1] + "|" + mesa[1][2]);
        System.out.println("-+-+-");
        System.out.println(mesa[2][0] + "|" + mesa[2][1] + "|" + mesa[2][2]);

    }

    protected static void jogadaDoUsuario(char[][] mesa, Scanner sc) {
        String jogadaDoUsuario;
        while (true) {
            System.out.println("Escolha uma posição 1-9");
            jogadaDoUsuario = sc.nextLine();
            if (posicaoVazia(mesa, Integer.parseInt(jogadaDoUsuario))) {
                break;
            } else {
                System.out.println("Posição inválida!");
            }
        }
        posicaoDaJogada(mesa, jogadaDoUsuario, 'X');
    }

    protected static void posicaoDaJogada(char[][] mesa, String posicao, char simbolo) {
        switch (posicao) {
            case "1":
                mesa[0][0] = simbolo;
                break;
            case "2":
                mesa[0][1] = simbolo;
                break;
            case "3":
                mesa[0][2] = simbolo;
                break;
            case "4":
                mesa[1][0] = simbolo;
                break;
            case "5":
                mesa[1][1] = simbolo;
                break;
            case "6":
                mesa[1][2] = simbolo;
                break;
            case "7":
                mesa[2][0] = simbolo;
                break;
            case "8":
                mesa[2][1] = simbolo;
                break;
            case "9":
                mesa[2][2] = simbolo;
                break;
            default:
                break;
        }
    }

    protected static boolean posicaoVazia(char[][] mesa, int escolha) {
        switch (escolha) {
            case 1:
                return mesa[0][0] == ' ';
            case 2:
                return mesa[0][1] == ' ';
            case 3:
                return mesa[0][2] == ' ';
            case 4:
                return mesa[1][0] == ' ';
            case 5:
                return mesa[1][1] == ' ';
            case 6:
                return mesa[1][2] == ' ';
            case 7:
                return mesa[2][0] == ' ';
            case 8:
                return mesa[2][1] == ' ';
            case 9:
                return mesa[2][2] == ' ';
            default:
                return false;
        }

    }

    protected static void computadorJogar(char[][] mesa) {
        Random aleatorio = new Random();
        int jogadaDoComoputador;
        while (true) {
            jogadaDoComoputador = aleatorio.nextInt(9) + 1;
            if (posicaoVazia(mesa, jogadaDoComoputador)) {
                System.out.println("Sua Vez!");
                break;
            }
        }
        posicaoDaJogada(mesa, String.valueOf(jogadaDoComoputador), 'O');


    }

    protected static boolean fimDeJogo(char[][] mesa) {

        if (verificarVencedor(mesa, 'X')) {
            imprimirMesa(mesa);
            System.out.println("Você venceu!");
            return true;
        }
        if (verificarVencedor(mesa, 'O')) {
            imprimirMesa(mesa);
            System.out.println("O computador venceu!");
            return true;
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (mesa[i][j] == ' ') {
                    return false;
                }
            }
        }
        imprimirMesa(mesa);
        System.out.println("Deu velha!");
        return true;

    }

    protected static boolean verificarVencedor(char[][] mesa, char simbolo) {

        if ((mesa[0][0] == simbolo && mesa[0][1] == simbolo && mesa[0][2] == simbolo) ||
                (mesa[1][0] == simbolo && mesa[1][1] == simbolo && mesa[1][2] == simbolo) ||
                (mesa[2][0] == simbolo && mesa[2][1] == simbolo && mesa[2][2] == simbolo) ||
                (mesa[0][0] == simbolo && mesa[1][0] == simbolo && mesa[2][0] == simbolo) ||
                (mesa[0][1] == simbolo && mesa[1][1] == simbolo && mesa[2][1] == simbolo) ||
                (mesa[0][2] == simbolo && mesa[1][2] == simbolo && mesa[2][2] == simbolo) ||
                (mesa[0][0] == simbolo && mesa[1][1] == simbolo && mesa[2][2] == simbolo) ||
                (mesa[0][2] == simbolo && mesa[1][1] == simbolo && mesa[2][0] == simbolo)) {
            return true;
        }
        return false;
    }
}
