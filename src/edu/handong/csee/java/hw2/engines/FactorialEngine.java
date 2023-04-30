package edu.handong.csee.java.hw2.engines;

import edu.handong.csee.java.hw2.util.InputChecker;

/** 
 * 
 * Function to find the factorial of the value
 * The input value must not be a negative value.
 * The input value must be one integer value
 * */
public class FactorialEngine implements Computable {
	
	/** 
	 * engine name
	 * */
    private static final String engineName ="FACTORIAL";
    

	/**
     * Number to perform factorial operations
     * */
    private int n;
    
    /**
     * result of the calculation
     * */
    private double result;
    
    
    /**
     * the function set the value to the variables.
     * @param args input values
     */
	public void setInput(String[] args) {
		
		if(args.length-1 != 1)
			InputChecker.printErrorMesssageForTheNumberOfRequiredInputsAndExit(engineName, 1);
		
		n = Integer.parseInt(args[1]);
		
		if(n < 0) 
			InputChecker.printErrorMessageForNegativeInputsAndExit(engineName);
		
		
	}
	
	/**
	 * the function that compute the factorial of input value n
	 * */
	public void compute() {
		int s = 1;
		
		for(int i = 1; i <= n; i++)
		{
			s = s * i;
		}
		
		result = s;
		
	}
	
	/**
	 * @return double return the result of the computation : factorial of input value n
	 * */
	public double getResult() {
		
		return result;
	}
    
	/**
	 * @return int return n
	 * */
	public int getN() {
		return n;
	}
	
	/**
	 * @param n set the n
	 * */
	public void setN(int n) {
		this.n = n;
	}
	
	/**
	 * @param result set the result
	 * */
	public void setResult(double result) {
		this.result = result;
	}
	
	/**
	 * @return String return the name of engine
	 * */
	public static String getEnginename() {
		return engineName;
	}
}
