public class Location {
	
	private double lattitude;
	private double longitude;
	
	public Location(String latlong){
		String[] location = latlong.split(", ");
		lattitude = Double.valueOf(location[0]);
		longitude = Double.valueOf(location[1]);
	}

	public double getLattitude() {
		return lattitude;
	}

	public void setLattitude(double lattitude) {
		this.lattitude = lattitude;
	}

	public double getLongitude() {
		return longitude;
	}

	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}
	
	
}
