package sub;

import supe.Super;
//親クラスsuperを小クラスであるSubに継承する。
public class Sub extends Super { 
	 public Sub(String name) { 
     //スーパークラスを使いSuper.javaのオーバーロード処理を行う。
	 super(); 
	 setName(name); 
	 } 
	}