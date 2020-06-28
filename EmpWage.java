import java.io.*;

class EmpWage
{
        public static int isPart = 1, isFull = 2, capGEmpRate = 20,bridgeEmpRate = 30;
        public static int capGMaxHrs = 100, capGTotalDays=20;
        public static int capGWage = 0, capGWagePerHrs=20, capGfullDayHrs=8;

        public static int bridgeMaxHrs = 130, bridgeTotalDays=24;
        public static int bridgeWage = 0, bridgeWagePerHrs=30, bridgefullDayHrs=9;

        //static int empCheck = (int)Math.floor(Math.random() * 10) % 2;

        public static void main(String[] args) throws IOException
        {
                System.out.println("\n=========================================");
                System.out.println("===Welcome to Employee Wage Computation Program====");
                System.out.println("===========================================");

                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

                System.out.println("1.Check Employee Wage for Capgemini");
                System.out.println("2.Check Employee Wage for BridgeLabz");
                System.out.println("Enter the choice : ");
                int choice = Integer.parseInt(br.readLine());

                switch(choice)
                {
                        case 1:
                                capGWage = capGWagePerHrs * capGfullDayHrs;

                                System.out.println("\nDaily Employee Wage salary = "+capGWage);

                                System.out.println("\nEmployee's working day and time...");
                                getCapGEmpWage();
                                break;
                        case 2:
                                bridgeWage = bridgeWagePerHrs * bridgefullDayHrs;

                                 System.out.println("\nDaily Employee Wage salary = "+bridgeWage);

                                System.out.println("\nEmployee's working day and time...");
                                getBridgeEmpWage();
                                break;
                        default:
                                System.out.println("Enter valid choice....");
                                break;
                }
        }

        //======================================================================================


        public static int getCapGEmpWage()
        {
                int capGEmpHrs=0, capGTotalEmpHrs=0,capGTotalWorkingDays=0;

                while(capGTotalEmpHrs <= capGMaxHrs && capGTotalWorkingDays < capGTotalDays)
                {
                        capGTotalWorkingDays++;

                        int empCheck = (int)Math.floor(Math.random() * 10) % 3;

                        switch(empCheck)
                        {
                                case 1:
                                        capGEmpHrs = 4;
                                        break;
                                case 2:
                                        capGEmpHrs = 8;
                                        break;
                                default:
                                        capGEmpHrs = 0;
                                        break;
                        }

                        capGTotalEmpHrs += capGEmpHrs;

                        if(capGEmpHrs > 0)
                        {
                                System.out.println("Days : "+capGTotalWorkingDays+"==================>Employee is present and working for : "+capGEmpHrs+"hrs");
                        }
                        else
                        {
                                System.out.println("Days : "+capGTotalWorkingDays+"==================>Employee is absent");
                        }
                }

                int capGTotalWage = capGTotalEmpHrs * capGEmpRate;
                System.out.println("\nTotal Emp Wage for month : "+capGTotalWage);

                return capGTotalWage;
        }

        //==================================================================================

        public static int getBridgeEmpWage()
        {
                int bridgeEmpHrs=0, bridgeTotalEmpHrs=0,bridgeTotalWorkingDays=0;

                while(bridgeTotalEmpHrs <= bridgeMaxHrs && bridgeTotalWorkingDays < bridgeTotalDays)
                {
                        bridgeTotalWorkingDays++;

                        int empCheck = (int)Math.floor(Math.random() * 10) % 3;

                        switch(empCheck)
                        {
                                case 1:
                                        bridgeEmpHrs = 4;
                                        break;
                                case 2:
                                        bridgeEmpHrs = 9;
                                        break;
                                default:
                                        bridgeEmpHrs = 0;
                                        break;
                        }

                        bridgeTotalEmpHrs += bridgeEmpHrs;

                        if(bridgeEmpHrs > 0)
                        {
                                System.out.println("Days : "+bridgeTotalWorkingDays+"==================>Employee is present and working for : "+bridgeEmpHrs+"hrs");
                        }
                        else
                        {
                                System.out.println("Days : "+bridgeTotalWorkingDays+"==================>Employee is absent");
                        }
                }

                int bridgeTotalWage = bridgeTotalEmpHrs * bridgeEmpRate;
                System.out.println("\nTotal Emp Wage for month : "+bridgeTotalWage);

                return bridgeTotalWage;
        }
}
