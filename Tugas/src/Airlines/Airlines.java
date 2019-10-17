package Airlines;

import Interfaces.AirlinesInterface;

public class Airlines implements AirlinesInterface {
	private AirlinesDetails airlineDetails = new AirlinesDetails();
	private String departure;
	private String arrival;

	
	
	public Airlines(String airlinesName,String flightNumber, String regNumber, String departure, String arrival){
		airlineDetails.setAirlinesName(airlinesName);
		airlineDetails.setFlightNumber(flightNumber);
		airlineDetails.setRegNumber(regNumber);
		this.departure = departure;
		this.arrival = arrival;
	}


	public AirlinesDetails getAirlineDetails() {
		return airlineDetails;
	}


	public void setAirlineDetails(AirlinesDetails airlineDetails) {
		this.airlineDetails = airlineDetails;
	}


	public String getDeparture() {
		return departure;
	}


	public void setDeparture(String departure) {
		this.departure = departure;
	}


	public String getArrival() {
		return arrival;
	}


	public void setArrival(String arrival) {
		this.arrival = arrival;
	}	
	
	@Override
	public void showAirlines() {
		System.out.println("Airlines : "+this.getAirlineDetails().getAirlinesName());
		System.out.println("Flight Number : "+this.getAirlineDetails().getFlightNumber());
		System.out.println("Register Code : "+this.getAirlineDetails().getRegNumber());
		System.out.println("Departure : "+this.getDeparture());
		System.out.println("Arrival : "+this.getArrival());
	}
	
	
}
