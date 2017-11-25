import java.util.List;

public class Error extends Item{
    protected Error(String description, String selector, String host, int port, List<String> extra) {
        super(description, selector, host, port, extra);
    }

    public Items.Type getType() { return Items.Type.Error; }
}
