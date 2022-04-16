package practice;

public class MoodAnalyzerMain {
	private String msg;
	 public MoodAnalyzerMain() {
	    }
	 public MoodAnalyzerMain(String msg) {
	        this.msg = msg;
	    }
	 public String analyMood() throws MoodAnalysisException {
	        try {
	            if(msg.contains("Sad")){
	                return "Sad";
	            }
	            return "Happy";
	        }catch (NullPointerException e){
	            return "Happy";
         }

	 }
}


