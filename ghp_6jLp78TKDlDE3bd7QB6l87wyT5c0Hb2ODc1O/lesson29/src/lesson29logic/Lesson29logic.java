package lesson29logic;
/*
コードの進め方
1.県名、県庁所在地名、面積が入るフィールドを作る。
2.昇順、降順が処理されるコードを記入。
コンソール出力時に昇順か降順かを選択し次の処理をする。
3.データの番号が入力された時にコンソールに県名、県庁所在地名、面積が出力されるコードを記入。
配列番号で各フィールドに文字を入力。
list型を利用し都道府県の情報をlistをする。

*/
public class Lesson29logic {
	private String name;
	private String capital;
	private double area;

	public Lesson29logic(String name,String capital,double area){
		this.name = name;
		this.capital = capital;
		this.area = area;
	}
	//ここでのゲッターセッターはのちに情報を代入するフィールドを作る。
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCapital() {
		return capital;
	}
	public void setCapital(String capital) {
		this.capital = capital;
	}
	public double getArea() {
		return area;
	}
	public void setArea(double area) {
		this.area = area;
	}
	public String toString() {
        return "都道府県名：" + name + "\n県庁所在地：" + capital + "\n面積：" + area + "km2";
    }
}
