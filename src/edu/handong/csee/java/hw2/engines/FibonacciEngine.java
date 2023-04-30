package edu.handong.csee.java.hw2.engines;

import edu.handong.csee.java.hw2.util.InputChecker;

/** 
 * 
 * Function to find the fibonacci of the value
 * The input value must not be a negative value.
 * The input value must be one integer value
 * */
public class FibonacciEngine implements Computable {
	
	/** 
	 * engine name
	 * */
    private static final String engineName ="FIBONACCI";
    
	/**
     * Number to perform fibonacci operations
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
		
		int num1,num2,sum;
        num1=0; 
        num2=1; 
        sum=1; 
        
        for(int i = 0; i < n-1; i++)
        {
            
            sum=num1+num2; 
            num1=num2;
            num2=sum; 
        }
        
        result = sum;
		
	}
	
	
	/**
	 * @return double return the result of the computation : factorial of input value n
	 * */
	public double getResult() {
		// TODO Auto-generated method stub
		return result;
	}
	
	/**
	 * @return String get the engine of name
	 * */
	public static String getEnginename() {
		return engineName;
	}
	
	/**
	 * @return int return the n
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
    
}
