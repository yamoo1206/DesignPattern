package memento;
/**
 * ����Ա�࣬ʵ���˹���Ա�ܹ��洢����¼��һ������ӿ�
 * �Ӷ��洢����¼
 * ������Ҫ���Խ����Ա�ɱ���¼�ļ��ϣ�ʵ�ִ����������¼������
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
