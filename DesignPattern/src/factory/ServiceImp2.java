package factory;
/**
 * 实现服务接口的一个服务类
 * 在类的内部定义了一个工厂对象，使用匿名内部类返回一个存有当前对象服务的一个工厂；
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
	 * 私有的构造方法
	 */
	private ServiceImp2(){
		System.out.println("创建了一个实例2的对象");
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
