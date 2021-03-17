package appiumtests;

public class Main {
	public static void main(String[] args) {
		
		try {
			//openInstagramn();
			//openTikTok();
			//TikTokInstagramfinder();
			//InfluencerScraping();
			CalculatorTest.InfluencerScrapingMethods();
		}catch(Exception exp) {
			System.out.println(exp.getCause());
			System.out.println(exp.getMessage());
			exp.printStackTrace();
		}
		
	}

}
