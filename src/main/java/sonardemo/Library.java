package sonardemo;

public class Library {
    public boolean someLibraryMethod() {
        return true;
    }

    public String getGreeting(String lang) {
        switch (lang) {
            case "en_US":
                return "Hello World";
            case "sv_SE":
                return "Hej Världen";
            default:
                throw new IllegalArgumentException("Unsupported language");
        }

    }

}
