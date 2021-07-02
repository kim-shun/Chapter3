package example;

public class LogicalOperationSample {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		String name = "太郎";
		int age = 24;
		double height = 173;
		System.out.println(age > 20 && height > 170);
		System.out.println(age > 20 || height > 170);
		
		if (height >= 168) {
			System.out.println(name + "の身長は" + height + "cmです");
		}
		System.out.println(name + "は" + age + "歳です");
	}

}
