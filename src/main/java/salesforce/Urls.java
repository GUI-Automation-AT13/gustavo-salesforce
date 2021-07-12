package salesforce;

public enum Urls {
    PATH("https://www.salesforce.com/mx/?ir=1"),
    WORK_TYPE_LIGHTNING(UserDate.URL_PERSONAL.getValue() +
            "/lightning/o/WorkType/list?filterName=00B5e00000CELgSEAX"),
    WORK_TYPE_CLASSIC(UserDate.URL_PERSONAL.getValue() + "/08q/o");


    private String value;

    Urls(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
