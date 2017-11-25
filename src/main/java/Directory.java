import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
import java.nio.charset.StandardCharsets;
import java.util.stream.Stream;

public class Directory extends Item {
    Directory(String description, String selector, String host, int port) {
        super(description, selector, host, port, null);
    }

    public Items.Type getType() { return Items.Type.Directory; }

    public Stream<Item> getItems() throws IOException{
        Socket socket = new Socket(getHost(), getPort());
        socket.getOutputStream().write((getSelector() + "\r\n").getBytes(StandardCharsets.UTF_8));
        BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        socket.close();
        return br.lines().map(Items::parseLine);
    }
}
