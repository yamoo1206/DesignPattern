package memento;
/**
 * 管理员类，实现了管理员能够存储备忘录的一个父类接口
 * 从而存储备忘录
 * 如有需要可以将属性变成备忘录的集合，实现存贮多个备忘录的作用
 * @author yamoo
 *
 */
public class Manager {
	public MementoImp m;

	public MementoImp getM() {
		return m;
	}

	public void setM(MementoImp m) {
		this.m = m;
	}
}
