package per;

import java.util.Arrays;

import tools.DataPoint;
import tools.DataSet;

public class Main {

	public static void main(String[] args) {
		DataPoint[] dataSet = DataSet.genFloatDataSet(0, 1, 0, 1, 5, (x, y) -> (x > y ? 1 : 0));
		System.out.println(Arrays.toString(dataSet));
		
		DataPoint[] intDataSet = DataSet.genIntDataSet(0, 1, 0, 1, 5, (x, y) -> ((x == 1 || y == 1) ? 1 : 0));
		System.out.println(Arrays.toString(intDataSet));
		
		Perceptron p = new Perceptron(2);
	}
	
}
