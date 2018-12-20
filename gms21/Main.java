package gms21;

import javax.swing.JOptionPane;

public class Main {
	public static void main(String[] args) {
		Studentbean studentbean = null;
		Subjectbean subjectbean = null;
		StudentService service = new StudentService();
		while(true) {
			/*성적표 표시될 내용 : 학번 (Student)
			 * 학생이름(Student)
			 * 과목명(Subject)
			 * 점수 (Subject)
			 * 학번은 student
			 */
			switch(JOptionPane.showInputDialog("0.종료\n 1.학생부등록\n 2. 비번변경\n 3. 회원정보보기\n 4. 수강과목등록\n 5.교수등록\n 6.점수등록\n 7.성적표보기")) {
			case "0":
				JOptionPane.showMessageDialog(null, "종료됩니다");
				return;
			case"1":
				String name = JOptionPane.showInputDialog("이름입력");
				String ssn = JOptionPane.showInputDialog("주민등록번호입력");
				String pass = JOptionPane.showInputDialog("비밀번호입력");
				studentbean = new Studentbean();
				studentbean.setname(name);
				studentbean.setssn(ssn);
				studentbean.setpass(pass);
				break;
			case"2":
				String chpass = JOptionPane.showInputDialog("비밀번호를 변경하세요");
				studentbean.setpass(chpass);
				break;
			case"3":
				String hakbun = service.hakbun();
				studentbean.sethakbun(hakbun);
				String info2 = service.info(studentbean.gethakbun(),
						studentbean.getname(),
						studentbean.getssn(),
						studentbean.getpass());
				JOptionPane.showMessageDialog(null, info2);
				break;
			case"4":
				subjectbean = new Subjectbean();
				String subjName = JOptionPane.showInputDialog("수강하실과목을 입력하세요");
				subjectbean.setsubjName(subjName); 
				break;
			case"5" :
				String profName = JOptionPane.showInputDialog("교수님 이름을 입력하세요");
				subjectbean.setprofName(profName);
				break;
			case"6":
				String score = JOptionPane.showInputDialog("점수를 입력하세요");
				int score1 = Integer.parseInt(score);
				subjectbean.setscore(score1);
				break;
				/*
				 * 학번
				 * 학생이름
				 * 과목명
				 * 점수
				 */
			case"7":
				String toString = subjectbean.toString(studentbean.gethakbun(),
						studentbean.getname(),
						subjectbean.getsubjName(),
						subjectbean.getscore());
				JOptionPane.showMessageDialog(null, toString);
				break;
			}
		}
	}
}
