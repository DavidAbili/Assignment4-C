import java.lang.String;

public class Property {

	private Plot plot;
	private String owner;
	private String city;
	private String propertyName;
	private double rentAmount;

	public Property() {
		owner = "";
		city = "";
		propertyName = "";
		rentAmount = 0;
		Plot plot = new Plot(0,0,0,0);
	}

	public Property(String p, String c, double r, String o, int x, int y, int width, int depth) {
		owner = o;
		city = c;
		propertyName = p;
		rentAmount = r;
		Plot plot = new Plot(x,y,depth,width);
	}

	public Property(String p, String c, double r, String o) {
		owner = o;
		city = c;
		propertyName = p;
		rentAmount = r;
		Plot plot = new Plot(0,0,0,0);
	}

	public Property(Property p) {
		owner = p.owner;
		city = p.city;
		propertyName = p.propertyName;
		rentAmount = p.rentAmount;
	
	}


	public String getCity() {
		return city;
	}

	public void setCity(String c) {
		city = c;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String o) {
		owner = o;
	}

	public String getPropertyName() {
		return propertyName;
	}

	public void setPropertyName(String p) {
		propertyName = p;
	}

	public double getRentAmount() {
		return rentAmount;
	}

	public void setRentAmount(double r) {
		rentAmount = r;
	}

	public Plot setPlot(int x, int y, int width, int depth) {
		return new Plot(x,y,width,depth);
	}
	public Plot getPlot() {
		return plot;
	}
	



	public String toString() {
		return "Property Name "+ propertyName
				+	" Located in " + city 
				+ " Owner By " + owner
				+ " Rent Amount " +rentAmount;

	}

}
