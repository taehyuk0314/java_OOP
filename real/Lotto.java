package real;

import java.util.Random;

public class Lotto {
	public String randomNum() {
		int[] gg = new int[6];
		Random random = new Random();
		String num = "";
		for(int i =0; i<gg.length;i++) {
			gg[i] = random.nextInt(45)+1;
			if(i<gg.length-1) {
				num+=gg[i]+",";
			}else {
				num+=gg[i];
			}
		}
		return num;
	}
}
