public class Particle {
	String name;
	int id;
	double mass;
	double radius;
	Vector3d position;
	Vector3d velocity;
	int[] colour;
	
	public Particle(String name, double mass, double radius, Vector3d position, Vector3d velocity, int[] colour) {
		this.name = name;
		this.mass = mass;
		this.radius = radius;
		this.position = position;
		this.velocity = velocity;
		this.colour = colour;
	}
	
	public void update() {
		this.updatePosition();
	}
	
	public void updatePosition() {
		position.add(velocity);
	}
	
	public void updateVelocity(Vector3d acceleration) {
		velocity.add(acceleration);
	}
	
	/*public static Vector3d updatePosition(Particle a) {
		a.position = Vector3d.add(a.postition, a.velocity);
	}*/
	
	public boolean isCollision(Particle a, Particle b) {
		if(Vector3d.distance(a, b) < (a.radius + b.radius))
			return true;
		return false;
	}
}
