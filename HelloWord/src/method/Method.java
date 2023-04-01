package method;
import java.util.Random;
public class Method {
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
				int[] result3 = new int[count];
				Random rd = new Random();
				for (int i =0; i < count; i++) {
				result3[i] =rd.nextInt(100)+1;
				}
			return result3;
	}
		// Q6：Q5で作成した関数を用いて、このメソッド（関数）の引数をQ5のメソッド（関数）の引数に渡して
		//     配列の要素の平均値を返すメソッド（関数）を作成してください。
		public static double ran2 (int count) {
			int sum = 0;
			int[] result4 = ran(count);
			//ここまでで引用している。
			for(int i =0; result4.length > i; i++) {
				sum += result4[i];
			}
			double ave = sum / result4.length; 
			return ave;
		}
		
	public static void main(String[] args) {
	//Q2
		int result = addOne(2);
		  System.out.println(result);
		
	//Q3	
		int result1 = multiply(5, 2);
	    System.out.println(result1);
    //Q4   
	    int result2 = multiply(8, 7);
	    System.out.println(result2);
	//Q5    
	    int[] arr1 = ran(5);
        for (int num : arr1) {
            System.out.print(num + " ");
        }
        System.out.println();
    //Q6
        double avg1 = ran2(5);
        System.out.println("平均値は " + avg1);
	}
}


