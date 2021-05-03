public class Reading {
    private Time time;
    private double temperature;
    private double rainfall;

    Reading(Time time,
            double temperature,
            double rainfall) {
        this.time = time;
        this.temperature = temperature;
        this.rainfall = rainfall;


    }

    public double getTemp() {
        return this.temperature;
    }

    public double getRainfall() {
        return this.rainfall;
    }
}
