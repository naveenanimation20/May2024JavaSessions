package EncapsulationConcept;

public class Browser {

	public void launchBrowser() {
		System.out.println("launching browser");
		checkRAMSize();
		checkBrowserUpdates();
		checkBrowserPolicy();
		verifyStorage();
		System.out.println("chrome is launched");
	}

	private void checkRAMSize() {
		System.out.println("checkRAMSize");
	}

	private void checkBrowserUpdates() {
		System.out.println("checkBrowserUpdates");
	}

	private void verifyStorage() {
		System.out.println("verifyStorage");
	}

	private void checkBrowserPolicy() {
		System.out.println("checkBrowserPolicy");
	}

}



