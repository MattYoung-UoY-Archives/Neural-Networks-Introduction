package tools;

@FunctionalInterface
public interface Classifier {

	public float classify(float x, float y);
	
}
