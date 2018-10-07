public class Vector3d {
	double x;
	double y;
	double z;
	
	public Vector3d(double x, double y, double z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}
	
	public void add(Vector3d a) {
		this.x += a.x;
		this.y += a.y;
		this.z += a.z;
	}

	public void sub(Vector3d a) {
		this.x -= a.x;
		this.y -= a.y;
		this.z -= a.z;
	}
	
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
		return Math.sqrt((a.x-b.x)*(a.x-b.x)+
						(a.y-b.y)*(a.y-b.y)+
						(a.z-b.z)*(a.z-b.z));
	}
}
