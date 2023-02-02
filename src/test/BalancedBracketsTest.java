package test;

import main.BalancedBrackets;
import org.junit.Test;

import static org.junit.Assert.*;

public class BalancedBracketsTest {

    //TODO: add tests here
    @Test
    public void emptyTest() {
        assertEquals(true, true);
    }
    @Test
    public void noBracketsReturnsFalse(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("launchcode"));
    }
    @Test
    public void oneOpeningBracket(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("["));
    }
    @Test
    public void twoOpeningBrackets(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("[["));
    }
    @Test
    public void oneOpeningThenOneClosingBrackets(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }
    @Test
    public void oneOpeningThenOneClosingThenOneOpeningBrackets(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("[]["));
    }
    @Test
    public void oneOpeningThenOneClosingThenOneOpeningThenOneClosingBrackets(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("[][]"));
    }
    @Test
    public void twoOpeningOneClosingBrackets(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("[[]"));
    }
    @Test
    public void twoOpeningTwoClosingBrackets(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("[[]]"));
    }
    @Test
    public void oneClosingBracket (){
        assertFalse(BalancedBrackets.hasBalancedBrackets("]"));
    }
    @Test
    public void oneClosingOneOpeningBrackets(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("]["));
    }
    @Test
    public void twoClosingBrackets(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("]]"));
    }
    @Test
    public void twoClosingOneOpeningBrackets(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("]]["));
    }
    @Test
    public void oneClosingOneOpeningOneClosingBrackets(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("][]"));
    }
    @Test
    public void oneClosingTwoOpeningBrackets(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("][["));
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
