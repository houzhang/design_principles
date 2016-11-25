public class Main {

    public static void main(String[] args) {

        Document xmlDocument = new XmlDocument(new JsonParser());
        xmlDocument.print();

        Document jsonDocument = xmlDocument.parse();
        jsonDocument.print();
    }
}