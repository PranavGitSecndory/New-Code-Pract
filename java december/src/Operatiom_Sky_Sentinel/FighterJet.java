package Operatiom_Sky_Sentinel;
public class FighterJet extends Airplane{
	


	    public FighterJet(String callSign) {
	        super(callSign, "FighterJet");
	    }

	    @Override
	    public void performMission(String target) {
	        System.out.println(callSign + " is performing mission at " + target);
	        fuelLevel -= 40;
	        if (fuelLevel < 0) fuelLevel = 0;

	        if (target.toLowerCase().contains("base")) {
	            System.out.println("High Priority Mission Assigned!");
	        }
	    }

	    @Override
	    public String toString() {
	        return super.toString(); // Using parent's toString
	    }
	    
	 
}

