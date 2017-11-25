import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;

public class File extends Item {
    protected File(String description, String selector, String host, int port) {
        super(description, selector, host, port, null);
    }

    public Items.Type getType() { return Items.Type.File; }

    public InputStream getInputStream() throws IOException {
        return new Socket(getHost(), getPort()).getInputStream();
    }
}
