package salesforce;

import static utilities.GetEnv.dotenv;

public enum UserDate {
    USERNAME(dotenv.get("USERNAME_VALUE")),
    PASSWORD(dotenv.get("PASSWORD_VALUE")),
    URL_PERSONAL(dotenv.get("URL_PERSONAL"));

    private String value;

    UserDate(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
