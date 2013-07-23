package from.jimmy.common;

/**
 * 游戏区域的定义，可能是战场，手牌，游戏外等区域
 * @author jimmy
 *
 */
public interface Zone {
	//统计
	Integer countInField(Type type);
	
	//进入此区域时产生的效应
	Effact enter();
	Effact leave();
}
