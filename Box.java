public class Box {
	Vector3d start;
	Vector3d end;
	double length;
	double width;
	double height;
	
	public Box(Vector3d start, Vector3d end) {
		this.start = start;
		this.end = end;
		length = Math.abs(start.x - end.x);
		width  = Math.abs(start.y - end.y);
		height = Math.abs(start.z - end.z);
	}
	
	public void setSize(length, width, height) {
		this.length = length;
		this.width = width;
		this.height = height;
		
		end.x = start.x + length;
		end.y = start.y + width;
		end.z = start.z + height;
	}
	
	public void changeSize(length, width, height) {
		
	}
	
	public void setPosition(Vector3d position) {
		start = position;
		end.x = start.x + length;
		end.y = start.y + width;
		end.z = start.z + height;
	}
	
	public void moveTo(Vector3d coordinates) {
		start.add(coordinates);
		end.add(coordinates);
	}
	
	public void setRotation() {
		// TODO: Add code
	}
	
	public void rotateBy() {
		// TODO: Add code
	}
	
	public void setScale() {
		// TODO: Add code
	}
	
	public void scaleBy() {
		// TODO: Add code
	}
}