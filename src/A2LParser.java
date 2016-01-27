// Generated from A2L.g4 by ANTLR 4.4
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class A2LParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__62=1, T__61=2, T__60=3, T__59=4, T__58=5, T__57=6, T__56=7, T__55=8, 
		T__54=9, T__53=10, T__52=11, T__51=12, T__50=13, T__49=14, T__48=15, T__47=16, 
		T__46=17, T__45=18, T__44=19, T__43=20, T__42=21, T__41=22, T__40=23, 
		T__39=24, T__38=25, T__37=26, T__36=27, T__35=28, T__34=29, T__33=30, 
		T__32=31, T__31=32, T__30=33, T__29=34, T__28=35, T__27=36, T__26=37, 
		T__25=38, T__24=39, T__23=40, T__22=41, T__21=42, T__20=43, T__19=44, 
		T__18=45, T__17=46, T__16=47, T__15=48, T__14=49, T__13=50, T__12=51, 
		T__11=52, T__10=53, T__9=54, T__8=55, T__7=56, T__6=57, T__5=58, T__4=59, 
		T__3=60, T__2=61, T__1=62, T__0=63, DTYPE=64, ID_STR=65, ID=66, INT=67, 
		HEX=68, FLOAT=69, COMMENT=70, WS=71, STRING=72, CHAR=73, TAG=74;
	public static final String[] tokenNames = {
		"<INVALID>", "'uchar'", "'ALIGNMENT_FLOAT64_IEEE'", "'PROJECT'", "'char'", 
		"'MODULE'", "'float'", "'{'", "'ECU'", "'='", "'AXIS_PTS'", "'CALIBRATION_METHOD'", 
		"'uint'", "'int'", "'ALIGNMENT_FLOAT32_IEEE'", "'('", "'taggedstruct'", 
		"','", "'BYTE_ORDER'", "'DEPOSIT'", "'ulong'", "'long'", "'VERSION'", 
		"'block'", "'IF_DATA'", "']'", "'IDENTICAL'", "'MEASUREMENT'", "'PROJECT_NO'", 
		"'PHONE_NO'", "'A2ML'", "'/include'", "'/end'", "'struct'", "'LINEAR'", 
		"'ADDR_EPK'", "'ECU_ADDRESS'", "'ASAP2_VERSION'", "'MOD_PAR'", "';'", 
		"'ALIGNMENT_BYTE'", "'HEADER'", "'}'", "'FORMAT'", "'enum'", "'\"%'", 
		"'COMPU_METHOD'", "'\"'", "'double'", "'*'", "'CPU_TYPE'", "'.'", "'ALIGNMENT_LONG'", 
		"'CUSTOMER_NO'", "'taggedunion'", "'MEMORY_SEGMENT'", "'USER'", "'['", 
		"'RAT_FUNC'", "'/begin'", "'MOD_COMMON'", "'EPK'", "'ALIGNMENT_WORD'", 
		"')'", "DTYPE", "ID_STR", "ID", "INT", "HEX", "FLOAT", "COMMENT", "WS", 
		"STRING", "CHAR", "TAG"
	};
	public static final int
		RULE_a2l = 0, RULE_version = 1, RULE_project = 2, RULE_header = 3, RULE_module = 4, 
		RULE_a2ml = 5, RULE_mod_common = 6, RULE_mod_par = 7, RULE_memory_segment = 8, 
		RULE_if_data = 9, RULE_compu_method = 10, RULE_calibration_method = 11, 
		RULE_measurement = 12, RULE_axis_pts = 13, RULE_include = 14, RULE_format = 15, 
		RULE_aml = 16, RULE_declaration = 17, RULE_type_definition = 18, RULE_type_name = 19, 
		RULE_predefined_type_name = 20, RULE_block_definition = 21, RULE_enum_type_name = 22, 
		RULE_enumerator_list = 23, RULE_enumerator = 24, RULE_struct_type_name = 25, 
		RULE_struct_member = 26, RULE_member = 27, RULE_array_specifier = 28, 
		RULE_taggedstruct_type_name = 29, RULE_taggedstruct_member = 30, RULE_taggedstruct_definition = 31, 
		RULE_taggedunion_type_name = 32, RULE_tagged_union_member = 33, RULE_constant = 34;
	public static final String[] ruleNames = {
		"a2l", "version", "project", "header", "module", "a2ml", "mod_common", 
		"mod_par", "memory_segment", "if_data", "compu_method", "calibration_method", 
		"measurement", "axis_pts", "include", "format", "aml", "declaration", 
		"type_definition", "type_name", "predefined_type_name", "block_definition", 
		"enum_type_name", "enumerator_list", "enumerator", "struct_type_name", 
		"struct_member", "member", "array_specifier", "taggedstruct_type_name", 
		"taggedstruct_member", "taggedstruct_definition", "taggedunion_type_name", 
		"tagged_union_member", "constant"
	};

	@Override
	public String getGrammarFileName() { return "A2L.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


	    public static void main(String[] args) throws Exception {
	        A2LLexer lex = new A2LLexer(new ANTLRFileStream(args[0]));
	        CommonTokenStream tokens = new CommonTokenStream(lex);
	 
	        A2LParser parser = new A2LParser(tokens);
	 
	        try {
	            parser.a2l();
	        } catch (RecognitionException e)  {
	            e.printStackTrace();
	        }
	    }

	public A2LParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class A2lContext extends ParserRuleContext {
		public VersionContext version() {
			return getRuleContext(VersionContext.class,0);
		}
		public ProjectContext project() {
			return getRuleContext(ProjectContext.class,0);
		}
		public A2lContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_a2l; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof A2LListener ) ((A2LListener)listener).enterA2l(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof A2LListener ) ((A2LListener)listener).exitA2l(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof A2LVisitor ) return ((A2LVisitor<? extends T>)visitor).visitA2l(this);
			else return visitor.visitChildren(this);
		}
	}

	public final A2lContext a2l() throws RecognitionException {
		A2lContext _localctx = new A2lContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_a2l);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(70); version();
			setState(71); project();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VersionContext extends ParserRuleContext {
		public TerminalNode INT(int i) {
			return getToken(A2LParser.INT, i);
		}
		public List<TerminalNode> INT() { return getTokens(A2LParser.INT); }
		public VersionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_version; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof A2LListener ) ((A2LListener)listener).enterVersion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof A2LListener ) ((A2LListener)listener).exitVersion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof A2LVisitor ) return ((A2LVisitor<? extends T>)visitor).visitVersion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VersionContext version() throws RecognitionException {
		VersionContext _localctx = new VersionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_version);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(73); match(T__26);
			setState(74); match(INT);
			setState(75); match(INT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ProjectContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(A2LParser.ID, 0); }
		public TerminalNode STRING() { return getToken(A2LParser.STRING, 0); }
		public HeaderContext header() {
			return getRuleContext(HeaderContext.class,0);
		}
		public ModuleContext module(int i) {
			return getRuleContext(ModuleContext.class,i);
		}
		public List<ModuleContext> module() {
			return getRuleContexts(ModuleContext.class);
		}
		public ProjectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_project; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof A2LListener ) ((A2LListener)listener).enterProject(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof A2LListener ) ((A2LListener)listener).exitProject(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof A2LVisitor ) return ((A2LVisitor<? extends T>)visitor).visitProject(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProjectContext project() throws RecognitionException {
		ProjectContext _localctx = new ProjectContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_project);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(77); match(T__4);
			setState(78); match(T__60);
			setState(79); match(ID);
			setState(80); match(STRING);
			setState(81); header();
			setState(83); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(82); module();
				}
				}
				setState(85); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__4 );
			setState(87); match(T__31);
			setState(88); match(T__60);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class HeaderContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(A2LParser.ID); }
		public TerminalNode STRING(int i) {
			return getToken(A2LParser.STRING, i);
		}
		public List<TerminalNode> STRING() { return getTokens(A2LParser.STRING); }
		public TerminalNode ID(int i) {
			return getToken(A2LParser.ID, i);
		}
		public HeaderContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_header; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof A2LListener ) ((A2LListener)listener).enterHeader(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof A2LListener ) ((A2LListener)listener).exitHeader(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof A2LVisitor ) return ((A2LVisitor<? extends T>)visitor).visitHeader(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HeaderContext header() throws RecognitionException {
		HeaderContext _localctx = new HeaderContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_header);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(90); match(T__4);
			setState(91); match(T__22);
			setState(93);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(92); match(ID);
				}
			}

			setState(95); match(STRING);
			setState(96); match(T__41);
			setState(97); match(STRING);
			setState(98); match(T__35);
			setState(99); match(ID);
			setState(100); match(T__31);
			setState(101); match(T__22);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ModuleContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(A2LParser.ID, 0); }
		public A2mlContext a2ml() {
			return getRuleContext(A2mlContext.class,0);
		}
		public Mod_parContext mod_par() {
			return getRuleContext(Mod_parContext.class,0);
		}
		public TerminalNode STRING() { return getToken(A2LParser.STRING, 0); }
		public Mod_commonContext mod_common() {
			return getRuleContext(Mod_commonContext.class,0);
		}
		public ModuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_module; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof A2LListener ) ((A2LListener)listener).enterModule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof A2LListener ) ((A2LListener)listener).exitModule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof A2LVisitor ) return ((A2LVisitor<? extends T>)visitor).visitModule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ModuleContext module() throws RecognitionException {
		ModuleContext _localctx = new ModuleContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_module);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(103); match(T__4);
			setState(104); match(T__58);
			setState(106);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(105); match(ID);
				}
			}

			setState(108); match(STRING);
			setState(110);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				{
				setState(109); a2ml();
				}
				break;
			}
			setState(112); mod_common();
			setState(113); mod_par();
			setState(114); match(T__31);
			setState(115); match(T__58);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class A2mlContext extends ParserRuleContext {
		public AmlContext aml() {
			return getRuleContext(AmlContext.class,0);
		}
		public A2mlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_a2ml; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof A2LListener ) ((A2LListener)listener).enterA2ml(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof A2LListener ) ((A2LListener)listener).exitA2ml(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof A2LVisitor ) return ((A2LVisitor<? extends T>)visitor).visitA2ml(this);
			else return visitor.visitChildren(this);
		}
	}

	public final A2mlContext a2ml() throws RecognitionException {
		A2mlContext _localctx = new A2mlContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_a2ml);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(117); match(T__4);
			setState(118); match(T__33);
			setState(119); aml();
			setState(120); match(T__31);
			setState(121); match(T__33);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Mod_commonContext extends ParserRuleContext {
		public TerminalNode INT(int i) {
			return getToken(A2LParser.INT, i);
		}
		public List<TerminalNode> ID() { return getTokens(A2LParser.ID); }
		public TerminalNode STRING() { return getToken(A2LParser.STRING, 0); }
		public TerminalNode ID(int i) {
			return getToken(A2LParser.ID, i);
		}
		public List<TerminalNode> INT() { return getTokens(A2LParser.INT); }
		public Mod_commonContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mod_common; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof A2LListener ) ((A2LListener)listener).enterMod_common(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof A2LListener ) ((A2LListener)listener).exitMod_common(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof A2LVisitor ) return ((A2LVisitor<? extends T>)visitor).visitMod_common(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Mod_commonContext mod_common() throws RecognitionException {
		Mod_commonContext _localctx = new Mod_commonContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_mod_common);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(123); match(T__4);
			setState(124); match(T__3);
			setState(125); match(STRING);
			setState(126); match(T__44);
			setState(127); match(ID);
			setState(128); match(T__45);
			setState(129); match(ID);
			setState(130); match(T__23);
			setState(131); match(INT);
			setState(132); match(T__1);
			setState(133); match(INT);
			setState(134); match(T__11);
			setState(135); match(INT);
			setState(136); match(T__49);
			setState(137); match(INT);
			setState(138); match(T__61);
			setState(139); match(INT);
			setState(140); match(T__31);
			setState(141); match(T__3);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Mod_parContext extends ParserRuleContext {
		public TerminalNode HEX() { return getToken(A2LParser.HEX, 0); }
		public TerminalNode STRING(int i) {
			return getToken(A2LParser.STRING, i);
		}
		public List<Memory_segmentContext> memory_segment() {
			return getRuleContexts(Memory_segmentContext.class);
		}
		public List<TerminalNode> STRING() { return getTokens(A2LParser.STRING); }
		public Calibration_methodContext calibration_method(int i) {
			return getRuleContext(Calibration_methodContext.class,i);
		}
		public List<Calibration_methodContext> calibration_method() {
			return getRuleContexts(Calibration_methodContext.class);
		}
		public Memory_segmentContext memory_segment(int i) {
			return getRuleContext(Memory_segmentContext.class,i);
		}
		public Mod_parContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mod_par; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof A2LListener ) ((A2LListener)listener).enterMod_par(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof A2LListener ) ((A2LListener)listener).exitMod_par(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof A2LVisitor ) return ((A2LVisitor<? extends T>)visitor).visitMod_par(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Mod_parContext mod_par() throws RecognitionException {
		Mod_parContext _localctx = new Mod_parContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_mod_par);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(143); match(T__4);
			setState(144); match(T__25);
			setState(145); match(STRING);
			setState(146); match(T__41);
			setState(147); match(STRING);
			setState(148); match(T__28);
			setState(149); match(HEX);
			setState(150); match(T__2);
			setState(151); match(STRING);
			setState(152); match(T__10);
			setState(153); match(STRING);
			setState(154); match(T__7);
			setState(155); match(STRING);
			setState(156); match(T__34);
			setState(157); match(STRING);
			setState(158); match(T__55);
			setState(159); match(STRING);
			setState(160); match(T__13);
			setState(161); match(STRING);
			setState(165);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(162); memory_segment();
					}
					} 
				}
				setState(167);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			}
			setState(171);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__4) {
				{
				{
				setState(168); calibration_method();
				}
				}
				setState(173);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(174); match(T__31);
			setState(175); match(T__25);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Memory_segmentContext extends ParserRuleContext {
		public TerminalNode INT(int i) {
			return getToken(A2LParser.INT, i);
		}
		public List<TerminalNode> ID() { return getTokens(A2LParser.ID); }
		public List<If_dataContext> if_data() {
			return getRuleContexts(If_dataContext.class);
		}
		public List<TerminalNode> HEX() { return getTokens(A2LParser.HEX); }
		public TerminalNode ID(int i) {
			return getToken(A2LParser.ID, i);
		}
		public TerminalNode STRING() { return getToken(A2LParser.STRING, 0); }
		public If_dataContext if_data(int i) {
			return getRuleContext(If_dataContext.class,i);
		}
		public List<TerminalNode> INT() { return getTokens(A2LParser.INT); }
		public TerminalNode HEX(int i) {
			return getToken(A2LParser.HEX, i);
		}
		public Memory_segmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_memory_segment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof A2LListener ) ((A2LListener)listener).enterMemory_segment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof A2LListener ) ((A2LListener)listener).exitMemory_segment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof A2LVisitor ) return ((A2LVisitor<? extends T>)visitor).visitMemory_segment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Memory_segmentContext memory_segment() throws RecognitionException {
		Memory_segmentContext _localctx = new Memory_segmentContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_memory_segment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(177); match(T__4);
			setState(178); match(T__8);
			setState(179); match(ID);
			setState(180); match(ID);
			setState(181); match(STRING);
			setState(182); match(ID);
			setState(183); match(ID);
			setState(184); match(ID);
			setState(185); match(HEX);
			setState(186); match(HEX);
			setState(187); match(INT);
			setState(188); match(INT);
			setState(189); match(INT);
			setState(190); match(INT);
			setState(191); match(INT);
			setState(195);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__4) {
				{
				{
				setState(192); if_data();
				}
				}
				setState(197);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(198); match(T__31);
			setState(199); match(T__8);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class If_dataContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(A2LParser.ID, 0); }
		public TerminalNode HEX() { return getToken(A2LParser.HEX, 0); }
		public TerminalNode CHAR(int i) {
			return getToken(A2LParser.CHAR, i);
		}
		public List<TerminalNode> CHAR() { return getTokens(A2LParser.CHAR); }
		public If_dataContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_data; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof A2LListener ) ((A2LListener)listener).enterIf_data(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof A2LListener ) ((A2LListener)listener).exitIf_data(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof A2LVisitor ) return ((A2LVisitor<? extends T>)visitor).visitIf_data(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_dataContext if_data() throws RecognitionException {
		If_dataContext _localctx = new If_dataContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_if_data);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(201); match(T__4);
			setState(202); match(T__39);
			setState(203); match(ID);
			setState(205);
			_la = _input.LA(1);
			if (_la==HEX) {
				{
				setState(204); match(HEX);
				}
			}

			setState(210);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CHAR) {
				{
				{
				setState(207); match(CHAR);
				}
				}
				setState(212);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(213); match(T__31);
			setState(214); match(T__39);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Compu_methodContext extends ParserRuleContext {
		public TerminalNode ID_STR() { return getToken(A2LParser.ID_STR, 0); }
		public TerminalNode ID() { return getToken(A2LParser.ID, 0); }
		public FormatContext format() {
			return getRuleContext(FormatContext.class,0);
		}
		public TerminalNode STRING() { return getToken(A2LParser.STRING, 0); }
		public Compu_methodContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compu_method; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof A2LListener ) ((A2LListener)listener).enterCompu_method(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof A2LListener ) ((A2LListener)listener).exitCompu_method(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof A2LVisitor ) return ((A2LVisitor<? extends T>)visitor).visitCompu_method(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Compu_methodContext compu_method() throws RecognitionException {
		Compu_methodContext _localctx = new Compu_methodContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_compu_method);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(216); match(T__4);
			setState(217); match(T__17);
			setState(218); match(ID);
			setState(219); match(STRING);
			setState(223);
			switch (_input.LA(1)) {
			case T__37:
				{
				{
				setState(220); match(T__37);
				}
				}
				break;
			case T__29:
				{
				{
				setState(221); match(T__29);
				}
				}
				break;
			case T__5:
				{
				{
				setState(222); match(T__5);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(225); format();
			setState(226); match(ID_STR);
			setState(227); match(T__31);
			setState(228); match(T__17);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Calibration_methodContext extends ParserRuleContext {
		public TerminalNode CHAR(int i) {
			return getToken(A2LParser.CHAR, i);
		}
		public TerminalNode STRING() { return getToken(A2LParser.STRING, 0); }
		public List<TerminalNode> CHAR() { return getTokens(A2LParser.CHAR); }
		public TerminalNode INT() { return getToken(A2LParser.INT, 0); }
		public Calibration_methodContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_calibration_method; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof A2LListener ) ((A2LListener)listener).enterCalibration_method(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof A2LListener ) ((A2LListener)listener).exitCalibration_method(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof A2LVisitor ) return ((A2LVisitor<? extends T>)visitor).visitCalibration_method(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Calibration_methodContext calibration_method() throws RecognitionException {
		Calibration_methodContext _localctx = new Calibration_methodContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_calibration_method);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(230); match(T__4);
			setState(231); match(T__52);
			setState(232); match(STRING);
			setState(233); match(INT);
			setState(237);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CHAR) {
				{
				{
				setState(234); match(CHAR);
				}
				}
				setState(239);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(240); match(T__31);
			setState(241); match(T__52);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MeasurementContext extends ParserRuleContext {
		public TerminalNode INT(int i) {
			return getToken(A2LParser.INT, i);
		}
		public List<TerminalNode> ID() { return getTokens(A2LParser.ID); }
		public FormatContext format() {
			return getRuleContext(FormatContext.class,0);
		}
		public TerminalNode HEX() { return getToken(A2LParser.HEX, 0); }
		public TerminalNode DTYPE() { return getToken(A2LParser.DTYPE, 0); }
		public TerminalNode ID(int i) {
			return getToken(A2LParser.ID, i);
		}
		public TerminalNode STRING() { return getToken(A2LParser.STRING, 0); }
		public List<TerminalNode> INT() { return getTokens(A2LParser.INT); }
		public MeasurementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_measurement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof A2LListener ) ((A2LListener)listener).enterMeasurement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof A2LListener ) ((A2LListener)listener).exitMeasurement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof A2LVisitor ) return ((A2LVisitor<? extends T>)visitor).visitMeasurement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MeasurementContext measurement() throws RecognitionException {
		MeasurementContext _localctx = new MeasurementContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_measurement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(243); match(T__4);
			setState(244); match(T__36);
			setState(245); match(ID);
			setState(246); match(STRING);
			setState(247); match(DTYPE);
			setState(248); match(ID);
			setState(249); match(INT);
			setState(250); match(INT);
			setState(251); match(INT);
			setState(252); match(INT);
			setState(253); match(T__27);
			setState(254); match(HEX);
			setState(257);
			_la = _input.LA(1);
			if (_la==T__20) {
				{
				setState(255); match(T__20);
				setState(256); format();
				}
			}

			setState(259); match(T__31);
			setState(260); match(T__36);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Axis_ptsContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(A2LParser.ID, 0); }
		public TerminalNode HEX() { return getToken(A2LParser.HEX, 0); }
		public TerminalNode STRING() { return getToken(A2LParser.STRING, 0); }
		public Axis_ptsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_axis_pts; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof A2LListener ) ((A2LListener)listener).enterAxis_pts(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof A2LListener ) ((A2LListener)listener).exitAxis_pts(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof A2LVisitor ) return ((A2LVisitor<? extends T>)visitor).visitAxis_pts(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Axis_ptsContext axis_pts() throws RecognitionException {
		Axis_ptsContext _localctx = new Axis_ptsContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_axis_pts);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(262); match(T__4);
			setState(263); match(T__53);
			setState(264); match(ID);
			setState(265); match(STRING);
			setState(266); match(HEX);
			setState(267); match(T__31);
			setState(268); match(T__53);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IncludeContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(A2LParser.STRING, 0); }
		public IncludeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_include; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof A2LListener ) ((A2LListener)listener).enterInclude(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof A2LListener ) ((A2LListener)listener).exitInclude(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof A2LVisitor ) return ((A2LVisitor<? extends T>)visitor).visitInclude(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IncludeContext include() throws RecognitionException {
		IncludeContext _localctx = new IncludeContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_include);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(270); match(T__32);
			setState(271); match(STRING);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FormatContext extends ParserRuleContext {
		public TerminalNode INT(int i) {
			return getToken(A2LParser.INT, i);
		}
		public List<TerminalNode> INT() { return getTokens(A2LParser.INT); }
		public FormatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_format; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof A2LListener ) ((A2LListener)listener).enterFormat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof A2LListener ) ((A2LListener)listener).exitFormat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof A2LVisitor ) return ((A2LVisitor<? extends T>)visitor).visitFormat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FormatContext format() throws RecognitionException {
		FormatContext _localctx = new FormatContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_format);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(273); match(T__18);
			setState(274); match(INT);
			setState(275); match(T__12);
			setState(276); match(INT);
			setState(277); match(T__16);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AmlContext extends ParserRuleContext {
		public List<DeclarationContext> declaration() {
			return getRuleContexts(DeclarationContext.class);
		}
		public DeclarationContext declaration(int i) {
			return getRuleContext(DeclarationContext.class,i);
		}
		public AmlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aml; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof A2LListener ) ((A2LListener)listener).enterAml(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof A2LListener ) ((A2LListener)listener).exitAml(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof A2LVisitor ) return ((A2LVisitor<? extends T>)visitor).visitAml(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AmlContext aml() throws RecognitionException {
		AmlContext _localctx = new AmlContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_aml);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(282);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__62) | (1L << T__59) | (1L << T__57) | (1L << T__51) | (1L << T__50) | (1L << T__47) | (1L << T__43) | (1L << T__42) | (1L << T__40) | (1L << T__30) | (1L << T__19) | (1L << T__15) | (1L << T__9))) != 0) || _la==ID || _la==TAG) {
				{
				{
				setState(279); declaration();
				}
				}
				setState(284);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclarationContext extends ParserRuleContext {
		public Block_definitionContext block_definition() {
			return getRuleContext(Block_definitionContext.class,0);
		}
		public Type_definitionContext type_definition() {
			return getRuleContext(Type_definitionContext.class,0);
		}
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof A2LListener ) ((A2LListener)listener).enterDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof A2LListener ) ((A2LListener)listener).exitDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof A2LVisitor ) return ((A2LVisitor<? extends T>)visitor).visitDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(287);
			switch (_input.LA(1)) {
			case T__62:
			case T__59:
			case T__57:
			case T__51:
			case T__50:
			case T__47:
			case T__43:
			case T__42:
			case T__30:
			case T__19:
			case T__15:
			case T__9:
			case ID:
			case TAG:
				{
				setState(285); type_definition();
				}
				break;
			case T__40:
				{
				setState(286); block_definition();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(289); match(T__24);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Type_definitionContext extends ParserRuleContext {
		public Type_nameContext type_name() {
			return getRuleContext(Type_nameContext.class,0);
		}
		public Type_definitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_definition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof A2LListener ) ((A2LListener)listener).enterType_definition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof A2LListener ) ((A2LListener)listener).exitType_definition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof A2LVisitor ) return ((A2LVisitor<? extends T>)visitor).visitType_definition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Type_definitionContext type_definition() throws RecognitionException {
		Type_definitionContext _localctx = new Type_definitionContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_type_definition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(291); type_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Type_nameContext extends ParserRuleContext {
		public Predefined_type_nameContext name;
		public Enum_type_nameContext enum_type_name() {
			return getRuleContext(Enum_type_nameContext.class,0);
		}
		public TerminalNode TAG() { return getToken(A2LParser.TAG, 0); }
		public Predefined_type_nameContext predefined_type_name() {
			return getRuleContext(Predefined_type_nameContext.class,0);
		}
		public Struct_type_nameContext struct_type_name() {
			return getRuleContext(Struct_type_nameContext.class,0);
		}
		public Taggedstruct_type_nameContext taggedstruct_type_name() {
			return getRuleContext(Taggedstruct_type_nameContext.class,0);
		}
		public Taggedunion_type_nameContext taggedunion_type_name() {
			return getRuleContext(Taggedunion_type_nameContext.class,0);
		}
		public Type_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof A2LListener ) ((A2LListener)listener).enterType_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof A2LListener ) ((A2LListener)listener).exitType_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof A2LVisitor ) return ((A2LVisitor<? extends T>)visitor).visitType_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Type_nameContext type_name() throws RecognitionException {
		Type_nameContext _localctx = new Type_nameContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_type_name);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(294);
			_la = _input.LA(1);
			if (_la==TAG) {
				{
				setState(293); match(TAG);
				}
			}

			setState(301);
			switch (_input.LA(1)) {
			case T__62:
			case T__59:
			case T__57:
			case T__51:
			case T__50:
			case T__43:
			case T__42:
			case T__15:
				{
				setState(296); ((Type_nameContext)_localctx).name = predefined_type_name();
				}
				break;
			case T__30:
				{
				setState(297); ((Type_nameContext)_localctx).name = struct_type_name();
				}
				break;
			case T__47:
			case ID:
				{
				setState(298); ((Type_nameContext)_localctx).name = taggedstruct_type_name();
				}
				break;
			case T__9:
				{
				setState(299); ((Type_nameContext)_localctx).name = taggedunion_type_name();
				}
				break;
			case T__19:
				{
				setState(300); ((Type_nameContext)_localctx).name = enum_type_name();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Predefined_type_nameContext extends ParserRuleContext {
		public Token name;
		public Predefined_type_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_predefined_type_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof A2LListener ) ((A2LListener)listener).enterPredefined_type_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof A2LListener ) ((A2LListener)listener).exitPredefined_type_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof A2LVisitor ) return ((A2LVisitor<? extends T>)visitor).visitPredefined_type_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Predefined_type_nameContext predefined_type_name() throws RecognitionException {
		Predefined_type_nameContext _localctx = new Predefined_type_nameContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_predefined_type_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(311);
			switch (_input.LA(1)) {
			case T__59:
				{
				setState(303); ((Predefined_type_nameContext)_localctx).name = match(T__59);
				}
				break;
			case T__50:
				{
				setState(304); ((Predefined_type_nameContext)_localctx).name = match(T__50);
				}
				break;
			case T__42:
				{
				setState(305); ((Predefined_type_nameContext)_localctx).name = match(T__42);
				}
				break;
			case T__62:
				{
				setState(306); ((Predefined_type_nameContext)_localctx).name = match(T__62);
				}
				break;
			case T__51:
				{
				setState(307); ((Predefined_type_nameContext)_localctx).name = match(T__51);
				}
				break;
			case T__43:
				{
				setState(308); ((Predefined_type_nameContext)_localctx).name = match(T__43);
				}
				break;
			case T__15:
				{
				setState(309); ((Predefined_type_nameContext)_localctx).name = match(T__15);
				}
				break;
			case T__57:
				{
				setState(310); ((Predefined_type_nameContext)_localctx).name = match(T__57);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Block_definitionContext extends ParserRuleContext {
		public TerminalNode TAG() { return getToken(A2LParser.TAG, 0); }
		public Type_nameContext type_name() {
			return getRuleContext(Type_nameContext.class,0);
		}
		public Block_definitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block_definition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof A2LListener ) ((A2LListener)listener).enterBlock_definition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof A2LListener ) ((A2LListener)listener).exitBlock_definition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof A2LVisitor ) return ((A2LVisitor<? extends T>)visitor).visitBlock_definition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Block_definitionContext block_definition() throws RecognitionException {
		Block_definitionContext _localctx = new Block_definitionContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_block_definition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(313); match(T__40);
			setState(314); match(TAG);
			setState(315); type_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Enum_type_nameContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(A2LParser.ID, 0); }
		public Enumerator_listContext enumerator_list() {
			return getRuleContext(Enumerator_listContext.class,0);
		}
		public Enum_type_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enum_type_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof A2LListener ) ((A2LListener)listener).enterEnum_type_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof A2LListener ) ((A2LListener)listener).exitEnum_type_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof A2LVisitor ) return ((A2LVisitor<? extends T>)visitor).visitEnum_type_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Enum_type_nameContext enum_type_name() throws RecognitionException {
		Enum_type_nameContext _localctx = new Enum_type_nameContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_enum_type_name);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(317); match(T__19);
			setState(319);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(318); match(ID);
				}
			}

			setState(321); match(T__56);
			setState(322); enumerator_list();
			setState(323); match(T__21);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Enumerator_listContext extends ParserRuleContext {
		public List<EnumeratorContext> enumerator() {
			return getRuleContexts(EnumeratorContext.class);
		}
		public EnumeratorContext enumerator(int i) {
			return getRuleContext(EnumeratorContext.class,i);
		}
		public Enumerator_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumerator_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof A2LListener ) ((A2LListener)listener).enterEnumerator_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof A2LListener ) ((A2LListener)listener).exitEnumerator_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof A2LVisitor ) return ((A2LVisitor<? extends T>)visitor).visitEnumerator_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Enumerator_listContext enumerator_list() throws RecognitionException {
		Enumerator_listContext _localctx = new Enumerator_listContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_enumerator_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(325); enumerator();
			setState(330);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__46) {
				{
				{
				setState(326); match(T__46);
				setState(327); enumerator();
				}
				}
				setState(332);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnumeratorContext extends ParserRuleContext {
		public TerminalNode TAG() { return getToken(A2LParser.TAG, 0); }
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public EnumeratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumerator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof A2LListener ) ((A2LListener)listener).enterEnumerator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof A2LListener ) ((A2LListener)listener).exitEnumerator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof A2LVisitor ) return ((A2LVisitor<? extends T>)visitor).visitEnumerator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumeratorContext enumerator() throws RecognitionException {
		EnumeratorContext _localctx = new EnumeratorContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_enumerator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(333); match(TAG);
			setState(336);
			_la = _input.LA(1);
			if (_la==T__54) {
				{
				setState(334); match(T__54);
				setState(335); constant();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Struct_type_nameContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(A2LParser.ID, 0); }
		public List<Struct_memberContext> struct_member() {
			return getRuleContexts(Struct_memberContext.class);
		}
		public Struct_memberContext struct_member(int i) {
			return getRuleContext(Struct_memberContext.class,i);
		}
		public Struct_type_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_struct_type_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof A2LListener ) ((A2LListener)listener).enterStruct_type_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof A2LListener ) ((A2LListener)listener).exitStruct_type_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof A2LVisitor ) return ((A2LVisitor<? extends T>)visitor).visitStruct_type_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Struct_type_nameContext struct_type_name() throws RecognitionException {
		Struct_type_nameContext _localctx = new Struct_type_nameContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_struct_type_name);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(352);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				{
				{
				setState(338); match(T__30);
				setState(340);
				_la = _input.LA(1);
				if (_la==ID) {
					{
					setState(339); match(ID);
					}
				}

				setState(342); match(T__56);
				setState(346);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__62) | (1L << T__59) | (1L << T__57) | (1L << T__51) | (1L << T__50) | (1L << T__47) | (1L << T__43) | (1L << T__42) | (1L << T__30) | (1L << T__19) | (1L << T__15) | (1L << T__9))) != 0) || _la==ID || _la==TAG) {
					{
					{
					setState(343); struct_member();
					}
					}
					setState(348);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(349); match(T__21);
				}
				}
				break;
			case 2:
				{
				{
				setState(350); match(T__30);
				setState(351); match(ID);
				}
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Struct_memberContext extends ParserRuleContext {
		public MemberContext member() {
			return getRuleContext(MemberContext.class,0);
		}
		public Struct_memberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_struct_member; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof A2LListener ) ((A2LListener)listener).enterStruct_member(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof A2LListener ) ((A2LListener)listener).exitStruct_member(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof A2LVisitor ) return ((A2LVisitor<? extends T>)visitor).visitStruct_member(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Struct_memberContext struct_member() throws RecognitionException {
		Struct_memberContext _localctx = new Struct_memberContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_struct_member);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(354); member();
			setState(355); match(T__24);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MemberContext extends ParserRuleContext {
		public Type_nameContext type_name() {
			return getRuleContext(Type_nameContext.class,0);
		}
		public List<Array_specifierContext> array_specifier() {
			return getRuleContexts(Array_specifierContext.class);
		}
		public Array_specifierContext array_specifier(int i) {
			return getRuleContext(Array_specifierContext.class,i);
		}
		public MemberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_member; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof A2LListener ) ((A2LListener)listener).enterMember(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof A2LListener ) ((A2LListener)listener).exitMember(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof A2LVisitor ) return ((A2LVisitor<? extends T>)visitor).visitMember(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MemberContext member() throws RecognitionException {
		MemberContext _localctx = new MemberContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_member);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(357); type_name();
			setState(361);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__6) {
				{
				{
				setState(358); array_specifier();
				}
				}
				setState(363);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Array_specifierContext extends ParserRuleContext {
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public Array_specifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array_specifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof A2LListener ) ((A2LListener)listener).enterArray_specifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof A2LListener ) ((A2LListener)listener).exitArray_specifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof A2LVisitor ) return ((A2LVisitor<? extends T>)visitor).visitArray_specifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Array_specifierContext array_specifier() throws RecognitionException {
		Array_specifierContext _localctx = new Array_specifierContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_array_specifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(364); match(T__6);
			setState(365); constant();
			setState(366); match(T__38);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Taggedstruct_type_nameContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(A2LParser.ID, 0); }
		public Taggedstruct_memberContext taggedstruct_member(int i) {
			return getRuleContext(Taggedstruct_memberContext.class,i);
		}
		public List<Taggedstruct_memberContext> taggedstruct_member() {
			return getRuleContexts(Taggedstruct_memberContext.class);
		}
		public Taggedstruct_type_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_taggedstruct_type_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof A2LListener ) ((A2LListener)listener).enterTaggedstruct_type_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof A2LListener ) ((A2LListener)listener).exitTaggedstruct_type_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof A2LVisitor ) return ((A2LVisitor<? extends T>)visitor).visitTaggedstruct_type_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Taggedstruct_type_nameContext taggedstruct_type_name() throws RecognitionException {
		Taggedstruct_type_nameContext _localctx = new Taggedstruct_type_nameContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_taggedstruct_type_name);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(369);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(368); match(ID);
				}
			}

			setState(371); match(T__47);
			setState(386);
			switch (_input.LA(1)) {
			case T__56:
				{
				setState(372); match(T__56);
				setState(376);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__62) | (1L << T__59) | (1L << T__57) | (1L << T__51) | (1L << T__50) | (1L << T__48) | (1L << T__47) | (1L << T__43) | (1L << T__42) | (1L << T__40) | (1L << T__30) | (1L << T__24) | (1L << T__19) | (1L << T__15) | (1L << T__9))) != 0) || _la==ID || _la==TAG) {
					{
					{
					setState(373); taggedstruct_member();
					}
					}
					setState(378);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(379); match(T__21);
				}
				break;
			case T__62:
			case T__59:
			case T__57:
			case T__51:
			case T__50:
			case T__48:
			case T__47:
			case T__43:
			case T__42:
			case T__40:
			case T__30:
			case T__24:
			case T__19:
			case T__15:
			case T__9:
			case T__6:
			case T__0:
			case ID:
			case TAG:
				{
				setState(383);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(380); taggedstruct_member();
						}
						} 
					}
					setState(385);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Taggedstruct_memberContext extends ParserRuleContext {
		public Taggedstruct_definitionContext taggedstruct_definition() {
			return getRuleContext(Taggedstruct_definitionContext.class,0);
		}
		public Block_definitionContext block_definition() {
			return getRuleContext(Block_definitionContext.class,0);
		}
		public Taggedstruct_memberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_taggedstruct_member; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof A2LListener ) ((A2LListener)listener).enterTaggedstruct_member(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof A2LListener ) ((A2LListener)listener).exitTaggedstruct_member(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof A2LVisitor ) return ((A2LVisitor<? extends T>)visitor).visitTaggedstruct_member(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Taggedstruct_memberContext taggedstruct_member() throws RecognitionException {
		Taggedstruct_memberContext _localctx = new Taggedstruct_memberContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_taggedstruct_member);
		try {
			setState(406);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(388); taggedstruct_definition();
				setState(389); match(T__24);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(391); match(T__48);
				setState(392); taggedstruct_definition();
				setState(393); match(T__0);
				setState(394); match(T__14);
				setState(395); match(T__24);
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(397); block_definition();
				setState(398); match(T__24);
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				{
				setState(400); match(T__48);
				setState(401); block_definition();
				setState(402); match(T__0);
				setState(403); match(T__14);
				setState(404); match(T__24);
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Taggedstruct_definitionContext extends ParserRuleContext {
		public TerminalNode TAG() { return getToken(A2LParser.TAG, 0); }
		public MemberContext member() {
			return getRuleContext(MemberContext.class,0);
		}
		public Taggedstruct_definitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_taggedstruct_definition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof A2LListener ) ((A2LListener)listener).enterTaggedstruct_definition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof A2LListener ) ((A2LListener)listener).exitTaggedstruct_definition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof A2LVisitor ) return ((A2LVisitor<? extends T>)visitor).visitTaggedstruct_definition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Taggedstruct_definitionContext taggedstruct_definition() throws RecognitionException {
		Taggedstruct_definitionContext _localctx = new Taggedstruct_definitionContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_taggedstruct_definition);
		int _la;
		try {
			setState(421);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(409);
				switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
				case 1:
					{
					setState(408); match(TAG);
					}
					break;
				}
				setState(412);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__62) | (1L << T__59) | (1L << T__57) | (1L << T__51) | (1L << T__50) | (1L << T__47) | (1L << T__43) | (1L << T__42) | (1L << T__30) | (1L << T__19) | (1L << T__15) | (1L << T__9))) != 0) || _la==ID || _la==TAG) {
					{
					setState(411); member();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(414); match(TAG);
				setState(415); match(T__48);
				setState(416); member();
				setState(417); match(T__0);
				setState(418); match(T__14);
				setState(419); match(T__24);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Taggedunion_type_nameContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(A2LParser.ID, 0); }
		public List<Tagged_union_memberContext> tagged_union_member() {
			return getRuleContexts(Tagged_union_memberContext.class);
		}
		public Tagged_union_memberContext tagged_union_member(int i) {
			return getRuleContext(Tagged_union_memberContext.class,i);
		}
		public Taggedunion_type_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_taggedunion_type_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof A2LListener ) ((A2LListener)listener).enterTaggedunion_type_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof A2LListener ) ((A2LListener)listener).exitTaggedunion_type_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof A2LVisitor ) return ((A2LVisitor<? extends T>)visitor).visitTaggedunion_type_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Taggedunion_type_nameContext taggedunion_type_name() throws RecognitionException {
		Taggedunion_type_nameContext _localctx = new Taggedunion_type_nameContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_taggedunion_type_name);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(437);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				{
				{
				setState(423); match(T__9);
				setState(425);
				_la = _input.LA(1);
				if (_la==ID) {
					{
					setState(424); match(ID);
					}
				}

				setState(427); match(T__56);
				setState(431);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__40 || _la==TAG) {
					{
					{
					setState(428); tagged_union_member();
					}
					}
					setState(433);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(434); match(T__21);
				}
				}
				break;
			case 2:
				{
				{
				setState(435); match(T__9);
				setState(436); match(ID);
				}
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Tagged_union_memberContext extends ParserRuleContext {
		public TerminalNode TAG() { return getToken(A2LParser.TAG, 0); }
		public Block_definitionContext block_definition() {
			return getRuleContext(Block_definitionContext.class,0);
		}
		public MemberContext member() {
			return getRuleContext(MemberContext.class,0);
		}
		public Tagged_union_memberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tagged_union_member; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof A2LListener ) ((A2LListener)listener).enterTagged_union_member(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof A2LListener ) ((A2LListener)listener).exitTagged_union_member(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof A2LVisitor ) return ((A2LVisitor<? extends T>)visitor).visitTagged_union_member(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Tagged_union_memberContext tagged_union_member() throws RecognitionException {
		Tagged_union_memberContext _localctx = new Tagged_union_memberContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_tagged_union_member);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(447);
			switch (_input.LA(1)) {
			case TAG:
				{
				setState(439); match(TAG);
				setState(441);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__62) | (1L << T__59) | (1L << T__57) | (1L << T__51) | (1L << T__50) | (1L << T__47) | (1L << T__43) | (1L << T__42) | (1L << T__30) | (1L << T__19) | (1L << T__15) | (1L << T__9))) != 0) || _la==ID || _la==TAG) {
					{
					setState(440); member();
					}
				}

				setState(443); match(T__24);
				}
				break;
			case T__40:
				{
				setState(444); block_definition();
				setState(445); match(T__24);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstantContext extends ParserRuleContext {
		public  value;
		public Token INT;
		public Token HEX;
		public Token FLOAT;
		public TerminalNode HEX() { return getToken(A2LParser.HEX, 0); }
		public TerminalNode INT() { return getToken(A2LParser.INT, 0); }
		public TerminalNode FLOAT() { return getToken(A2LParser.FLOAT, 0); }
		public ConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constant; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof A2LListener ) ((A2LListener)listener).enterConstant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof A2LListener ) ((A2LListener)listener).exitConstant(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof A2LVisitor ) return ((A2LVisitor<? extends T>)visitor).visitConstant(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstantContext constant() throws RecognitionException {
		ConstantContext _localctx = new ConstantContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_constant);
		try {
			setState(455);
			switch (_input.LA(1)) {
			case INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(449); ((ConstantContext)_localctx).INT = match(INT);
				_localctx.value = int((((ConstantContext)_localctx).INT!=null?((ConstantContext)_localctx).INT.getText():null))
				}
				break;
			case HEX:
				enterOuterAlt(_localctx, 2);
				{
				setState(451); ((ConstantContext)_localctx).HEX = match(HEX);
				_localctx.value = int((((ConstantContext)_localctx).HEX!=null?((ConstantContext)_localctx).HEX.getText():null), 16)
				}
				break;
			case FLOAT:
				enterOuterAlt(_localctx, 3);
				{
				setState(453); ((ConstantContext)_localctx).FLOAT = match(FLOAT);
				_localctx.value = float((((ConstantContext)_localctx).FLOAT!=null?((ConstantContext)_localctx).FLOAT.getText():null))
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3L\u01cc\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\6\4V\n\4\r\4\16\4W\3\4\3\4\3\4\3\5\3\5\3\5\5\5`\n\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\5\6m\n\6\3\6\3\6\5\6q\n\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\7\t\u00a6\n\t\f\t"+
		"\16\t\u00a9\13\t\3\t\7\t\u00ac\n\t\f\t\16\t\u00af\13\t\3\t\3\t\3\t\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\7\n\u00c4"+
		"\n\n\f\n\16\n\u00c7\13\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\5\13\u00d0\n"+
		"\13\3\13\7\13\u00d3\n\13\f\13\16\13\u00d6\13\13\3\13\3\13\3\13\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\5\f\u00e2\n\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r"+
		"\3\r\7\r\u00ee\n\r\f\r\16\r\u00f1\13\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u0104\n\16\3\16"+
		"\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\22\7\22\u011b\n\22\f\22\16\22\u011e\13\22"+
		"\3\23\3\23\5\23\u0122\n\23\3\23\3\23\3\24\3\24\3\25\5\25\u0129\n\25\3"+
		"\25\3\25\3\25\3\25\3\25\5\25\u0130\n\25\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\5\26\u013a\n\26\3\27\3\27\3\27\3\27\3\30\3\30\5\30\u0142\n"+
		"\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\7\31\u014b\n\31\f\31\16\31\u014e"+
		"\13\31\3\32\3\32\3\32\5\32\u0153\n\32\3\33\3\33\5\33\u0157\n\33\3\33\3"+
		"\33\7\33\u015b\n\33\f\33\16\33\u015e\13\33\3\33\3\33\3\33\5\33\u0163\n"+
		"\33\3\34\3\34\3\34\3\35\3\35\7\35\u016a\n\35\f\35\16\35\u016d\13\35\3"+
		"\36\3\36\3\36\3\36\3\37\5\37\u0174\n\37\3\37\3\37\3\37\7\37\u0179\n\37"+
		"\f\37\16\37\u017c\13\37\3\37\3\37\7\37\u0180\n\37\f\37\16\37\u0183\13"+
		"\37\5\37\u0185\n\37\3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3"+
		" \3 \5 \u0199\n \3!\5!\u019c\n!\3!\5!\u019f\n!\3!\3!\3!\3!\3!\3!\3!\5"+
		"!\u01a8\n!\3\"\3\"\5\"\u01ac\n\"\3\"\3\"\7\"\u01b0\n\"\f\"\16\"\u01b3"+
		"\13\"\3\"\3\"\3\"\5\"\u01b8\n\"\3#\3#\5#\u01bc\n#\3#\3#\3#\3#\5#\u01c2"+
		"\n#\3$\3$\3$\3$\3$\3$\5$\u01ca\n$\3$\2\2%\2\4\6\b\n\f\16\20\22\24\26\30"+
		"\32\34\36 \"$&(*,.\60\62\64\668:<>@BDF\2\2\u01db\2H\3\2\2\2\4K\3\2\2\2"+
		"\6O\3\2\2\2\b\\\3\2\2\2\ni\3\2\2\2\fw\3\2\2\2\16}\3\2\2\2\20\u0091\3\2"+
		"\2\2\22\u00b3\3\2\2\2\24\u00cb\3\2\2\2\26\u00da\3\2\2\2\30\u00e8\3\2\2"+
		"\2\32\u00f5\3\2\2\2\34\u0108\3\2\2\2\36\u0110\3\2\2\2 \u0113\3\2\2\2\""+
		"\u011c\3\2\2\2$\u0121\3\2\2\2&\u0125\3\2\2\2(\u0128\3\2\2\2*\u0139\3\2"+
		"\2\2,\u013b\3\2\2\2.\u013f\3\2\2\2\60\u0147\3\2\2\2\62\u014f\3\2\2\2\64"+
		"\u0162\3\2\2\2\66\u0164\3\2\2\28\u0167\3\2\2\2:\u016e\3\2\2\2<\u0173\3"+
		"\2\2\2>\u0198\3\2\2\2@\u01a7\3\2\2\2B\u01b7\3\2\2\2D\u01c1\3\2\2\2F\u01c9"+
		"\3\2\2\2HI\5\4\3\2IJ\5\6\4\2J\3\3\2\2\2KL\7\'\2\2LM\7E\2\2MN\7E\2\2N\5"+
		"\3\2\2\2OP\7=\2\2PQ\7\5\2\2QR\7D\2\2RS\7J\2\2SU\5\b\5\2TV\5\n\6\2UT\3"+
		"\2\2\2VW\3\2\2\2WU\3\2\2\2WX\3\2\2\2XY\3\2\2\2YZ\7\"\2\2Z[\7\5\2\2[\7"+
		"\3\2\2\2\\]\7=\2\2]_\7+\2\2^`\7D\2\2_^\3\2\2\2_`\3\2\2\2`a\3\2\2\2ab\7"+
		"J\2\2bc\7\30\2\2cd\7J\2\2de\7\36\2\2ef\7D\2\2fg\7\"\2\2gh\7+\2\2h\t\3"+
		"\2\2\2ij\7=\2\2jl\7\7\2\2km\7D\2\2lk\3\2\2\2lm\3\2\2\2mn\3\2\2\2np\7J"+
		"\2\2oq\5\f\7\2po\3\2\2\2pq\3\2\2\2qr\3\2\2\2rs\5\16\b\2st\5\20\t\2tu\7"+
		"\"\2\2uv\7\7\2\2v\13\3\2\2\2wx\7=\2\2xy\7 \2\2yz\5\"\22\2z{\7\"\2\2{|"+
		"\7 \2\2|\r\3\2\2\2}~\7=\2\2~\177\7>\2\2\177\u0080\7J\2\2\u0080\u0081\7"+
		"\25\2\2\u0081\u0082\7D\2\2\u0082\u0083\7\24\2\2\u0083\u0084\7D\2\2\u0084"+
		"\u0085\7*\2\2\u0085\u0086\7E\2\2\u0086\u0087\7@\2\2\u0087\u0088\7E\2\2"+
		"\u0088\u0089\7\66\2\2\u0089\u008a\7E\2\2\u008a\u008b\7\20\2\2\u008b\u008c"+
		"\7E\2\2\u008c\u008d\7\4\2\2\u008d\u008e\7E\2\2\u008e\u008f\7\"\2\2\u008f"+
		"\u0090\7>\2\2\u0090\17\3\2\2\2\u0091\u0092\7=\2\2\u0092\u0093\7(\2\2\u0093"+
		"\u0094\7J\2\2\u0094\u0095\7\30\2\2\u0095\u0096\7J\2\2\u0096\u0097\7%\2"+
		"\2\u0097\u0098\7F\2\2\u0098\u0099\7?\2\2\u0099\u009a\7J\2\2\u009a\u009b"+
		"\7\67\2\2\u009b\u009c\7J\2\2\u009c\u009d\7:\2\2\u009d\u009e\7J\2\2\u009e"+
		"\u009f\7\37\2\2\u009f\u00a0\7J\2\2\u00a0\u00a1\7\n\2\2\u00a1\u00a2\7J"+
		"\2\2\u00a2\u00a3\7\64\2\2\u00a3\u00a7\7J\2\2\u00a4\u00a6\5\22\n\2\u00a5"+
		"\u00a4\3\2\2\2\u00a6\u00a9\3\2\2\2\u00a7\u00a5\3\2\2\2\u00a7\u00a8\3\2"+
		"\2\2\u00a8\u00ad\3\2\2\2\u00a9\u00a7\3\2\2\2\u00aa\u00ac\5\30\r\2\u00ab"+
		"\u00aa\3\2\2\2\u00ac\u00af\3\2\2\2\u00ad\u00ab\3\2\2\2\u00ad\u00ae\3\2"+
		"\2\2\u00ae\u00b0\3\2\2\2\u00af\u00ad\3\2\2\2\u00b0\u00b1\7\"\2\2\u00b1"+
		"\u00b2\7(\2\2\u00b2\21\3\2\2\2\u00b3\u00b4\7=\2\2\u00b4\u00b5\79\2\2\u00b5"+
		"\u00b6\7D\2\2\u00b6\u00b7\7D\2\2\u00b7\u00b8\7J\2\2\u00b8\u00b9\7D\2\2"+
		"\u00b9\u00ba\7D\2\2\u00ba\u00bb\7D\2\2\u00bb\u00bc\7F\2\2\u00bc\u00bd"+
		"\7F\2\2\u00bd\u00be\7E\2\2\u00be\u00bf\7E\2\2\u00bf\u00c0\7E\2\2\u00c0"+
		"\u00c1\7E\2\2\u00c1\u00c5\7E\2\2\u00c2\u00c4\5\24\13\2\u00c3\u00c2\3\2"+
		"\2\2\u00c4\u00c7\3\2\2\2\u00c5\u00c3\3\2\2\2\u00c5\u00c6\3\2\2\2\u00c6"+
		"\u00c8\3\2\2\2\u00c7\u00c5\3\2\2\2\u00c8\u00c9\7\"\2\2\u00c9\u00ca\79"+
		"\2\2\u00ca\23\3\2\2\2\u00cb\u00cc\7=\2\2\u00cc\u00cd\7\32\2\2\u00cd\u00cf"+
		"\7D\2\2\u00ce\u00d0\7F\2\2\u00cf\u00ce\3\2\2\2\u00cf\u00d0\3\2\2\2\u00d0"+
		"\u00d4\3\2\2\2\u00d1\u00d3\7K\2\2\u00d2\u00d1\3\2\2\2\u00d3\u00d6\3\2"+
		"\2\2\u00d4\u00d2\3\2\2\2\u00d4\u00d5\3\2\2\2\u00d5\u00d7\3\2\2\2\u00d6"+
		"\u00d4\3\2\2\2\u00d7\u00d8\7\"\2\2\u00d8\u00d9\7\32\2\2\u00d9\25\3\2\2"+
		"\2\u00da\u00db\7=\2\2\u00db\u00dc\7\60\2\2\u00dc\u00dd\7D\2\2\u00dd\u00e1"+
		"\7J\2\2\u00de\u00e2\7\34\2\2\u00df\u00e2\7$\2\2\u00e0\u00e2\7<\2\2\u00e1"+
		"\u00de\3\2\2\2\u00e1\u00df\3\2\2\2\u00e1\u00e0\3\2\2\2\u00e2\u00e3\3\2"+
		"\2\2\u00e3\u00e4\5 \21\2\u00e4\u00e5\7C\2\2\u00e5\u00e6\7\"\2\2\u00e6"+
		"\u00e7\7\60\2\2\u00e7\27\3\2\2\2\u00e8\u00e9\7=\2\2\u00e9\u00ea\7\r\2"+
		"\2\u00ea\u00eb\7J\2\2\u00eb\u00ef\7E\2\2\u00ec\u00ee\7K\2\2\u00ed\u00ec"+
		"\3\2\2\2\u00ee\u00f1\3\2\2\2\u00ef\u00ed\3\2\2\2\u00ef\u00f0\3\2\2\2\u00f0"+
		"\u00f2\3\2\2\2\u00f1\u00ef\3\2\2\2\u00f2\u00f3\7\"\2\2\u00f3\u00f4\7\r"+
		"\2\2\u00f4\31\3\2\2\2\u00f5\u00f6\7=\2\2\u00f6\u00f7\7\35\2\2\u00f7\u00f8"+
		"\7D\2\2\u00f8\u00f9\7J\2\2\u00f9\u00fa\7B\2\2\u00fa\u00fb\7D\2\2\u00fb"+
		"\u00fc\7E\2\2\u00fc\u00fd\7E\2\2\u00fd\u00fe\7E\2\2\u00fe\u00ff\7E\2\2"+
		"\u00ff\u0100\7&\2\2\u0100\u0103\7F\2\2\u0101\u0102\7-\2\2\u0102\u0104"+
		"\5 \21\2\u0103\u0101\3\2\2\2\u0103\u0104\3\2\2\2\u0104\u0105\3\2\2\2\u0105"+
		"\u0106\7\"\2\2\u0106\u0107\7\35\2\2\u0107\33\3\2\2\2\u0108\u0109\7=\2"+
		"\2\u0109\u010a\7\f\2\2\u010a\u010b\7D\2\2\u010b\u010c\7J\2\2\u010c\u010d"+
		"\7F\2\2\u010d\u010e\7\"\2\2\u010e\u010f\7\f\2\2\u010f\35\3\2\2\2\u0110"+
		"\u0111\7!\2\2\u0111\u0112\7J\2\2\u0112\37\3\2\2\2\u0113\u0114\7/\2\2\u0114"+
		"\u0115\7E\2\2\u0115\u0116\7\65\2\2\u0116\u0117\7E\2\2\u0117\u0118\7\61"+
		"\2\2\u0118!\3\2\2\2\u0119\u011b\5$\23\2\u011a\u0119\3\2\2\2\u011b\u011e"+
		"\3\2\2\2\u011c\u011a\3\2\2\2\u011c\u011d\3\2\2\2\u011d#\3\2\2\2\u011e"+
		"\u011c\3\2\2\2\u011f\u0122\5&\24\2\u0120\u0122\5,\27\2\u0121\u011f\3\2"+
		"\2\2\u0121\u0120\3\2\2\2\u0122\u0123\3\2\2\2\u0123\u0124\7)\2\2\u0124"+
		"%\3\2\2\2\u0125\u0126\5(\25\2\u0126\'\3\2\2\2\u0127\u0129\7L\2\2\u0128"+
		"\u0127\3\2\2\2\u0128\u0129\3\2\2\2\u0129\u012f\3\2\2\2\u012a\u0130\5*"+
		"\26\2\u012b\u0130\5\64\33\2\u012c\u0130\5<\37\2\u012d\u0130\5B\"\2\u012e"+
		"\u0130\5.\30\2\u012f\u012a\3\2\2\2\u012f\u012b\3\2\2\2\u012f\u012c\3\2"+
		"\2\2\u012f\u012d\3\2\2\2\u012f\u012e\3\2\2\2\u0130)\3\2\2\2\u0131\u013a"+
		"\7\6\2\2\u0132\u013a\7\17\2\2\u0133\u013a\7\27\2\2\u0134\u013a\7\3\2\2"+
		"\u0135\u013a\7\16\2\2\u0136\u013a\7\26\2\2\u0137\u013a\7\62\2\2\u0138"+
		"\u013a\7\b\2\2\u0139\u0131\3\2\2\2\u0139\u0132\3\2\2\2\u0139\u0133\3\2"+
		"\2\2\u0139\u0134\3\2\2\2\u0139\u0135\3\2\2\2\u0139\u0136\3\2\2\2\u0139"+
		"\u0137\3\2\2\2\u0139\u0138\3\2\2\2\u013a+\3\2\2\2\u013b\u013c\7\31\2\2"+
		"\u013c\u013d\7L\2\2\u013d\u013e\5(\25\2\u013e-\3\2\2\2\u013f\u0141\7."+
		"\2\2\u0140\u0142\7D\2\2\u0141\u0140\3\2\2\2\u0141\u0142\3\2\2\2\u0142"+
		"\u0143\3\2\2\2\u0143\u0144\7\t\2\2\u0144\u0145\5\60\31\2\u0145\u0146\7"+
		",\2\2\u0146/\3\2\2\2\u0147\u014c\5\62\32\2\u0148\u0149\7\23\2\2\u0149"+
		"\u014b\5\62\32\2\u014a\u0148\3\2\2\2\u014b\u014e\3\2\2\2\u014c\u014a\3"+
		"\2\2\2\u014c\u014d\3\2\2\2\u014d\61\3\2\2\2\u014e\u014c\3\2\2\2\u014f"+
		"\u0152\7L\2\2\u0150\u0151\7\13\2\2\u0151\u0153\5F$\2\u0152\u0150\3\2\2"+
		"\2\u0152\u0153\3\2\2\2\u0153\63\3\2\2\2\u0154\u0156\7#\2\2\u0155\u0157"+
		"\7D\2\2\u0156\u0155\3\2\2\2\u0156\u0157\3\2\2\2\u0157\u0158\3\2\2\2\u0158"+
		"\u015c\7\t\2\2\u0159\u015b\5\66\34\2\u015a\u0159\3\2\2\2\u015b\u015e\3"+
		"\2\2\2\u015c\u015a\3\2\2\2\u015c\u015d\3\2\2\2\u015d\u015f\3\2\2\2\u015e"+
		"\u015c\3\2\2\2\u015f\u0163\7,\2\2\u0160\u0161\7#\2\2\u0161\u0163\7D\2"+
		"\2\u0162\u0154\3\2\2\2\u0162\u0160\3\2\2\2\u0163\65\3\2\2\2\u0164\u0165"+
		"\58\35\2\u0165\u0166\7)\2\2\u0166\67\3\2\2\2\u0167\u016b\5(\25\2\u0168"+
		"\u016a\5:\36\2\u0169\u0168\3\2\2\2\u016a\u016d\3\2\2\2\u016b\u0169\3\2"+
		"\2\2\u016b\u016c\3\2\2\2\u016c9\3\2\2\2\u016d\u016b\3\2\2\2\u016e\u016f"+
		"\7;\2\2\u016f\u0170\5F$\2\u0170\u0171\7\33\2\2\u0171;\3\2\2\2\u0172\u0174"+
		"\7D\2\2\u0173\u0172\3\2\2\2\u0173\u0174\3\2\2\2\u0174\u0175\3\2\2\2\u0175"+
		"\u0184\7\22\2\2\u0176\u017a\7\t\2\2\u0177\u0179\5> \2\u0178\u0177\3\2"+
		"\2\2\u0179\u017c\3\2\2\2\u017a\u0178\3\2\2\2\u017a\u017b\3\2\2\2\u017b"+
		"\u017d\3\2\2\2\u017c\u017a\3\2\2\2\u017d\u0185\7,\2\2\u017e\u0180\5> "+
		"\2\u017f\u017e\3\2\2\2\u0180\u0183\3\2\2\2\u0181\u017f\3\2\2\2\u0181\u0182"+
		"\3\2\2\2\u0182\u0185\3\2\2\2\u0183\u0181\3\2\2\2\u0184\u0176\3\2\2\2\u0184"+
		"\u0181\3\2\2\2\u0185=\3\2\2\2\u0186\u0187\5@!\2\u0187\u0188\7)\2\2\u0188"+
		"\u0199\3\2\2\2\u0189\u018a\7\21\2\2\u018a\u018b\5@!\2\u018b\u018c\7A\2"+
		"\2\u018c\u018d\7\63\2\2\u018d\u018e\7)\2\2\u018e\u0199\3\2\2\2\u018f\u0190"+
		"\5,\27\2\u0190\u0191\7)\2\2\u0191\u0199\3\2\2\2\u0192\u0193\7\21\2\2\u0193"+
		"\u0194\5,\27\2\u0194\u0195\7A\2\2\u0195\u0196\7\63\2\2\u0196\u0197\7)"+
		"\2\2\u0197\u0199\3\2\2\2\u0198\u0186\3\2\2\2\u0198\u0189\3\2\2\2\u0198"+
		"\u018f\3\2\2\2\u0198\u0192\3\2\2\2\u0199?\3\2\2\2\u019a\u019c\7L\2\2\u019b"+
		"\u019a\3\2\2\2\u019b\u019c\3\2\2\2\u019c\u019e\3\2\2\2\u019d\u019f\58"+
		"\35\2\u019e\u019d\3\2\2\2\u019e\u019f\3\2\2\2\u019f\u01a8\3\2\2\2\u01a0"+
		"\u01a1\7L\2\2\u01a1\u01a2\7\21\2\2\u01a2\u01a3\58\35\2\u01a3\u01a4\7A"+
		"\2\2\u01a4\u01a5\7\63\2\2\u01a5\u01a6\7)\2\2\u01a6\u01a8\3\2\2\2\u01a7"+
		"\u019b\3\2\2\2\u01a7\u01a0\3\2\2\2\u01a8A\3\2\2\2\u01a9\u01ab\78\2\2\u01aa"+
		"\u01ac\7D\2\2\u01ab\u01aa\3\2\2\2\u01ab\u01ac\3\2\2\2\u01ac\u01ad\3\2"+
		"\2\2\u01ad\u01b1\7\t\2\2\u01ae\u01b0\5D#\2\u01af\u01ae\3\2\2\2\u01b0\u01b3"+
		"\3\2\2\2\u01b1\u01af\3\2\2\2\u01b1\u01b2\3\2\2\2\u01b2\u01b4\3\2\2\2\u01b3"+
		"\u01b1\3\2\2\2\u01b4\u01b8\7,\2\2\u01b5\u01b6\78\2\2\u01b6\u01b8\7D\2"+
		"\2\u01b7\u01a9\3\2\2\2\u01b7\u01b5\3\2\2\2\u01b8C\3\2\2\2\u01b9\u01bb"+
		"\7L\2\2\u01ba\u01bc\58\35\2\u01bb\u01ba\3\2\2\2\u01bb\u01bc\3\2\2\2\u01bc"+
		"\u01bd\3\2\2\2\u01bd\u01c2\7)\2\2\u01be\u01bf\5,\27\2\u01bf\u01c0\7)\2"+
		"\2\u01c0\u01c2\3\2\2\2\u01c1\u01b9\3\2\2\2\u01c1\u01be\3\2\2\2\u01c2E"+
		"\3\2\2\2\u01c3\u01c4\7E\2\2\u01c4\u01ca\b$\1\2\u01c5\u01c6\7F\2\2\u01c6"+
		"\u01ca\b$\1\2\u01c7\u01c8\7G\2\2\u01c8\u01ca\b$\1\2\u01c9\u01c3\3\2\2"+
		"\2\u01c9\u01c5\3\2\2\2\u01c9\u01c7\3\2\2\2\u01caG\3\2\2\2(W_lp\u00a7\u00ad"+
		"\u00c5\u00cf\u00d4\u00e1\u00ef\u0103\u011c\u0121\u0128\u012f\u0139\u0141"+
		"\u014c\u0152\u0156\u015c\u0162\u016b\u0173\u017a\u0181\u0184\u0198\u019b"+
		"\u019e\u01a7\u01ab\u01b1\u01b7\u01bb\u01c1\u01c9";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}