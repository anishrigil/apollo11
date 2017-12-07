package com.apollo11.controller;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api/v1")
public class PingController {
	
	@RequestMapping(method = RequestMethod.GET, value = "/ping")
	ResponseEntity<?> handlePingGetRequest(){
		System.out.println("GetPingRequest initiated...");
		return new ResponseEntity<>("Apollo11 is launched",HttpStatus.OK);
	}
	
	@RequestMapping(method = RequestMethod.GET, value = "/revision")
	ResponseEntity<?> handleRevisionGetRequest(){
		System.out.println("GetRevisionRequest initiated...");
		return new ResponseEntity<>("Apollo11 launched revised0",HttpStatus.OK);
	}
}
