package AppLaunch;

public class BrowserLaunch extends BrowserUtil{


	public BrowserLaunch(String browser, String URL) {
	//	super("chrome", "http://facebook.com");
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		BrowserLaunch bl = new BrowserLaunch(browser, URL);
		System.out.println("started execution");
		bl.browserLaunch(browser);
		bl.getURL(URL);
	   
		System.out.println(bl.getTitleName());
		
		System.out.println(bl.getCurrentUrl());
		//System.out.println(bl.getPageSource());
		bl.browserquit();
	}

}
