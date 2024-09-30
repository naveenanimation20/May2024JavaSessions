package WebDriverArch;

public interface WebDriver {
	
	public void get(String url);
	
	public String getTitle();
	
	public void click(String element);
	
	public void sendKeys(String element, String value);
	
	public void close();
	
	
	default void getLogs() {
		System.out.println("get logs");
	}
	

}
