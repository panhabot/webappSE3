import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

public class mysessionlistener implements HttpSessionListener {
    int count = 0;
    @Override
    public void sessionCreated(HttpSessionEvent httpSessionEvent) {
        count++;
        System.out.println("A new session created....");
        System.out.println("Active session: "+count);
    }

    @Override
    public void sessionDestroyed(HttpSessionEvent httpSessionEvent) {
        count--;
        System.out.println("Session Destroyed....");
        System.out.println(count);
    }
}
