// Test class to demonstrate it works, Main class to run the example

public class DocumentFactoryTest {

    public static void main(String[] args) {
        DocumentFactory wordFactory=new WordDocumentFactory();
        Document wordDocument=wordFactory.createDocument();
        System.out.println(wordDocument.getFileType());
        wordDocument.open();
        wordDocument.close();

        DocumentFactory pdfFactory=new PdfDocumentFactory();
        Document pdfDocument=pdfFactory.createDocument();
        System.out.println(pdfDocument.getFileType());
        pdfDocument.open();
        pdfDocument.close();

        DocumentFactory excelFactory=new ExcelDocumentFactory();
        Document excelDocument=excelFactory.createDocument();
        System.out.println(excelDocument.getFileType());
        excelDocument.open();
        excelDocument.close();
        
    }
}