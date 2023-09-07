package interfacedemo;

public interface WebDriver {
	
	// a method without a body is called as abstract methods
	
	public void maximise();
	
	public void get(String url);
	
	public void sendKeys(String text);
	
	public void click();
	
	public void select();
	
	public void getPageTitle();
	
	public void close();

}
