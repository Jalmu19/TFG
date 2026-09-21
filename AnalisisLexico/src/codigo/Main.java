package codigo;

import jflex.exceptions.SilentExit;

import java.io.*;

import  jflex.Main.*;

public class Main {

    static void main(String[] args) throws SilentExit, IOException {
        String[] ruta = {"C:/Users/almud/OneDrive/Documentos/GitHub/TFG/AnalisisLexico/src/codigo/lexer.l"};
        jflex.Main.generate(ruta);

        prueba("C:/Users/almud/OneDrive/Documentos/GitHub/TFG/AnalisisLexico/src/input.txt");
    }

    public static void prueba(String ruta) throws IOException {
        Reader input = new InputStreamReader(new FileInputStream(ruta));
        AnalizadorLexicoTiny al = new AnalizadorLexicoTiny(input);
        UnidadLexica unidad;
        do {
            unidad = al.yylex();
            System.out.println(unidad);
        }
        while (unidad.clase() != ClaseLexica.EOF);
    }
}
