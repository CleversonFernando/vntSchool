package aula3;

public class Exercicio1 {

    public static void main(String[] args) {

        String produto1 = "Computador";
        String produto2 = "Tablet";
        int idade = 30;
        int codigo = 5290;
        char sexo = 'F';
        double preco1 = 5100.0;
        double preco2 = 1000.5;
        double medida = 53.234567;

        System.out.println("Produtos:");
        System.out.printf(produto1 + ", Preco Total: R$ %.2f\n", preco1 );
        System.out.printf(produto2 + ", Preco Total: R$ %.2f\n\n", preco2 );
        System.out.println("Registro: " + idade + " anos, codigo " + codigo + " e sexo:" + sexo);
        System.out.println();
        System.out.printf("Medidas com oito casas decimais: %.8f\n", medida);
        System.out.printf("Medidas com duas casas decimais: %.2f", medida);


    }
}
