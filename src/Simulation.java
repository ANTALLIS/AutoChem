public class Simulation {
	// Constants - Get them from file
	// Gravity   N * kg-2 * m2
	//double G = 6.674 * Math.pow(10, -11);
	
	public String name;
	
	public Simulation(String[] args) {
		name = "Sim " + String.format("%05d", (int)(Math.random()*100000)); // Generate a number between 00000 and 99999
		this.run();
	}
	
	public void run() {
		System.out.println("Hello World!");
		System.out.println("Running..." + name);		
		System.out.println("End Simulation " + name + ".");
	}
	
	/*
	public static void main(String[] args) {
		System.out.println("Hello World!");	
		this.run();
	}*/
}
