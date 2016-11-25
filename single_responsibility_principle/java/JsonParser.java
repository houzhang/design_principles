public class JsonParser implements Parser {

    public JsonParser() {}

    public Document parse(Document document) {
        return new JsonDocument();
    }
}