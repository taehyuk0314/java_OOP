package gms21;

public class SubjectService {
	public String info2(String hakbun,String name,String subjName,int score,String profname) {
		return String.format("학번은:%s\n"
				+ "학생이름:%s\n"
				+ "과목명:%s\n"
				+ "점수:%d\n"
				+ "교수님 :%s ",hakbun,name,subjName,score,profname);
		
	}
}
