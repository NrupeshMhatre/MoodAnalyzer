package test;
import static org.junit.Assert.*;
import org.assertj.core.api.Assertions;
import org.junit.Test;

import practice.MoodAnalyzerMain;

public class MoodAnalyzerTest {
	    @Test
	    public void sadMood() {
	        MoodAnalyzerMain mo = new MoodAnalyzerMain();
	        String mood = mo.analyMood("Output is a sad ");
	        assertEquals(mood,"SAD");
	    }
	    @Test
	    public void happyMood() {
	        MoodAnalyzerMain mo = new MoodAnalyzerMain();
	        String mood = mo.analyMood("OutPut is a happy ");
	        assertEquals(mood,"HAPPY");
	    }
}

