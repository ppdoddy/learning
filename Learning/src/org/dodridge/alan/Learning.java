package org.dodridge.alan;

public class Learning {
	
	public static void main(String[] args){
		Learning l = new Learning();
		l.applyCostFunctionToData();
	}
	
	double theta0, theta1, bestTheta0, bestTheta1;
	double[] xData = new double[]{1,2,3,4,5,6,7,8,9};
	double[] yData = new double[]{6,7,8,9,10,11,12,13,14};
	
	public double evaluateH(double x){
		return theta0 + (theta1*x);
	}

	public double evaluateJ(){
		double error, sumOfErrors = 0;
		for(int i=0; i<xData.length; i++){
			error = evaluateH(xData[i]) - yData[i];
			error = Math.pow(error, 2);
			sumOfErrors += error;
		}
		return sumOfErrors/(2*xData.length);
	}
	
	public void applyCostFunctionToData(){
		double j = 0, minJ = Double.MAX_VALUE;
		for(double zero=-100; zero<100; zero=zero+0.5){
			theta0 = zero;
			for(double one=-100; one<100; one=one+0.5){
				theta1 = one;
				j = evaluateJ();
				if(j<minJ){
					minJ = j;
					bestTheta0 = theta0;
					bestTheta1 = theta1;
				}
				
			}
		}
		System.out.println("optimal theta0 is: " + bestTheta0);
		System.out.println("optimal theta1 is: " + bestTheta1);
	}
}
