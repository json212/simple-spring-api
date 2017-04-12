package com.jason.common.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.jason.common.model.Stairwell;
import com.jason.common.model.Stride;
import com.jason.common.service.StrideCalculator;

@RestController
@RequestMapping("/stepsCalculator/{stairwells},StepsPerStride:{stepsPerStride}")
public class StairwellController {

	@Autowired
	StrideCalculator strideCalculator;

	ArrayList<Stairwell> stairwells;

	@RequestMapping(method = RequestMethod.GET)
	public Integer findStridesRemaining(@PathVariable List<Integer> strideParameters,@PathVariable int stepsPerStride) {

		Stride stride = new Stride(stepsPerStride);

		if (!strideParameters.isEmpty()) {
			if (strideParameters.size() > 1 && !strideParameters.isEmpty()) {
				for (Integer param : strideParameters) {
					Stairwell stairwell = new Stairwell(param);
					stairwells.add(stairwell);
				}
				return strideCalculator.calculateForMultipleStairwells(stairwells, stride);
			} else {
				int singleValue = strideParameters.get(0);
				return strideCalculator.calculateForSingleStairwell(singleValue, stride);
			}

		}
		return null;
	}
}
