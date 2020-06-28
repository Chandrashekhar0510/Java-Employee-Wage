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

                        System.out.println("Daily Employee Wage salary = "+salary);
                }

        //======================================================================================

                int isPart = 0, isFull = 1, totalSalary = 0, empRate = 10;
                int empHrs=0;

                if(empCheck == isFull)
                {
                        empHrs = 16;
                        System.out.println("Working full time....");
                }
                else if(empCheck == isPart)
                {
                        empHrs = 8;
                        System.out.println("Working part time....");
                }
                else
                {
                        System.out.println("Employee is absent....");
                }
                totalSalary = empHrs * empRate;
                System.out.println("Total Salary = "+totalSalary);
	}
}
