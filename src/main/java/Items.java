import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

final class Items {
    public static enum Type {
        // RFC-1436 defined types
        File, Directory, CSO_PhoneBook,
        Error, BinHex, DOSBinary, UNIXFile,
        IndexSearch, Telnet, Binary,

        // Gopher+ defined types

        Other
    }

    static Item parseLine(String line) {
        char type = line.charAt(0);
        String[] parts = line.substring(1).split("\t");
        String descr = parts[0], seltr = parts[1], host = parts[2];
        int port = Integer.parseInt(parts[3]);
        List<String> extra = new ArrayList<>(parts.length > 4 ? parts.length - 4 : 0);
        for (int i = 4; i < parts.length; i++)
            extra.add(parts[i]);

        switch (type) {
            case '0':   return new File(descr, seltr, host, port);
            case '1':   return new Directory(descr, seltr, host, port);
            case '3':   return new Error(descr, seltr, host, port, extra);

            // otherwise
            default:    return new Other(descr, seltr, host, port, extra);
        }
    }
}
