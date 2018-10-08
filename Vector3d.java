public class Vector3d {
	double x;
	double y;
	double z;
	
	public Vector3d(double x, double y, double z) {
		// Constructor
		this.x = x;
		this.y = y;
		this.z = z;
	}
	
	public Vector3d add(Vector3d a) {
		this = Vector3d.add(this, a);
		return this;
		/*this.x += a.x;
		this.y += a.y;
		this.z += a.z;*/
	}

	public Vector3d sub(Vector3d a) {
		this = Vector3d.sub(this, a);
		return this;
		/*this.x -= a.x;
		this.y -= a.y;
		this.z -= a.z;*/
	}
	
	public double magnitude() {
		return Vector3d.magnitude(this);
	}
	
	public double distance(Vector3d a) {
		return Vector3d.distance(this, a);
	}
	
	public boolean inBox(Box b) {
		// Returns true if vector is in Box b
		if((x > b.start.x) && (x < b.end.x) && 
		   (y > b.start.y) && (y < b.end.y) && 
		   (z > b.start.z) && (x < b.end.z)) {
			return true;
		}
		return false
	}
	
	// Static methods
	public static Vector3d add(Vector3d a, Vector3d b) {
		Vector3d c = new Vector3d(0, 0, 0);
		
		c.x = a.x + b.x;
		c.y = a.y + b.y;
		c.z = a.z + b.z;
		
		return c;
	}

	public static Vector3d sub(Vector3d a, Vector3d b) {
		Vector3d c = new Vector3d(0, 0, 0);
		
		c.x = a.x - b.x;
		c.y = a.y - b.y;
		c.z = a.z - b.z;
		
		return c;
	}
	
	
	public static double magnitude(Vector3d a) {
		return Math.sqrt((a.x*a.x)+(a.y*a.y)+(a.z*a.z));
	}
	
	public static double distance(Vector3d a, Vector3d b) {
		// Returns the distance between two vectors
		return Math.sqrt((a.x-b.x)*(a.x-b.x)+
						(a.y-b.y)*(a.y-b.y)+
						(a.z-b.z)*(a.z-b.z));
	}
}
