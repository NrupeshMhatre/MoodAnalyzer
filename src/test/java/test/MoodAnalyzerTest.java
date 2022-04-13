package test;
import static org.junit.Assert.*;
import org.assertj.core.api.Assertions;
import org.junit.Test;

import practice.MoodAnalyzerMain;

public class MoodAnalyzerTest {
	    @Test
	    public void sadMood() {
	        MoodAnalyzerMain mo = new MoodAnalyzerMain("Output is a sad ");
	        String mood = mo.analyMood();
	        assertEquals(mood,"SAD");
	    }
	    @Test
	    public void happyMood() {
	        MoodAnalyzerMain mo = new MoodAnalyzerMain("OutPut is a happy ");
	        String mood = mo.analyMood();
	        assertEquals(mood,"HAPPY");
	    }
}

