package main;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ConsoleLogic {
	private String greeting = "こんにちは！ここは日本です！";
	private String sushitaste ="この寿司はうまい";
	private String sushitype = "寿司は和食です";
	private String datetime;
	
	public ConsoleLogic() {
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        this.datetime = "今の現在日時は" + now.format(formatter) + "です";
    }
	public void printOutput() {
        System.out.println(this.greeting);
        System.out.println(this.sushitaste);
        System.out.println(this.sushitype);
        System.out.println(this.datetime);
    }
}
