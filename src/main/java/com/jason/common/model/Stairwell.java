package com.jason.common.model;

public class Stairwell {

	private int numberOfStepsInStairwell;

	public Stairwell(int numberOfSteps) {
		if (numberOfSteps >= 1 && numberOfSteps <= 20) {
			this.setNumberOfSteps(numberOfSteps);
		}else{
		throw new IllegalArgumentException("Invalid number of steps in Stairwell");
		}
	}

	public int getNumberOfSteps() {
		return numberOfStepsInStairwell;
	}

	public void setNumberOfSteps(int numberOfSteps) {
		this.numberOfStepsInStairwell = numberOfSteps;
	}

	@Override
	public String toString() {
		return "Stairwell [Number Of Steps = " + numberOfStepsInStairwell + "]";
	}
}
