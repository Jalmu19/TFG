package codigo;

public class ALexOperations {
  private AnalizadorLexicoTiny alex;
  public ALexOperations(AnalizadorLexicoTiny alex) {
   this.alex = alex;   
  }
  
  
  public UnidadLexica unidadId() {
     return new UnidadLexica(alex.fila(),alex.columna(),ClaseLexica.IDEN,
                                         alex.lexema()); 
  } 
  public UnidadLexica unidadIf() {
     return new UnidadLexica(alex.fila(),alex.columna(),ClaseLexica.IF); 
  } 
  public UnidadLexica unidadElse() {
     return new UnidadLexica(alex.fila(),alex.columna(),ClaseLexica.ELSE); 
  }
  public UnidadLexica unidadElif(){return new UnidadLexica(alex.fila(), alex.columna(), ClaseLexica.ELIF);}
  public UnidadLexica unidadFor(){return new UnidadLexica(alex.fila(), alex.columna(), ClaseLexica.FOR);}
  public UnidadLexica unidadWhile(){return new UnidadLexica(alex.fila(), alex.columna(), ClaseLexica.WHILE);}
  public UnidadLexica unidadFunct(){return new UnidadLexica(alex.fila(), alex.columna(), ClaseLexica.FUNC,alex.lexema());}

  public UnidadLexica unidadEnt() { return new UnidadLexica(alex.fila(),alex.columna(),ClaseLexica.ENT,alex.lexema());}
  public UnidadLexica unidadFloat(){return new UnidadLexica(alex.fila(), alex.columna(), ClaseLexica.FLOAT);}

  public UnidadLexica unidadTipoEnt() {
     return new UnidadLexica(alex.fila(),alex.columna(),ClaseLexica.TIPO_ENT); 
  }
  public UnidadLexica unidadTipoBool() {
     return new UnidadLexica(alex.fila(),alex.columna(),ClaseLexica.TIPO_BOOL); 
  }
  public UnidadLexica unidadTipoFloat(){return new UnidadLexica(alex.fila(),alex.columna(),ClaseLexica.TIPO_FLOAT);}

  public UnidadLexica unidadTrue() {
     return new UnidadLexica(alex.fila(),alex.columna(),ClaseLexica.TRUE); 
  }
  public UnidadLexica unidadFalse() {
     return new UnidadLexica(alex.fila(),alex.columna(),ClaseLexica.FALSE); 
  }

  public UnidadLexica unidadSuma() {
     return new UnidadLexica(alex.fila(),alex.columna(),ClaseLexica.MAS); 
  }
  public UnidadLexica unidadResta() {
        return new UnidadLexica(alex.fila(),alex.columna(),ClaseLexica.MENOS);
    }
  public UnidadLexica unidadMulti(){return new UnidadLexica(alex.fila(), alex.columna(),ClaseLexica.MULTI);}
  public UnidadLexica unidadDiv(){return new UnidadLexica(alex.fila(), alex.columna(),ClaseLexica.DIV);}

  public UnidadLexica unidadPAp() {
     return new UnidadLexica(alex.fila(),alex.columna(),ClaseLexica.PAP); 
  } 
  public UnidadLexica unidadPCierre() {
     return new UnidadLexica(alex.fila(),alex.columna(),ClaseLexica.PCIERRE); 
  }
  public UnidadLexica unidadCAp() {
     return new UnidadLexica(alex.fila(),alex.columna(),ClaseLexica.CAP); 
  } 
  public UnidadLexica unidadCCierre() {
     return new UnidadLexica(alex.fila(),alex.columna(),ClaseLexica.CCIERRE); 
  }
  public UnidadLexica unidadLAp() { return new UnidadLexica(alex.fila(),alex.columna(),ClaseLexica.LAP);}
  public UnidadLexica unidadLCierre() { return new UnidadLexica(alex.fila(),alex.columna(),ClaseLexica.LCIERRE);}

  public UnidadLexica unidadIgual() {
     return new UnidadLexica(alex.fila(),alex.columna(),ClaseLexica.IGUAL); 
  } 
  public UnidadLexica unidadIgualIgual() {
     return new UnidadLexica(alex.fila(),alex.columna(),ClaseLexica.IGUALIGUAL); 
  }
  public UnidadLexica unidadDistinto(){return new UnidadLexica(alex.fila(),alex.columna(),ClaseLexica.DISTINTO);}
  public UnidadLexica unidadPlusPlus(){return new UnidadLexica(alex.fila(),alex.columna(),ClaseLexica.PLUSPLUS);}
  public UnidadLexica unidadMenosMenos(){return new UnidadLexica(alex.fila(),alex.columna(),ClaseLexica.MENOSMENOS);}
  public UnidadLexica unidadMenor(){return new UnidadLexica(alex.fila(),alex.columna(),ClaseLexica.MENOR);}
  public UnidadLexica unidadMayorIgual(){return new UnidadLexica(alex.fila(),alex.columna(),ClaseLexica.MAYORI);}
  public UnidadLexica unidadMenorIgual(){return new UnidadLexica(alex.fila(),alex.columna(),ClaseLexica.MENORI);}
  public UnidadLexica unidadMayor() {
     return new UnidadLexica(alex.fila(),alex.columna(),ClaseLexica.MAYOR); 
  }
  public UnidadLexica unidadPuntoComa() {
     return new UnidadLexica(alex.fila(),alex.columna(),ClaseLexica.PUNTOCOMA); 
  } 
  public UnidadLexica unidadEof() {
     return new UnidadLexica(alex.fila(),alex.columna(),ClaseLexica.EOF); 
  }
  public void error() {
    System.err.println("***"+alex.fila()+", "+alex.columna()+" Caracter inesperado: "+alex.lexema());
  }
}
