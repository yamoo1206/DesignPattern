package memento;
/**
 * ������
 * ���������Կ�������Ҫ�洢��һ������¼�����ǿ���ͨ������Ա�Ķ���������Ҫ
 * �ص����������ݵ���Ҫ���ݵ�״̬
 * �ŵ㣺�ܹ���ʱ�Ļص�����¼����ʱ���״̬
 * ȱ�㣺���������Կ�����ÿ�α��ݵ�ʱ��Ҫ�洢һ���������ԣ�����������Զ��ʱ��ÿ�δ�����Ҫ���Ĵ������ڴ�
 * @author yamoo
 *
 */
public class Test {
public static void main(String[] args) {
	Player player = new Player("icey");
	Manager manager = new Manager();
	System.out.println(player);//��ʼ��
	player.lvUp();
	player.pass();
	player.lvUp();
	System.out.println(player);//һ��ʱ����״̬
	manager.setM(player.saving());//�洢��ǰ״̬
	player.lvUp();
	player.pass();
	System.out.println(player);//��һ��ʱ����״̬
	player.loading(manager.getM());//���ݵ�֮ǰ�洢��״̬
	System.out.println(player);
}
}
