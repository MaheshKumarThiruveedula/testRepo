package ports;

public class Port {
	private String portId;
	private String portName;
	private Integer railTransportation;
	private Integer roadTransportation;
	private Integer airTransportation;
	public String getPortId() {
		return portId;
	}
	public void setPortId(String portId) {
		this.portId = portId;
	}
	public String getPortName() {
		return portName;
	}
	public void setPortName(String portName) {
		this.portName = portName;
	}
	public Integer getRailTransportation() {
		return railTransportation;
	}
	public void setRailTransportation(Integer railTransportation) {
		this.railTransportation = railTransportation;
	}
	public Integer getRoadTransportation() {
		return roadTransportation;
	}
	public void setRoadTransportation(Integer roadTransportation) {
		this.roadTransportation = roadTransportation;
	}
	public Integer getAirTransportation() {
		return airTransportation;
	}
	public void setAirTransportation(Integer airTransportation) {
		this.airTransportation = airTransportation;
	}
	public Port(String portId, String portName, Integer railTransportation,
			Integer roadTransportation, Integer airTransportation) {
		super();
		this.portId = portId;
		this.portName = portName;
		this.railTransportation = railTransportation;
		this.roadTransportation = roadTransportation;
		this.airTransportation = airTransportation;
	}
	public Port() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return String.format("%-5s%s\n",portId,portName);
	}
	

}
