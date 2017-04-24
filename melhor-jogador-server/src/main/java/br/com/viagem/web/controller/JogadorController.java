package br.com.viagem.web.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JogadorController {

	private static final Logger logger = LoggerFactory.getLogger(JogadorController.class);
	
	
	@RequestMapping(value = "/api/check", method = RequestMethod.GET)
	public String checkApi() {

		logger.info("Teste da api - servidor esta ok");
		
		return "servidor esta ok";
	}
}
