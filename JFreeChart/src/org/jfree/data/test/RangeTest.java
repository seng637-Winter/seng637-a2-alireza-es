package org.jfree.data.test;

import static org.junit.Assert.*; import org.jfree.data.Range; import org.junit.*;

public class RangeTest {
	

	// Testing getLength()
    @Test
    public void getLength_set_DifferentLowerBoundUpperBound_then_ReturnLength() {
    	Range range = new Range(-1, 1);
    	assertEquals("The range value between -1 and 1 should be 2", 2, range.getLength(),.000000001d);

    }
    
    @Test
    public void getLength_set_SameLowerBoundUpperBound_then_ReturnLength() {
    	Range range = new Range(1, 1);
    	assertEquals("The range value between 1 and 1 should be 0", 0, range.getLength(),.000000001d);

    }
    
    // Testing getCentralValue()
    @Test
    public void getCentralValue_set_DifferentLowerBoundUpperBound_then_ReturnCentralValue() {
    	Range range = new Range(-1, 1);
    	assertEquals("The central value between -1 and 1 should be 0", 0, range.getCentralValue(),.000000001d);
    }
    
    @Test
    public void getCentralValue_set_SameLowerBoundUpperBound_then_ReturnCentralValue() {
    	Range range = new Range(1, 1);
    	assertEquals("The central value between 1 and 1 should be 1", 1, range.getCentralValue(),.000000001d);
    }
    
    // Testing contains()
    @Test
    public void contains_given_ValueOfWithinRange_then_ReturnTrue() {
    	Range range = new Range(-1, 1);
    	assertTrue("The range between -1 and 1 contains zero, so it returns True", range.contains(0));
    }
    
    @Test
    public void contains_given_ValueOfLowerBound_then_ReturnTrue() {
    	Range range = new Range(-1, 1);
    	assertTrue("The range between -1 and 1 contains minus one, so it returns True", range.contains(-1));
    }
    
    @Test
    public void contains_given_ValueOfUpperBound_then_ReturnTrue() {
    	Range range = new Range(-1, 1);
    	assertTrue("The range between -1 and 1 contains one, so it returns True", range.contains(1));
    }
    
    @Test
    public void contains_given_ValueOfAboveUpperBound_then_ReturnFalse() {
    	Range range = new Range(-1, 1);
    	assertFalse("The range between -1 and 1 does not contain two, so it returns False", range.contains(2));
    }
    
    @Test
    public void contains_given_ValueOfBeneathUpperBound_then_ReturnFalse() {
    	Range range = new Range(-1, 1);
    	assertFalse("The range between -1 and 1 does not contain minus two, so it returns False", range.contains(-2));
    }
    
    // Testing getLowerBound()
    @Test
    public void getLowerBound_set_LowerBoundNegativeUpperBoundPositive_then_ReturnLowerBound() {
    	Range range = new Range(-1, 1);
    	assertEquals("The lower bound of range -1 and 1, should be -1", -1, range.getLowerBound(), .000000001d);
    }
    
    // Testing getUpperBound()
    @Test
    public void getUpperBound_set_LowerBoundNegativeUpperBoundPositive_then_ReturnUpperBound() {
    	Range range = new Range(-1, 1);
    	assertEquals("The upper bound of range -1 and 1, should be 1", 1, range.getUpperBound(), .000000001d);
    }
    
}