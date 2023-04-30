package edu.handong.csee.java.hw2.engines;

import edu.handong.csee.java.hw2.util.InputChecker;
/** 
 * 
 * Function to find the volume of a cube
 * The input value must not be a negative value.
 * The input value must be one integer value
 * */
public class CubeVolEngine implements Computable {
	
	/** 
	 * engine name
	 * */
    private static final String engineName ="CUBEVOL";
    

	/**
     * side length of the room
     * */
    private double sideLength;
    
    /**
     * result of the calculation
     * */
	private double volume;

    /**
     * the function set the value to the variables.
     * @param args input values
     */
	public void setInput(String[] args) {
		
		if(args.length-1 != 1)
			InputChecker.printErrorMesssageForTheNumberOfRequiredInputsAndExit(engineName, 1);
		
		sideLength = Double.parseDouble(args[1]);
		
		if(sideLength < 0) 
			InputChecker.printErrorMessageForNegativeInputsAndExit(engineName);
		
	}
	/**
	 * the function that compute the volume of cube
	 * */
	public void compute() {
		volume = sideLength * sideLength * sideLength;
		
	}
	
	/**
	 * @return double return the result of the computation : volume of cube
	 * */
	public double getResult() {
		
		return volume;
	}
    
	/**
	 * @return double return the result of sideLength;
	 * */
	public double getSideLength() {
		return this.sideLength;
	}
	
	/**
	 * @param sideLength get value that will save in field
	 * */
	public void setSideLength(double sideLength) {
		this.sideLength = sideLength;
	}
	
	/**
	 * @return double return the volume;
	 * */
	public double getVolume() {
		return volume;
	}
	
	
	/**
	 * @return get the name of engine
	 * */
	public static String getEnginename() {
		return engineName;
	}
	
	/**
	 * @param volume get value that will save in field
	 * */
	public void setVolume(double volume) {
		this.volume = volume;
	}
    
}
