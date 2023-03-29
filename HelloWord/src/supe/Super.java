package supe;
import java.util.Random;
//superクラスを作成
public class Super {
	
     //基本的ステータス名を代入
	private String name; 
	 private int HP; 
	 private int MP; 
	 private int 攻撃力; 
	 private int 素早さ; 
	 private int 防御力; 
	 
	 //Random変数を設定し各ステータスに代入。
	 public Super() { 
	 Random rand = new Random(); 
	 HP = rand.nextInt(1000)+1; 
	 MP = rand.nextInt(1000)+1; 
	 攻撃力 = rand.nextInt(1000)+1; 
	 素早さ = rand.nextInt(1000)+1; 
	 防御力 = rand.nextInt(1000)+1; 
	 } 
	 
	 public String getName() { 
	 return name; 
	 } 
	 
	 public void setName(String name) { 
	 this.name = name; 
	 } 
	 //オーバーライドを記述して最終的にコンソールに出力する文を入力。
	 //apend文を使い文字を連結するようにさせる。
	 //toStringのメソッドとすることでオーバーライドを組み合わせる。
	 //lineseparaterを使うことで文章を改行する。
	 @Override 
	 public String toString() { 
	 StringBuilder sb = new StringBuilder(); 
	 sb.append("こんにちは 「"); 
	 sb.append(getName()); 
	 sb.append("」 さん"); 
	 sb.append(System.lineSeparator()); 
	 sb.append("ステータス"); 
	 sb.append(System.lineSeparator()); 
	 sb.append("HP："); 
	 sb.append(HP); 
	 sb.append(System.lineSeparator()); 
	 sb.append("MP："); 
	 sb.append(MP); 
	 sb.append(System.lineSeparator()); 
	 sb.append("攻撃力："); 
	 sb.append(攻撃力); 
	 sb.append(System.lineSeparator()); 
	 sb.append("素早さ："); 
	 sb.append(素早さ); 
	 sb.append(System.lineSeparator()); 
	 sb.append("防御力："); 
	 sb.append(防御力); 
	 sb.append(System.lineSeparator()); 
	 sb.append(System.lineSeparator()); 
	 sb.append("さあ冒険に出かけよう！"); 
	 return sb.toString(); 
	 }
}
