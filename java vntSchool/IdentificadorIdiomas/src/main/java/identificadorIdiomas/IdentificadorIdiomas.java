package identificadorIdiomas;

import java.util.Locale;

public class IdentificadorIdiomas {

    public static void main(String[] args) {

        //programa para identificar o idioma do sistema.

        Locale locale = Locale.getDefault();
        String linguagem = locale.getDisplayLanguage();
        System.out.println("A linguagem utilizada no seu sistema é " + linguagem);

    }
}
