package aula22.exercicio2;

import java.util.Date;

public class ProdutoUsado extends Produto {

    private String dataDeFabricacao;

    public ProdutoUsado(String nome, double preco, String dataDeFabricacao) {
        super(nome, preco);
        this.dataDeFabricacao = dataDeFabricacao;
    }

    @Override
    public void etiquetaPreco(){
        System.out.printf(" %s (Usado) R$ %.2f (Data de fabricação: %s ) %n", getNome(), getPreco(), dataDeFabricacao);
    }

    public String getDataDeFabricacao() {
        return dataDeFabricacao;
    }

    public void setDataDeFabricacao(String dataDeFabricacao) {
        this.dataDeFabricacao = dataDeFabricacao;
    }
}
