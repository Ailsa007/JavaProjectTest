package project;

public class ClassTest {
	
    //salary是静态的私有变量
    static double salary;
    // DEPARTMENT是一个常量
    public static final String DEPARTMENT = "开发人员";
	
	public static void main(String []args) {
        System.out.println("Hello World"); // 打印 Hello World
        salary = 10000;
        System.out.println(DEPARTMENT+"平均工资:"+salary);
        test();
            
        
    }
	
	public static void test()
	{
		System.out.println(DEPARTMENT+"pingjungongzi11:"+salary);
	}

}
