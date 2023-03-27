package ca23;

public class C23 {
	private String name;
	private double bodylength;
	private double speed;
	 
	public C23() {}
	
	public C23(String name,double bodylength,double speed)
	{this.name = name;
	this.bodylength = bodylength;
	this.speed = speed;
	}

	public String getName() {
		return name;
	}
	public void setName(String name){
		this.name = name;
	}
	public double getBodylength() {
		return bodylength;
	}
	public void setBodylength(double bodylength) {
		this.bodylength = bodylength;
	}
	public double getSpeed() {
		return speed;
	}
	public void setSpeed(double speed) {
		this.speed = speed;
	}
	
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		C23 lion = new C23();
		lion.setName("ライオン");
		lion.setBodylength(2.1);
		lion.setSpeed(80);
		
		System.out.println("動物名：" + lion.getName());
	    System.out.println("体長：" + lion.getBodylength() + "m");
	    System.out.println("速度：" + lion.getSpeed() + "km/h");

	}

}
