import java.lang.reflect.Array;

public class ManagementCompany {

	private  int MAX_PROPERTY =5;
	private  double	mgmFeePer;
	private  String	name;           
	private  Property[]	properties;	           
	private  String taxID;	           
	private  int	MGMT_WIDTH = 10;	           
	private  int	MGMT_DEPTH = 10;	           
	private  Plot plot;
	private int index = 0;

	public	ManagementCompany() {
		this.properties = new Property[MAX_PROPERTY];
		mgmFeePer = 0;
		name = "";
		taxID = "";
		this.plot = new Plot(0,0,0,0);

	}

	public ManagementCompany(String n, String t, double mgmFee) {

		mgmFeePer = mgmFee;
		name = n;
		taxID = t;
		this.plot = new Plot(0,0,MGMT_WIDTH,MGMT_DEPTH);
		this.properties = new Property[MAX_PROPERTY];
	}

	public ManagementCompany(String n, String t, double m, int x, int y, int width, int depth){

		mgmFeePer = m;
		name = n;
		taxID = t;
		this.plot = new Plot(x,y,width,depth);
		this.properties = new Property[MAX_PROPERTY];
	}

	public ManagementCompany(ManagementCompany otherCompany){
		this.properties = otherCompany.properties;
		mgmFeePer = otherCompany.mgmFeePer;
		name = otherCompany.name;
		taxID = otherCompany.taxID;
		this.plot = otherCompany.plot;
	}

	public double totalRent() {
		double tot = 0;
		for(int i = 0; i< properties.length; i++) {
			tot += properties[i].getRentAmount();
		}
		return tot;
	}

	public String maxRentProp() {
		int max =  0;

		for(int i = 0; i< properties.length; i++) {
			if(max < properties[i].getRentAmount()) {
				max = i;
			}
		}
		return properties[max].toString();

	}

	public int maxRentPropertyIndex() {
		int max = 0;
		for(int i = 0; i< properties.length; i++) {
			if(max < this.properties[i].getRentAmount()) {
				max = i;
			}
		}
		return max;
	}
	public String displayPropertyAtIndex(int in) {
		return properties[in].toString();
	}
	

	public int addProperty(Property property) {

int num = 0;
		Property prop = new Property(property);
			properties[4] = prop;

			  if (properties.equals(null)) {
				num = -2;
			} else if(plot.overlaps(property.getPlot())) {
				num = -4;
			} else if (plot.encompasses(property.getPlot())) {
				num = -3;
			} else if(!(properties.equals(null))) {
				if(index != 5) {
				properties[index] = prop;
				num = index;
				Array.set(properties, index,properties[index] );
				index++;
				}

			} else if(index ==4) {
				num = -1;
			} 
		
		return num;
	}
	
	public int addProperty(String n, String c, double r, String o) {

		Property prop = new Property(n,c,r,o);

		int num = 0;
		for(int i = 0; i < MAX_PROPERTY; i++) {	

			properties[i] = prop;

			 if(i==4) {
				num = -1;
			} else if (properties.equals(null)) {
				num = -2;
			} else if(plot.overlaps(prop.getPlot())) {
				num = -4;
			} else if (plot.encompasses(prop.getPlot())) {
				num = -3;
			} else if(!(properties.equals(null))) {
				properties[i] = prop;
				num = i;
			}
		}
		return num;
	}
	
	public int addProperty(String n, String c, double r, String o,int x, int y, int depth, int width) {

		Property prop = new Property(n,c,r,o,x,y,depth,width);

		int num = 0;
		
		for(int i = 0; i < MAX_PROPERTY; i++) {	

			properties[i] = prop;

			 if(i == 4) {
				num = -1;
			} else if (properties.equals(null)) {
				num = -2;
			} else if(plot.overlaps(prop.getPlot())) {
				num = -4;
			} else if (plot.encompasses(prop.getPlot())) {
				num = -3;
			} else if(!(properties.equals(null))) {
				properties[i] = prop;
				num = i;
			}
		}
		return num;
	}


	public String toString() {
		String word = "";
		for(int i = 0; i< properties.length; i++) {
			word+=properties[i].toString();
			word += "\n";
		}
		return word;
	}
}


