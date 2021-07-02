package example;

public class LogicalOperationSample {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		String name = "太郎";
		double height = 173;
		
		if (height > 170) {
			System.out.println(name + "の身長は170cmを超えています。");
		} else {
			System.out.println(name + "の身長は170cmを超えていません。");
		}
		System.out.println(name + "の身長は" + height + "cmです。");
	}

}
