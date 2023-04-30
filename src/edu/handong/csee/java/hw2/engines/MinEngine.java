package edu.handong.csee.java.hw2.engines;

import edu.handong.csee.java.hw2.util.InputChecker;


/**  
* Function to find the Minimum of input values
* The input value must be more than two value
* */
public class MinEngine implements Computable {
	
	/** 
	 * engine name
	 * */
    private static final String engineName ="MIN";
    
    /**
     * array of value of inputs
     * */
    private double[] inputs;
    
    /**
     * result of the calculation
     * */
    private double result;
    
    /**
     * the function find the min of input values
     * @param args input values
     */
	public void setInput(String[] args) {
		
		if(args.length-1 < 2)
			InputChecker.printErrorMessageForTheNumberOfMinimumRequiredInputsAndExit(engineName, 2);
		
		inputs = new double[args.length-1];
		
		int idx = 0,i = 0;
		
		for(String s : args)
		{
			if(idx == 0) 
			{
				idx++;
				continue;
			}
			inputs[i] =  Double.parseDouble(s);
			i++;
		}
		
		
	}
	
	/**
	 * the function that find the minimum of the input values
	 * */
	public void compute() {
		result = inputs[0];
		
		for(Double i : inputs)
		{
			if(result > i)
				result = i;
		}
		
	}
	
	/**
	 * @return double return the result of the computation : find the minimum of the input values
	 * */
	public double getResult() {
		return result;
	}
    
	/**
	 * @return double[] return inputs
	 * */
	public double[] getInputs() {
		return inputs;
	}
	
	/**
	 * @return String return the name of engine
	 * */
	public static String getEnginename() {
		return engineName;
	}
	
	/**
	 * @param inputs set inputs
	 * */
	public void setInputs(double[] inputs) {
		this.inputs = inputs;
	}
	
	/**
	 * @param result set the result
	 * */
	public void setResult(double result) {
		this.result = result;
	}
}
