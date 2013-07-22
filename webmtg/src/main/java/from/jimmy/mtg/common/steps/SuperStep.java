package from.jimmy.mtg.common.steps;

import from.jimmy.maindesk.GameFlow;
import from.jimmy.maindesk.Player;

public abstract class SuperStep implements Step {
	protected GameFlow game;

	protected void beforeStep(Player activePlayer) {
		// do nothing
	}

	protected void afterStep(Player activePlayer) {
		// do nothing
	}

	public void doStep(Player activePlayer) {
		beforeStep(activePlayer);

		afterStep(activePlayer);
	}
}
