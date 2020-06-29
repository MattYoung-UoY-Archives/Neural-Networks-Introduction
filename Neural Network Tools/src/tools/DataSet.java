package tools;

import java.util.Random;

public class DataSet {

	private static Random rand = new Random();
	
	public static DataPoint[] genFloatDataSet(float minX, float maxX, float minY, float maxY, int num, Classifier classifier) {
		DataPoint[] dataSet = new DataPoint[num];
		for(int i = 0; i < dataSet.length; i++) dataSet[i] = new DataPoint(minX + ((maxX - minX) * rand.nextFloat()) / maxX, minY + ((maxY - minY) * rand.nextFloat()) / maxY, classifier);
		return dataSet;
	}

	public static DataPoint[] genIntDataSet(int minX, int maxX, int minY, int maxY, int num, Classifier classifier) {
		DataPoint[] dataSet = new DataPoint[num];
		for(int i = 0; i < dataSet.length; i++) dataSet[i] = new DataPoint(minX + rand.nextInt(maxX - minX + 1) / (float) maxX, minY + rand.nextInt(maxY - minY + 1) / (float) maxX, classifier);
		return dataSet;
	}
	
}
