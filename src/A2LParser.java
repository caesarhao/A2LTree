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
		T__52=1, T__51=2, T__50=3, T__49=4, T__48=5, T__47=6, T__46=7, T__45=8, 
		T__44=9, T__43=10, T__42=11, T__41=12, T__40=13, T__39=14, T__38=15, T__37=16, 
		T__36=17, T__35=18, T__34=19, T__33=20, T__32=21, T__31=22, T__30=23, 
		T__29=24, T__28=25, T__27=26, T__26=27, T__25=28, T__24=29, T__23=30, 
		T__22=31, T__21=32, T__20=33, T__19=34, T__18=35, T__17=36, T__16=37, 
		T__15=38, T__14=39, T__13=40, T__12=41, T__11=42, T__10=43, T__9=44, T__8=45, 
		T__7=46, T__6=47, T__5=48, T__4=49, T__3=50, T__2=51, T__1=52, T__0=53, 
		ID_STR=54, ID=55, INT=56, HEX=57, FLOAT=58, COMMENT=59, WS=60, STRING=61, 
		CHAR=62, TAG=63;
	public static final String[] tokenNames = {
		"<INVALID>", "'uchar'", "'/end HEADER'", "'char'", "'/begin MEMORY_SEGMENT'", 
		"'float'", "'{'", "'ECU'", "'='", "'uint'", "'int'", "'/begin CALIBRATION_METHOD'", 
		"'('", "'taggedstruct'", "','", "'ulong'", "'long'", "'/begin AXIS_PTS'", 
		"'VERSION'", "'/begin MODULE'", "'block'", "']'", "'/begin PROJECT'", 
		"'PROJECT_NO'", "'/end PROJECT'", "'A2ML'", "'PHONE_NO'", "'/end'", "'/include'", 
		"'struct'", "'/end CALIBRATION_METHOD'", "'ADDR_EPK'", "'/end IF_DATA'", 
		"'/end MODULE'", "'/begin IF_DATA'", "'ASAP2_VERSION'", "';'", "'}'", 
		"'/end MOD_PAR'", "'enum'", "'/begin MOD_PAR'", "'double'", "'*'", "'CPU_TYPE'", 
		"'CUSTOMER_NO'", "'/begin HEADER'", "'taggedunion'", "'USER'", "'['", 
		"'/begin'", "'/end AXIS_PTS'", "'EPK'", "')'", "'/end MEMORY_SEGMENT'", 
		"ID_STR", "ID", "INT", "HEX", "FLOAT", "COMMENT", "WS", "STRING", "CHAR", 
		"TAG"
	};
	public static final int
		RULE_a2l = 0, RULE_version = 1, RULE_project = 2, RULE_header = 3, RULE_module = 4, 
		RULE_a2ml = 5, RULE_mod_par = 6, RULE_memory_segment = 7, RULE_if_data = 8, 
		RULE_calibration_method = 9, RULE_axis_pts = 10, RULE_include = 11, RULE_aml = 12, 
		RULE_declaration = 13, RULE_type_definition = 14, RULE_type_name = 15, 
		RULE_predefined_type_name = 16, RULE_block_definition = 17, RULE_enum_type_name = 18, 
		RULE_enumerator_list = 19, RULE_enumerator = 20, RULE_struct_type_name = 21, 
		RULE_struct_member = 22, RULE_member = 23, RULE_array_specifier = 24, 
		RULE_taggedstruct_type_name = 25, RULE_taggedstruct_member = 26, RULE_taggedstruct_definition = 27, 
		RULE_taggedunion_type_name = 28, RULE_tagged_union_member = 29, RULE_constant = 30;
	public static final String[] ruleNames = {
		"a2l", "version", "project", "header", "module", "a2ml", "mod_par", "memory_segment", 
		"if_data", "calibration_method", "axis_pts", "include", "aml", "declaration", 
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
			setState(62); version();
			setState(63); project();
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
			setState(65); match(T__18);
			setState(66); match(INT);
			setState(67); match(INT);
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
			setState(69); match(T__31);
			setState(70); match(ID);
			setState(71); match(STRING);
			setState(72); header();
			setState(74); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(73); module();
				}
				}
				setState(76); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__34 );
			setState(78); match(T__29);
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
			setState(80); match(T__8);
			setState(82);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(81); match(ID);
				}
			}

			setState(84); match(STRING);
			setState(85); match(T__35);
			setState(86); match(STRING);
			setState(87); match(T__30);
			setState(88); match(ID);
			setState(89); match(T__51);
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
			setState(91); match(T__34);
			setState(93);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(92); match(ID);
				}
			}

			setState(95); match(STRING);
			setState(97);
			_la = _input.LA(1);
			if (_la==T__4) {
				{
				setState(96); a2ml();
				}
			}

			setState(99); mod_par();
			setState(100); match(T__20);
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
			setState(102); aml();
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
		enterRule(_localctx, 12, RULE_mod_par);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(104); match(T__13);
			setState(105); match(STRING);
			setState(106); match(T__35);
			setState(107); match(STRING);
			setState(108); match(T__22);
			setState(109); match(HEX);
			setState(110); match(T__2);
			setState(111); match(STRING);
			setState(112); match(T__9);
			setState(113); match(STRING);
			setState(114); match(T__6);
			setState(115); match(STRING);
			setState(116); match(T__27);
			setState(117); match(STRING);
			setState(118); match(T__46);
			setState(119); match(STRING);
			setState(120); match(T__10);
			setState(121); match(STRING);
			setState(125);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__49) {
				{
				{
				setState(122); memory_segment();
				}
				}
				setState(127);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(131);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__42) {
				{
				{
				setState(128); calibration_method();
				}
				}
				setState(133);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(134); match(T__15);
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
		enterRule(_localctx, 14, RULE_memory_segment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(136); match(T__49);
			setState(137); match(ID);
			setState(138); match(ID);
			setState(139); match(STRING);
			setState(140); match(ID);
			setState(141); match(ID);
			setState(142); match(ID);
			setState(143); match(HEX);
			setState(144); match(HEX);
			setState(145); match(INT);
			setState(146); match(INT);
			setState(147); match(INT);
			setState(148); match(INT);
			setState(149); match(INT);
			setState(153);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__19) {
				{
				{
				setState(150); if_data();
				}
				}
				setState(155);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(156); match(T__0);
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
		enterRule(_localctx, 16, RULE_if_data);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(158); match(T__19);
			setState(159); match(ID);
			setState(161);
			_la = _input.LA(1);
			if (_la==HEX) {
				{
				setState(160); match(HEX);
				}
			}

			setState(166);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CHAR) {
				{
				{
				setState(163); match(CHAR);
				}
				}
				setState(168);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(169); match(T__21);
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
		enterRule(_localctx, 18, RULE_calibration_method);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(171); match(T__42);
			setState(172); match(STRING);
			setState(173); match(INT);
			setState(177);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CHAR) {
				{
				{
				setState(174); match(CHAR);
				}
				}
				setState(179);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(180); match(T__23);
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
		enterRule(_localctx, 20, RULE_axis_pts);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(182); match(T__36);
			setState(183); match(ID);
			setState(184); match(STRING);
			setState(185); match(HEX);
			setState(186); match(T__3);
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
		enterRule(_localctx, 22, RULE_include);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(188); match(T__25);
			setState(189); match(STRING);
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
		enterRule(_localctx, 24, RULE_aml);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(191); match(T__4);
			setState(192); match(T__28);
			setState(196);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__52) | (1L << T__50) | (1L << T__48) | (1L << T__44) | (1L << T__43) | (1L << T__40) | (1L << T__38) | (1L << T__37) | (1L << T__33) | (1L << T__24) | (1L << T__14) | (1L << T__12) | (1L << T__7) | (1L << ID) | (1L << TAG))) != 0)) {
				{
				{
				setState(193); declaration();
				}
				}
				setState(198);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(199); match(T__26);
			setState(200); match(T__28);
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
		enterRule(_localctx, 26, RULE_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(204);
			switch (_input.LA(1)) {
			case T__52:
			case T__50:
			case T__48:
			case T__44:
			case T__43:
			case T__40:
			case T__38:
			case T__37:
			case T__24:
			case T__14:
			case T__12:
			case T__7:
			case ID:
			case TAG:
				{
				setState(202); type_definition();
				}
				break;
			case T__33:
				{
				setState(203); block_definition();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(206); match(T__17);
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
		enterRule(_localctx, 28, RULE_type_definition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(208); type_name();
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
		enterRule(_localctx, 30, RULE_type_name);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(211);
			_la = _input.LA(1);
			if (_la==TAG) {
				{
				setState(210); match(TAG);
				}
			}

			setState(218);
			switch (_input.LA(1)) {
			case T__52:
			case T__50:
			case T__48:
			case T__44:
			case T__43:
			case T__38:
			case T__37:
			case T__12:
				{
				setState(213); ((Type_nameContext)_localctx).name = predefined_type_name();
				}
				break;
			case T__24:
				{
				setState(214); ((Type_nameContext)_localctx).name = struct_type_name();
				}
				break;
			case T__40:
			case ID:
				{
				setState(215); ((Type_nameContext)_localctx).name = taggedstruct_type_name();
				}
				break;
			case T__7:
				{
				setState(216); ((Type_nameContext)_localctx).name = taggedunion_type_name();
				}
				break;
			case T__14:
				{
				setState(217); ((Type_nameContext)_localctx).name = enum_type_name();
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
		enterRule(_localctx, 32, RULE_predefined_type_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(228);
			switch (_input.LA(1)) {
			case T__50:
				{
				setState(220); ((Predefined_type_nameContext)_localctx).name = match(T__50);
				}
				break;
			case T__43:
				{
				setState(221); ((Predefined_type_nameContext)_localctx).name = match(T__43);
				}
				break;
			case T__37:
				{
				setState(222); ((Predefined_type_nameContext)_localctx).name = match(T__37);
				}
				break;
			case T__52:
				{
				setState(223); ((Predefined_type_nameContext)_localctx).name = match(T__52);
				}
				break;
			case T__44:
				{
				setState(224); ((Predefined_type_nameContext)_localctx).name = match(T__44);
				}
				break;
			case T__38:
				{
				setState(225); ((Predefined_type_nameContext)_localctx).name = match(T__38);
				}
				break;
			case T__12:
				{
				setState(226); ((Predefined_type_nameContext)_localctx).name = match(T__12);
				}
				break;
			case T__48:
				{
				setState(227); ((Predefined_type_nameContext)_localctx).name = match(T__48);
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
		enterRule(_localctx, 34, RULE_block_definition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(230); match(T__33);
			setState(231); match(TAG);
			setState(232); type_name();
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
		enterRule(_localctx, 36, RULE_enum_type_name);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(234); match(T__14);
			setState(236);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(235); match(ID);
				}
			}

			setState(238); match(T__47);
			setState(239); enumerator_list();
			setState(240); match(T__16);
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
		enterRule(_localctx, 38, RULE_enumerator_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(242); enumerator();
			setState(247);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__39) {
				{
				{
				setState(243); match(T__39);
				setState(244); enumerator();
				}
				}
				setState(249);
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
		enterRule(_localctx, 40, RULE_enumerator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(250); match(TAG);
			setState(253);
			_la = _input.LA(1);
			if (_la==T__45) {
				{
				setState(251); match(T__45);
				setState(252); constant();
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
		enterRule(_localctx, 42, RULE_struct_type_name);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(269);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				{
				{
				setState(255); match(T__24);
				setState(257);
				_la = _input.LA(1);
				if (_la==ID) {
					{
					setState(256); match(ID);
					}
				}

				setState(259); match(T__47);
				setState(263);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__52) | (1L << T__50) | (1L << T__48) | (1L << T__44) | (1L << T__43) | (1L << T__40) | (1L << T__38) | (1L << T__37) | (1L << T__24) | (1L << T__14) | (1L << T__12) | (1L << T__7) | (1L << ID) | (1L << TAG))) != 0)) {
					{
					{
					setState(260); struct_member();
					}
					}
					setState(265);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(266); match(T__16);
				}
				}
				break;
			case 2:
				{
				{
				setState(267); match(T__24);
				setState(268); match(ID);
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
		enterRule(_localctx, 44, RULE_struct_member);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(271); member();
			setState(272); match(T__17);
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
		enterRule(_localctx, 46, RULE_member);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(274); type_name();
			setState(278);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__5) {
				{
				{
				setState(275); array_specifier();
				}
				}
				setState(280);
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
		enterRule(_localctx, 48, RULE_array_specifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(281); match(T__5);
			setState(282); constant();
			setState(283); match(T__32);
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
		enterRule(_localctx, 50, RULE_taggedstruct_type_name);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(286);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(285); match(ID);
				}
			}

			setState(288); match(T__40);
			setState(303);
			switch (_input.LA(1)) {
			case T__47:
				{
				setState(289); match(T__47);
				setState(293);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__52) | (1L << T__50) | (1L << T__48) | (1L << T__44) | (1L << T__43) | (1L << T__41) | (1L << T__40) | (1L << T__38) | (1L << T__37) | (1L << T__33) | (1L << T__24) | (1L << T__17) | (1L << T__14) | (1L << T__12) | (1L << T__7) | (1L << ID) | (1L << TAG))) != 0)) {
					{
					{
					setState(290); taggedstruct_member();
					}
					}
					setState(295);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(296); match(T__16);
				}
				break;
			case T__52:
			case T__50:
			case T__48:
			case T__44:
			case T__43:
			case T__41:
			case T__40:
			case T__38:
			case T__37:
			case T__33:
			case T__24:
			case T__17:
			case T__14:
			case T__12:
			case T__7:
			case T__5:
			case T__1:
			case ID:
			case TAG:
				{
				setState(300);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(297); taggedstruct_member();
						}
						} 
					}
					setState(302);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
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
		enterRule(_localctx, 52, RULE_taggedstruct_member);
		try {
			setState(323);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(305); taggedstruct_definition();
				setState(306); match(T__17);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(308); match(T__41);
				setState(309); taggedstruct_definition();
				setState(310); match(T__1);
				setState(311); match(T__11);
				setState(312); match(T__17);
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(314); block_definition();
				setState(315); match(T__17);
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				{
				setState(317); match(T__41);
				setState(318); block_definition();
				setState(319); match(T__1);
				setState(320); match(T__11);
				setState(321); match(T__17);
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
		enterRule(_localctx, 54, RULE_taggedstruct_definition);
		int _la;
		try {
			setState(338);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(326);
				switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
				case 1:
					{
					setState(325); match(TAG);
					}
					break;
				}
				setState(329);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__52) | (1L << T__50) | (1L << T__48) | (1L << T__44) | (1L << T__43) | (1L << T__40) | (1L << T__38) | (1L << T__37) | (1L << T__24) | (1L << T__14) | (1L << T__12) | (1L << T__7) | (1L << ID) | (1L << TAG))) != 0)) {
					{
					setState(328); member();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(331); match(TAG);
				setState(332); match(T__41);
				setState(333); member();
				setState(334); match(T__1);
				setState(335); match(T__11);
				setState(336); match(T__17);
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
		enterRule(_localctx, 56, RULE_taggedunion_type_name);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(354);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				{
				{
				setState(340); match(T__7);
				setState(342);
				_la = _input.LA(1);
				if (_la==ID) {
					{
					setState(341); match(ID);
					}
				}

				setState(344); match(T__47);
				setState(348);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__33 || _la==TAG) {
					{
					{
					setState(345); tagged_union_member();
					}
					}
					setState(350);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(351); match(T__16);
				}
				}
				break;
			case 2:
				{
				{
				setState(352); match(T__7);
				setState(353); match(ID);
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
		enterRule(_localctx, 58, RULE_tagged_union_member);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(364);
			switch (_input.LA(1)) {
			case TAG:
				{
				setState(356); match(TAG);
				setState(358);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__52) | (1L << T__50) | (1L << T__48) | (1L << T__44) | (1L << T__43) | (1L << T__40) | (1L << T__38) | (1L << T__37) | (1L << T__24) | (1L << T__14) | (1L << T__12) | (1L << T__7) | (1L << ID) | (1L << TAG))) != 0)) {
					{
					setState(357); member();
					}
				}

				setState(360); match(T__17);
				}
				break;
			case T__33:
				{
				setState(361); block_definition();
				setState(362); match(T__17);
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
		enterRule(_localctx, 60, RULE_constant);
		try {
			setState(372);
			switch (_input.LA(1)) {
			case INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(366); ((ConstantContext)_localctx).INT = match(INT);
				_localctx.value = int((((ConstantContext)_localctx).INT!=null?((ConstantContext)_localctx).INT.getText():null))
				}
				break;
			case HEX:
				enterOuterAlt(_localctx, 2);
				{
				setState(368); ((ConstantContext)_localctx).HEX = match(HEX);
				_localctx.value = int((((ConstantContext)_localctx).HEX!=null?((ConstantContext)_localctx).HEX.getText():null), 16)
				}
				break;
			case FLOAT:
				enterOuterAlt(_localctx, 3);
				{
				setState(370); ((ConstantContext)_localctx).FLOAT = match(FLOAT);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3A\u0179\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \3\2"+
		"\3\2\3\2\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\6\4M\n\4\r\4\16\4N\3\4\3"+
		"\4\3\5\3\5\5\5U\n\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\5\6`\n\6\3\6\3"+
		"\6\5\6d\n\6\3\6\3\6\3\6\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\7\b~\n\b\f\b\16\b\u0081\13\b\3"+
		"\b\7\b\u0084\n\b\f\b\16\b\u0087\13\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\7\t\u009a\n\t\f\t\16\t\u009d\13\t\3"+
		"\t\3\t\3\n\3\n\3\n\5\n\u00a4\n\n\3\n\7\n\u00a7\n\n\f\n\16\n\u00aa\13\n"+
		"\3\n\3\n\3\13\3\13\3\13\3\13\7\13\u00b2\n\13\f\13\16\13\u00b5\13\13\3"+
		"\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\16\3\16\3\16\7\16\u00c5"+
		"\n\16\f\16\16\16\u00c8\13\16\3\16\3\16\3\16\3\17\3\17\5\17\u00cf\n\17"+
		"\3\17\3\17\3\20\3\20\3\21\5\21\u00d6\n\21\3\21\3\21\3\21\3\21\3\21\5\21"+
		"\u00dd\n\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u00e7\n\22\3"+
		"\23\3\23\3\23\3\23\3\24\3\24\5\24\u00ef\n\24\3\24\3\24\3\24\3\24\3\25"+
		"\3\25\3\25\7\25\u00f8\n\25\f\25\16\25\u00fb\13\25\3\26\3\26\3\26\5\26"+
		"\u0100\n\26\3\27\3\27\5\27\u0104\n\27\3\27\3\27\7\27\u0108\n\27\f\27\16"+
		"\27\u010b\13\27\3\27\3\27\3\27\5\27\u0110\n\27\3\30\3\30\3\30\3\31\3\31"+
		"\7\31\u0117\n\31\f\31\16\31\u011a\13\31\3\32\3\32\3\32\3\32\3\33\5\33"+
		"\u0121\n\33\3\33\3\33\3\33\7\33\u0126\n\33\f\33\16\33\u0129\13\33\3\33"+
		"\3\33\7\33\u012d\n\33\f\33\16\33\u0130\13\33\5\33\u0132\n\33\3\34\3\34"+
		"\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34"+
		"\3\34\3\34\5\34\u0146\n\34\3\35\5\35\u0149\n\35\3\35\5\35\u014c\n\35\3"+
		"\35\3\35\3\35\3\35\3\35\3\35\3\35\5\35\u0155\n\35\3\36\3\36\5\36\u0159"+
		"\n\36\3\36\3\36\7\36\u015d\n\36\f\36\16\36\u0160\13\36\3\36\3\36\3\36"+
		"\5\36\u0165\n\36\3\37\3\37\5\37\u0169\n\37\3\37\3\37\3\37\3\37\5\37\u016f"+
		"\n\37\3 \3 \3 \3 \3 \3 \5 \u0177\n \3 \2\2!\2\4\6\b\n\f\16\20\22\24\26"+
		"\30\32\34\36 \"$&(*,.\60\62\64\668:<>\2\2\u0189\2@\3\2\2\2\4C\3\2\2\2"+
		"\6G\3\2\2\2\bR\3\2\2\2\n]\3\2\2\2\fh\3\2\2\2\16j\3\2\2\2\20\u008a\3\2"+
		"\2\2\22\u00a0\3\2\2\2\24\u00ad\3\2\2\2\26\u00b8\3\2\2\2\30\u00be\3\2\2"+
		"\2\32\u00c1\3\2\2\2\34\u00ce\3\2\2\2\36\u00d2\3\2\2\2 \u00d5\3\2\2\2\""+
		"\u00e6\3\2\2\2$\u00e8\3\2\2\2&\u00ec\3\2\2\2(\u00f4\3\2\2\2*\u00fc\3\2"+
		"\2\2,\u010f\3\2\2\2.\u0111\3\2\2\2\60\u0114\3\2\2\2\62\u011b\3\2\2\2\64"+
		"\u0120\3\2\2\2\66\u0145\3\2\2\28\u0154\3\2\2\2:\u0164\3\2\2\2<\u016e\3"+
		"\2\2\2>\u0176\3\2\2\2@A\5\4\3\2AB\5\6\4\2B\3\3\2\2\2CD\7%\2\2DE\7:\2\2"+
		"EF\7:\2\2F\5\3\2\2\2GH\7\30\2\2HI\79\2\2IJ\7?\2\2JL\5\b\5\2KM\5\n\6\2"+
		"LK\3\2\2\2MN\3\2\2\2NL\3\2\2\2NO\3\2\2\2OP\3\2\2\2PQ\7\32\2\2Q\7\3\2\2"+
		"\2RT\7/\2\2SU\79\2\2TS\3\2\2\2TU\3\2\2\2UV\3\2\2\2VW\7?\2\2WX\7\24\2\2"+
		"XY\7?\2\2YZ\7\31\2\2Z[\79\2\2[\\\7\4\2\2\\\t\3\2\2\2]_\7\25\2\2^`\79\2"+
		"\2_^\3\2\2\2_`\3\2\2\2`a\3\2\2\2ac\7?\2\2bd\5\f\7\2cb\3\2\2\2cd\3\2\2"+
		"\2de\3\2\2\2ef\5\16\b\2fg\7#\2\2g\13\3\2\2\2hi\5\32\16\2i\r\3\2\2\2jk"+
		"\7*\2\2kl\7?\2\2lm\7\24\2\2mn\7?\2\2no\7!\2\2op\7;\2\2pq\7\65\2\2qr\7"+
		"?\2\2rs\7.\2\2st\7?\2\2tu\7\61\2\2uv\7?\2\2vw\7\34\2\2wx\7?\2\2xy\7\t"+
		"\2\2yz\7?\2\2z{\7-\2\2{\177\7?\2\2|~\5\20\t\2}|\3\2\2\2~\u0081\3\2\2\2"+
		"\177}\3\2\2\2\177\u0080\3\2\2\2\u0080\u0085\3\2\2\2\u0081\177\3\2\2\2"+
		"\u0082\u0084\5\24\13\2\u0083\u0082\3\2\2\2\u0084\u0087\3\2\2\2\u0085\u0083"+
		"\3\2\2\2\u0085\u0086\3\2\2\2\u0086\u0088\3\2\2\2\u0087\u0085\3\2\2\2\u0088"+
		"\u0089\7(\2\2\u0089\17\3\2\2\2\u008a\u008b\7\6\2\2\u008b\u008c\79\2\2"+
		"\u008c\u008d\79\2\2\u008d\u008e\7?\2\2\u008e\u008f\79\2\2\u008f\u0090"+
		"\79\2\2\u0090\u0091\79\2\2\u0091\u0092\7;\2\2\u0092\u0093\7;\2\2\u0093"+
		"\u0094\7:\2\2\u0094\u0095\7:\2\2\u0095\u0096\7:\2\2\u0096\u0097\7:\2\2"+
		"\u0097\u009b\7:\2\2\u0098\u009a\5\22\n\2\u0099\u0098\3\2\2\2\u009a\u009d"+
		"\3\2\2\2\u009b\u0099\3\2\2\2\u009b\u009c\3\2\2\2\u009c\u009e\3\2\2\2\u009d"+
		"\u009b\3\2\2\2\u009e\u009f\7\67\2\2\u009f\21\3\2\2\2\u00a0\u00a1\7$\2"+
		"\2\u00a1\u00a3\79\2\2\u00a2\u00a4\7;\2\2\u00a3\u00a2\3\2\2\2\u00a3\u00a4"+
		"\3\2\2\2\u00a4\u00a8\3\2\2\2\u00a5\u00a7\7@\2\2\u00a6\u00a5\3\2\2\2\u00a7"+
		"\u00aa\3\2\2\2\u00a8\u00a6\3\2\2\2\u00a8\u00a9\3\2\2\2\u00a9\u00ab\3\2"+
		"\2\2\u00aa\u00a8\3\2\2\2\u00ab\u00ac\7\"\2\2\u00ac\23\3\2\2\2\u00ad\u00ae"+
		"\7\r\2\2\u00ae\u00af\7?\2\2\u00af\u00b3\7:\2\2\u00b0\u00b2\7@\2\2\u00b1"+
		"\u00b0\3\2\2\2\u00b2\u00b5\3\2\2\2\u00b3\u00b1\3\2\2\2\u00b3\u00b4\3\2"+
		"\2\2\u00b4\u00b6\3\2\2\2\u00b5\u00b3\3\2\2\2\u00b6\u00b7\7 \2\2\u00b7"+
		"\25\3\2\2\2\u00b8\u00b9\7\23\2\2\u00b9\u00ba\79\2\2\u00ba\u00bb\7?\2\2"+
		"\u00bb\u00bc\7;\2\2\u00bc\u00bd\7\64\2\2\u00bd\27\3\2\2\2\u00be\u00bf"+
		"\7\36\2\2\u00bf\u00c0\7?\2\2\u00c0\31\3\2\2\2\u00c1\u00c2\7\63\2\2\u00c2"+
		"\u00c6\7\33\2\2\u00c3\u00c5\5\34\17\2\u00c4\u00c3\3\2\2\2\u00c5\u00c8"+
		"\3\2\2\2\u00c6\u00c4\3\2\2\2\u00c6\u00c7\3\2\2\2\u00c7\u00c9\3\2\2\2\u00c8"+
		"\u00c6\3\2\2\2\u00c9\u00ca\7\35\2\2\u00ca\u00cb\7\33\2\2\u00cb\33\3\2"+
		"\2\2\u00cc\u00cf\5\36\20\2\u00cd\u00cf\5$\23\2\u00ce\u00cc\3\2\2\2\u00ce"+
		"\u00cd\3\2\2\2\u00cf\u00d0\3\2\2\2\u00d0\u00d1\7&\2\2\u00d1\35\3\2\2\2"+
		"\u00d2\u00d3\5 \21\2\u00d3\37\3\2\2\2\u00d4\u00d6\7A\2\2\u00d5\u00d4\3"+
		"\2\2\2\u00d5\u00d6\3\2\2\2\u00d6\u00dc\3\2\2\2\u00d7\u00dd\5\"\22\2\u00d8"+
		"\u00dd\5,\27\2\u00d9\u00dd\5\64\33\2\u00da\u00dd\5:\36\2\u00db\u00dd\5"+
		"&\24\2\u00dc\u00d7\3\2\2\2\u00dc\u00d8\3\2\2\2\u00dc\u00d9\3\2\2\2\u00dc"+
		"\u00da\3\2\2\2\u00dc\u00db\3\2\2\2\u00dd!\3\2\2\2\u00de\u00e7\7\5\2\2"+
		"\u00df\u00e7\7\f\2\2\u00e0\u00e7\7\22\2\2\u00e1\u00e7\7\3\2\2\u00e2\u00e7"+
		"\7\13\2\2\u00e3\u00e7\7\21\2\2\u00e4\u00e7\7+\2\2\u00e5\u00e7\7\7\2\2"+
		"\u00e6\u00de\3\2\2\2\u00e6\u00df\3\2\2\2\u00e6\u00e0\3\2\2\2\u00e6\u00e1"+
		"\3\2\2\2\u00e6\u00e2\3\2\2\2\u00e6\u00e3\3\2\2\2\u00e6\u00e4\3\2\2\2\u00e6"+
		"\u00e5\3\2\2\2\u00e7#\3\2\2\2\u00e8\u00e9\7\26\2\2\u00e9\u00ea\7A\2\2"+
		"\u00ea\u00eb\5 \21\2\u00eb%\3\2\2\2\u00ec\u00ee\7)\2\2\u00ed\u00ef\79"+
		"\2\2\u00ee\u00ed\3\2\2\2\u00ee\u00ef\3\2\2\2\u00ef\u00f0\3\2\2\2\u00f0"+
		"\u00f1\7\b\2\2\u00f1\u00f2\5(\25\2\u00f2\u00f3\7\'\2\2\u00f3\'\3\2\2\2"+
		"\u00f4\u00f9\5*\26\2\u00f5\u00f6\7\20\2\2\u00f6\u00f8\5*\26\2\u00f7\u00f5"+
		"\3\2\2\2\u00f8\u00fb\3\2\2\2\u00f9\u00f7\3\2\2\2\u00f9\u00fa\3\2\2\2\u00fa"+
		")\3\2\2\2\u00fb\u00f9\3\2\2\2\u00fc\u00ff\7A\2\2\u00fd\u00fe\7\n\2\2\u00fe"+
		"\u0100\5> \2\u00ff\u00fd\3\2\2\2\u00ff\u0100\3\2\2\2\u0100+\3\2\2\2\u0101"+
		"\u0103\7\37\2\2\u0102\u0104\79\2\2\u0103\u0102\3\2\2\2\u0103\u0104\3\2"+
		"\2\2\u0104\u0105\3\2\2\2\u0105\u0109\7\b\2\2\u0106\u0108\5.\30\2\u0107"+
		"\u0106\3\2\2\2\u0108\u010b\3\2\2\2\u0109\u0107\3\2\2\2\u0109\u010a\3\2"+
		"\2\2\u010a\u010c\3\2\2\2\u010b\u0109\3\2\2\2\u010c\u0110\7\'\2\2\u010d"+
		"\u010e\7\37\2\2\u010e\u0110\79\2\2\u010f\u0101\3\2\2\2\u010f\u010d\3\2"+
		"\2\2\u0110-\3\2\2\2\u0111\u0112\5\60\31\2\u0112\u0113\7&\2\2\u0113/\3"+
		"\2\2\2\u0114\u0118\5 \21\2\u0115\u0117\5\62\32\2\u0116\u0115\3\2\2\2\u0117"+
		"\u011a\3\2\2\2\u0118\u0116\3\2\2\2\u0118\u0119\3\2\2\2\u0119\61\3\2\2"+
		"\2\u011a\u0118\3\2\2\2\u011b\u011c\7\62\2\2\u011c\u011d\5> \2\u011d\u011e"+
		"\7\27\2\2\u011e\63\3\2\2\2\u011f\u0121\79\2\2\u0120\u011f\3\2\2\2\u0120"+
		"\u0121\3\2\2\2\u0121\u0122\3\2\2\2\u0122\u0131\7\17\2\2\u0123\u0127\7"+
		"\b\2\2\u0124\u0126\5\66\34\2\u0125\u0124\3\2\2\2\u0126\u0129\3\2\2\2\u0127"+
		"\u0125\3\2\2\2\u0127\u0128\3\2\2\2\u0128\u012a\3\2\2\2\u0129\u0127\3\2"+
		"\2\2\u012a\u0132\7\'\2\2\u012b\u012d\5\66\34\2\u012c\u012b\3\2\2\2\u012d"+
		"\u0130\3\2\2\2\u012e\u012c\3\2\2\2\u012e\u012f\3\2\2\2\u012f\u0132\3\2"+
		"\2\2\u0130\u012e\3\2\2\2\u0131\u0123\3\2\2\2\u0131\u012e\3\2\2\2\u0132"+
		"\65\3\2\2\2\u0133\u0134\58\35\2\u0134\u0135\7&\2\2\u0135\u0146\3\2\2\2"+
		"\u0136\u0137\7\16\2\2\u0137\u0138\58\35\2\u0138\u0139\7\66\2\2\u0139\u013a"+
		"\7,\2\2\u013a\u013b\7&\2\2\u013b\u0146\3\2\2\2\u013c\u013d\5$\23\2\u013d"+
		"\u013e\7&\2\2\u013e\u0146\3\2\2\2\u013f\u0140\7\16\2\2\u0140\u0141\5$"+
		"\23\2\u0141\u0142\7\66\2\2\u0142\u0143\7,\2\2\u0143\u0144\7&\2\2\u0144"+
		"\u0146\3\2\2\2\u0145\u0133\3\2\2\2\u0145\u0136\3\2\2\2\u0145\u013c\3\2"+
		"\2\2\u0145\u013f\3\2\2\2\u0146\67\3\2\2\2\u0147\u0149\7A\2\2\u0148\u0147"+
		"\3\2\2\2\u0148\u0149\3\2\2\2\u0149\u014b\3\2\2\2\u014a\u014c\5\60\31\2"+
		"\u014b\u014a\3\2\2\2\u014b\u014c\3\2\2\2\u014c\u0155\3\2\2\2\u014d\u014e"+
		"\7A\2\2\u014e\u014f\7\16\2\2\u014f\u0150\5\60\31\2\u0150\u0151\7\66\2"+
		"\2\u0151\u0152\7,\2\2\u0152\u0153\7&\2\2\u0153\u0155\3\2\2\2\u0154\u0148"+
		"\3\2\2\2\u0154\u014d\3\2\2\2\u01559\3\2\2\2\u0156\u0158\7\60\2\2\u0157"+
		"\u0159\79\2\2\u0158\u0157\3\2\2\2\u0158\u0159\3\2\2\2\u0159\u015a\3\2"+
		"\2\2\u015a\u015e\7\b\2\2\u015b\u015d\5<\37\2\u015c\u015b\3\2\2\2\u015d"+
		"\u0160\3\2\2\2\u015e\u015c\3\2\2\2\u015e\u015f\3\2\2\2\u015f\u0161\3\2"+
		"\2\2\u0160\u015e\3\2\2\2\u0161\u0165\7\'\2\2\u0162\u0163\7\60\2\2\u0163"+
		"\u0165\79\2\2\u0164\u0156\3\2\2\2\u0164\u0162\3\2\2\2\u0165;\3\2\2\2\u0166"+
		"\u0168\7A\2\2\u0167\u0169\5\60\31\2\u0168\u0167\3\2\2\2\u0168\u0169\3"+
		"\2\2\2\u0169\u016a\3\2\2\2\u016a\u016f\7&\2\2\u016b\u016c\5$\23\2\u016c"+
		"\u016d\7&\2\2\u016d\u016f\3\2\2\2\u016e\u0166\3\2\2\2\u016e\u016b\3\2"+
		"\2\2\u016f=\3\2\2\2\u0170\u0171\7:\2\2\u0171\u0177\b \1\2\u0172\u0173"+
		"\7;\2\2\u0173\u0177\b \1\2\u0174\u0175\7<\2\2\u0175\u0177\b \1\2\u0176"+
		"\u0170\3\2\2\2\u0176\u0172\3\2\2\2\u0176\u0174\3\2\2\2\u0177?\3\2\2\2"+
		"&NT_c\177\u0085\u009b\u00a3\u00a8\u00b3\u00c6\u00ce\u00d5\u00dc\u00e6"+
		"\u00ee\u00f9\u00ff\u0103\u0109\u010f\u0118\u0120\u0127\u012e\u0131\u0145"+
		"\u0148\u014b\u0154\u0158\u015e\u0164\u0168\u016e\u0176";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}