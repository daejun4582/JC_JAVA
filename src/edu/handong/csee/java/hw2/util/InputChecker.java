package edu.handong.csee.java.hw2.util;

/**
 * For the input checker
 * */
public class InputChecker {
	/**
	 * if the number of the input is not equal to the number of required.
	 * @param engineName name of engine
	 * @param numOfRequiredInputs  num of required Inputs
	 * */
    public static void printErrorMesssageForTheNumberOfRequiredInputsAndExit(String engineName, int numOfRequiredInputs) {
        System.out.println("You need " + numOfRequiredInputs + " input values for " + engineName.toUpperCase() + ".");
        System.exit(0);
    }
    
    /**
	 * if the number of the input is smaller than the number of required.
	 * @param engineName name of engine
	 * @param numOfRequiredInputs  num of required Inputs
	 * */
    public static void printErrorMessageForTheNumberOfMinimumRequiredInputsAndExit(String engineName, int numOfRequiredInputs) {
    	
    	System.out.println("You need at least " + numOfRequiredInputs +" input values for " + engineName.toUpperCase() + ".");
        System.exit(0);
    }
    
    /**
	 * if the input is smaller than 0 when it should not be lower than 0.
	 * @param engineName name of engine
	 * */
    public static void printErrorMessageForNegativeInputsAndExit(String engineName) {
    	System.out.println("The input value cannot be negative for "+ engineName.toUpperCase() + ".");
        System.exit(0);
    }
    
    
    
    
}
