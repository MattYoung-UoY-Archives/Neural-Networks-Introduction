package tools;

public class DataPoint {

	private float x, y;
	private float classification;
	
	public DataPoint(float x, float y, float classification) {
		this.x = x;
		this.y = y;
		this.classification = classification;
	}

	public DataPoint(float x, float y, Classifier classifier) {
		this.x = x;
		this.y = y;
		classification = classifier.classify(x, y);
	}
	
	public float getX() {
		return x;
	}

	public float getY() {
		return y;
	}

	public float getClassification() {
		return classification;
	}
	
	@Override
	public String toString() {
		return "(" + x + ", " + y + ", " + classification + ")";
	}
	
}
