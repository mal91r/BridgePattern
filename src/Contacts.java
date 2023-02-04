public class Contacts implements WebPage {
    Theme theme;

    public Contacts(Theme theme) {
        this.theme = theme;
    }

    @Override
    public String getContent() {
        return "Page: Contacts\tTheme: " + theme.getColour();
    }
}
