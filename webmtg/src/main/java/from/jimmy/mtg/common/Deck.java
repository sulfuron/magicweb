package from.jimmy.mtg.common;

/**
 * 玩家的套牌
 * @author jimmy
 *
 */
public interface Deck {
	/**
	 * 此套牌是否合法
	 * @return boolean 合法为true，否则为false
	 */
	boolean isValidate();
}
