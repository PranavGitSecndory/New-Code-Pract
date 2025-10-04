package encapsulation;

public class Question3 {
	
	    private String accountNumber;
	    private double balance;

	    public Question3(String accountNumber, double balance) {
	        this.accountNumber = accountNumber;
	        this.balance = balance;
	    }

	    public String getAN() {
	        return accountNumber;
	    }

	    public double getB() {
	        return balance;
	    }

	    public static void main(String[] args) {
	    	Question3 account = new Question3("123456789", 5000.0);

	        System.out.println("Account Number: " + account.getAN());
	        System.out.println("Balance: " + account.getB());
	    }
	}



