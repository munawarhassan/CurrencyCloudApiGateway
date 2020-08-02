package com.ibm.currency.cloudapigateway.currencycloudapigateway;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/currencycloudapigateway")
public class CurrencyCloudApiGatewayController {
	
	@RequestMapping(path = "/default", method = RequestMethod.GET)
	public String getDefaultMessage() {
		
		
		
		return "Welcome To CurrencyCloudApiGateway";
	}

}
