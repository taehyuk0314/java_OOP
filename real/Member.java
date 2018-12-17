package real;

import java.util.Scanner;

public class Member {
	String name; // 멤버변수
	
	public String bmi(double t, double w) {
		
		String bmi = ""; //지역변수 ->로컬변수
		double res = w/((t*t)/10000);
		if(res>=40) {
			bmi = "고도비만";
		}else if(res>=35) {
			bmi = "중등도비만";
		}else if(res>=30) {
			bmi = "경도비만";
		}else if(res >=25) {
			bmi = "과체중";
		}else if(res>=18.5) {
			bmi = "정상";
		}else {
			bmi = "저체중";
		}
		return bmi;
//		return String.format("%s이다\t%f", bmi,res);
	}// bmi end
	public String grade(String[] ar) {
		String grade = ""; // 로컬변수는 반드시 초기화 해야한다. 원치않는 값이 할당됨
		int a =Integer.parseInt(ar[0]);
		int b =Integer.parseInt(ar[1]);
		int c =Integer.parseInt(ar[2]);
		int d =Integer.parseInt(ar[3]);
		int e =Integer.parseInt(ar[4]);
		int all = a+b+c+d+e;
		int avr = all/5;
		if(avr>=90) {
			grade = "A학점";
		}else if(avr>=80) {
			grade = "B학점";
		}else if(avr>=70){
			grade = "C학점";
		}else if(avr>=60){
			grade = "D학점";
		}else if(avr>=50){
			grade = "E학점";
		}else {
			grade = "F학점";
		}
		return grade;
	}
	public String genderChecker(String ssn) {
		String gender = "";
		char ch = ssn.charAt(7);
		switch (ch) {
		case '1' :  case '3' :
			gender ="남자";
			break;
		case '2' :  case '4' :
			gender ="여자";
			break;
		case '5' :  case '6' :
			gender ="외국인";
			break;
		default:
			gender = "잘못입력했습니다";
			break;
		}
		return gender;
	}

}
