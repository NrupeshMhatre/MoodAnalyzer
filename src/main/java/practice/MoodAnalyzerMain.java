package practice;

public class MoodAnalyzerMain {
	private String msg;
	 public MoodAnalyzerMain() {
	    }
	 public MoodAnalyzerMain(String msg) {
	        this.msg = msg;
	    }
public String analyMood(String msg) {
	if(msg.contains(("SAD"))) {
		return "SAD";
	}
	else {
		return "HAPPY";
		
	}
}
}
