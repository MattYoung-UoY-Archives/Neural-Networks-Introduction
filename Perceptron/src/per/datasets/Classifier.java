package per.datasets;

@FunctionalInterface
public interface Classifier {

	public int classify(float x, float y);
	
}
