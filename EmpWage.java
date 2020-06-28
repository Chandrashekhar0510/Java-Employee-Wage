public class EmpWage
{
	public static void main(String args[])
	{
		System.out.println("===========================================");
		System.out.println("====Welcome to Employee Wage Problem=======");
		System.out.println("===========================================");

		int present = 1,wage = 0;
                int salary = 0,wagePerHrs = 20,fullDayHrs = 8;

                int empCheck = (int)Math.floor(Math.random() * 10) % 2;

                if(empCheck == present)
                {
                        System.out.println("Employee is present");

                        wage = wagePerHrs * fullDayHrs;

                        System.out.println("Daily Employee Wage salary = "+wage);
                }

        //======================================================================================

                int isPart = 0, isFull = 1, totalSalary = 0, empRate = 20;
                int empHrs=0,totalDays = 20;

                for(int day=1; day<=totalDays;day++)
                {
                        switch(empCheck)
                        {
                                case 1:
                                        empHrs = 16;
                                        break;
                                case 0:
                                        empHrs = 8;
                                        break;
                                default:
                                        empHrs = 0;
                                        break;
                        }

                        salary = empHrs * empRate;
                        totalSalary = totalSalary + salary + wage;
                }

                if(empCheck == 0)
                {
                        System.out.println("Working part time...");
                        System.out.println("Total Salary = "+totalSalary);
                }
                else
                {
                        System.out.println("Working full time...");
                        System.out.println("Total Salary = "+totalSalary);

                }
	}
}
