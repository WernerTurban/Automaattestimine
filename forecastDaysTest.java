import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class forecastDaysTest {
    @Test
    public void weatherForecastByDays() {
        try {
            DailyForecast forecast = dailyForecastByCityName(Tallinn, 3);
            assertEquals("Tallinn", forecast.getCityInstance().getCityName());
            assertEquals(3, forecast.getCityInstance().getForecastCount());
        }
        catch (Exception e) {
            ("failure " + e.getMessage());
        }
    }

}
