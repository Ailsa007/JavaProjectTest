package project;

public class ClassTest {
	
    //salary�Ǿ�̬��˽�б���
    static double salary;
    // DEPARTMENT��һ������
    public static final String DEPARTMENT = "������Ա";
	
	public static void main(String []args) {
        System.out.println("Hello World"); // ��ӡ Hello World
        salary = 10000;
        System.out.println(DEPARTMENT+"ƽ������:"+salary);
        test();
            
        
    }
	
	public static void test()
	{
		System.out.println(DEPARTMENT+"pingjungongzi11:"+salary);
	}

}
