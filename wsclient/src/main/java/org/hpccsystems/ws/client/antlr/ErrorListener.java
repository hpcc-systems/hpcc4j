package org.hpccsystems.ws.client.antlr;

import org.antlr.v4.runtime.BaseErrorListener;
import org.antlr.v4.runtime.FailedPredicateException;
import org.antlr.v4.runtime.InputMismatchException;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.LexerNoViableAltException;
import org.antlr.v4.runtime.NoViableAltException;
import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;
import org.antlr.v4.runtime.Token;

public class ErrorListener extends BaseErrorListener {

	private EclReader parent;
	private ErrorStrategy errorHandler = new ErrorStrategy();
	    // *************************************************************
	    // * Attaching to a parser or lexer
	    // *************************************************************
	
	
		public void attach(Parser parser) {
			parser.removeErrorListeners();
			parser.addErrorListener(this);
			parser.setErrorHandler(errorHandler);
		}
	
		public void attach(Lexer lexer) {
			lexer.removeErrorListeners();
			lexer.addErrorListener(this);
	}
    // *************************************************************
    // * Errors section
    // *************************************************************

    @Override
	public void syntaxError(Recognizer<?, ?> recognizer,
			Object offendingSymbol, int line, int charPositionInLine,
			String msg, RecognitionException e) {
		if (e != null) {
		    e.printStackTrace();
			msg=getErrorMessage(recognizer,e);
		}

		    System.err.println(msg);

	}

    public void setParent(EclReader r) {
    	this.parent=r;
    }
    private String getErrorMessage(Recognizer<?, ?> recognizer, RecognitionException e) {
    	String msg = "GENERAL_PARSE_ERROR";
    	String loc="";
    	if (e.getOffendingToken() != null) {
    	    loc="(" + e.getOffendingToken().getLine() + "," + e.getOffendingToken().getCharPositionInLine() + "-" + e.getOffendingToken().getCharPositionInLine() +( e.getOffendingToken().getStopIndex()- e.getOffendingToken().getStartIndex()) + ")";
    	}
    	if (e instanceof InputMismatchException) {
            InputMismatchException ime = (InputMismatchException) e;
            String expected = ime.getExpectedTokens().toString(recognizer.getVocabulary());
            msg = "MISMATCHED_TOKEN " + e.getOffendingToken().getText() + " , expected one of " + expected;
        } else if (e instanceof NoViableAltException) {
        	msg = "NO_PARSE_ALTERNATIVE," + getTokenErrorDisplay(e.getOffendingToken());
        } else if (e instanceof LexerNoViableAltException) {
        	msg = "NO_PARSE_ALTERNATIVE," + getTokenErrorDisplay(e.getOffendingToken());
        } else if (e instanceof FailedPredicateException ) {
            FailedPredicateException fpe = (FailedPredicateException) e;
            msg = "FAILED_PARSE_PREDICATE," + recognizer.getRuleNames()[fpe.getRuleIndex()] + "," + fpe.getPredicate();
        } else {
        	msg = "GENERAL_PARSE_ERROR," + e.getMessage();
        }
    	return msg + loc;
    }

    private String getTokenErrorDisplay(Token t) {
		if ( t==null ) return "<no token>";
		String s = t.getText();
		if ( s==null ) {
			if ( t.getType()==Token.EOF ) {
				return "<EOF>";
			}
			else {
				return "<"+t.getType()+">";
			}
		}
		s = s.replace("\n","\\n");
		s = s.replace("\r","\\r");
		s = s.replace("\t","\\t");
		return "'"+s+"'";
	}
}
