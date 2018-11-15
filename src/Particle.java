public class Particle {
	/* Class for a generic particle that behaves like a billiard ball */
	
	String name;
	int id;
	double mass;
	double radius;
	double momentum;
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
		this.momentum = mass * velocity.magnitude();
	}
	
	public void update(double time) {
		// Update all attributes of the particle
		this.updatePosition(time);
	}
	
	public void updatePosition(double time) {
		// Update the position of the particle
		position.add(velocity/time);
	}
	
	public void updateVelocity(Vector3d acceleration, double time) {
		// Update the velocity of the particle
		velocity.add(acceleration/time);
	}
	
	public calulateCollision(Particle P) {
		// Calculate the new velocities and momenta
		// Calculate collision point
		this.
	}
	
	public static boolean isCollisionParticle(Particle a) {
		// Check if two particles are colliding
		if(this.distancesquared(a) < (a.radius + this.radius)*(a.radius + this.radius)))
			return true;
		return false;
	}
	
	
	
	// Static methods
}




	/*public boolean isCollisionBox(Box b) {
		// Check if particle is colliding with box b
		if(this.inBox(b)) {
			return true;
		}
		return false;
	}*/