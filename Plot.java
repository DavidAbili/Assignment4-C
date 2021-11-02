
public class Plot {

	private int x;
	private int y;
	private int width;
	private int depth;

	public Plot() {
		x = 0;
		y = 0;
		width = 0;
		depth = 0;

	}

	public Plot(Plot p) {
		x = 0;
		y = 0;
		width = 0;
		depth = 0;

	}
	public Plot(int x, int y, int depth, int width) {
		this.x = x;
		this.y = y;
		this.width = width;
		this.depth = depth;

	}

	public boolean overlaps(Plot plot) {
		boolean value = false;
		Plot pl = new Plot(plot);
	if(!((getX() + getWidth()) > pl.getX()) &&!((getY() + getWidth()) > pl.getY())) {
			value = true;
		}
		return value;
	}
	
	public boolean encompasses(Plot plot) {
		boolean value = false;
		if(getX() > this.x && getWidth() > this.width && getY() > this.y && getDepth() > this.depth) {
			value = true;
		}
		return value;
	}
	
	public void setX(int x) {
		this.x = x;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getY() {
		return y;
	}

	public int getX() {
		return x;
	}

	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public void setDepth(int depth) {
		this.depth = depth;
	}
	public int getDepth() {
		return depth;
	}
	
	public String toString() {
		return "Upper left("+x+","+y+")"+ "Width" + width+"Depth" + depth;
	}





}
