/*
	0, "北海道:札幌市:83424"
	1, "青森県:青森市:9646"
	2, "岩手県:盛岡市:15275"
	3, "宮城県:仙台市:7282"
	4, "秋田県:秋田市:11638"
	5, "山形県:山形市:9323"
	6, "福島県:福島市:13784"
	7, "茨城県:水戸市:6097"
	8, "栃木県:宇都宮市:6408"
	9, "群馬県:前橋市:6362"
	10, "埼玉県:さいたま市:3798"
 	
 	コンソールに数字と昇順・降順の値が入力されると上記配列に対応する
 	都道府県がソートされてコンソールに出力されるように作ってください
   	※Packageを2つ作ってください
   	※複数選択できるようにしてください
   	
   	例:
   	8
   	5
   	9
   	と入力された場合（昇順）
   	
   	都道府県名：山形県
	県庁所在地：山形市
	面積：9323.0km2
   	
   	都道府県名：栃木県
	県庁所在地：宇都宮市
	面積：6408.0km2

   	都道府県名：群馬県
	県庁所在地：前橋市
	面積：6362.0km2
	
 */
package lesson29main;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import lesson29logic.Lesson29logic;

public class Lesson29main {
	    
	public static void main(String[] args) {
		//Arrays.sortを使うことによりこのリストの並びは常に昇順で表示されるように設定。
		List<Lesson29logic> prefectures = Arrays.asList(
				 new Lesson29logic("北海道", "札幌市", 83424),
			        new Lesson29logic("青森県", "青森市", 9646),
			        new Lesson29logic("岩手県", "盛岡市", 15275),
			        new Lesson29logic("宮城県", "仙台市", 7282),
			        new Lesson29logic("秋田県", "秋田市", 11638),
			        new Lesson29logic("山形県", "山形市", 9323),
			        new Lesson29logic("福島県", "福島市", 13784),
			        new Lesson29logic("茨城県", "水戸市", 6097),
			        new Lesson29logic("栃木県", "宇都宮市", 6408),
			        new Lesson29logic("群馬県", "前橋市", 6362),
			        new Lesson29logic("埼玉県", "さいたま市", 3798)
		);
		//Scanner文を利用し都道府県番号、昇順降順かをコンソールにて問いただす出力をする。
		Scanner scanner = new Scanner(System.in);
        System.out.println("都道府県の番号を入力してください。複数選択可能です。※その際数字の間に空白を入れてください。");
        //空白をあけることで数字を分ける
        String[] numbers = scanner.nextLine().split("\\s+");
        
        System.out.println("昇順（0）、降順（1）のいずれかを入力してください。");
        //この際入力した数字をsortorderと命名
        int sortOrder = scanner.nextInt();
        
     //数字に応じて都道府県をソートする
        /*if文を使いもし1が入力された場合revers文を使い降順に設定をする。
         * （Arrays.sort(配列名, collections.reversorder());)
         */
        Arrays.sort(numbers);
        if (sortOrder == 1) {
            Collections.reverse(Arrays.asList(numbers));
        }

        // ソートされた都道府県を出力する
        //この際入手するint型はcollection型を使うのでparseIntを使用し文字列として処理をする。
        for (String number : numbers) {
        	//ここのint indexとはList型のメソッドから来ており意味としてはリストからの値の要素番号を出力している。
            int index = Integer.parseInt(number);
            Lesson29logic prefecture = prefectures.get(index);
            
            //実際コンソールに出力する文章を記入。
            System.out.println("都道府県名：" + prefecture.getName());
            System.out.println("県庁所在地：" + prefecture.getCapital());
            System.out.println("面積：" + prefecture.getArea() + "km2");
            System.out.println();
	}

}
}
