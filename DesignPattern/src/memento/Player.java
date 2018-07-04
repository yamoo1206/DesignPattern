package memento;

/**
 * ��Ϸ��ɫ ��  ʹ���������ʹ�ñ���¼ģʽ
 * @author yamoo
 *
 */
public class Player {
	private String name; //����
	private int  lv;  //�ȼ�
	private int hp;  //Ѫ��
	private int atk;  //������
	private int site;  //�ؿ�
	/**
	 * ͨ��һ���������������һ���µ���Ϸ
	 * @param name  �������
	 */
	public Player(String name){
		this.name=name;
		lv=1;
		hp=100;
		atk=5;
		site=1;
	}
	/**
	 * �Ѷ���ĵ�ǰ״̬�����ڱ���¼����
	 * @return
	 */
	public Memento saving(){
		return new Memento(lv,site);
	}
	/**
	 * �ñ���¼�еĶ���״̬�滻��ǰ�Ķ����״̬��ʵ�ֻص�����
	 * @param m1  ����¼����
	 */
	public void loading(MementoImp m1){
		Memento m=(Memento)m1;
		lv=m.getLv1();
		site=m.getSite1();
	}
	/**
	 * ��ɫ�����ķ���
	 */
	public void  lvUp(){
		lv++;
		atk+=5;
		hp=100;
	}
	/**
	 * ��ɫ����
	 */
	public void pass(){
		site++;
	}

	@Override
	public String toString() {
		return "Player [name=" + name + ", lv=" + lv + ", hp=" + hp + ", atk=" + atk + ", site=" + site + "]";
	}
	/**
	 * ������¼��Ƴ���ҵ��ڲ��࣬��ֻ֤����Ҷ����з���������Ȩ��
	 * ����¼�����һ���յĽӿڣ���֤�˹���Ա�ܹ��õ�������󣬵��ֲ������޸�Ȩ��
	 * @author yamoo
	 *
	 */
	private class Memento implements MementoImp {
		private int lv1;
		private int site1;
		/**
		 * ͨ�������Ϣ����һ������¼
		 * @param lv  ��ɫ�ȼ�
		 * @param site  ��ɫ�ؿ�����
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
