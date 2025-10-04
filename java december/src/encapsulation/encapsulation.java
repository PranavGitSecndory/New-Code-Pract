package encapsulation;

public class encapsulation {
	private int id;
	private String name;
	
	encapsulation(int id ,String name)
	{
		this.id=id;
		this.name=name;
	}
	public int getid()
	{
		return id;
	}
	public String getname()
	{
		return name;
	}
	public static void main(String[] args) {
		encapsulation ob=new encapsulation(22,"nick");
		System.out.println(ob.getid()+" "+ob.getname());
	}
	
}
