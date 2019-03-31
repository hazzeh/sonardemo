package sonardemo;

import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSession;
import java.util.logging.Level;
import java.util.logging.Logger;

public class BadCode {

    public void toBeRemoved() {

        HostnameVerifier hostnameVerifier = new HostnameVerifier() {
            @Override
            public boolean verify(String requestedHost, SSLSession remoteServerSession) {
                return true;
            }
        };
        Logger.getAnonymousLogger().log(Level.FINE, hostnameVerifier.toString());
    }

    public String doAStupidList() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 5; i++) {
            switch (i) {
                case 0:
                    sb.append("zero");
                case 1:
                    sb.append("one");
                case 2:
                    sb.append("two");
                case 3:
                    sb.append("three");
                case 4:
                    sb.append("four");
                    break;
                default:
                    sb.append(", ");
            }
        }
        return sb.toString();
    }
}
