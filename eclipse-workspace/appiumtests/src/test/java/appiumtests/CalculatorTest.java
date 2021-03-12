package appiumtests;
import java.util.concurrent.TimeUnit;
import  java.util.*;

import io.appium.java_client.MultiTouchAction;
import io.appium.java_client.TouchAction;

import io.appium.java_client.android.AndroidDriver;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;


import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.touch.TouchActions;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import java.io.PrintWriter;

import io.appium.java_client.touch.TapOptions;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.ElementOption;
import io.appium.java_client.touch.offset.PointOption;


public class CalculatorTest {
	
	
	public void consumeIrrelevantLogs() {
	    driver.manage().logs().get("logcat");
	} 
	
	static AppiumDriver<MobileElement> driver;
	public static void main(String[] args) {
		try {
			//openInstagramn();
			//openTikTok();
			//TikTokInstagramfinder();
			//InfluencerScraping();
			InfluencerScrapingMethods();
		}catch(Exception exp) {
			System.out.println(exp.getCause());
			System.out.println(exp.getMessage());
			exp.printStackTrace();
		}
		
	}
	
	//******
	//Link TikTok Usernames to Instagramn Usernames
	public static void scrollDown()  {

	    //The viewing size of the device
	    Dimension size = driver.manage().window().getSize();

	    //x position set to mid-screen horizontally
	    int width = size.width / 2;

	    //Starting y location set to 80% of the height (near bottom)
	    int startPoint = (int) (size.getHeight() * .70);

	    //Ending y location set to 20% of the height (near top)
	    int endPoint = (int) (size.getHeight() * 0.27);

	    new TouchAction(driver).press(PointOption.point(width, startPoint)).waitAction(WaitOptions.waitOptions(Duration.ofMillis(2000))).moveTo(PointOption.point(width, endPoint)).release().perform();

	}
	public static LinkedList<String> gatherSuggested() {
		LinkedList<String> llUserNames
        = new LinkedList<String>(); 
		WebElement downArrow= driver.findElement(By.id("com.zhiliaoapp.musically:id/cku"));
		downArrow.click();
		WebElement downArrowMore= driver.findElement(By.id("com.zhiliaoapp.musically:id/dy1"));
		downArrowMore.click();
		int X = 1;
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		int Q = 1;
		while (X<52) { 
			String V = Integer.toString(Q);
			String linkXpath = "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.LinearLayout/androidx.viewpager.widget.ViewPager/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout["+V+"]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.TextView";
			
			WebElement showMoreList = driver.findElement(By.xpath(linkXpath));
			String ttUsername = showMoreList.getText();
			System.out.println(ttUsername);
			llUserNames.add(ttUsername);
			if (Q%11 == 0) {
				
				Q = 2;
				
				scrollDown();
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				scrollDown();
				try {
					Thread.sleep(3000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			X++;
			Q++;
			
		}
		
		
		
		System.out.println("Done");
		driver.navigate().back();
		driver.navigate().back();
		driver.navigate().back();
		return llUserNames;
		
		
	}
	
	public static void searchProfile(String username) {
		LinkedList<String> llM
        = new LinkedList<String>(); 
		LinkedList<String> llUserNames
        = new LinkedList<String>(); 
		List<Float> llK = new LinkedList<Float>();
		TouchAction touchAction=new TouchAction(driver);
		
		//setting the arrays with lenghth of csv in lines for each section
		
		
		touchAction.tap(PointOption.point(325, 1819)).perform();
		int i = 2;
		String ttHandle[] = new String[3];
		ttHandle[0] = "chanclaacademy";
		ttHandle[1] = "caseyiscrazy";
		//ttHandle[2] = "theonlynoah_withnoark";
		ttHandle[2] = username;
		//ttHandle[4] = "averycyrus";
		
	
		
		//while loop to go through each  person in the
		//while (i<3) {
			touchAction.tap(PointOption.point(337, 85)).perform();
			WebElement searchName = driver.findElement(By.id("com.zhiliaoapp.musically:id/amb"));
			searchName.sendKeys(ttHandle[i]);
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			touchAction.tap(PointOption.point(236, 137)).perform();
			i++;
			
			//WebElement firstProfile1 = driver.findElement(By.id("com.zhiliaoapp.musically:id/bb_"));
			//firstProfile1.click();
			//tap.sendKeys(names[i]);
			try {
				Thread.sleep(6000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			touchAction.tap(PointOption.point(356, 310)).perform();
			//WebElement firstProfile = driver.findElement(By.id("com.zhiliaoapp.musically:id/bke"));
			//touchAction.tap(PointOption.point(585, 87)).perform();
			//WebElement searchClick = driver.findElement(By.id("com.zhiliaoapp.musically:id/dxv"));
			//searchClick.click();
			//touchAction.tap(PointOption.point(186, 155)).perform();
			
			WebElement followers= driver.findElement(By.id("com.zhiliaoapp.musically:id/av7"));
			String followerCheck = followers.getText();
			boolean isFoundM= followerCheck.contains("M");
			boolean isFoundK= followerCheck.contains("K");
			if (isFoundM) {
				followerCheck = followerCheck.replaceAll("M", "");
				System.out.println(followerCheck);
				
				llM.add(followerCheck);
			
				
				
			}
			if (isFoundK) {
				followerCheck = followerCheck.replaceAll("K", "");
				System.out.println(followerCheck);
				float x = Float.parseFloat(followerCheck);
				if (x>100) {

				llK.add(x);}
				}
		
			System.out.println(llK);
			System.out.println(llM);

			//driver.navigate().back();
			//driver.navigate().back();
			System.out.println(i);
		//}
	}
	public static void runTikTok() throws MalformedURLException 
	{
		
		DesiredCapabilities cap  = new DesiredCapabilities();
		cap.setCapability("deviceName", "Pixel 2");
		//for wired connection
		//cap.setCapability("udid","HT8281A02502");
		
		//for Bluestacks android emulator
		cap.setCapability("udid","localhost:5555");
		cap.setCapability("platformName","Android");
		cap.setCapability("platformVersion","10");
		//keyboard functions
		cap.setCapability("unicodeKeyboard", "true");                                     
		cap.setCapability("resetKeyboard", "true");
		//App opener lines
		
		//INSTAGRAM
		
		//cap.setCapability("appPackage","com.instagram.android");
		//cap.setCapability("appActivity","com.instagram.android.activity.MainTabActivity");
		
		//TIKTOK
		
		//cap.setCapability("appPackage","com.zhiliaoapp.musically");
		//cap.setCapability("appActivity","com.ss.android.ugc.aweme.splash.SplashActivity");

		URL url = new URL("http://127.0.0.1:4723/wd/hub");
		driver =  new AppiumDriver<MobileElement>(url,cap);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		System.out.println("running");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
		
		
		}
	public static void runInstagram() throws MalformedURLException{
		//path for the csv file being read from
		String path = "/Users/gabe/Desktop/Instagram-to-Email.csv";
		String line = "";
		//setting counter to  figure out how many names there are to set the  array length
		int counter = 0;
		int h = 0;
		//setting up the file reader try catch to count the number  of lines
			try {
				BufferedReader br = new BufferedReader(new FileReader(path));
				while((line = br.readLine()) != null) {
					counter++;
					}
					
			} catch (FileNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			catch (IOException e2) {
				// TODO Auto-generated catch block
				e2.printStackTrace();}
				
			
			
			//******
			
			//setting desired capabilities for appium (also needed for the the desktop appium program)
			
			
			
			
			DesiredCapabilities cap  = new DesiredCapabilities();
			cap.setCapability("deviceName", "Pixel 2");
			//for wired connection
			//cap.setCapability("udid","HT8281A02502");
			
			//for Bluestacks android emulator
			cap.setCapability("udid","HT8281A02502");
			cap.setCapability("platformName","Android");
			cap.setCapability("platformVersion","10");
			//keyboard functions
			cap.setCapability("unicodeKeyboard", "true");                                     
			cap.setCapability("resetKeyboard", "true");
			//App opener lines
			
			//INSTAGRAM
			
			//cap.setCapability("appPackage","com.instagram.android");
			//cap.setCapability("appActivity","com.instagram.android.activity.MainTabActivity");
			
			//TIKTOK
			
			//cap.setCapability("appPackage","com.zhiliaoapp.musically");
			//cap.setCapability("appActivity","com.ss.android.ugc.aweme.splash.SplashActivity");
	
			URL url = new URL("http://127.0.0.1:4723/wd/hub");
			driver =  new AppiumDriver<MobileElement>(url,cap);
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			System.out.println("running");
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
			
	}
	public static String[] pullFromCSV(String filePath) {
		//path for the csv file being read from
				//String path = "/Users/gabe/Desktop/TikTokUnames-to-instagram.csv";
				String path = filePath;

				String line = "";
				//setting counter to  figure out how many names there are to set the  array length
				int counter = 0;
				int h = 0;
				//setting up the file reader try catch to count the number  of lines
					try {
						BufferedReader br = new BufferedReader(new FileReader(path));
						while((line = br.readLine()) != null) {
							counter++;
							}
							
					} catch (FileNotFoundException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					catch (IOException e2) {
						// TODO Auto-generated catch block
						e2.printStackTrace();}
					//setting the arrays with lenghth of csv in lines for each section
					String[] ttHandle = new String[counter+1];
					try {
						BufferedReader br = new BufferedReader(new FileReader(path));
						
						
						
						
						while((line = br.readLine()) != null) {
							ttHandle[h] = line;
							h++;
							System.out.println("Here2");
							}
					} catch (FileNotFoundException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					catch (IOException e3) {
						// TODO Auto-generated catch block
						e3.printStackTrace();
					
					}
					System.out.println(ttHandle.toString());
					
					
					
					
					return ttHandle;
					
					
						
	}
	public static void writeToCSV(LinkedList<String> ttHandle, String fileName) {
		PrintWriter out = null;
		int counter = ttHandle.size();
		try {
		    out = new PrintWriter(new BufferedWriter(new FileWriter(fileName, true)));
		    for(int e = 0; e<counter; e++) {
		    out.println(ttHandle.get(e).toString());}
		}catch (IOException e) {
		    System.err.println(e);
		}finally{
		    if(out != null){
		        out.close();
		    }}
		
	}
	public static void openTikTok() throws MalformedURLException 
	{	
		//path for the csv file being read from
		String path = "/Users/gabe/Desktop/TikTokUnames-to-instagram.csv";
		String line = "";
		//setting counter to  figure out how many names there are to set the  array length
		int counter = 0;
		int h = 0;
		//setting up the file reader try catch to count the number  of lines
			try {
				BufferedReader br = new BufferedReader(new FileReader(path));
				while((line = br.readLine()) != null) {
					counter++;
					}
					
			} catch (FileNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			catch (IOException e2) {
				// TODO Auto-generated catch block
				e2.printStackTrace();}
				
			
			
			//******
			
			//setting desired capabilities for appium (also needed for the the desktop appium program)
			
			
			
			
			DesiredCapabilities cap  = new DesiredCapabilities();
			cap.setCapability("deviceName", "Pixel 2");
			//for wired connection
			//cap.setCapability("udid","HT8281A02502");
			
			//for Bluestacks android emulator
			cap.setCapability("udid","localhost:5555");
			cap.setCapability("platformName","Android");
			cap.setCapability("platformVersion","10");
			//keyboard functions
			cap.setCapability("unicodeKeyboard", "true");                                     
			cap.setCapability("resetKeyboard", "true");
			//App opener lines
			
			//INSTAGRAM
			
			//cap.setCapability("appPackage","com.instagram.android");
			//cap.setCapability("appActivity","com.instagram.android.activity.MainTabActivity");
			
			//TIKTOK
			
			//cap.setCapability("appPackage","com.zhiliaoapp.musically");
			//cap.setCapability("appActivity","com.ss.android.ugc.aweme.splash.SplashActivity");
	
			URL url = new URL("http://127.0.0.1:4723/wd/hub");
			driver =  new AppiumDriver<MobileElement>(url,cap);
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			System.out.println("running");
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
			
			
			//*******
			//reading from same csv to populate array with TikTok Usernames
			
			
			
			
			
			
			//setting the arrays with lenghth of csv in lines for each section
			String[] ttHandle = new String[counter+1];
			try {
				BufferedReader br = new BufferedReader(new FileReader(path));
				
				
				
				
				while((line = br.readLine()) != null) {
					ttHandle[h] = line;
					h++;
					System.out.println("Here2");
					}
			} catch (FileNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			catch (IOException e3) {
				// TODO Auto-generated catch block
				e3.printStackTrace();
			
			}
			System.out.println(ttHandle.toString());
			
			
			
			
			
			//*******
			//Blue Stacks Emulator Program
			
			//setting the touch action so that taps can be done using coordinates
			TouchAction touchAction=new TouchAction(driver);
			
			//setting the arrays with lenghth of csv in lines for each section
			String[] igHandle = new String[counter+1];
			String[] ytHandle = new String[counter+1];
			
			touchAction.tap(PointOption.point(325, 1819)).perform();
			int i = 0;
			
			//while loop to go through each  person in the
			while (i<counter+1) {
				touchAction.tap(PointOption.point(337, 85)).perform();
				WebElement searchName = driver.findElement(By.id("com.zhiliaoapp.musically:id/amb"));
				searchName.sendKeys(ttHandle[i]);
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				touchAction.tap(PointOption.point(236, 137)).perform();
	
				//WebElement firstProfile1 = driver.findElement(By.id("com.zhiliaoapp.musically:id/bb_"));
				//firstProfile1.click();
				//tap.sendKeys(names[i]);
				try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				WebElement firstProfile = driver.findElement(By.id("com.zhiliaoapp.musically:id/bke"));
				//touchAction.tap(PointOption.point(585, 87)).perform();
				WebElement searchClick = driver.findElement(By.id("com.zhiliaoapp.musically:id/dxv"));
				searchClick.click();
				//touchAction.tap(PointOption.point(186, 155)).perform();
				touchAction.tap(PointOption.point(248, 310)).perform();
				WebElement instagram = driver.findElement(By.id("com.zhiliaoapp.musically:id/qf"));
				instagram.click();
				
				//Try catch to scrape data from  each  profile based on how socials have been linked 1:Instagram+Yt 2:Instagram 3: no instagram
				try
				   {
					WebElement instagramTag= driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.appcompat.widget.LinearLayoutCompat/android.widget.FrameLayout/android.widget.ListView/android.widget.TextView[1]"));
					String iG = instagramTag.getText();
					String iGCorrect = iG.replace("Instagram: ", "");
					System.out.println(iGCorrect);
					igHandle[i] = iGCorrect;
					
					try {
						Thread.sleep(5000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					touchAction.tap(PointOption.point(348, 998)).perform();
					WebElement youtubeTag = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[1]/android.view.View/android.view.View[2]"));
					String ytTag = youtubeTag.getText();
					System.out.println(ytTag);
					ytHandle[i] = ytTag;
					//WebElement youtubeTag  = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.appcompat.widget.LinearLayoutCompat/android.widget.FrameLayout/android.widget.ListView/android.widget.TextView[2]"));
					//youtubeTag.click();
					//System.out.println(youtubeTag);
					try {
						Thread.sleep(5000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
					driver.navigate().back();
					driver.navigate().back();
					driver.navigate().back();
					
		
				  
				   }
				catch(Exception e)
				
				   {
					try {
						WebElement instagramTag= driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[1]/android.view.View/android.view.View[1]/android.view.View/android.view.View[1]/android.view.View[2]/android.view.View[1]/android.view.View"));
						String igUserName = instagramTag.getText();
						
						System.out.println(igUserName);
						igHandle[i] = igUserName;
						ytHandle[i] = "NA";
						driver.navigate().back();
						driver.navigate().back();
						driver.navigate().back();
						
					}
					catch(Exception e1)
					{
						System.out.println("No ig");
						igHandle[i] = "NA";
						driver.navigate().back();
						driver.navigate().back();
						
					}
					
				     
				   }
				i++;
			}
			
			
			//setting up csv output file for each person and their respective @ for tt, Insta and YT
			PrintWriter out = null;
			try {
			    out = new PrintWriter(new BufferedWriter(new FileWriter("test.csv", true)));
			    for(int e = 0; e<counter; e++) {
			    out.println(ttHandle[e].toString()+","+igHandle[e].toString()+","+ytHandle[e].toString());}
			}catch (IOException e) {
			    System.err.println(e);
			}finally{
			    if(out != null){
			        out.close();
			    }
		} 
		/*
		// Real Device
		WebElement login = driver.findElement(By.id("com.zhiliaoapp.musically:id/btv"));
		login.click();
		
		WebElement login2 = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.RelativeLayout/androidx.viewpager.widget.ViewPager/android.view.ViewGroup/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]"));
		login2.click();
		WebElement clickEmail = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.HorizontalScrollView/android.widget.LinearLayout/androidx.appcompat.app.ActionBar.b[2]/android.widget.TextView"));
		clickEmail.click();
		WebElement loginEmail = driver.findElement(By.id("com.zhiliaoapp.musically:id/b8_"));
		//loginEmail.sendKeys("team@lgbt50.com");
		loginEmail.sendKeys("dropzace@gmail.com");
		WebElement loginPass = driver.findElement(By.id("com.zhiliaoapp.musically:id/ama"));
		//loginPass.sendKeys("LGBT50.com!");
		loginPass.sendKeys("Password1!");
		WebElement loginClick = driver.findElement(By.id("com.zhiliaoapp.musically:id/bv7"));
		loginClick.click();
		try {
			Thread.sleep(15000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		TouchAction touchAction=new TouchAction(driver);
		touchAction.tap(PointOption.point(337, 1707)).perform();
		WebElement searchNameInput = driver.findElement(By.id("com.zhiliaoapp.musically:id/amb"));
		searchNameInput.sendKeys("cjtooicy");
		touchAction.tap(PointOption.point(244, 135)).perform();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		touchAction.tap(PointOption.point(263, 267)).perform();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		touchAction.tap(PointOption.point(317, 554)).perform();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		//WebElement searchNameClick = driver.findElement(By.id("com.zhiliaoapp.musically:id/dxv"));
		//searchNameClick.click();
		//WebElement firstNameClick = driver.findElement(By.id("com.zhiliaoapp.musically:id/bke"));
		//firstNameClick.click();
		WebElement instagramClick = driver.findElement(By.id("com.zhiliaoapp.musically:id/qf"));
		instagramClick.click();
		//TouchAction touchAction = new TouchAction(driver);
		//touchAction.tap(PointOption.point(314, 1370))
		           //.perform();
		            */
		     
	

	}
	
	
	
	//******
	//Scrape email from Instagram username
	public static void openInstagramn() throws MalformedURLException {
		//path for the csv file being read from
				String path = "/Users/gabe/Desktop/Instagram-to-Email.csv";
				String line = "";
				//setting counter to  figure out how many names there are to set the  array length
				int counter = 0;
				int h = 0;
				//setting up the file reader try catch to count the number  of lines
					try {
						BufferedReader br = new BufferedReader(new FileReader(path));
						while((line = br.readLine()) != null) {
							counter++;
							}
							
					} catch (FileNotFoundException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					catch (IOException e2) {
						// TODO Auto-generated catch block
						e2.printStackTrace();}
						
					
					
					//******
					
					//setting desired capabilities for appium (also needed for the the desktop appium program)
					
					
					
					
					DesiredCapabilities cap  = new DesiredCapabilities();
					cap.setCapability("deviceName", "Pixel 2");
					//for wired connection
					//cap.setCapability("udid","HT8281A02502");
					
					//for Bluestacks android emulator
					cap.setCapability("udid","HT8281A02502");
					cap.setCapability("platformName","Android");
					cap.setCapability("platformVersion","10");
					//keyboard functions
					cap.setCapability("unicodeKeyboard", "true");                                     
					cap.setCapability("resetKeyboard", "true");
					//App opener lines
					
					//INSTAGRAM
					
					//cap.setCapability("appPackage","com.instagram.android");
					//cap.setCapability("appActivity","com.instagram.android.activity.MainTabActivity");
					
					//TIKTOK
					
					//cap.setCapability("appPackage","com.zhiliaoapp.musically");
					//cap.setCapability("appActivity","com.ss.android.ugc.aweme.splash.SplashActivity");
			
					URL url = new URL("http://127.0.0.1:4723/wd/hub");
					driver =  new AppiumDriver<MobileElement>(url,cap);
					driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
					System.out.println("running");
					driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
					
					
					
					//*******
					//reading from same csv to populate array with TikTok Usernames
					
					
					
					
					
					
					//setting the arrays with lenghth of csv in lines for each section
					String[] ttHandle = new String[counter+1];
					try {
						BufferedReader br = new BufferedReader(new FileReader(path));
						
						
						
						
						while((line = br.readLine()) != null) {
							ttHandle[h] = line;
							h++;
							System.out.println("Here2");
							}
					} catch (FileNotFoundException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					catch (IOException e3) {
						// TODO Auto-generated catch block
						e3.printStackTrace();
					
					}
					System.out.println(ttHandle.toString());
					
					
					
					
					
					//*******
					//Blue Stacks Emulator Program
					
					//setting the touch action so that taps can be done using coordinates
					TouchAction touchAction=new TouchAction(driver);
					
					//setting the arrays with lenghth of csv in lines for each section
					String[] igEmail = new String[counter+1];
	
					int i = 0;
					
					
					try {
						Thread.sleep(5000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					while (i<counter) {
						touchAction.tap(PointOption.point(333, 1726)).perform();
						WebElement igSearchKeys= driver.findElement(By.id("com.instagram.android:id/action_bar_search_edit_text"));
						igSearchKeys.click();
						try {
							Thread.sleep(500);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						touchAction.tap(PointOption.point(406, 163)).perform();
						try {
							Thread.sleep(500);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						
						igSearchKeys.sendKeys(ttHandle[i]);
						try {
							Thread.sleep(2000);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						
						touchAction.tap(PointOption.point(279, 395)).perform();
						try {
							WebElement emailClick= driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout[2]/android.widget.FrameLayout[2]/android.widget.FrameLayout[1]/android.view.ViewGroup/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.Button[3]"));
							emailClick.click();
							WebElement emailText= driver.findElement(By.id("com.google.android.gm:id/to"));
							String EmailFirst = emailText.getText();
							String Email1 = EmailFirst.replace("<", "");
							String Email = Email1.replace(">", "");
							System.out.println(Email);
							igEmail[i] = Email;
							System.out.println(Email);
							driver.navigate().back();
							driver.navigate().back();
							driver.navigate().back();
							
						}
						catch(Exception e) {
							driver.navigate().back();
							String Email = "NA";
							System.out.println(Email);
							igEmail[i] = Email;
							
						}
						i++;
						
					}
					PrintWriter out = null;
					try {
					    out = new PrintWriter(new BufferedWriter(new FileWriter("igEmail.csv", true)));
					    for(int e = 0; e<counter; e++) {
					    out.println(ttHandle[e].toString()+","+igEmail[e].toString());}
					}catch (IOException e) {
					    System.err.println(e);
					}finally{
					    if(out != null){
					        out.close();
					    }
					   
					    
					
	}
}
	 public static void TikTokInstagramfinder() throws MalformedURLException {
		 String path = "/Users/gabe/Desktop/TikTokUnames-to-instagram.csv";
			String line = "";
			//setting counter to  figure out how many names there are to set the  array length
			int counter = 0;
			int h = 0;
			//setting up the file reader try catch to count the number  of lines
				try {
					BufferedReader br = new BufferedReader(new FileReader(path));
					while((line = br.readLine()) != null) {
						counter++;
						}
						
				} catch (FileNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				catch (IOException e2) {
					// TODO Auto-generated catch block
					e2.printStackTrace();}
					
				
				
				//******
				
				//setting desired capabilities for appium (also needed for the the desktop appium program)
				
				
				
				
				DesiredCapabilities cap  = new DesiredCapabilities();
				cap.setCapability("deviceName", "Pixel 2");
				//for wired connection
				//cap.setCapability("udid","HT8281A02502");
				
				//for Bluestacks android emulator
				cap.setCapability("udid","localhost:5555");
				cap.setCapability("platformName","Android");
				cap.setCapability("platformVersion","10");
				//keyboard functions
				cap.setCapability("unicodeKeyboard", "true");                                     
				cap.setCapability("resetKeyboard", "true");
				//App opener lines
				
				//INSTAGRAM
				
				//cap.setCapability("appPackage","com.instagram.android");
				//cap.setCapability("appActivity","com.instagram.android.activity.MainTabActivity");
				
				//TIKTOK
				
				//cap.setCapability("appPackage","com.zhiliaoapp.musically");
				//cap.setCapability("appActivity","com.ss.android.ugc.aweme.splash.SplashActivity");
		
				URL url = new URL("http://127.0.0.1:4723/wd/hub");
				driver =  new AppiumDriver<MobileElement>(url,cap);
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				System.out.println("running");
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				
				
				
				
				
				
				
					TouchAction touchAction=new TouchAction(driver);
					
					//setting the arrays with lenghth of csv in lines for each section
					String[] igHandle = new String[counter+1];
					String[] ytHandle = new String[counter+1];
					
					touchAction.tap(PointOption.point(325, 1819)).perform();
					int i = 0;
					String ttHandle[] = new String[3];
					ttHandle[0] = "averycyrus";
					ttHandle[1] = "caseyiscrazy";
					//ttHandle[2] = "theonlynoah_withnoark";
					ttHandle[2] = "justmaiko";
					//ttHandle[4] = "averycyrus";
					
				
					
					//while loop to go through each  person in the
					while (i<3) {
						touchAction.tap(PointOption.point(337, 85)).perform();
						WebElement searchName = driver.findElement(By.id("com.zhiliaoapp.musically:id/amb"));
						searchName.sendKeys(ttHandle[i]);
						try {
							Thread.sleep(5000);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						touchAction.tap(PointOption.point(236, 137)).perform();
						i++;
			
						//WebElement firstProfile1 = driver.findElement(By.id("com.zhiliaoapp.musically:id/bb_"));
						//firstProfile1.click();
						//tap.sendKeys(names[i]);
						try {
							Thread.sleep(6000);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						touchAction.tap(PointOption.point(356, 310)).perform();
						//WebElement firstProfile = driver.findElement(By.id("com.zhiliaoapp.musically:id/bke"));
						//touchAction.tap(PointOption.point(585, 87)).perform();
						//WebElement searchClick = driver.findElement(By.id("com.zhiliaoapp.musically:id/dxv"));
						//searchClick.click();
						//touchAction.tap(PointOption.point(186, 155)).perform();
						
						WebElement Bio= driver.findElement(By.id("com.zhiliaoapp.musically:id/e5r"));
						String bioCheck = Bio.getText();
						String bioCheckLower = bioCheck.toLowerCase();
						
						boolean isFoundSH = bioCheckLower.contains("she/her");
						boolean isFoundTT = bioCheckLower.contains("they/them");
						boolean isFoundHH = bioCheckLower.contains("he/him");
						boolean isFoundST = bioCheckLower.contains("she/them");
						boolean isFoundHT = bioCheckLower.contains("he/them");
						boolean isFoundFlag = bioCheckLower.contains("🌈");
						boolean isFoundRainBow = bioCheckLower.contains("🏳️‍🌈");
						boolean isFoundLGBTQ = bioCheckLower.contains("lgbtq+");
						boolean isFoundlgbt = bioCheckLower.contains("lgbt");
						boolean isFoundgay= bioCheckLower.contains("gay️‍");
						boolean isFoundpride= bioCheckLower.contains("pride");
						boolean isFoundlesbian = bioCheckLower.contains("lesbian");
						boolean isFoundtrans = bioCheckLower.contains("trans");
						boolean isFoundhomo = bioCheckLower.contains("homo");
						boolean isFoundqueer = bioCheckLower.contains("queer️");
						boolean isFoundKiss = bioCheckLower.contains("👩‍❤️‍💋‍👩");
						if (isFoundSH || isFoundTT || isFoundHH || isFoundST || isFoundHT || isFoundRainBow) {
							WebElement TTuserName= driver.findElement(By.id("com.zhiliaoapp.musically:id/e58"));
							String TTuser = TTuserName.getText();
							System.out.println(TTuser);}
						driver.navigate().back();
						driver.navigate().back();
						System.out.println(i);
					
				}
					
					
				}
				
				
		 //com.zhiliaoapp.musically:id/e5r
	    


public static void InfluencerScraping() throws MalformedURLException {
	 String path = "/Users/gabe/Desktop/TikTokUnames-to-instagram.csv";
		String line = "";
		//setting counter to  figure out how many names there are to set the  array length
		int counter = 0;
		int h = 0;
		//setting up the file reader try catch to count the number  of lines
			try {
				BufferedReader br = new BufferedReader(new FileReader(path));
				while((line = br.readLine()) != null) {
					counter++;
					}
					
			} catch (FileNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			catch (IOException e2) {
				// TODO Auto-generated catch block
				e2.printStackTrace();}
				
			
			
			//******
			
			//setting desired capabilities for appium (also needed for the the desktop appium program)
			
			
			
			
			DesiredCapabilities cap  = new DesiredCapabilities();
			cap.setCapability("deviceName", "Pixel 2");
			//for wired connection
			//cap.setCapability("udid","HT8281A02502");
			
			//for Bluestacks android emulator
			cap.setCapability("udid","localhost:5555");
			cap.setCapability("platformName","Android");
			cap.setCapability("platformVersion","10");
			//keyboard functions
			cap.setCapability("unicodeKeyboard", "true");                                     
			cap.setCapability("resetKeyboard", "true");
			//App opener lines
			
			//INSTAGRAM
			
			//cap.setCapability("appPackage","com.instagram.android");
			//cap.setCapability("appActivity","com.instagram.android.activity.MainTabActivity");
			
			//TIKTOK
			
			//cap.setCapability("appPackage","com.zhiliaoapp.musically");
			//cap.setCapability("appActivity","com.ss.android.ugc.aweme.splash.SplashActivity");
	
			URL url = new URL("http://127.0.0.1:4723/wd/hub");
			driver =  new AppiumDriver<MobileElement>(url,cap);
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			System.out.println("running");
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
			
			
			
			
			
			LinkedList<String> llM
            = new LinkedList<String>(); 
			LinkedList<String> llUserNames
            = new LinkedList<String>(); 
			List<Float> llK = new LinkedList<Float>();

				TouchAction touchAction=new TouchAction(driver);
				
				//setting the arrays with lenghth of csv in lines for each section
				String[] igHandle = new String[counter+1];
				String[] ytHandle = new String[counter+1];
				
				touchAction.tap(PointOption.point(325, 1819)).perform();
				int i = 2;
				String ttHandle[] = new String[3];
				ttHandle[0] = "chanclaacademy";
				ttHandle[1] = "caseyiscrazy";
				//ttHandle[2] = "theonlynoah_withnoark";
				ttHandle[2] = "caseyiscrazy";
				//ttHandle[4] = "averycyrus";
				
			
				
				//while loop to go through each  person in the
				//while (i<3) {
					touchAction.tap(PointOption.point(337, 85)).perform();
					WebElement searchName = driver.findElement(By.id("com.zhiliaoapp.musically:id/amb"));
					searchName.sendKeys(ttHandle[i]);
					try {
						Thread.sleep(5000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					touchAction.tap(PointOption.point(236, 137)).perform();
					i++;
					
					//WebElement firstProfile1 = driver.findElement(By.id("com.zhiliaoapp.musically:id/bb_"));
					//firstProfile1.click();
					//tap.sendKeys(names[i]);
					try {
						Thread.sleep(6000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					touchAction.tap(PointOption.point(356, 310)).perform();
					//WebElement firstProfile = driver.findElement(By.id("com.zhiliaoapp.musically:id/bke"));
					//touchAction.tap(PointOption.point(585, 87)).perform();
					//WebElement searchClick = driver.findElement(By.id("com.zhiliaoapp.musically:id/dxv"));
					//searchClick.click();
					//touchAction.tap(PointOption.point(186, 155)).perform();
					
					WebElement followers= driver.findElement(By.id("com.zhiliaoapp.musically:id/av7"));
					String followerCheck = followers.getText();
					boolean isFoundM= followerCheck.contains("M");
					boolean isFoundK= followerCheck.contains("K");
					if (isFoundM) {
						followerCheck = followerCheck.replaceAll("M", "");
						System.out.println(followerCheck);
						
						llM.add(followerCheck);
					
						
						
					}
					if (isFoundK) {
						followerCheck = followerCheck.replaceAll("K", "");
						System.out.println(followerCheck);
						float x = Float.parseFloat(followerCheck);
						if (x>100) {

						llK.add(x);}
						}
				
					System.out.println(llK);
					System.out.println(llM);
	
					//driver.navigate().back();
					//driver.navigate().back();
					System.out.println(i);
				//}
					WebElement downArrow= driver.findElement(By.id("com.zhiliaoapp.musically:id/cku"));
					downArrow.click();
					WebElement downArrowMore= driver.findElement(By.id("com.zhiliaoapp.musically:id/dy1"));
					downArrowMore.click();
					int X = 1;
					try {
						Thread.sleep(4000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
					int Q = 1;
					while (X<52) { 
						String V = Integer.toString(Q);
						String linkXpath = "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.LinearLayout/androidx.viewpager.widget.ViewPager/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout["+V+"]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.TextView";
						
						WebElement showMoreList = driver.findElement(By.xpath(linkXpath));
						String ttUsername = showMoreList.getText();
						System.out.println(ttUsername);
						llUserNames.add(ttUsername);
						if (Q%11 == 0) {
							
							Q = 2;
							
							scrollDown();
							try {
								Thread.sleep(2000);
							} catch (InterruptedException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
							scrollDown();
							try {
								Thread.sleep(3000);
							} catch (InterruptedException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
						}
						X++;
						Q++;
						
					}
					TouchAction action = new TouchAction(driver);
					
					String linkXpath = "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.LinearLayout/androidx.viewpager.widget.ViewPager/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout[10]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.TextView";
					
					
					WebElement ele =  driver.findElement(By.xpath(linkXpath));
					//scrollDown();
					
					
					
					System.out.println("Done");
					
					
					
					

					/*
				
					int Q = 0;
					int Y = 250;
					try {
						Thread.sleep(4000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					while (Q<13) {
						//String Search = "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.LinearLayout/androidx.viewpager.widget.ViewPager/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout["+Q+"]/android.widget.LinearLayout/android.widget.LinearLayout";
						//WebElement parseSuggested = driver.findElement(By.xpath(Search));
						touchAction.tap(PointOption.point(500, Y)).perform();
						try {
							Thread.sleep(3000);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						
						WebElement ttParseUsername = driver.findElement(By.id("com.zhiliaoapp.musically:id/e58"));
						String ttUsername = ttParseUsername.getText();
						WebElement followers1= driver.findElement(By.id("com.zhiliaoapp.musically:id/av7"));
						String followerCheckSuggested = followers1.getText();
						boolean isFoundMSuggested= followerCheckSuggested.contains("M");
						boolean isFoundKSuggested= followerCheckSuggested.contains("K");
						if (isFoundMSuggested) {
							followerCheckSuggested = followerCheckSuggested.replaceAll("M", "");
							System.out.println(followerCheckSuggested);
							llUserNames.add(followerCheckSuggested);
							llM.add(followerCheckSuggested);
						
							
							
						}
						if (isFoundKSuggested) {
							followerCheckSuggested = followerCheckSuggested.replaceAll("K", "");
							System.out.println(followerCheckSuggested);
							float x = Float.parseFloat(followerCheckSuggested);
							if (x>100) {
								llUserNames.add(followerCheckSuggested);
								llK.add(x);}
								}
					
						System.out.println(llK);
						System.out.println(llM);
						driver.navigate().back();
						try {
							Thread.sleep(3000);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						Q++;
						Y += 100;
						*/
			}
public static void InfluencerScrapingMethods() throws MalformedURLException {
	runTikTok();
	String[] ttHandle;
	ttHandle = pullFromCSV("/Users/gabe/Desktop/TTNames.csv");
	LinkedList<String> outputTTHandle;
	
	for (String x: ttHandle) {
	searchProfile(x);
	outputTTHandle = gatherSuggested();
	writeToCSV(outputTTHandle, "SuggestedList.csv");
	}
}
				
			
			
			
	 //com.zhiliaoapp.musically:id/e5r
   
}


