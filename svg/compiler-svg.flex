%%

%package herbadji.svg.api
%class Lexer
%public
%line
%column
%cup

%%

[ \t\n\r]		{ }
^#.*			{ }

rectangle       { return getSymbolFactory().newSymbol ("RECTANGLE", Sym.RECTANGLE); }
circle			{ return getSymbolFactory().newSymbol ("CIRCLE", Sym.CIRCLE); }
animate         { return getSymbolFactory().newSymbol ("ANIMATE", Sym.ANIMATE); }


"="				{ return getSymbolFactory().newSymbol ("SET", Sym.SET); }
"+"				{ return getSymbolFactory().newSymbol ("ADD", Sym.ADD); }
"-"				{ return getSymbolFactory().newSymbol ("SUB", Sym.SUB); }
"*"				{ return getSymbolFactory().newSymbol ("MULT", Sym.MULT); }
"/"				{ return getSymbolFactory().newSymbol ("DIV", Sym.DIV); }
"("				{ return getSymbolFactory().newSymbol ("OPEN_PARENTHESIS", Sym.OPEN_PARENTHESIS); }
")"				{ return getSymbolFactory().newSymbol ("CLOSE_PARENTHESIS", Sym.CLOSE_PARENTHESIS); }

","				{ return getSymbolFactory().newSymbol ("SEP", Sym.SEP); }
";"				{ return getSymbolFactory().newSymbol ("SEP", Sym.TERM); }

[0-9]+			{ return getSymbolFactory().newSymbol ("INT", Sym.INT, Integer.parseInt(yytext())); }

//[a-zA-Z0-9,()_.!#@]+	{ return getSymbolFactory().newSymbol ("ID", Sym.ID, yytext()); }
[a-zA-Z][a-zA-Z0-9]*		{ return getSymbolFactory().newSymbol ("ID", Sym.ID, yytext()); }
\"[^\"]*\"		{ return getSymbolFactory().newSymbol ("TEXT", Sym.TEXT, new String( zzBuffer, zzStartRead+1, zzMarkedPos-zzStartRead-2 )); }

[^]				{ throw new Error("Illegal character <"+yytext()+">"); }