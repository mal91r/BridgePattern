public class News implements WebPage {
    protected Theme theme;

    public News(Theme theme) {
        this.theme = theme;
    }

    @Override
    public String getContent() {
        return "Page: News\tTheme: " + theme.getColour();
    }
}
