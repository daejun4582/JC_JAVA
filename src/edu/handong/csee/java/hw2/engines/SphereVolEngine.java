package edu.handong.csee.java.hw2.engines;

import edu.handong.csee.java.hw2.util.InputChecker;

/** 
 * 
 * Function to find the volume of a volume of a sphere
 * The input value must not be a negative value.
 * The input value must be one integer value
 * */
public class SphereVolEngine implements Computable {
	
	/** 
	 * engine name
	 * */
    private static final String engineName ="SPHEREVOL";
    
    /**
     * radius of sphere
     * */
    private double radius;
    
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
    	
		radius = Double.parseDouble(args[1]);
		
		if(radius < 0) 
			InputChecker.printErrorMessageForNegativeInputsAndExit(engineName);
	}

	/**
	 * the function that compute the volume of sphere
	 * */
	public void compute() {
		result = (4.0/3.0) * (Math.PI) * Math.pow(radius, 3) ; 
	}
	
	
	/**
	 * @return double return the result of the computation : volume of sphere
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
	 * @return double return radius
	 * */
	public double getRadius() {
		return radius;
	}
	
	/**
	 * @param radius set radius
	 * */
	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	/**
	 * @param result set result
	 * */
	public void setResult(double result) {
		this.result = result;
	}
}
