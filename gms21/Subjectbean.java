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
	public String toString(String hakbun,String name,String subjName,int score) {
		return String.format("학번은:%s\n"
				+ "학생이름:%s\n"
				+ "과목명:%s\n"
				+ "점수:%s\n",hakbun,name,subjName,score);
		
	}
}

