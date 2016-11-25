public class XmlDocument implements Document {

    private Parser parser;

    public XmlDocument(Parser parser) {
        this.parser = parser;
    }

    public void print() {
        System.out.println("I'm Xml document");
    }

    public Document parse() {
        return this.parser.parse(this);
    }
}