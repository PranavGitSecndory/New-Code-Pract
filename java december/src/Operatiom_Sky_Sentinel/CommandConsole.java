package Operatiom_Sky_Sentinel;

public class CommandConsole {
	
	    private Airplane[] fleet = new Airplane[10];
	    private String[] missionLog = new String[10];
	    private int aircraftCount = 0;
	    private int missionCount = 0;

	    public void addAircraft(Airplane a) {
	        if (aircraftCount < fleet.length) {
	            fleet[aircraftCount++] = a;
	            System.out.println("Aircraft " + a.callSign + " added to fleet.");
	        } else {
	            System.out.println("Fleet is full. Cannot add more aircraft.");
	        }
	    }

	    public Airplane findAircraft(String callSign) {
	        for (int i = 0; i < aircraftCount; i++) {
	            if (fleet[i].callSign.equalsIgnoreCase(callSign)) {
	                return fleet[i];
	            }
	        }
	        return null;
	    }

	    public void assignMission(String callSign, String target) {
	        Airplane a = findAircraft(callSign);
	        if (a != null) {
	            a.performMission(target);
	            logMission(callSign + " assigned mission at " + target);
	        } else {
	            System.out.println("Aircraft with callSign " + callSign + " not found.");
	        }
	    }

	    private void logMission(String missionDetail) {
	        missionLog[missionCount % missionLog.length] = missionDetail;
	        missionCount++;
	    }

	    public void printFleetStatus() {
	        System.out.println("\nFleet Status:");
	        for (int i = 0; i < aircraftCount; i++) {
	            System.out.println(fleet[i]);
	        }
	    }

	    public void printMissionLog() {
	        System.out.println("\nMission Log:");
	        int logsToPrint = Math.min(missionCount, missionLog.length);
	        for (int i = 0; i < logsToPrint; i++) {
	            System.out.println((i + 1) + ". " + missionLog[i]);
	        }
	    }
	

	}


