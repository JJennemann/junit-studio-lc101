package test;

import main.BalancedBrackets;
import org.junit.Test;

import static org.junit.Assert.*;

public class BalancedBracketsTest {

    //TODO: add tests here

    @Test
    public void oneOpeningThenOneClosingBrackets(){
        String spec = "a single set of balanced brackets returns true";
        String testData = "[]";
        boolean result = BalancedBrackets.hasBalancedBrackets(testData);
        assertTrue(spec, result);
    }
    @Test
    public void noBracketsReturnsTrue(){
        String spec = "no brackets returns true";
        String testData = "launchcode";
        boolean result = BalancedBrackets.hasBalancedBrackets(testData);
        assertTrue(spec, result);
    }
    @Test
    public void emptyStringReturnsTrue(){
        String spec = "empty string returns true";
        String testData = "";
        boolean result = BalancedBrackets.hasBalancedBrackets(testData);
        assertTrue(spec, result);
    }
    @Test
    public void oneOpeningBracket(){
        String spec = "only one opening bracket returns false";
        String testData = "[";
        boolean result = BalancedBrackets.hasBalancedBrackets(testData);
        assertFalse(spec, result);
    }
    @Test
    public void twoOpeningBrackets(){
        String spec = "two opening brackets and no closing bracket returns false";
        String testData = "[[";
        boolean result = BalancedBrackets.hasBalancedBrackets(testData);
        assertFalse(spec, result);
    }
    @Test
    public void balancedBracketThenOneOpeningBrackets(){
        String spec = "a balanced bracket followed by one opening bracket returns false";
        String testData = "[][";
        boolean result = BalancedBrackets.hasBalancedBrackets(testData);
        assertFalse(spec, result);
    }
    @Test
    public void oneOpeningOneClosingOneOpeningOneClosingBrackets(){
        String spec = "three consecutive sets of balanced brackets returns true";
        String testData = "[][][]";
        boolean result = BalancedBrackets.hasBalancedBrackets(testData);
        assertTrue(spec, result);
    }
    @Test
    public void twoOpeningOneClosingBrackets(){
        String spec = "an opening bracket followed by a set of balanced brackets returns false";
        String testData = "[[]";
        boolean result = BalancedBrackets.hasBalancedBrackets(testData);
        assertFalse(spec, result);
    }
    @Test
    public void threeOpeningThreeClosingBrackets(){
        String spec = "three sets of nested brackets returns true";
        String testData = "[[[]]]";
        boolean result = BalancedBrackets.hasBalancedBrackets(testData);
        assertTrue(spec, result);
    }
    @Test
    public void oneClosingBracket (){
        String spec = "a single closing bracket returns false";
        String testData = "]";
        boolean result = BalancedBrackets.hasBalancedBrackets(testData);
        assertFalse(spec, result);
    }
    @Test
    public void oneClosingOneOpeningBrackets(){
        String spec = "one closing bracket followed by an opening bracket return false";
        String testData = "][";
        boolean result = BalancedBrackets.hasBalancedBrackets(testData);
        assertFalse(spec, result);
    }
    @Test
    public void twoClosingBrackets(){
        String spec = "two closing brackets returns false";
        String testData = "]]";
        boolean result = BalancedBrackets.hasBalancedBrackets(testData);
        assertFalse(spec, result);
    }
    @Test
    public void twoClosingOneOpeningBrackets(){
        String spec = "two closing brackets followed by an opening bracket returns false";
        String testData = "]][";
        boolean result = BalancedBrackets.hasBalancedBrackets(testData);
        assertFalse(spec, result);
    }
    @Test
    public void oneClosingOneOpeningOneClosingBrackets(){
        String spec = "one closing bracket followed by a set of balanced brackets returns false";
        String testData = "[[]";
        boolean result = BalancedBrackets.hasBalancedBrackets(testData);
        assertFalse(spec, result);
    }
    @Test
    public void oneClosingTwoOpeningBrackets(){
        String spec = "one closing bracket followed by two opening brackets returns false";
        String testData = "][[";
        boolean result = BalancedBrackets.hasBalancedBrackets(testData);
        assertFalse(spec, result);
    }
    @Test
    public void setOfBalancedBracketsBeforeOtherCharacters(){
        String spec = "single set of balanced brackets before other characters returns true";
        String testData = "[]launchcode";
        boolean result = BalancedBrackets.hasBalancedBrackets(testData);
        assertTrue(spec, result);
    }
    @Test
    public void setOfBalancedBracketsAroundOtherCharacters(){
        String spec = "single set of balanced brackets around other characters returns true";
        String testData = "[launchcode]";
        boolean result = BalancedBrackets.hasBalancedBrackets(testData);
        assertTrue(spec, result);
    }
    @Test
    public void setOfBalancedBracketsAmongOtherCharacters(){
        String spec = "single set of balanced brackets before other characters returns true";
        String testData = "launch[code]";
        boolean result = BalancedBrackets.hasBalancedBrackets(testData);
        assertTrue(spec, result);
    }

    //First tests before redoing without text
    //@Test
//    public void onlyBracketsReturnsTrue() {
//        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
//    }
//    @Test
//    public void wrappedBracketsReturnsTrue(){
//        assertTrue(BalancedBrackets.hasBalancedBrackets("[launchcode]"));
//    }
//    @Test
//    public void reverseBracketsReturnsFalse(){
//        assertFalse(BalancedBrackets.hasBalancedBrackets("]launchCode["));
//    }
//    @Test
//    public void twoClosingBracketsReturnsFalse(){
//        assertFalse(BalancedBrackets.hasBalancedBrackets("]launchcode]"));
//    }
//    @Test
//    public void twoOpeningBracketsReturnsFalse(){
//        assertFalse(BalancedBrackets.hasBalancedBrackets("[launchcode["));
//    }
//
//    @Test
//    public void oneOpeningBracketReturnsFalse(){
//        assertFalse(BalancedBrackets.hasBalancedBrackets("[launchcode"));
//    }
//    @Test
//    public void oneClosingBracketReturnsFalse(){
//        assertFalse(BalancedBrackets.hasBalancedBrackets("launchcode]"));
//    }
//
//    @Test
//    public void twoOpeningOneClosingBracketReturnsFalse(){
//        assertFalse(BalancedBrackets.hasBalancedBrackets("[launch][code"));
//    }
//    @Test
//    public void twoClosingOneOpeningBracketReturnsFalse(){
//        assertFalse(BalancedBrackets.hasBalancedBrackets("]launch[code]"));
//    }
//    @Test
//    public void twoSetsOfBracketsReturnsTrue(){
//        assertTrue(BalancedBrackets.hasBalancedBrackets("[launch][code]"));
//    }
}
