import java.util.List;

public class Other extends Item{
    protected Other(String description, String selector, String host, int port, List<String> extra) {
        super(description, selector, host, port, extra);
    }

    public Items.Type getType() { return Items.Type.Other; }
}
