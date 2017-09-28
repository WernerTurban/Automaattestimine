import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by Shelative on 27.09.2017.
 */
class todaysWeatherTest {
    @Test
    public void testWeatherByCity() {
        try {
            weatherRequest request = new weatherRequest("Tallinn, EE, metric");
            CurrentWeatherReport report = repository.getCurrentWeather(request);
            assertEquals(report.cityName, request.cityName);
        }
        catch (Exception e) {
            ("failure " + e.getMessage());
        }
    }

}