package per;

import tools.DataPoint;
import tools.DataSet;

public class Main {

	public static void main(String[] args) {
		
		DataPoint[] gtTrainingSet = DataSet.genIntDataSet(0, 1, 0, 1, 100, (x, y) -> ((x == 1) || (y == 1) ? 1 : 0));
		DataPoint[] gtEvaluationSet = DataSet.genIntDataSet(0, 1, 0, 1, 10, (x, y) -> ((x == 1) || (y == 1) ? 1 : 0));
		
		Perceptron gtPercep = new Perceptron(2);
		
		for(DataPoint data: gtTrainingSet) {
			float[] inps = {data.getX(), data.getY()};
			gtPercep.train(inps, data.getClassification());
		}
		
		int correct = 0;
		
		for(DataPoint data: gtEvaluationSet) {
			float[] inps = {data.getX(), data.getY()};
			float out = gtPercep.evaluate(inps);
			float result = (out > 0.5 ? 1 : 0);
			if(result == data.getClassification()) correct++;
			System.out.println(data + ", " + out + ", " + result);
		}
		
		System.out.println((float) correct / gtEvaluationSet.length);
		
	}
	
}
