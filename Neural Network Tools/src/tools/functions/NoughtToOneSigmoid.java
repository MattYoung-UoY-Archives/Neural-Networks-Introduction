package tools.functions;

import tools.Function;

public class NoughtToOneSigmoid implements Function {

	@Override
	public float f(float x) {
		return (float) ((((float) 1) / (1 + Math.exp(-x))) - 0.5) * 2;
	}

}
