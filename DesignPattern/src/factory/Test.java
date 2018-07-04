package factory;
/**
 * 测试工厂模式
 * @author yamoo
 *从结果可以看出，每次使用ServiceImp1.factory都能够返回一个装有Service的Factory对象
 *优点：在面对基类编程的情况下工厂模式可以实现多态，提高了代码的复用性
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
