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
	
	public setRotation() {
		// TODO: Add code
	}
	
	public rotateBy() {
		// TODO: Add code
	}
	
	public setScale() {
		// TODO: Add code
	}
	
	public scaleBy() {
		// TODO: Add code
	}
}