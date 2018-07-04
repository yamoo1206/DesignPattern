package factory;
/**
 * ���Թ���ģʽ
 * @author yamoo
 *�ӽ�����Կ�����ÿ��ʹ��ServiceImp1.factory���ܹ�����һ��װ��Service��Factory����
 *�ŵ㣺����Ի����̵�����¹���ģʽ����ʵ�ֶ�̬������˴���ĸ�����
 */
public class Test {
	public static void main(String[] args) {
		Service service1=getService(ServiceImp1.factory);
		Service service2=getService(ServiceImp2.factory);
		service1.method1();
		service2.method1();
		Service service3=getService(ServiceImp1.factory);
		System.out.println(service1==service3);
	}
	public static Service getService(ServiceFactory factory){
		return factory.getService();
	}
}
