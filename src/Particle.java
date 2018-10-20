public class Particle {
	/* Class for a generic particle that behaves like a billiard ball */
	
	String name;
	int id;
	double mass;
	double radius;
	Vector3d position;
	Vector3d velocity;
	int[] colour;
	
	public Particle(String name, double mass, double radius, Vector3d position, Vector3d velocity, int[] colour) {
		//Constructor method
		this.name = name;
		this.mass = mass;
		this.radius = radius;
		this.position = position;
		this.velocity = velocity;
		this.colour = colour;
	}
	
	public void update() {
		// Update all attributes of the particle
		this.updatePosition();
	}
	
	public calulateCollision(Particle P) {
		
	}
	
	public void updatePosition() {
		// Update the position of the particle
		position.add(velocity);
	}
	
	public void updateVelocity(Vector3d acceleration) {
		// Update the velocity of the particle
		velocity.add(acceleration);
	}
	
	public boolean isCollisionBox(Box b) {
		// Check if particle is colliding with box b
		if(this.inBox(b)) {
			return true;
		}
		return false;
	}
	
	
	
	// Static methods
	public static boolean isCollisionParticle(Particle a, Particle b) {
		// Check if two particles are colliding
		if(Vector3d.distancesquared(a, b) < (a.radius + b.radius)*(a.radius + b.radius)))
			return true;
		return false;
	}
}
