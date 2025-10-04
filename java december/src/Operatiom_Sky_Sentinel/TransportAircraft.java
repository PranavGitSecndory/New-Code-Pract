package Operatiom_Sky_Sentinel;

public class TransportAircraft extends Airplane {
	
	        private int cargoWeight;

	        public TransportAircraft(String callSign, int cargoWeight) {
	            super(callSign, "TransportAircraft");
	            this.cargoWeight = cargoWeight;
	        }

	        @Override
	        public void performMission(String target) {
	            System.out.println(callSign + " is transporting cargo to " + target);
	            fuelLevel -= 25;
	            if (fuelLevel < 0) fuelLevel = 0;
	        }

	        @Override
	        public String toString() {
	            return super.toString() + ", Cargo Weight: " + cargoWeight + "kg";
	        }
	    
}
