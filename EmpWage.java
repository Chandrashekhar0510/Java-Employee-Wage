import java.util.*;

public class EmpWage implements IComputeWage
{
        public static final int isPart = 1, isFull = 2;
        int numOfCompany = 0;

        LinkedList<CompanyWage> companyWageList;
	Map<String,CompanyWage> companyWageMap;
        public EmpWage()
        {
                companyWageList = new LinkedList<>();
		companyWageMap = new HashMap<>();
        }

        public static void main(String[] args)
        {
                System.out.println("\n=================================================");
                System.out.println("===Welcome to Employee Wage Computation Program====");
                System.out.println("===================================================");

                IComputeWage empWage = new EmpWage();
		EmpWage emp = new EmpWage();

		int capGEmpRate = 30, capGFullDayHr = 9;
		int bridgeEmpRate = 20, bridgeGFullDayHr = 8;

		empWage.addCompanyWage("CapG", capGEmpRate, 25, 100);
                empWage.addCompanyWage("BridgeLabz", bridgeEmpRate, 20, 120);
                empWage.computeEmpWage();

		emp.dailyWage("CapG", capGEmpRate, capGFullDayHr);
		emp.dailyWage("BridgeLabz", bridgeEmpRate, bridgeGFullDayHr);

		System.out.println("\nTotal Wage for CapGemini => "+empWage.getTotalWage("CapG"));
        	System.out.println("Total Wage for BridgeLabz => "+empWage.getTotalWage("BridgeLabz"));
	}

	public void dailyWage(String company, int empRatePerHr, int fullDayHr)
	{
		System.out.println("\nFull Day Daily Wage of "+company+" is = "+(empRatePerHr*fullDayHr));
		System.out.println("Part Time Daily Wage of "+company+" is = "+((empRatePerHr*fullDayHr)/2));
	}

        public void addCompanyWage(String company, int empRatePerHr, int workingDays, int maxHrsPerMonth)
        {
                CompanyWage companyWage = new CompanyWage(company, empRatePerHr, workingDays, maxHrsPerMonth);

		companyWageList.add(companyWage);
		companyWageMap.put(company, companyWage);
        }

        public void computeEmpWage()
        {
                for (int i=0; i<companyWageList.size(); i++)
                {
                        CompanyWage companyWage = companyWageList.get(i);
			companyWage.setTotalEmpWage(this.computeEmpWage(companyWage));

                        System.out.println(companyWage);
                }
        }

	public int getTotalWage(String company)
	{
		return companyWageMap.get(company).totalEmpWage;
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
