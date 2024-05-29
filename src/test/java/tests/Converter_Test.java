package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import utils.Temperature_Converter;

public class Converter_Test {


    @Test
    public void testConvertTemperature() {
        Assert.assertEquals(Temperature_Converter.convertTemperature(0, "celsius", "fahrenheit"), 32.0);
        Assert.assertEquals(Temperature_Converter .convertTemperature(100, "celsius", "fahrenheit"), 212.0);
        Assert.assertEquals(Temperature_Converter .convertTemperature(32, "fahrenheit", "celsius"), 0.0);
        Assert.assertEquals(Temperature_Converter .convertTemperature(100, "fahrenheit", "celsius"), 37.77777777777778);
        Assert.assertEquals(Temperature_Converter .convertTemperature(273.15, "kelvin", "celsius"), 0.0);
        Assert.assertEquals(Temperature_Converter .convertTemperature(373.15, "kelvin", "celsius"), 100.0);
    }
}
