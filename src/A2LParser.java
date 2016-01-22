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
		T__28=1, T__27=2, T__26=3, T__25=4, T__24=5, T__23=6, T__22=7, T__21=8, 
		T__20=9, T__19=10, T__18=11, T__17=12, T__16=13, T__15=14, T__14=15, T__13=16, 
		T__12=17, T__11=18, T__10=19, T__9=20, T__8=21, T__7=22, T__6=23, T__5=24, 
		T__4=25, T__3=26, T__2=27, T__1=28, T__0=29, ID=30, INT=31, HEX=32, FLOAT=33, 
		COMMENT=34, WS=35, STRING=36, CHAR=37;
	public static final String[] tokenNames = {
		"<INVALID>", "'ADDR_EPK'", "'/end HEADER'", "'/end IF_DATA'", "'/end MODULE'", 
		"'/begin IF_DATA'", "'ASAP2_VERSION'", "'/begin MEMORY_SEGMENT'", "'ECU'", 
		"'/end MOD_PAR'", "'/begin MOD_PAR'", "'/begin A2ML'", "'/begin CALIBRATION_METHOD'", 
		"'CPU_TYPE'", "'CUSTOMER_NO'", "'/begin HEADER'", "'/begin AXIS_PTS'", 
		"'VERSION'", "'/begin MODULE'", "'USER'", "'/begin PROJECT'", "'PROJECT_NO'", 
		"'/end PROJECT'", "'/end AXIS_PTS'", "'PHONE_NO'", "'EPK'", "'/include'", 
		"'/end MEMORY_SEGMENT'", "'/end CALIBRATION_METHOD'", "'/end A2ML'", "ID", 
		"INT", "HEX", "FLOAT", "COMMENT", "WS", "STRING", "CHAR"
	};
	public static final int
		RULE_a2l = 0, RULE_version = 1, RULE_project = 2, RULE_header = 3, RULE_module = 4, 
		RULE_a2ml = 5, RULE_mod_par = 6, RULE_memory_segment = 7, RULE_if_data = 8, 
		RULE_calibration_method = 9, RULE_axis_pts = 10, RULE_include = 11;
	public static final String[] ruleNames = {
		"a2l", "version", "project", "header", "module", "a2ml", "mod_par", "memory_segment", 
		"if_data", "calibration_method", "axis_pts", "include"
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
			setState(24); version();
			setState(25); project();
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
			setState(27); match(T__23);
			setState(28); match(INT);
			setState(29); match(INT);
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
			setState(31); match(T__9);
			setState(32); match(ID);
			setState(33); match(STRING);
			setState(34); header();
			setState(36); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(35); module();
				}
				}
				setState(38); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__11 );
			setState(40); match(T__7);
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
			setState(42); match(T__14);
			setState(44);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(43); match(ID);
				}
			}

			setState(46); match(STRING);
			setState(47); match(T__12);
			setState(48); match(STRING);
			setState(49); match(T__8);
			setState(50); match(ID);
			setState(51); match(T__27);
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
			setState(53); match(T__11);
			setState(55);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(54); match(ID);
				}
			}

			setState(57); match(STRING);
			setState(59);
			_la = _input.LA(1);
			if (_la==T__18) {
				{
				setState(58); a2ml();
				}
			}

			setState(61); mod_par();
			setState(62); match(T__25);
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
		public TerminalNode CHAR(int i) {
			return getToken(A2LParser.CHAR, i);
		}
		public List<TerminalNode> CHAR() { return getTokens(A2LParser.CHAR); }
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(64); match(T__18);
			setState(68);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CHAR) {
				{
				{
				setState(65); match(CHAR);
				}
				}
				setState(70);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(71); match(T__0);
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
			setState(73); match(T__19);
			setState(74); match(STRING);
			setState(75); match(T__12);
			setState(76); match(STRING);
			setState(77); match(T__28);
			setState(78); match(HEX);
			setState(79); match(T__4);
			setState(80); match(STRING);
			setState(81); match(T__15);
			setState(82); match(STRING);
			setState(83); match(T__10);
			setState(84); match(STRING);
			setState(85); match(T__5);
			setState(86); match(STRING);
			setState(87); match(T__21);
			setState(88); match(STRING);
			setState(89); match(T__16);
			setState(90); match(STRING);
			setState(94);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__22) {
				{
				{
				setState(91); memory_segment();
				}
				}
				setState(96);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(100);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__17) {
				{
				{
				setState(97); calibration_method();
				}
				}
				setState(102);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(103); match(T__20);
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
			setState(105); match(T__22);
			setState(106); match(ID);
			setState(107); match(ID);
			setState(108); match(STRING);
			setState(109); match(ID);
			setState(110); match(ID);
			setState(111); match(ID);
			setState(112); match(HEX);
			setState(113); match(HEX);
			setState(114); match(INT);
			setState(115); match(INT);
			setState(116); match(INT);
			setState(117); match(INT);
			setState(118); match(INT);
			setState(122);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__24) {
				{
				{
				setState(119); if_data();
				}
				}
				setState(124);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(125); match(T__2);
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
			setState(127); match(T__24);
			setState(128); match(ID);
			setState(130);
			_la = _input.LA(1);
			if (_la==HEX) {
				{
				setState(129); match(HEX);
				}
			}

			setState(135);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CHAR) {
				{
				{
				setState(132); match(CHAR);
				}
				}
				setState(137);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(138); match(T__26);
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
			setState(140); match(T__17);
			setState(141); match(STRING);
			setState(142); match(INT);
			setState(146);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CHAR) {
				{
				{
				setState(143); match(CHAR);
				}
				}
				setState(148);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(149); match(T__1);
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
			setState(151); match(T__13);
			setState(152); match(ID);
			setState(153); match(STRING);
			setState(154); match(HEX);
			setState(155); match(T__6);
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
			setState(157); match(T__3);
			setState(158); match(STRING);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\'\u00a3\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\6"+
		"\4\'\n\4\r\4\16\4(\3\4\3\4\3\5\3\5\5\5/\n\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\6\3\6\5\6:\n\6\3\6\3\6\5\6>\n\6\3\6\3\6\3\6\3\7\3\7\7\7E\n\7\f\7"+
		"\16\7H\13\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\7\b_\n\b\f\b\16\bb\13\b\3\b\7\be\n\b\f\b\16"+
		"\bh\13\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\7\t{\n\t\f\t\16\t~\13\t\3\t\3\t\3\n\3\n\3\n\5\n\u0085\n\n\3\n\7"+
		"\n\u0088\n\n\f\n\16\n\u008b\13\n\3\n\3\n\3\13\3\13\3\13\3\13\7\13\u0093"+
		"\n\13\f\13\16\13\u0096\13\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r"+
		"\3\r\3\r\2\2\16\2\4\6\b\n\f\16\20\22\24\26\30\2\2\u00a1\2\32\3\2\2\2\4"+
		"\35\3\2\2\2\6!\3\2\2\2\b,\3\2\2\2\n\67\3\2\2\2\fB\3\2\2\2\16K\3\2\2\2"+
		"\20k\3\2\2\2\22\u0081\3\2\2\2\24\u008e\3\2\2\2\26\u0099\3\2\2\2\30\u009f"+
		"\3\2\2\2\32\33\5\4\3\2\33\34\5\6\4\2\34\3\3\2\2\2\35\36\7\b\2\2\36\37"+
		"\7!\2\2\37 \7!\2\2 \5\3\2\2\2!\"\7\26\2\2\"#\7 \2\2#$\7&\2\2$&\5\b\5\2"+
		"%\'\5\n\6\2&%\3\2\2\2\'(\3\2\2\2(&\3\2\2\2()\3\2\2\2)*\3\2\2\2*+\7\30"+
		"\2\2+\7\3\2\2\2,.\7\21\2\2-/\7 \2\2.-\3\2\2\2./\3\2\2\2/\60\3\2\2\2\60"+
		"\61\7&\2\2\61\62\7\23\2\2\62\63\7&\2\2\63\64\7\27\2\2\64\65\7 \2\2\65"+
		"\66\7\4\2\2\66\t\3\2\2\2\679\7\24\2\28:\7 \2\298\3\2\2\29:\3\2\2\2:;\3"+
		"\2\2\2;=\7&\2\2<>\5\f\7\2=<\3\2\2\2=>\3\2\2\2>?\3\2\2\2?@\5\16\b\2@A\7"+
		"\6\2\2A\13\3\2\2\2BF\7\r\2\2CE\7\'\2\2DC\3\2\2\2EH\3\2\2\2FD\3\2\2\2F"+
		"G\3\2\2\2GI\3\2\2\2HF\3\2\2\2IJ\7\37\2\2J\r\3\2\2\2KL\7\f\2\2LM\7&\2\2"+
		"MN\7\23\2\2NO\7&\2\2OP\7\3\2\2PQ\7\"\2\2QR\7\33\2\2RS\7&\2\2ST\7\20\2"+
		"\2TU\7&\2\2UV\7\25\2\2VW\7&\2\2WX\7\32\2\2XY\7&\2\2YZ\7\n\2\2Z[\7&\2\2"+
		"[\\\7\17\2\2\\`\7&\2\2]_\5\20\t\2^]\3\2\2\2_b\3\2\2\2`^\3\2\2\2`a\3\2"+
		"\2\2af\3\2\2\2b`\3\2\2\2ce\5\24\13\2dc\3\2\2\2eh\3\2\2\2fd\3\2\2\2fg\3"+
		"\2\2\2gi\3\2\2\2hf\3\2\2\2ij\7\13\2\2j\17\3\2\2\2kl\7\t\2\2lm\7 \2\2m"+
		"n\7 \2\2no\7&\2\2op\7 \2\2pq\7 \2\2qr\7 \2\2rs\7\"\2\2st\7\"\2\2tu\7!"+
		"\2\2uv\7!\2\2vw\7!\2\2wx\7!\2\2x|\7!\2\2y{\5\22\n\2zy\3\2\2\2{~\3\2\2"+
		"\2|z\3\2\2\2|}\3\2\2\2}\177\3\2\2\2~|\3\2\2\2\177\u0080\7\35\2\2\u0080"+
		"\21\3\2\2\2\u0081\u0082\7\7\2\2\u0082\u0084\7 \2\2\u0083\u0085\7\"\2\2"+
		"\u0084\u0083\3\2\2\2\u0084\u0085\3\2\2\2\u0085\u0089\3\2\2\2\u0086\u0088"+
		"\7\'\2\2\u0087\u0086\3\2\2\2\u0088\u008b\3\2\2\2\u0089\u0087\3\2\2\2\u0089"+
		"\u008a\3\2\2\2\u008a\u008c\3\2\2\2\u008b\u0089\3\2\2\2\u008c\u008d\7\5"+
		"\2\2\u008d\23\3\2\2\2\u008e\u008f\7\16\2\2\u008f\u0090\7&\2\2\u0090\u0094"+
		"\7!\2\2\u0091\u0093\7\'\2\2\u0092\u0091\3\2\2\2\u0093\u0096\3\2\2\2\u0094"+
		"\u0092\3\2\2\2\u0094\u0095\3\2\2\2\u0095\u0097\3\2\2\2\u0096\u0094\3\2"+
		"\2\2\u0097\u0098\7\36\2\2\u0098\25\3\2\2\2\u0099\u009a\7\22\2\2\u009a"+
		"\u009b\7 \2\2\u009b\u009c\7&\2\2\u009c\u009d\7\"\2\2\u009d\u009e\7\31"+
		"\2\2\u009e\27\3\2\2\2\u009f\u00a0\7\34\2\2\u00a0\u00a1\7&\2\2\u00a1\31"+
		"\3\2\2\2\r(.9=F`f|\u0084\u0089\u0094";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}