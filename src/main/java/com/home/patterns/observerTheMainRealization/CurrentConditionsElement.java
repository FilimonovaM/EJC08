package com.home.patterns.observerTheMainRealization;

public class CurrentConditionsElement implements Observer, DisplayElements {
    private float temperature;
    private float humidity;
    private float pressure;

    /**
     *uses to update weather information.
     *
     * @param temperature - is a new temperature
     * @param humidity - is a new humidity
     * @param pressure - is a new pressure
     */
    @Override
    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        display();
    }

    /**
     *uses to show new values of pressure, temperature & humidity.
     *
     */
    @Override
    public void display() {
        System.out.println("---CURRENT CONDITIONS:---\n" + temperature + "C degrees.\n" + humidity + " percents of humidity\n"
                + pressure + " mm. of pressure");
    }
}
