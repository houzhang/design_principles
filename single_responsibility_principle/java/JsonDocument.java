public class JsonDocument implements Document {

    private Parser parser;

    public JsonDocument() {}

    public JsonDocument(Parser parser) {
        this.parser = parser;
    }

    public void print() {
        System.out.println("I'm Json document");
    }

    public Document parse() {
        return this.parser.parse(this);
    }
}