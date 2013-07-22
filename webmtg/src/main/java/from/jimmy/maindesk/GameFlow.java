package from.jimmy.maindesk;

import from.jimmy.common.Zone;

public interface GameFlow {
	boolean loadGame();

	void doGame(Player mainPlay);

	InGameStatic getStatic(Integer gameId);

	Zone[] getAllInitedZone();
}
