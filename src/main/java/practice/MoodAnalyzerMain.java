package practice;

public class MoodAnalyzerMain {
	private String msg;
	 public MoodAnalyzerMain() {
	    }
	 public MoodAnalyzerMain(String msg) {
	        this.msg = msg;
	    }
public String analyMood(String msg) {
	if(msg.contains(("sad"))) {
		return "SAD";
	}
	else {
		return "HAPPY";
		
	}
}
}
