package per.datasets;

import java.util.Random;

public class DataSet {

	private static Random rand = new Random();
	
	public static DataPoint[] genDataSet(float minX, float maxX, float minY, float maxY, int num, Classifier classifier) {
		DataPoint[] dataSet = new DataPoint[num];
		for(int i = 0; i < dataSet.length; i++) dataSet[i] = new DataPoint(minX + ((maxX - minX) * rand.nextFloat()), minY + ((maxY - minY) * rand.nextFloat()), classifier);
		return dataSet;
	}
	
}
