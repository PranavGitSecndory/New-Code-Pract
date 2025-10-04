package consumer;

import java.util.function.Consumer;

public class Consumer_lambda {
public static void main(String[] args) {
	Consumer<String> ob=(s)->
	{
System.out.println("consumer in lambda : "+s);
	};
	ob.accept("ketan");
}
}
