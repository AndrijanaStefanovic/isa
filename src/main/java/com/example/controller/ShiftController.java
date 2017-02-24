package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Shift;
import com.example.service.ShiftService;

@RestController
public class ShiftController {
	
	@Autowired
	private ShiftService shiftService;
	
	@RequestMapping(
			value = "/shift/create",
			method = RequestMethod.POST,
			consumes = MediaType.APPLICATION_JSON_VALUE,
			produces = MediaType.TEXT_PLAIN_VALUE
			)
	public String createShift(@RequestBody Shift newShift) {
		return shiftService.createShift(newShift);
	}
	
}
