//Concrete class for Excel docs

public class ExcelDocument implements Document {
    public void open() {
        System.out.println("Opening an Excel document.");
    }
    
    public void close() {
        System.out.println("Closing an Excel document.\n");
    }

    public void save() {
        System.out.println("Saving an Excel document.");
    }

    public String getFileType() {
        return "Excel Document";
    }
}