import java.util.List;

public abstract class Item {
    Items.Type type;
    String description;
    String selector;
    String host;
    int port;
    List<String> extras;

    public Item(String description, String selector, String host, int port, List<String> extras) {
        this.type = type;
        this.description = description;
        this.selector = selector;
        this.host = host;
        this.port = port;
        this.extras = extras;
    }

    public String getDescription() { return description; }
    public String getSelector() { return selector; }
    public String getHost() { return host; }
    public int getPort() { return port; }
    public List<String> getExtras() { return extras; }

    abstract public Items.Type getType();
}
