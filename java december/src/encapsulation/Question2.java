package encapsulation;

public class Question2 {

	    private String brand;
	    private double price;

	    public String getBrand() {
	        return brand;
	    }

	    public void setBrand(String brand) {
	        this.brand = brand;
	    }

	    public double getPrice() {
	        return price;
	    }

	    public void setPrice(double price) {
	        if (price > 0) {
	            this.price = price;
	        } else {
	            System.out.println("Price must be positive.");
	        }
	    }

	    public static void main(String[] args) {
	    	Question2 car = new Question2();
	        car.setBrand("Toyota");
	        car.setPrice(25000);

	        System.out.println("Brand: " + car.getBrand());
	        System.out.println("Price: " + car.getPrice());
	    }
	}



