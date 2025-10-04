//10. Design a thread-safe Singleton class in Java.
package test_16;
class Singleton {

    
    private Singleton() 
    {
        System.out.println("Singleton instance created");
    }

  
    private static class SingletonHelper 
    {
        private static final Singleton INSTANCE = new Singleton();
    }

    public static Singleton getInstance() 
    {
        return SingletonHelper.INSTANCE;
    }
}


public class Q7 {
	public static void main(String[] args) {
		Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();

        System.out.println(s1 == s2);
		
	}

}
