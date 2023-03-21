/*
	string型の配列を作成し、アルファベットa～jまでを格納してください。
	brake文を使用し、a～dまで表示してください。
	
	 出力結果：a
	           b
	           c
	           d
	          
	cotinue文を使用し、i以外を表示してください。
	
	 出力結果：a
	           b
	           c
	           d
	           e
	           f
	           g
	           h
	           j
*/
package array2.java;

public class practice {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		//String文でa~j格納
		String[]rel = {"a","b","c","d","e","f","g","h","i","j"};
		for (String letter : rel ) {
			if(letter.equals("e")){
				break;
			}
			System.out.println(letter);
		}
		for(String letter : rel) {
			if(letter.equals("i")) {
				continue;
			}
			System.out.println(letter);
		}
	}
}
