package utilities;

import pageObject.AdminPage;
import pageObject.BuzzPage;
import pageObject.ClaimPage;
import pageObject.DashboardPage;
import pageObject.DirectoryPage;
import pageObject.LeavePage;
import pageObject.LoginPage;
import pageObject.MaintenancePage;
import pageObject.MyInfoPage;
import pageObject.PIMPage;
import pageObject.PerformancePage;
import pageObject.RecruitmentPage;
import pageObject.TimePage;

public class PageInitializer extends BaseClass{
	public static DashboardPage dp;
	public static AdminPage ap;
	public static LoginPage lp;
	public static MyInfoPage mp;
	public static TimePage tp;
	public static LeavePage LeaP;
	public static PIMPage PIM;
	public static BuzzPage bp;
	public static ClaimPage cp;
	public static DirectoryPage dip;
	public static MaintenancePage mainP;
	public static PerformancePage pp;
	public static RecruitmentPage rp;
	
	
	public static void initialize() {
		dp = new DashboardPage();
		ap = new AdminPage();
		lp = new LoginPage();
		mp = new MyInfoPage();
		tp = new TimePage();
		LeaP = new LeavePage();
		PIM = new PIMPage();
		bp = new BuzzPage();
		cp=new ClaimPage();
		dip = new DirectoryPage();
		mainP = new MaintenancePage();
		pp= new PerformancePage();
		rp= new RecruitmentPage();
		
		
		
		
		
		
	}
}
