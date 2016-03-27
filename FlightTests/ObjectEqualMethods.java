package FlightTests;

import Entities.*;

public class ObjectEqualMethods {
	
	public boolean equalAirports(Airport expected, Airport actual)
	{
		if (expected == null || actual == null) return false; 
		
		if (expected.GetAirportId() == actual.GetAirportId() &&
			expected.GetAirportCity() == actual.GetAirportCity() &&
			expected.GetAirportName() == actual.GetAirportName() &&
			expected.GetAirportCountry() == actual.GetAirportCountry())
		{
			return true; 
		}
		else return false; 
		
		
	}
	
	public boolean equalPlane(Plane expected, Plane actual)
	{
		if (expected == null || actual == null) return false; 
		
		if (expected.GetPlaneId() == actual.GetPlaneId() &&
			expected.GetPlaneType() == actual.GetPlaneType() &&
			expected.GetPlaneSeats() == actual.GetPlaneSeats())
		{
			return true; 
		}
		else return false; 
		
		
	}

}
