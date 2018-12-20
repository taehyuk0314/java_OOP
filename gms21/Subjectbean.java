package gms21;

public class Subjectbean {
	private String subjName,profName;  //시험 
	private int score;
	public void setsubjName(String subjName) { //
		this.subjName = subjName;
	}
	public String getsubjName() {
		return subjName;
	}
	public void setprofName(String profName) {
		this.profName = profName;
	}
	public String getprofName() {
		return profName;
	}
	public void setscore(int score) {
		this.score = score;
	}
	public int getscore() {
		return score;
	}
	public String toString() {
		return String.format("과목명:%s\n"
				+ "점수:%d\n"
				+ "교수님 :%s\n ",subjName,score,profName);
		
	}
}

