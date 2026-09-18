package codigo;

import jflex.exceptions.SilentExit;

import java.io.*;

public class Main {

    static void main(String[] args) throws SilentExit, IOException {
        //String[] ruta = {"C:/Users/almud/OneDrive/Documentos/GitHub/TFG/AnalisisLexico/src/codigo/lexer.l"};
        //jflex.Main.generate(ruta);

        Reader input = new InputStreamReader(new FileInputStream("C:/Users/almud/OneDrive/Documentos/GitHub/TFG/AnalisisLexico/src/input.txt"));
        AnalizadorLexicoTiny al = new AnalizadorLexicoTiny(input);
        UnidadLexica unidad;
        do {
            unidad = al.yylex();
            System.out.println(unidad);
        }
        while (unidad.clase() != ClaseLexica.EOF);
    }
}
