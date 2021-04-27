package per;

import java.security.InvalidParameterException;
import java.util.Random;

import tools.Function;
import tools.functions.NoughtToOneSigmoid;

public class Perceptron {
	
	private float[] weights;
	private Function activationFunction;
	
	private int trainNum = 1;
	
	public Perceptron(int inputs) {
		Random rand = new Random();
		weights = new float[inputs];
		for(int i = 0; i < weights.length; i++) {
			weights[i] = rand.nextFloat();
		}
		activationFunction = new NoughtToOneSigmoid();
	}
	
	public Perceptron(float[] weights) {
		for(float weight: weights) if(weight > 1 || weight < 0) throw new InvalidParameterException();
		this.weights = weights;
		activationFunction = new NoughtToOneSigmoid();
	}
	
	public void train(float[] inps, float expectedOut) {
		float evalOut = evaluate(inps);
		float error = expectedOut - evalOut;
		for(int i = 0; i < weights.length; i++) weights[i] += error * inps[i] * Math.min(1, (float) 100 / trainNum);
		trainNum++;
	}
	
	public float evaluate(float[] inps) {
		if(inps.length != weights.length) throw new InvalidParameterException();
		
		//sum
		float sum = 0;
		for(int i = 0; i < inps.length; i++) sum += inps[i] * weights[i];
		
		//act func
		return activationFunction.f(sum);
	}
	
}
