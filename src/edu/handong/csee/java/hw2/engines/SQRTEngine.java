package edu.handong.csee.java.hw2.engines;

import edu.handong.csee.java.hw2.util.InputChecker;


/** 
 * 
 * Function to find the volume of a volume of a sphere
 * The input value must not be a negative value.
 * The input value must be one integer value
 * */
public class SQRTEngine implements Computable {
	
	/** 
	 * engine name
	 * */
    private static final String engineName ="SQRT";
   
	/**
     * value of input
     * */
    private double input;
    
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
		
		input = Double.parseDouble(args[1]);
		
		if(input < 0) 
			InputChecker.printErrorMessageForNegativeInputsAndExit(engineName);
	}
	
	/**
	 * the function that compute the SQRT of input values
	 * */
	public void compute() {
		
		double s=0;
	    double t=0;
	 
	    s = input / 2;
	    for (;s != t;)
	    {
	        t = s;
	        s = ( (input / t) + t) / 2;
	    }
	    
	    result = s;
		
	}
	
	/**
	 * @return double return the result of the computation : SQRT of input values
	 * */
	public double getResult() {
		
		return result;
	}
	
	/**
	 * @return String return the name of engine
	 * */
    public static String getEnginename() {
		return engineName;
	}

    /**
	 * @param input set the inputs
	 * */
	public void setInput(double input) {
		this.input = input;
	}

	/**
	 * @return double[] return inputs
	 * */
	public double getInput() {
		return input;
	}
	
	/**
	 * @param result set the result
	 * */
	public void setResult(double result) {
		this.result = result;
	}


}
