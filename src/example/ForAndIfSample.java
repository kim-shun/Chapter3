package example;

public class ForAndIfSample {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int num = 1;
		for (num = 1; num <= 50; num++) {
			if (num % 3 == 0 && num % 5 == 0) {
				System.out.println("わん！にゃ〜！");
			} else if (num % 3 == 0) {
				System.out.println("わん！");
			} else if (num % 5 == 0) {
				System.out.println("にゃ〜！");
			} else {
				System.out.println(num);
			}
		}
	}

}
