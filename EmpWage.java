public class EmpWage
{
	public static void main(String args[])
	{
		System.out.println("===========================================");
		System.out.println("====Welcome to Employee Wage Problem=======");
		System.out.println("===========================================");

		int present = 1;

                double empCheck = Math.floor(Math.random() * 10) % 2;

                if(empCheck == present)
                {
                        System.out.println("Employee is present");
                }
                else
                {
                        System.out.println("Employee is not present");
                }
	}
}
