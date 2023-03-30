package aula24.exercicio1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class Exercicio1 {

    public static void main(String[] args) {

        String path = "src/main/java/aula24/exercicio1/Logs.txt";
        Set<String> usuarios = new TreeSet<>();

        try {
            BufferedReader br = new BufferedReader(new FileReader(path));
            String line = br.readLine();
            while (line != null) {
                usuarios.add(line.substring(0, line.indexOf(" ")));
                line = br.readLine();
            }
        } catch (
                IOException e) {
            System.out.println("Error " + e.getMessage());
        }
        System.out.println("Usuários que logaram " + usuarios);
    }
}
