public interface IComputeWage
{
	public void addCompanyWage(String company, int empRatePerHr, int workingDays, int maxHrsPerMonth);
	public void computeEmpWage();
	public int getTotalWage(String company);
}
