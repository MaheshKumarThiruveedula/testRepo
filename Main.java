package ports;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Main {
	static Scanner sc = new Scanner(System.in);
	static Port port = new Port();
	static List<Port> oneMode = new ArrayList<Port>();
	static List<Port> twoMode = new ArrayList<Port>();
	public static void main(String[] args) {
		System.err.println("Enter number of ports : ");
		int count = Integer.valueOf(sc.nextLine());
		System.err.println("Enter details : ");
		Port[] portArray = new Port[count];
		for (int i = 0; i < count; i++) {
			String input = sc.nextLine();
			Scanner s = new Scanner(input).useDelimiter("\\|");
			String portId = s.next();
			String portName = s.next();
			Integer railTransportation = Integer.valueOf(s.next());
			Integer roadTransportation = Integer.valueOf(s.next());
			Integer airTransportation = Integer.valueOf(s.next());
			s.close();
			port = new Port(portId, portName, railTransportation, roadTransportation, airTransportation);
			portArray[i]=port;
		}
		modeOfTransportation(portArray);
		System.out.println("One mode of transportation : ");
		if(oneMode.size()!=0){
			System.out.format("%-5s%s\n","Id","Name");
			Iterator<Port> itr = oneMode.iterator();
			while(itr.hasNext()){
				System.out.println(itr.next().toString().trim());
				
			}
		}
		else{
			System.out.println("No such transportation available ");
		}
		
		System.out.println("more than one  mode of transportation : ");
		 if(twoMode.size()!= 0){
			
			System.out.format("%-5s%s\n","Id","Name");
			Iterator<Port> itr = twoMode.iterator();
			while(itr.hasNext()){
				System.out.println(itr.next().toString().trim());
			}
		}
		 else{
			 System.out.println("No such transportation available");
		 }
	}
	
	public static void modeOfTransportation(Port[] portArray){
		
		for (int i = 0; i < portArray.length; i++) {
			if(portArray[i].getRailTransportation()==1&&(portArray[i].getRoadTransportation()==1)&&portArray[i].getAirTransportation()==1){
				twoMode.add(portArray[i]);
				
			}
			if(portArray[i].getRailTransportation()==1&&(portArray[i].getRoadTransportation()==1)&&portArray[i].getAirTransportation()==0){
				twoMode.add(portArray[i]);
				
			}
			if(portArray[i].getRailTransportation()==1&&(portArray[i].getRoadTransportation()==0)&&portArray[i].getAirTransportation()==1){
				twoMode.add(portArray[i]);
				
			}
			if(portArray[i].getRailTransportation()==1&&(portArray[i].getRoadTransportation()==0)&&portArray[i].getAirTransportation()==0){
				oneMode.add(portArray[i]);
				
			}
			if(portArray[i].getRailTransportation()==0&&(portArray[i].getRoadTransportation()==1)&&portArray[i].getAirTransportation()==1){
				twoMode.add(portArray[i]);
				
			}
			if(portArray[i].getRailTransportation()==0&&(portArray[i].getRoadTransportation()==1)&&portArray[i].getAirTransportation()==0){
				oneMode.add(portArray[i]);
				
			}
			if(portArray[i].getRailTransportation()==0&&(portArray[i].getRoadTransportation()==0)&&portArray[i].getAirTransportation()==1){
				oneMode.add(portArray[i]);
				
			}
			if(portArray[i].getRailTransportation()==0&&(portArray[i].getRoadTransportation()==0)&&portArray[i].getAirTransportation()==0){
				
			}
			
		}
		
	}

}
