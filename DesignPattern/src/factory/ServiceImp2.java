package factory;
/**
 * ʵ�ַ���ӿڵ�һ��������
 * ������ڲ�������һ����������ʹ�������ڲ��෵��һ�����е�ǰ��������һ��������
 * @author yamoo
 *
 */
public class ServiceImp2 implements Service{
	public static ServiceFactory factory=new ServiceFactory() {
		
		@Override
		public Service getService() {
			// TODO Auto-generated method stub
			return new ServiceImp2();
		}
	};
	/**
	 * ˽�еĹ��췽��
	 */
	private ServiceImp2(){
		System.out.println("������һ��ʵ��2�Ķ���");
	}
	@Override
	public void method1() {
		// TODO Auto-generated method stub
		System.out.println("this is  imp2's method1");
	}
	@Override
	public void method2() {
		// TODO Auto-generated method stub
		System.out.println("this is imp2's method2");
	}
}
