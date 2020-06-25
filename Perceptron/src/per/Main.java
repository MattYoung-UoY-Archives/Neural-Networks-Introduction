package per;

import java.util.Arrays;

import per.datasets.DataPoint;
import per.datasets.DataSet;

public class Main {

	public static void main(String[] args) {
		DataPoint[] dataSet = DataSet.genDataSet(0, 1, 0, 1, 5, (x, y) -> (x > y ? 0 : 1));
		System.out.println(Arrays.toString(dataSet));
	}
	
}
