
//This version includes: multiple constructors, private access modifiers,
//getter and setter methods, and object equality test and a toString methods

public class Gummain {

	//4 fields code,description,price and product count.
	private int w;
	private int x;
	private int y;	
	private int z;
	
	//constructor 1 to create a new point at the origin
	public Gummain() {
		this(0,0);	
	}
	//constructor2
	public Gummain(int i, int j) {
		
	}
	public Gummain(int w, int x, int y, int z) {
		if(x < 0 || y < 0) {
			throw new IllegalArgumentException();
		}
		
		this.w = w;
		this.x = x;
		this.y = y;
		this.z = z;
		
	}
	
	//return distance from origin and this point
	public double distanceEnomOrigin() {
		return Math.sqrt(w * w + x * x + y * y + z * z);
	}
	
	//check object equality hmm
	public boolean equals (Object o) {
		if (o instanceof Gum) {
			Gum other = (Gum) o;
			return w == other. w && x == other.x && y == other.y && z == other.z;
		}
		else {
			return false; //
		}
		
	}
	
	//add getter and setter
	
	public int getW() {
		return w;
	}
	public void setW(int w) {
		this.w = w;
	}	
	
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}	
	public int getZ() {
		return z;
	}
	public void setZ(int z) {
		this.z = z;
	}
	//return a String representation of gum
	public String toString() {
		return (" w: " + w + "x: " + x + " y: " + y +"z: " + z);
		
	}
	public Gum translate(int dw, int dx, int dy, int dz) {
		return new Gum(w + dw, x + dx, y + dy, z + dz);
	}
	
	
}


