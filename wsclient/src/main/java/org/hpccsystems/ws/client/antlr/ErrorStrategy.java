package org.hpccsystems.ws.client.antlr;

import java.text.ParseException;

import org.antlr.v4.runtime.DefaultErrorStrategy;
import org.antlr.v4.runtime.NoViableAltException;
import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.misc.IntervalSet;

public class ErrorStrategy extends DefaultErrorStrategy
{

    @Override
    protected void reportMissingToken(Parser recognizer)
    {

        beginErrorCondition(recognizer);

        Token t = recognizer.getCurrentToken();
        String loc = t.getLine() + "," + t.getCharPositionInLine();
        String tokenName = getTokenErrorDisplay(t);
        IntervalSet expecting = getExpectedTokens(recognizer);
        String expectingStr = expecting.toString(recognizer.getVocabulary());

        // TODO - Insert appropriate error code here or change to alternate error handling
        RecognitionException e = new RecognitionException("MISSING_TOKEN " + tokenName + ", expecting "
                + expecting.toString(recognizer.getVocabulary()) + " at " + loc, recognizer, null,
                recognizer.getContext());
        recognizer.notifyErrorListeners(t, "missing token", e);
    }
    
    @Override
    protected void reportNoViableAlternative(Parser recognizer, NoViableAltException e) {

        beginErrorCondition(recognizer);

        Token t = recognizer.getCurrentToken();
        String tokenName = getTokenErrorDisplay(t);
        IntervalSet expecting = getExpectedTokens(recognizer);
        String expectingStr = expecting.toString(recognizer.getVocabulary());

        RecognitionException re = new RecognitionException("NO_VIABLE_ALTERNATIVE at " + tokenName + ", expecting "
                + expecting.toString(recognizer.getVocabulary()), recognizer, null, recognizer.getContext());
        recognizer.notifyErrorListeners(t, "extra token", e);

    }

    @Override
    protected void reportUnwantedToken(Parser recognizer)
    {
        if (inErrorRecoveryMode(recognizer))
        {
            return;
        }

        beginErrorCondition(recognizer);

        Token t = recognizer.getCurrentToken();
        String tokenName = getTokenErrorDisplay(t);
        IntervalSet expecting = getExpectedTokens(recognizer);
        String expectingStr = expecting.toString(recognizer.getVocabulary());

        RecognitionException e = new RecognitionException("MISSING_TOKEN " + tokenName + ", expecting "
                + expecting.toString(recognizer.getVocabulary()), recognizer, null, recognizer.getContext());
        recognizer.notifyErrorListeners(t, "extra token", e);
    }

}
