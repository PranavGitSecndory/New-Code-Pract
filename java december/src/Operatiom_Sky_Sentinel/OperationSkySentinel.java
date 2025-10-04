package Operatiom_Sky_Sentinel;

public class OperationSkySentinel {

	    public static void main(String[] args) {
	        CommandConsole console = new CommandConsole();

	        // Adding aircraft
	        console.addAircraft(new FighterJet("Alpha1"));
	        console.addAircraft(new FighterJet("Bravo2"));
	        console.addAircraft(new TransportAircraft("CargoX", 5000));
	        console.addAircraft(new TransportAircraft("CargoY", 3000));

	        // Assigning missions
	        console.assignMission("Alpha1", "Enemy Base Alpha");
	        console.assignMission("CargoX", "Forward Operating Base");
	        console.assignMission("Bravo2", "Recon Over Sector 9");
	        console.assignMission("CargoY", "Supply Drop at Village");

	        // Refueling some aircraft
	        Airplane a = console.findAircraft("Alpha1");
	        if (a != null) {
	            a.refuel();
	            System.out.println("Refueled " + a.callSign);
	        }

	        // Printing fleet status
	        console.printFleetStatus();

	        // Printing mission log
	        console.printMissionLog();
	    }
	

}
