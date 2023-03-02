package aula2;

import java.util.Locale;

public class Exercicio1 {

    public static void main(String[] args) {

        //programa para identificar o idioma do sistema.

        Locale locale = Locale.getDefault();
        String linguagem = locale.getDisplayLanguage();
        System.out.println("A linguagem utilizada no seu sistema é " + linguagem);



    }
}
