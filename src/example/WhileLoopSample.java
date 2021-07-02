package example;

public class WhileLoopSample {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int num = 0;
		int sum = 0;
		
		do {
			num += 1;
			sum += num;		
		} while (sum < 100);
		System.out.println("1から" + num + "までの数の和は" + sum + "です。");
	}

}
