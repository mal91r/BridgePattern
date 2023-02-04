public class Main {
    public static void main(String[] args) {
        Theme darkTheme = new DarkTheme();
        Theme lightTheme = new LightTheme();
        Theme aquaTheme = new AquaTheme();
        WebPage news = new News(darkTheme);
        WebPage market = new Market(lightTheme);
        WebPage contacts = new Contacts(aquaTheme);
        System.out.println(news.getContent());
        System.out.println(market.getContent());
        System.out.println(contacts.getContent());
    }
}