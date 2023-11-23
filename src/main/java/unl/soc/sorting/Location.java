package unl.soc.sorting;

public class Location implements Comparable<Location> {

	private final String zipCode;
	private final String city;
	private final Double latitude;
	private final Double longitude;
	private final String state;

	public Location(String zipCode, Double latitude, Double longitude, String city, String state) {
		this.zipCode = zipCode;
		this.city = city;
		this.latitude = latitude;
		this.longitude = longitude;
		this.state = state;
	}

	public String getCity() {
		return this.city;
	}

	public String getZipCode() {
		return this.zipCode;
	}

	public Double getLatitude() {
		return latitude;
	}

	public Double getLongitude() {
		return longitude;
	}

	public String getState() {
		return state;
	}

	/**
	 * Complete the implementation of this method that will be used for sorting
	 * collections of Locations.
	 * 
	 * @param l
	 * @return
	 */
	@Override
	public int compareTo(Location location) {
		throw new UnsupportedOperationException("YOU MUST IMPLEMENT THIS");
	}

	@Override
	public String toString() {
		return String.format("%-20s %-4s %-8s ( %.2f, %.2f)", this.city, this.state, this.zipCode, this.latitude,
				this.longitude);
	}

	@Override
	public boolean equals(Object obj) {
		return (obj != null && obj instanceof Location) ? (this.compareTo((Location) obj) == 0) : false;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((city == null) ? 0 : city.hashCode());
		result = prime * result + ((latitude == null) ? 0 : latitude.hashCode());
		result = prime * result + ((longitude == null) ? 0 : longitude.hashCode());
		result = prime * result + ((state == null) ? 0 : state.hashCode());
		result = prime * result + ((zipCode == null) ? 0 : zipCode.hashCode());
		return result;
	}
}
