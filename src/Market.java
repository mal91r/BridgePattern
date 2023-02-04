import java.lang.reflect.Member;

public class Market implements WebPage {
    protected Theme theme;

    public Market(Theme theme) {
        this.theme = theme;
    }

    @Override
    public String getContent() {
        return "Page: Content\tTheme: " + theme.getColour();
    }
}
