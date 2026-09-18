package codigo;

import jflex.exceptions.SilentExit;

public class Main {
    static void main(String[] args) throws SilentExit {
        String[] ruta = {"C:/Users/almud/OneDrive/Documentos/GitHub/TFG/AnalisisLexico/src/codigo/lexer.l"};
        jflex.Main.generate(ruta);
    }
}
