// Generated from C:/Users/Josue/Documents/TEC/Semestre 5/Compiladores/Proyectos/Proyecto 1/Avance 1\Scanner.g4 by ANTLR 4.7
package generated;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class Scanner extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		PyCOMA=1, COMA=2, ASIGNACION=3, MAYIGUAL=4, MENIGUAL=5, IGUAL=6, MAYOR=7, 
		MENOR=8, DOSPTOS=9, SUM=10, RES=11, MUL=12, DIV=13, PARIZQ=14, PARDER=15, 
		PARCUADIZQ=16, PARCUADDER=17, CORCHETEIZQ=18, CORCHETEDER=19, VACIO=20, 
		IF=21, WHILE=22, LET=23, ELSE=24, RETURN=25, INT=26, STRING=27, TRUE=28, 
		FALSE=29, FN=30, PUTS=31, LEN=32, FIRST=33, LAST=34, REST=35, PUSH=36, 
		ID=37, WS=38;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"PyCOMA", "COMA", "ASIGNACION", "MAYIGUAL", "MENIGUAL", "IGUAL", "MAYOR", 
		"MENOR", "DOSPTOS", "SUM", "RES", "MUL", "DIV", "PARIZQ", "PARDER", "PARCUADIZQ", 
		"PARCUADDER", "CORCHETEIZQ", "CORCHETEDER", "VACIO", "IF", "WHILE", "LET", 
		"ELSE", "RETURN", "INT", "STRING", "TRUE", "FALSE", "FN", "PUTS", "LEN", 
		"FIRST", "LAST", "REST", "PUSH", "ID", "LETTER", "DIGIT", "WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "';'", "','", "'='", "'>='", "'<='", "'=='", "'>'", "'<'", "':'", 
		"'+'", null, null, "'/'", "'('", "')'", "'['", "']'", "'{'", "'}'", "'\u00CE\u00B5'", 
		"'if'", "'while'", "'let'", "'else'", "'return'", "'Integer'", "'String'", 
		"'true'", "'false'", "'fn'", "'puts'", "'len'", "'first'", "'last'", "'rest'", 
		"'push'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "PyCOMA", "COMA", "ASIGNACION", "MAYIGUAL", "MENIGUAL", "IGUAL", 
		"MAYOR", "MENOR", "DOSPTOS", "SUM", "RES", "MUL", "DIV", "PARIZQ", "PARDER", 
		"PARCUADIZQ", "PARCUADDER", "CORCHETEIZQ", "CORCHETEDER", "VACIO", "IF", 
		"WHILE", "LET", "ELSE", "RETURN", "INT", "STRING", "TRUE", "FALSE", "FN", 
		"PUTS", "LEN", "FIRST", "LAST", "REST", "PUSH", "ID", "WS"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}


	public Scanner(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Scanner.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2(\u00e6\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\3\2\3\2\3\3\3"+
		"\3\3\4\3\4\3\5\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n"+
		"\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22"+
		"\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\25\3\26\3\26\3\26\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\32\3\32"+
		"\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\34"+
		"\3\34\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36"+
		"\3\36\3\36\3\36\3\37\3\37\3\37\3 \3 \3 \3 \3 \3!\3!\3!\3!\3\"\3\"\3\""+
		"\3\"\3\"\3\"\3#\3#\3#\3#\3#\3$\3$\3$\3$\3$\3%\3%\3%\3%\3%\3&\3&\3&\7&"+
		"\u00d7\n&\f&\16&\u00da\13&\3\'\3\'\3(\3(\3)\6)\u00e1\n)\r)\16)\u00e2\3"+
		")\3)\2\2*\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33"+
		"\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67"+
		"\359\36;\37= ?!A\"C#E$G%I&K\'M\2O\2Q(\3\2\4\4\2C\\c|\5\2\13\f\17\17\""+
		"\"\2\u00e6\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2"+
		"\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27"+
		"\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2"+
		"\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2"+
		"\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2"+
		"\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2"+
		"\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2Q\3\2\2\2\3S\3\2\2\2\5U\3\2\2\2\7W"+
		"\3\2\2\2\tY\3\2\2\2\13\\\3\2\2\2\r_\3\2\2\2\17b\3\2\2\2\21d\3\2\2\2\23"+
		"f\3\2\2\2\25h\3\2\2\2\27j\3\2\2\2\31l\3\2\2\2\33n\3\2\2\2\35p\3\2\2\2"+
		"\37r\3\2\2\2!t\3\2\2\2#v\3\2\2\2%x\3\2\2\2\'z\3\2\2\2)|\3\2\2\2+\177\3"+
		"\2\2\2-\u0082\3\2\2\2/\u0088\3\2\2\2\61\u008c\3\2\2\2\63\u0091\3\2\2\2"+
		"\65\u0098\3\2\2\2\67\u00a0\3\2\2\29\u00a7\3\2\2\2;\u00ac\3\2\2\2=\u00b2"+
		"\3\2\2\2?\u00b5\3\2\2\2A\u00ba\3\2\2\2C\u00be\3\2\2\2E\u00c4\3\2\2\2G"+
		"\u00c9\3\2\2\2I\u00ce\3\2\2\2K\u00d3\3\2\2\2M\u00db\3\2\2\2O\u00dd\3\2"+
		"\2\2Q\u00e0\3\2\2\2ST\7=\2\2T\4\3\2\2\2UV\7.\2\2V\6\3\2\2\2WX\7?\2\2X"+
		"\b\3\2\2\2YZ\7@\2\2Z[\7?\2\2[\n\3\2\2\2\\]\7>\2\2]^\7?\2\2^\f\3\2\2\2"+
		"_`\7?\2\2`a\7?\2\2a\16\3\2\2\2bc\7@\2\2c\20\3\2\2\2de\7>\2\2e\22\3\2\2"+
		"\2fg\7<\2\2g\24\3\2\2\2hi\7-\2\2i\26\3\2\2\2jk\7,\2\2k\30\3\2\2\2lm\7"+
		",\2\2m\32\3\2\2\2no\7\61\2\2o\34\3\2\2\2pq\7*\2\2q\36\3\2\2\2rs\7+\2\2"+
		"s \3\2\2\2tu\7]\2\2u\"\3\2\2\2vw\7_\2\2w$\3\2\2\2xy\7}\2\2y&\3\2\2\2z"+
		"{\7\177\2\2{(\3\2\2\2|}\7\u00d0\2\2}~\7\u00b7\2\2~*\3\2\2\2\177\u0080"+
		"\7k\2\2\u0080\u0081\7h\2\2\u0081,\3\2\2\2\u0082\u0083\7y\2\2\u0083\u0084"+
		"\7j\2\2\u0084\u0085\7k\2\2\u0085\u0086\7n\2\2\u0086\u0087\7g\2\2\u0087"+
		".\3\2\2\2\u0088\u0089\7n\2\2\u0089\u008a\7g\2\2\u008a\u008b\7v\2\2\u008b"+
		"\60\3\2\2\2\u008c\u008d\7g\2\2\u008d\u008e\7n\2\2\u008e\u008f\7u\2\2\u008f"+
		"\u0090\7g\2\2\u0090\62\3\2\2\2\u0091\u0092\7t\2\2\u0092\u0093\7g\2\2\u0093"+
		"\u0094\7v\2\2\u0094\u0095\7w\2\2\u0095\u0096\7t\2\2\u0096\u0097\7p\2\2"+
		"\u0097\64\3\2\2\2\u0098\u0099\7K\2\2\u0099\u009a\7p\2\2\u009a\u009b\7"+
		"v\2\2\u009b\u009c\7g\2\2\u009c\u009d\7i\2\2\u009d\u009e\7g\2\2\u009e\u009f"+
		"\7t\2\2\u009f\66\3\2\2\2\u00a0\u00a1\7U\2\2\u00a1\u00a2\7v\2\2\u00a2\u00a3"+
		"\7t\2\2\u00a3\u00a4\7k\2\2\u00a4\u00a5\7p\2\2\u00a5\u00a6\7i\2\2\u00a6"+
		"8\3\2\2\2\u00a7\u00a8\7v\2\2\u00a8\u00a9\7t\2\2\u00a9\u00aa\7w\2\2\u00aa"+
		"\u00ab\7g\2\2\u00ab:\3\2\2\2\u00ac\u00ad\7h\2\2\u00ad\u00ae\7c\2\2\u00ae"+
		"\u00af\7n\2\2\u00af\u00b0\7u\2\2\u00b0\u00b1\7g\2\2\u00b1<\3\2\2\2\u00b2"+
		"\u00b3\7h\2\2\u00b3\u00b4\7p\2\2\u00b4>\3\2\2\2\u00b5\u00b6\7r\2\2\u00b6"+
		"\u00b7\7w\2\2\u00b7\u00b8\7v\2\2\u00b8\u00b9\7u\2\2\u00b9@\3\2\2\2\u00ba"+
		"\u00bb\7n\2\2\u00bb\u00bc\7g\2\2\u00bc\u00bd\7p\2\2\u00bdB\3\2\2\2\u00be"+
		"\u00bf\7h\2\2\u00bf\u00c0\7k\2\2\u00c0\u00c1\7t\2\2\u00c1\u00c2\7u\2\2"+
		"\u00c2\u00c3\7v\2\2\u00c3D\3\2\2\2\u00c4\u00c5\7n\2\2\u00c5\u00c6\7c\2"+
		"\2\u00c6\u00c7\7u\2\2\u00c7\u00c8\7v\2\2\u00c8F\3\2\2\2\u00c9\u00ca\7"+
		"t\2\2\u00ca\u00cb\7g\2\2\u00cb\u00cc\7u\2\2\u00cc\u00cd\7v\2\2\u00cdH"+
		"\3\2\2\2\u00ce\u00cf\7r\2\2\u00cf\u00d0\7w\2\2\u00d0\u00d1\7u\2\2\u00d1"+
		"\u00d2\7j\2\2\u00d2J\3\2\2\2\u00d3\u00d8\5M\'\2\u00d4\u00d7\5M\'\2\u00d5"+
		"\u00d7\5O(\2\u00d6\u00d4\3\2\2\2\u00d6\u00d5\3\2\2\2\u00d7\u00da\3\2\2"+
		"\2\u00d8\u00d6\3\2\2\2\u00d8\u00d9\3\2\2\2\u00d9L\3\2\2\2\u00da\u00d8"+
		"\3\2\2\2\u00db\u00dc\t\2\2\2\u00dcN\3\2\2\2\u00dd\u00de\4\62;\2\u00de"+
		"P\3\2\2\2\u00df\u00e1\t\3\2\2\u00e0\u00df\3\2\2\2\u00e1\u00e2\3\2\2\2"+
		"\u00e2\u00e0\3\2\2\2\u00e2\u00e3\3\2\2\2\u00e3\u00e4\3\2\2\2\u00e4\u00e5"+
		"\b)\2\2\u00e5R\3\2\2\2\6\2\u00d6\u00d8\u00e2\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}