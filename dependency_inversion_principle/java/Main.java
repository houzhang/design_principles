public class Main {

    public static void main(String[] args) {

        DocumentPrinter printer = new DocumentPrinter();
        Document xmlDocument = new XmlDocument();

        printer.printDocument(xmlDocument);
    }
}