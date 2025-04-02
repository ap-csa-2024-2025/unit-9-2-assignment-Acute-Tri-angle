public class CompanyTester
{
	public static void run()
	{
		Company c9 = new Company("Killer Software INC");
		System.out.println(c9.getName());
		System.out.println(c9.address());
		System.out.println(c9.toString());
		
		Company cloud9 = new Company("Skibi Law Firm", "777 Main St.", "Chernobyl", "OH");
		System.out.println(cloud9.getName());
		System.out.println(cloud9.address());
		System.out.println(cloud9.toString());

		OnlineCompany not_cloud9 = new OnlineCompany("RIOT Games", "www.riot-games.com");
		System.out.println(not_cloud9.getName());
		System.out.println(not_cloud9.address());
		System.out.println(not_cloud9.toString());
	}
}
