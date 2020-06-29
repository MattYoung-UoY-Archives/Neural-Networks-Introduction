package per;

import java.security.InvalidParameterException;
import java.util.Random;

public class Perceptron {
	
	private float[] weights;
	
	public Perceptron(int inputs) {
		Random rand = new Random();
		weights = new float[inputs];
		for(int i = 0; i < weights.length; i++) {
			weights[i] = rand.nextFloat();
		}
	}
	
	public Perceptron(float[] weights) {
		for(float weight: weights) if(weight > 1 || weight < 0) throw new InvalidParameterException();
		this.weights = weights;
	}
	
}
