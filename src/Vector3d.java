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
	
	public Vector3d(double[] coords) {
		// Constructor
		this.x = coords[0];
		this.y = coords[1];
		this.z = coords[2];
	}
	
	public double[] getCoords() {
		// Returns the x, y and z of this vector as an double array
		return {x, y, z};
	}
	
	public void add(Vector3d a) {
		// Adds Vector3d a to this vector
		this.x = this.x + a.x;
		this.y = this.y + a.y;
		this.z = this.z + a.z;
	}

	public void sub(Vector3d a) {
		// Subtracts Vector3d a from this vector
		this.x = this.x - a.x;
		this.y = this.y - a.y;
		this.z = this.z - a.z;
	}
	
	public double magnitudeSquared() {
		return (this.x*this.x) + (this.y*this.y) + (this.z*this.z);
	}
	
	public double magnitude() {
		return Math.sqrt(this.magnitudeSquared());
	}
	
	public double distancesquared(Vector3d a) {
		// Returns the distance squared between this vector and vector A
		Vector3d result = new Vector3d(this.getCoords());
		result.sub(a);
		return result.magnitudesquared();
	}
	
	public double distance(Vector3d a) {
		// Returns the distance between this vector and vector A
		Vector3d result = new Vector3d(this.getCoords());
		result.sub(a);
		return result.magnitude();
	}
	
	public double dotProduct(Vector3d a) {
		// Returns the dot product of the vector and vector A
		return (this.x * a.x) + (this.y * a.y) + (this.y * a.y);
	}
	
	public Vector3d crossProduct(Vector3d a) {
		// Returns a Vector3d that is the cross product of this vector and vector A
		Vector3d result = new Vector3d(this.y*a.z − this.z*a.y,
									   this.z*a.x − this.x*a.z,
									   this.x*a.y − this.y*a.x);
		return result;
	}
	
	public double angleBetween(Vector a) {
		// Returns the angle between this vector and vector A in radians
		return Math.acos(this.dotProduct(a) / (this.magnitude() * a.magnitude());
	}
	
	public boolean inBox(Box b) {
		// Returns true if this vector is in Box b
		if((this.x > b.start.x) && (this.x < b.end.x) && 
		   (this.y > b.start.y) && (this.y < b.end.y) && 
		   (this.z > b.start.z) && (this.x < b.end.z)) {
			return true;
		}
		return false
	}
	
	// Static methods
}

/*
	
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
	
	public static double magnitudeSquared(Vector3d a) {
		return (a.x*a.x)+(a.y*a.y)+(a.z*a.z)
	}
	
	public static double magnitude(Vector3d a) {
		return Math.sqrt(Vector3d.magnitudeSquared(a));
	}
	
	public static double distancesquared(Vector3d a, Vector3d b) {
		return Vector3d.magnitudesquared(Vector3d.sub(a, b));
	}
	
	public static double distance(Vector3d a, Vector3d b) {
		// Returns the distance between two vectors
		return Vector3d.magnitude(Vector3d.sub(a, b));
	}
	
	public static double dotProduct(Vector3d a, Vector3d b) {
		return 	1.0;
	}
	
	public static Vector3d crossProduct(Vector3d a, Vector3d b) {
		return 1.0;
	}
*/
