/*
①配列int test[][]に以下の成績を格納し、表示してください。
	出力結果：生徒1：国語64点、数学73点、英語69点
			  生徒2：国語58点、数学81点、英語75点
			  生徒3：国語86点、数学68点、英語79点
			  生徒4：国語72点、数学55点、英語80点
	
②それぞれの教科の平均点を表示してください。
	出力結果：国語の平均点は○○点です。
			  数学の平均点は○○点です。
			  英語の平均点は○○点です。
*/
package multidimensional_array.java;

public class Practice {

	public static void main(String[] args) {
		//1
		int test [][] = {
				{64,73,69},
				{58,81,75},
				{86,68,79},
				{72,55,80}
		};
		for(int i = 0; i < test.length; ++i) {
			System.out.printf("生徒%d：国語%d点、数学%d点、英語%d点\n",
                    i+1, test[i][0], test[i][1], test[i][2]);
		}
		//2
		int score [][] = {
				{64,73,69},
				{58,81,75},
				{86,68,79},
				{72,55,80}
		};
		double[] averages = new double[3];
        for (int i = 0; i < 3; i++) {
            double sum = 0;
            for (int j = 0; j < 4; j++) {
                sum += score[j][i];
            }
            averages[i] = sum / 4;
        }

        // 結果を出力する
        System.out.printf("国語の平均点: %.2f%n", averages[0]);
        System.out.printf("数学の平均点: %.2f%n", averages[1]);
        System.out.printf("英語の平均点: %.2f%n", averages[2]);
		}
		
	}

