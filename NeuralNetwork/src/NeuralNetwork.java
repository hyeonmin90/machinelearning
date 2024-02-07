
public class NeuralNetwork {

	public static final int[][][] andData= {
			{{0,0},{0}},
			{{0,1},{1}},
			{{1,0},{1}},
			{{1,1},{0}}
	};
	//XOR½Ä
	public static final double LEARNING_RATE=0.05;
	public static double[] Initialweights= {Math.random(), Math.random()};
	public static double calculateWeightedSum(int[] data, double[] weights) {
			
			double weightedSum=0;
			for(int x=0; x<data.length; x++) {
				weightedSum += data[x]*weights[x];
			}
			
			return weightedSum;
			
		}
	
	
	public static double sigmoid(double x) {
		double sig=1/(1+Math.exp(-x));
		return sig;	
	}
	
	public static double[] adjustweights(int[] data, double[] weights, double error) {
		
		double[] adjustedWeights=new double[weights.length];
		for(int x=0; x<data.length; x++) {
			adjustedWeights[x]=weights[x]+LEARNING_RATE*sigmoid(x)*error*(sigmoid(x)*(1-sigmoid(x)));
		}
		return adjustedWeights;
		
	}

}
