package example;

public class ForLoopSample {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		for (int count = 0; count < 5; ++count) {
			System.out.println("お腹がすいた！" + "[" + count + "回目]");
		}
		
		int sum = 0;
		
		for (int num = 1; num <= 10; ++num) {
			sum += num;
		}
		System.out.println("1から10までの整数の和は" + sum + "です。");
	}

}
