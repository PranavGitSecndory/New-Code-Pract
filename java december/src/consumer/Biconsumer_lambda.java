package consumer;

import java.util.function.BiConsumer;

public class Biconsumer_lambda {
public static void main(String[] args) {
BiConsumer<String, Integer> ob=(a,b)->
{
	System.out.println(a+" "+b);
	};
	ob.accept("Apple", 1);
	ob.accept("mango", 2);
	ob.accept("banana", 3);
}
}
