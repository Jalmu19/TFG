package AnalizadorSintacticoCUP.asint;

import AnalizadorSintacticoCUP.alex.AnalizadorLexicoTiny;

import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class Main {
    static void main(String[] args) throws Exception {

        //java -cp jflex.jar jflex.Main mini_lexico.l
        //mover a alex/
        //java -cp cup.jar java_cup.Main -parser AnalizadorSintacticoTiny -symbols ClaseLexica -nopositions Tiny.cup
        //mover a asint/

        Reader input = new InputStreamReader(new FileInputStream(args[0]));
        AnalizadorLexicoTiny alex = new AnalizadorLexicoTiny(input);
        AnalizadorSintacticoTiny asint = new AnalizadorSintacticoTiny(alex);
        asint.parse();
    }

}   
   
