package memento;

/**
 * 游戏角色 类  使用这个类来使用备忘录模式
 * @author yamoo
 *
 */
public class Player {
	private String name; //姓名
	private int  lv;  //等级
	private int hp;  //血量
	private int atk;  //攻击力
	private int site;  //关卡
	/**
	 * 通过一个玩家名字来构造一个新的游戏
	 * @param name  玩家姓名
	 */
	public Player(String name){
		this.name=name;
		lv=1;
		hp=100;
		atk=5;
		site=1;
	}
	/**
	 * 把对象的当前状态存贮在备忘录当中
	 * @return
	 */
	public Memento saving(){
		return new Memento(lv,site);
	}
	/**
	 * 用备忘录中的对象状态替换当前的对象的状态，实现回档功能
	 * @param m1  备忘录对象
	 */
	public void loading(MementoImp m1){
		Memento m=(Memento)m1;
		lv=m.getLv1();
		site=m.getSite1();
	}
	/**
	 * 角色升级的方法
	 */
	public void  lvUp(){
		lv++;
		atk+=5;
		hp=100;
	}
	/**
	 * 角色过关
	 */
	public void pass(){
		site++;
	}

	@Override
	public String toString() {
		return "Player [name=" + name + ", lv=" + lv + ", hp=" + hp + ", atk=" + atk + ", site=" + site + "]";
	}
	/**
	 * 将备忘录设计成玩家的内部类，保证只有玩家对象有访问这个类的权限
	 * 备忘录类调用一个空的接口，保证了管理员能够得到这个对象，但又不能有修改权限
	 * @author yamoo
	 *
	 */
	private class Memento implements MementoImp {
		private int lv1;
		private int site1;
		/**
		 * 通过玩家信息构造一个备忘录
		 * @param lv  角色等级
		 * @param site  角色关卡坐标
		 */
		public Memento(int lv,int site){
			lv1=lv;
			site1=site;
		}
		public int getLv1() {
			return lv1;
		}
		public void setLv1(int lv1) {
			this.lv1 = lv1;
		}
		public int getSite1() {
			return site1;
		}
		public void setSite1(int site1) {
			this.site1 = site1;
		}
	}

	}
