package edu.handong.csee.java.hw2.engines;

/** 
 * Abstraction task interface for computational classes
 * */
public interface Computable {
	/**
	 * Functions that pass variables to internal private variables
	 * @param args the values
	 */
	public void setInput(String[] args);
	/**
	 * Real Calculation Execute Function
	 * */
	public void compute();
	/**
	 * Function to return calculation results
	 * @return double return the reults 
	 */
	public double getResult();
}
