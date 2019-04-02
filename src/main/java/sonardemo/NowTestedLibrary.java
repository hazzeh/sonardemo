package sonardemo;

public class NowTestedLibrary {
    boolean headerCalled = false;
    public String getHeader() {
        headerCalled=true;
        return "Nice Header";
    }

    @Override
    public String toString() {
        if(headerCalled) {
            return super.toString();
        } else {
            return "";
        }
    }
}
