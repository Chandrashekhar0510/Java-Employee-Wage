public class EmpWage
{
	public static void main(String args[])
	{
		System.out.println("===========================================");
		System.out.println("====Welcome to Employee Wage Problem=======");
		System.out.println("===========================================");

		int present = 1;
		int salary = 0,wagePerHrs = 20,fullDayHrs = 8;

                double empCheck = Math.floor(Math.random() * 10) % 2;

                if(empCheck == present)
                {
                        System.out.println("Employee is present");
			salary = wagePerHrs * fullDayHrs;
                }
                else
                {
                        System.out.println("Employee is not present");
                }
		System.out.println("Daily Employee Wage salary = "+salary);
	}
}
