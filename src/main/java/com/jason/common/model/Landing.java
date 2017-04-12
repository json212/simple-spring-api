package com.jason.common.model;

public class Landing {

	private static int stepsForLanding = 2;
	
	private int numberOfStepsForLandings;
	
	public Landing(int numberOfLandings){
		this.setNumberOfLandings(stepsForLanding * numberOfLandings);
	}

	public int getNumberOfLandings() {
		return numberOfStepsForLandings;
	}

	private void setNumberOfLandings(int numberOfLandings) {
		this.numberOfStepsForLandings = numberOfLandings;
	}
	
	@Override
	public String toString() {
		return "Landing [Number Of Steps per Stride = " + stepsForLanding + "Number Of Landings" + numberOfStepsForLandings + "]";
	}
	
}
