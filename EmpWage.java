public class EmpWage implements IComputeWage
{
        public static final int isPart = 1, isFull = 2;
        int numOfCompany = 0;

        CompanyWage[] wageArray;

        public EmpWage()
        {
                wageArray = new CompanyWage[10];
        }

        public static void main(String[] args)
        {
                System.out.println("\n=================================================");
                System.out.println("===Welcome to Employee Wage Computation Program====");
                System.out.println("===================================================");

                IComputeWage empWage = new EmpWage();

                empWage.addCompanyWage("CapG", 30, 25, 100);
                empWage.addCompanyWage("BridgeLabz", 20, 20, 120);
                empWage.computeEmpWage();
        }


        public void addCompanyWage(String company, int empRatePerHr, int workingDays, int maxHrsPerMonth)
        {
                wageArray[numOfCompany] = new CompanyWage(company, empRatePerHr, workingDays, maxHrsPerMonth);

                numOfCompany++;
        }

        public void computeEmpWage()
        {
                for (int i=0; i<numOfCompany; i++)
                {
                        wageArray[i].setTotalEmpWage(this.computeEmpWage(wageArray[i]));

                        System.out.println(wageArray[i]);
                }
        }

        int computeEmpWage(CompanyWage compWage)
        {
                int empHrs = 0, totalEmpHrs = 0, totalWorkingDays = 0;

                while(totalEmpHrs <= compWage.maxHrsPerMonth && totalWorkingDays < compWage.workingDays)
                {
                        totalWorkingDays++;

                        int empCheck = (int)Math.floor(Math.random() * 10) % 3;

                        switch(empCheck)
                        {
                                case isPart:
                                        empHrs = 4;
                                        break;
                                case isFull:
                                        empHrs = 8;
                                        break;
                                default:
                                        empHrs = 0;
                                        break;
                        }
                        totalEmpHrs += empHrs;

                        if(empHrs > 0)
                        {
                                System.out.println("Days : "+totalWorkingDays+"==================>Employee is present and working for : "+empHrs+"hrs");
                        }
                        else
                        {
                                System.out.println("Days : "+totalWorkingDays+"==================>Employee is absent");
                        }
                }
                return totalEmpHrs * compWage.empRatePerHr;
        }
}
