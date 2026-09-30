package codigo;

import jflex.exceptions.SilentExit;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

import  jflex.Main.*;

public class Main {

    static void main(String[] args) throws SilentExit, IOException {
//        Ruta del fichero pasarla como argumentos del Main -> edit configuration-arguments
//        String[] ruta = {"src/codigo/lexer.l"};
//        jflex.Main.generate(ruta);

        prueba(args[0]);
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
