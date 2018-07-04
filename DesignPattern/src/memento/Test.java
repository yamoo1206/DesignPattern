package memento;
/**
 * 测试类
 * 从这个类可以看出，是要存储了一个备忘录，我们可以通过管理员的对象来将需要
 * 回调的玩家类回溯到需要回溯的状态
 * 优点：能够随时的回到备忘录备份时候的状态
 * 缺点：从这个类可以看出，每次备份的时候都要存储一遍对象的属性，当对象的属性多的时候，每次存贮都要消耗大量的内存
 * @author yamoo
 *
 */
public class Test {
public static void main(String[] args) {
	Player player = new Player("icey");
	Manager manager = new Manager();
	System.out.println(player);//初始化
	player.lvUp();
	player.pass();
	player.lvUp();
	System.out.println(player);//一段时间后的状态
	manager.setM(player.saving());//存储当前状态
	player.lvUp();
	player.pass();
	System.out.println(player);//又一段时间后的状态
	player.loading(manager.getM());//回溯到之前存储的状态
	System.out.println(player);
}
}
