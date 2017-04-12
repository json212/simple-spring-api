package com.jason.common.service;

import java.util.ArrayList;

import com.jason.common.model.Landing;
import com.jason.common.model.Stairwell;
import com.jason.common.model.Stride;

public class StrideCalculatorImpl implements StrideCalculator {

	public Integer calculateForMultipleStairwells(ArrayList<Stairwell> stairwells, Stride stride) {

		int numberOfLandingInStairwell = stairwells.size();
		Landing landings = new Landing(numberOfLandingInStairwell);
		int stepsForLandings = landings.getNumberOfLandings();

		int stairwellStepsTotal = 0;
		for (Stairwell d : stairwells) {
			stairwellStepsTotal += d.getNumberOfSteps();
		}
		return calculatorRequiredSteps(stepsForLandings + stairwellStepsTotal, stride.getNumberOfSteps());

	}

	public Integer calculateForSingleStairwell(int singleStairwellSteps, Stride stride) {
		return calculatorRequiredSteps(singleStairwellSteps, stride.getNumberOfSteps());
	}

	/**
	 * 
	 * @param steps
	 * @param stride
	 * @return minimum number of strides remaining
	 */
	private Integer calculatorRequiredSteps(int steps, int stride) {
		double numberResult = steps / stride;

		if ((numberResult - (int) numberResult) != 0) {
			int numberResultRoundUp = (int) numberResult + stride;
			return numberResultRoundUp;
		} else {
			return (int) numberResult;

		}
	}
}
