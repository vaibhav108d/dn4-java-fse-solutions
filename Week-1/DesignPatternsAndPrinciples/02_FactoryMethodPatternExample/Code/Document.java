//Interface or abstract class for all documents
public interface Document {
    void open();
    void close();
    void save();
    String getFileType();
}
