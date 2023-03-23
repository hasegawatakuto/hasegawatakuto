package method;
import java.util.Random;
public class Method {

	public static void main(String[] args) {
		
	}
	// Q1：コンソールに「Hello Java」とコンソールに出力するメソッド（関数）を作成してください。
	public static void hello() {
		System.out.println("Hello Java");
	}
	// Q2：引数として整数を渡すと+1して返すメソッド（関数）を作成してください。
	public static int addOne(int num) {
		return num +1;
	}
	// Q3：引数として整数を2つ渡すと、その引数2つを乗算した値を返すメソッド（関数）を作成してください。
	public static int multiply(int num1, int num2) {
	    return num1 * num2;
	  }
	// Q4：引数として小数を2つ渡すと、その引数2つを乗算した値を返すメソッド（関数）を作成してください。
	//     ※ただしメソッド名はQ3のメソッド名と同じにしてください。
	public static double multiply(double num3, double num4) {
		return num3 * num4;
		}
	// Q5：引数として数字を渡すと、1～100までのランダムな数字を引数の値分格納して返すメソッド（関数）を作成してください。
	public static int[] ran (int count) {
			int[] result = new int[count];
			Random rd = new Random();
			for (int i =0; i < count; i++) {
			result[i] =rd.nextInt(100)+1;
			}
		return result;
		}
		
	// Q6：Q5で作成した関数を用いて、このメソッド（関数）の引数をQ5のメソッド（関数）の引数に渡して
	//     配列の要素の平均値を返すメソッド（関数）を作成してください。
	public static double ran2 (int count) {
		int sum = 0;
		int[] result = ran(count);
		//ここまでで引用している。
		for(int i =0; result.length > i; i++) {
			sum += result[i];
		}
		double ave = sum / result.length; 
		return ave;
	}
}


