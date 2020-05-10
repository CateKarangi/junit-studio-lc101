package test;

import main.BalancedBrackets;
import org.junit.Test;

import static org.junit.Assert.*;

public class BalancedBracketsTest {

    //TODO: add tests here
    @Test
    public void onlyBracketsReturnTrue(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));

    }

    @Test
    public void hasBracketsOnEnds(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("[LaunchCode]"));
    }

    @Test
    public void hasBracketsSomewhereInTheMiddle(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("Launch[Code]"));
    }

    @Test
    public void hasMultipleSetsOfBrackets(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]LaunchCode\", \"\", \"[]"));
    }

   @Test
    public void isNotNull(){
       BalancedBrackets.hasBalancedBrackets("");

   }

    @Test
    public void doesntHaveBalancedBrackets(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("Launch]Code["));
    }

    @Test
    public void hasOnlyLeftBracket(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("["));
    }

    @Test
    public void hasOnlyRightBracket(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("]"));
    }

    @Test
    public void hasBackwardBracket(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("]["));
    }


}
