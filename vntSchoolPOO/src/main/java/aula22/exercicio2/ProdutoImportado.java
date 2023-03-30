package aula22.exercicio2;

public class ProdutoImportado extends Produto {

    private double taxaAlfandega;

    public ProdutoImportado(String nome, double preco, double taxaAlfandega) {
        super(nome, preco);
        this.taxaAlfandega = taxaAlfandega;
    }

    public double precoTotal() {
        return getPreco() + taxaAlfandega;
    }

    @Override
    public void etiquetaPreco(){
        System.out.printf(" %s R$ %.2f (Taxa alfandega: R$ %.2f ) %n", getNome(), precoTotal(), taxaAlfandega);
    }

    public double getTaxaAlfandega() {
        return taxaAlfandega;
    }

    public void setTaxaAlfandega(double taxaAlfandega) {
        this.taxaAlfandega = taxaAlfandega;
    }
}

