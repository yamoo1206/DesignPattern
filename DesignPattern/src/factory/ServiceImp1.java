package factory;
/**
 * ʵ�ַ���ӿڵ�һ��������
 * ������ڲ�������һ����������ʹ�������ڲ��෵��һ�����е�ǰ��������һ��������
 * @author yamoo
 *
 */
public class ServiceImp1 implements Service	{
	public static ServiceFactory factory=new ServiceFactory() {
		@Override
		public Service getService() {
			// TODO Auto-generated method stub
			return new ServiceImp1();
		}
	};
	/**
	 * ˽�еĹ��췽��
	 */
	private ServiceImp1(){
		System.out.println("������һ��ʵ��1�Ķ���");
	}
	
	@Override
	public void method1() {
		// TODO Auto-generated method stub
		System.out.println("this is  imp1's method1");
	}
	
	@Override
	public void method2() {
		// TODO Auto-generated method stub
		System.out.println("this is imp1's method2");
	}
	
}
