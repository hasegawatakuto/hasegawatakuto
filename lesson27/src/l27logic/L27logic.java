package l27logic;

public class L27logic {
	private String name;
	private double bodylength;
	private int speed;
	private String name2;
	
	public L27logic(String name,double bodylength,int speed,String name2){
		setName(name);
		setBodylength(bodylength);
		setSpeed(speed);
		setName2 (name2);
	}
	//ゲッターとセッターを作成
	String getName() {
		return this.name;
	}
	void setName(String name) {
		this.name = name;
	}
	double getBodylength() {
		return this.bodylength;
	}
	void setBodylength(double bodylength) {
		this.bodylength = bodylength;
	}
	int getSpeed() {
		return this.speed;
	}
	void setSpeed(int speed) {
		this.speed = speed;
	}
	String getName2() {
		return this.name2;
	}
	void setName2(String name2) {
		this.name2 = name2;
	}
	//コンソールに出力する内容
	public void process(String input) {
	//sprit文を用いて[,]で区切るように設定したものをanimalsと命名
		String[] animals = input.split(",");
    //for文を使いコンソールで入力された文章を[:]で分ける。
	//コンソールで入力されspritで[:]と分けたものを文章はannimaldetailとして命名。
        for (String animal : animals) {
            String[] animalDetails = animal.split(":");
    //それぞれの動物名や体長の情報を配列番号を指定し呼び出している。
    //parseIntを使用し数字を文字列として設定。理由として実行用パッケージでnextlineを使用するため。
            String name = animalDetails[0];
            double bodylength = Double.parseDouble(animalDetails[1]);
            int speed = Integer.parseInt(animalDetails[2]);
    //name2は空白にすることでswich文で判定した文字を出力させる
            String name2 = "";
	
    switch (name) {
        case "ライオン":
            name2 = "パンテラ レオ";
            break;
        case "ゾウ":
            name2 = "ロキソドンタ・サイクロティス";
            break;
        case "パンダ":
            name2 = "アイルロポダ・メラノレウカ";
            break;
        case "チンパンジー":
            name2 = "パン・トゥログロディテス";
            break;
        case "シマウマ":
            name2 = "チャップマンシマウマ";
            break;
        case "インコ":
            name2 = "不明";
            break;
        
}
    //コンソールに出力する文章。最後に()を使うことで改行をしている
    System.out.println("動物名：" + name);
    System.out.println("体長：" + bodylength + "m");
    System.out.println("速度：" + speed + "km/h");
    System.out.println("学名：" + name2);
    System.out.println();
    
	}
}
}
