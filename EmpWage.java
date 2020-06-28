public class EmpWage
{
	public static int isPart = 1, isFull = 2, empRate = 20;
        public static int maxHrs = 100, totalDays=20;

        static int empCheck = (int)Math.floor(Math.random() * 10) % 2;

	public static void main(String args[])
	{
		System.out.println("===========================================");
		System.out.println("====Welcome to Employee Wage Problem=======");
		System.out.println("===========================================");

		int wage = 0, wagePerHrs=20, fullDayHrs=8;
                if(empCheck == 1)
                {
                        System.out.println("Employee's working day and time...");

                        wage = wagePerHrs * fullDayHrs;

                        System.out.println("Daily Employee Wage salary = "+wage);

                        getEmpWage();
                }
                else
                {
                        System.out.println("Employee is absent...");
                }
        }
        //======================================================================================

        public static int getEmpWage()
        {
                int empHrs=0, totalEmpHrs=0,totalWorkingDays=0;

                while(totalEmpHrs <= maxHrs && totalWorkingDays < totalDays)
                {
                        totalWorkingDays++;

                        int empCheck = (int)Math.floor(Math.random() * 10) % 3;

                        switch(empCheck)
                        {
                                case 1:
                                        empHrs = 4;
                                        break;
                                case 2:
                                        empHrs = 8;
                                        break;
                                default:
                                        empHrs = 0;
                                        break;
                        }

                        totalEmpHrs = totalEmpHrs + empHrs;

                        System.out.println("Days : "+totalWorkingDays+"\tEmp hrs : "+empHrs);
                }

                int totalWage = totalEmpHrs * empRate;
                System.out.println("Total Emp Wage : "+totalWage);

                return totalWage;
        }
}


