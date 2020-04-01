package com.example.carbonfootprint;

import java.util.ArrayList;
import java.util.List;

public class CarbonTest {

	public static void main(String[] args) {
		Building building1 = new Building(3000, 300);
		Car car1 = new Car("Toyota Auris", 230, true, 500);
		Bicycle bicycle1 = new Bicycle(5000);
		
		List<CarbonFootprint> carbonList = new ArrayList<CarbonFootprint>();
		
		carbonList.add(building1);
		carbonList.add(car1);
		carbonList.add(bicycle1);
		
		for(CarbonFootprint cf : carbonList) {
			System.out.println(cf);
			System.out.println("Carbon footprint: " 
					+ cf.getCarbonFootprint());
		}
	}
}
