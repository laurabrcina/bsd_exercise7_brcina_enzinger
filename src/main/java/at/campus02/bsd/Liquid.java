package at.campus02.bsd;
/**
 * Represents a liquid that can be used in drinks
 */
public class Liquid {

    private String name;
    private double volume;
    private double alcoholPercent;

    /**
     * Creates a Liquid object with the given name, volume, and alcohol percentage
     *
     * @param name           The name of the liquid
     * @param volume         The volume of the liquid in liters
     * @param alcoholPercent The alcohol volume percent (e.g., 42)
     */
    public Liquid(String name, double volume, double alcoholPercent) {
        this.name = name;
        this.volume = volume;
        this.alcoholPercent = alcoholPercent;
    }

    /**
     * Gets the name of the liquid
     *
     * @return The name of the liquid
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the name of the liquid.
     *
     * @param name The name of the liquid.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Returns the volume of the liquid.
     *
     * @return The volume of the liquid in liters.
     */
    public double getVolume() {
        return volume;
    }

    /**
     * Sets the volume of the liquid.
     *
     * @param volume The volume of the liquid in liters.
     */
    public void setVolume(double volume) {
        this.volume = volume;
    }

    /**
     * Returns the alcohol volume percent of the liquid.
     *
     * @return The alcohol volume percent.
     */
    public double getAlcoholPercent() {
        return alcoholPercent;
    }

    /**
     * Sets the alcohol volume percent of the liquid.
     *
     * @param alcoholPercent The alcohol volume percent.
     */
    public void setAlcoholPercent(double alcoholPercent) {
        this.alcoholPercent = alcoholPercent;
    }
}
