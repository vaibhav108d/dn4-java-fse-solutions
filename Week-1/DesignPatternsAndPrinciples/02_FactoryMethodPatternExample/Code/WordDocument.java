//Concrete class for Word docs
public class WordDocument implements Document {
    public void open() {
        System.out.println("Opening a Word document.");
    }
    public void close() {
        System.out.println("Closing a Word document.\n");
    }

    public void save() {
        System.out.println("Saving a Word document.");
    }

    public String getFileType() {
        return "Word Document";
    }
}