public class Launcher {
	final static String version_string = "0.1 alpha";
	final static float version_num = 0.1f;
	public static void main(String[] args) {
		// Run check for new jar or exe file with higher version number
		// Check digital signature to see if legit
		// If legit then replace jar with newer version
		// 
		// Run simulation with parameters args
		// And run graphics program
		
		System.out.println("Hello World!");
		System.out.println("Running Autochem version " + version_string);
		Simulation mySim = new Simulation(args);
		System.out.println("End launcher.");
	}
}