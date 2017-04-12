package com.jason.common.model;

public class Stride {

	private int numberofStepsInStride;

	public Stride(int numberofSteps) {
		if (numberofSteps >= 1 && numberofSteps <= 4) {
			this.setNumberOfSteps(numberofSteps);
		} else {
			throw new IllegalArgumentException("Invalid number of strides for one person");
		}
	}

	public int getNumberOfSteps() {
		return numberofStepsInStride;
	}

	public void setNumberOfSteps(int numberofSteps) {
		this.numberofStepsInStride = numberofSteps;
	}

	@Override
	public String toString() {
		return "Stride [Number Of Steps per Stride = " + numberofStepsInStride + "]";
	}
}
