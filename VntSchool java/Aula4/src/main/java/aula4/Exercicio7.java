package aula4;

import java.util.*;

public class Exercicio7 {

    public static class Pedidos {
        int codigo;
        int quantidade;
        double valorUnitario;

        public Pedidos(int codigo, int quantidade, double valorUnitario) {
            this.codigo = codigo;
            this.quantidade = quantidade;
            this.valorUnitario = valorUnitario;
        }

        public String toString() {
            return "Entrada: Código: " + codigo +
                    ", Quantidade: " + quantidade + ", Valor unitário: " + valorUnitario + "\n";
        }

    }

    public static double calcularTotal(int quantidade, double valorUnitario) {
        return (quantidade * valorUnitario);
    }

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        List<Pedidos> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        int codigo;
        int quantidade;
        double valorUnitario;
        double total;
        double precoFinal = 0;

        System.out.println("Entre com o número de peças que deseje cadastrar:");
        int contador = sc.nextInt();
        for (int i = 1; i <= contador; i++) {
            System.out.println("Entre com o código da peça: " + i);
            codigo = sc.nextInt();
            System.out.println("Entre com o número de peças: " + i);
            quantidade = sc.nextInt();
            System.out.println("Entre com o valor unitário: " + i);
            valorUnitario = sc.nextInt();
            total = calcularTotal(quantidade, valorUnitario);
            precoFinal += total;
            Pedidos pedidos = new Pedidos(codigo, quantidade, valorUnitario);
            list.add(pedidos);
        }
        System.out.println("VALOR A PAGAR: R$ " + precoFinal);
        System.out.println();
        System.out.print(String.valueOf(list));

        sc.close();
    }
}




