package aula15.exercicio1;

public class Exercicio1 {

    public static void main(String[] args) {

        Produto cafe = new Produto();
        cafe.nome = "café";
        cafe.preco = 50.0;
        cafe.quantidade = 5;
        imprimir(cafe);

        cafe.addProdutos(3);
        imprimir(cafe);

        cafe.removeProduto(4);
        imprimir(cafe);
    }
    static void imprimir(Produto produto) {
        System.out.printf("%s %.2f %d %.2f %n", produto.nome, produto.preco,
                produto.quantidade, produto.totalValorEmEstoque());
    }
}

