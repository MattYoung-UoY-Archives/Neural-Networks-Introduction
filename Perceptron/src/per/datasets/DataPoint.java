package per.datasets;

public class DataPoint {

	private float x, y;
	private int classification;
	
	public DataPoint(float x, float y, int classification) {
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

	public int getClassification() {
		return classification;
	}
	
	@Override
	public String toString() {
		return "(" + x + ", " + y + ", " + classification + ")";
	}
	
}
