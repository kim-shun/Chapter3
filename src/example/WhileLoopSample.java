package example;

public class WhileLoopSample {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int num = 0;
		int sum = 0;
		
		while (sum < 100) {
			num += 1;
			sum += num;
		}
		System.out.println("1から" + num + "までの数の和は" + sum + "です。");
	}

}
