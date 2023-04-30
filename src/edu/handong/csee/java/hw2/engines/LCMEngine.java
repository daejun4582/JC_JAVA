package edu.handong.csee.java.hw2.engines;

import edu.handong.csee.java.hw2.util.InputChecker;



/** 
* 
* Function to find the LCM of input two value
* The input value must not be a negative value.
* The input value must be two integer value
* */
public class LCMEngine implements Computable{
	
	/** 
	 * engine name
	 * */
    private static final String engineName ="LCM";
    

	/**
     * value of input
     * */
    private double arr[];

    
    /**
     * result of the calculation
     * */
    private double result;

    
    /**
     * the function set the value to the variables.
     * @param args input values
     */
	public void setInput(String[] args) {
		
		arr = new double[args.length -1];
		
		int idx = 0,i = 0;
		
		for(String s : args)
		{
			if(idx == 0) 
			{
				idx++;
				continue;
			}
			arr[i] =  Double.parseDouble(s);
			i++;
		}
		
		for(Double s : arr)
		{
			if(s < 0)
				InputChecker.printErrorMessageForNegativeInputsAndExit(engineName);
		}
		
		if(args.length-1 < 2)
			InputChecker.printErrorMessageForTheNumberOfMinimumRequiredInputsAndExit(engineName, 2);
		
	}
	
	/**
	 * the function that compute the LCM of input values
	 * */
	public void compute() {
		
		int max, min, tmp;
		
		result = arr[0];
		
			for(int i=1;i<arr.length;i++) {
				max = (int) Math.max(result, arr[i]);
				min = (int) Math.min(result, arr[i]);
				tmp = max;
				while(tmp % min != 0) {
					tmp += max;
				}
				result = tmp;
			}
		
	}
		 
	
	/**
	 * @return double return the result of the computation : LCM of input values
	 * */
	public double getResult() {
		// TODO Auto-generated method stub
		return result;
	}
	
	/**
	 * @return String return the name of engine
	 * */
	public static String getEnginename() {
		return engineName;
	}
	
	
	/**
	 * @return double[] return arr
	 * */
	public double[] getArr() {
		return this.arr;
	}
	
	/**
	 * @param arr[] set the arr
	 * */
	public void setArr(double arr[]) {
		this.arr = arr;
	}
	
	/**
	 * @param result set the result
	 * */
	public void setResult(double result) {
		this.result = result;
	}
    
}
