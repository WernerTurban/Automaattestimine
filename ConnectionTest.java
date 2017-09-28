import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.net.HttpURLConnection;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by Shelative on 27.09.2017.
 */
class ConnectionTest {
    @Test
    public void testSuccessfulConnection() {
        try {
            String url ="";
            HttpURLConnection con = (HttpURLConnection) url.openConnection();
            assertEquals(con.getResponseCode(), 200);
        }
        catch (IOException e) {
            e.printStackTrace();
            fail("Fail");
        }
    }

}