package from.jimmy.spring.controller;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import from.jimmy.common.Zone;
import from.jimmy.maindesk.GameFlow;
import from.jimmy.maindesk.Player;

@Controller
public class MtgController {

	Map<String, Player> players = new ConcurrentHashMap<String, Player>();

	@RequestMapping("/initMtg")
	public ModelAndView initMtg(@RequestParam("game_name") String gameName) {
		String message = "loading....";

		// load the rule of game
		try {
			GameFlow game = (GameFlow) Class.forName("from.jimmy.mtg.t2.MagicT2").getConstructors()[0]
					.newInstance(new Object[] {});
			if (!game.loadGame()) {
				throw new Exception();
			}

			// draw all filed
			Zone[] zones = game.getAllInitedZone();
			// init player: load their desk and avatar, then draw to field

			// game begin

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return new ModelAndView("showBoard", "message", message);
	}

	@RequestMapping("/addPlayer")
	public ModelAndView addPlayer() {
		String message = "loading....";
		return new ModelAndView("showBoard", "message", message);
	}

}
