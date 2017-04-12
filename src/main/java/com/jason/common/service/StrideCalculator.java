package com.jason.common.service;

import java.util.ArrayList;

import com.jason.common.model.Stairwell;
import com.jason.common.model.Stride;

public interface StrideCalculator {

	public Integer calculateForMultipleStairwells(ArrayList<Stairwell> stairwells, Stride stride);

	public Integer calculateForSingleStairwell(int singleValue, Stride stride);
}
