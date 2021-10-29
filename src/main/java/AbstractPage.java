public abstract class AbstractPage {
    static String url;
    static String title;

    public void goTo() {
        Browser.goTo(url);
    }
}
