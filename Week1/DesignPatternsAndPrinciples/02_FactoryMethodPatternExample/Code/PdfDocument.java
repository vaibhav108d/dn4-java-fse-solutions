//Concrete class for PDF docs

public class PdfDocument implements Document {
    public void open() {
        System.out.println("Opening a PDF document.");
    }
    
    public void close() {
        System.out.println("Closing a PDF document.\n");
    }

    public void save() {
        System.out.println("Saving a PDF document.");
    }

    public String getFileType() {
        return "PDF Document";
    }
}