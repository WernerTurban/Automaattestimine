import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


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
