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
                int empHrs=0,totalDays = 20,totalEmpHrs = 0,maxHrs = 100;
		int day=0;

                while(day<=totalDays && empHrs <= maxHrs)
                {
                        day++;
                        switch(empCheck)
                        {
                                case 0:
                                        empHrs = 4;
                                        break;
                                case 1:
                                        empHrs = 8;
                                        break;
                                default:
                                        empHrs = 0;
                                        break;
                        }

                        salary = empHrs * empRate;
                        totalSalary = totalSalary + salary + wage;
                	totalEmpHrs = totalEmpHrs + empHrs;
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
