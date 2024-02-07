
public class Driver {
	
public static void main(String[] args) {
	int[][][] data=NeuralNetwork.andData;
	double[] weights=NeuralNetwork.Initialweights;
	boolean errorflag=true;
	double[] adjustweights=null;
	Driver driver=new Driver();
	NeuralNetwork neuralnetwork=new NeuralNetwork();
	double bias=Math.random();
    while(errorflag) {
    	errorflag=false;
    	
    	for(int x=0; x<data.length; x++) {
    		double sum=NeuralNetwork.calculateWeightedSum(data[x][0], weights);
    		double result=NeuralNetwork.sigmoid(sum+bias);
    		double error=data[x][1][0]-result;
    		if(error != 0) {
    			errorflag=true;
    			System.out.println("data1:"+data[x][0][0]+" data2:"+data[x][0][1]+" weights1:"+weights[0]+" weights2:"+weights[1]+" data result:"+data[x][1][0]+
    					" result:"+result+" bias:"+bias+" error:"+error);
    			adjustweights=NeuralNetwork.adjustweights(data[x][0], weights, error);
    			
    		}
    			
    	}
    	weights=adjustweights;
    	
    }
	
}
}
