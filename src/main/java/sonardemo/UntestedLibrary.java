package sonardemo;

public class UntestedLibrary {
    boolean headerCalled = false;
    public String getHeader() {
        //System.out.println("DEBUG");
        headerCalled=true;
        return "Nice Header";
    }

    @Override
    public String toString() {
        if(headerCalled) {
            return super.toString();
        } else {
            return null;
        }
    }
}
