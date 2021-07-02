package example;

public class IfElseSample {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int maxTemperate = 28;
		
		if (maxTemperate > 35) {
			System.out.println("今日は猛暑日です。");
		} else if (maxTemperate >= 25) {
			System.out.println("今日は夏日です。");
		} else {
			System.out.println("今日は猛暑日・真夏日・夏日ではありません。");
		}
	}

}
