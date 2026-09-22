package codigo

%%
%char
%line
%column
%class AnalizadorLexicoTiny
%type  UnidadLexica
%unicode

%{
  private ALexOperations ops;
  public String lexema() {return yytext();}
  public int fila() {return yyline+1;}
  public int columna() {return yycolumn+1;}
%}

%eofval{
  return ops.unidadEof();
%eofval}

%init{
  ops = new ALexOperations(this);
%init}

letra  = ([A-Z]|[a-z])
digitoPositivo = [1-9]
digitoNegativo = \-({digitoPositivo})
digito = ({digitoPositivo}|0)
numeroEntero = ({digitoPositivo}|{digitoNegativo}){digito}*|0
separador = [ \t\r\b\n]
comentarioBarras = \/\/[^\r\n]*
comentarioAlm = \#[^\#\n\r]*
comentarioMultLinea =\/\*[^]*\*\/
comentario = {comentarioBarras}|{comentarioAlm}|{comentarioMultLinea}
idBBaja = {letra}({letra}|{digito}|\_)*({letra}|{digito})
identificador = (({letra}({letra}|{digito})*)|{idBBaja})
operadorSuma = \+
operadorResta = \-
operadorMult = \*
operadorDiv = \/
operadorIgual = \=
operadorMayor = \>
operadorMenor = \<
operadorMayorIgual = \>\=
operadorMenorIgual = \<\=
operadorIgualIgual = \=\=
operadorPlusPlus = \+\+
operadorMenosMenos = \-\-
parentesisApertura = \(
parentesisCierre = \)
corcheteApertura = \[
corcheteCierre = \]
llaveApertura = \{
llaveCierre = \}
true = True
false = False
if = if
else = else
elif = elif
for = for
while = while
int = int
bool = boolean
puntocoma = \;


%%
{separador}               {}
{comentario}              {}
{if}                      {return ops.unidadIf();}
{else}                    {return ops.unidadElse();}
{elif}                    {return ops.unidadElif();}
{for}                     {return ops.unidadFor();}
{while}                   {return ops.unidadWhile();}
{int}                     {return ops.unidadTipoEnt();}
{bool}                    {return ops.unidadTipoBool();}
{false}                   {return ops.unidadFalse();}
{true}                    {return ops.unidadTrue();}
{identificador}           {return ops.unidadId();}
{numeroEntero}            {return ops.unidadEnt();}
{operadorSuma}            {return ops.unidadSuma();}
{operadorResta}           {return ops.unidadResta();}
{operadorIgual}           {return ops.unidadIgual();}
{operadorIgualIgual}      {return ops.unidadIgualIgual();}
{operadorPlusPlus}        {return ops.unidadPlusPlus();}
{operadorMenosMenos}      {return ops.unidadMenosMenos();}
{operadorMayor}           {return ops.unidadMayor();}
{operadorMenor}           {return ops.unidadMenor();}
{operadorMayorIgual}      {return ops.unidadMayorIgual();}
{operadorMenorIgual}      {return ops.unidadMenorIgual();}
{operadorMult}            {return ops.unidadMulti();}
{operadorDiv}             {return ops.unidadDiv();}
{parentesisApertura}      {return ops.unidadPAp();}
{parentesisCierre}        {return ops.unidadPCierre();}
{corcheteApertura}        {return ops.unidadCAp();}
{corcheteCierre}          {return ops.unidadCCierre();}
{llaveApertura}           {return ops.unidadLAp();}
{llaveCierre}             {return ops.unidadLCierre();}
{puntocoma}               {return ops.unidadPuntoComa();}
[^]                       {ops.error();}
