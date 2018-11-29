
public class Gum {
	
		//fields what the object knows
		int w;
		int x;
		int y;
		int z;
		
		//constructor - called when the object is instantiated from the client
		public Gum(int initialW, int initialX, int initialY, int initialZ) {
			w = initialW;
			x = initialX;
			y = initialY;
			z = initialZ;
			
		} 
		
		//methods - what the class does

		//return the distance between this point and (0,0)
		public double distanceFromOrigin() {
			return Math.sqrt(w * w + x * x + y * y + z * z);
		}
		
		//translate the point location by a given number
		public void translate(int dw,int dx, int dy, int dz) {
			w += dw;
			x += dx;
			y += dy;
			z += dz;
		}
	}


