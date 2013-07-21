package com.mycompany.upc_app;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.mycompany.upc_app.common.UpcCard;

/**
 * Handles requests for the application home page.
 */
@Controller
public class CoreController {
	
	private static final Logger logger = LoggerFactory.getLogger(CoreController.class);
	
	@RequestMapping(value = "/action/{action}/{id}", method = RequestMethod.POST)
	public @ResponseBody List<UpcCard> getCardsInJSON(@PathVariable String action, @PathVariable String id) {
		List<UpcCard> cards = new ArrayList<UpcCard>();
		logger.debug("Action: "+action+" ID: "+id);
		UpcCard card = new UpcCard();
		card.setCode("13422124");
		card.setCompany("Walgreens");
		cards.add(card);
		return cards;
	}
}
