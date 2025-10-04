package consumer;

import java.util.function.BiConsumer;

public class Baiconsumer implements BiConsumer<String,Integer>{
	@Override
		public void accept(String t, Integer u) {
			// TODO Auto-generated method stub
		System.out.println(t+" "+u);	
		}
public static void main(String[] args) {
	Baiconsumer ob = new Baiconsumer();
	ob.accept("apple",1);
	ob.accept("mango",2);
	ob.accept("banana",3);
}
}
