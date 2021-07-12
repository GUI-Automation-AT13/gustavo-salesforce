package utilities;

public enum Browser {
    CHROME("CHROME", "\\thirdparty\\windows\\chrome\\chromedriver.exe","webdriver.chrome.driver");

    private String path;
    private String browser;
    private String browserKey;


    private Browser(String browser, String path, String browserKey) {
        this.browser = browser;
        this.path = path;
        this.browserKey=browserKey;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getBrowser() {
        return browser;
    }

    public void setBrowser(String browser) {
        this.browser = browser;
    }

    public String getBrowserKey() {
        return browserKey;
    }

    public void setBrowserKey(String browserKey) {
        this.browserKey = browserKey;
    }
}
