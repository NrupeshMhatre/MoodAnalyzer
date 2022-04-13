package practice;

public class MoodAnalyzerMain {
	private String msg;
	 public MoodAnalyzerMain() {
	    }
	 public MoodAnalyzerMain(String msg) {
	        this.msg = msg;
	    }
public String analyMood() {
	try {
        if (msg.contains("sad")) 
        {
            return "SAD";
        }
        else 
        {
            return "HAPPY";
         }
    } catch(Exception p) {
        return "HAPPY";
	}
}
}


