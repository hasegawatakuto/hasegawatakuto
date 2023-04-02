package person;

public class Person{
	static int count = 0;
	String name;
	int age;
	double height;
	double weight;
    double bmi;
	// コンストラクタを定義しインスタンスフィールドに値をセット
	public Person(String name,int age, double height,double weight){
		Person.count++;
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
	}
	public double bmi() {
		return  this.weight / this.height / this.height ;
	}
	public void print() {
		System.out.println("名前は" + this.name + "です");
		System.out.println("BMI" + this.bmi() + "です");
		System.out.println("年は" + this.age + "です");
	}
	public static void printCount(){
		System.out.println("合計" + Person.count + "人です");
		}
	//BMI = 体重/身長*身長
	}