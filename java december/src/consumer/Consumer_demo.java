package consumer;

import java.util.function.Consumer;

public class Consumer_demo implements Consumer<String> {
	public void accept(String s)
	{
		System.out.println("This is my prgraming in a : "+s);
	}
public static void main(String[] args) {
	Consumer_demo ob =new Consumer_demo();
	ob.accept("Java");
}
}
