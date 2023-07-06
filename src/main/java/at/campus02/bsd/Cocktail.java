package at.campus02.bsd;

import java.util.List;

/**
 * Represents a cocktail, which is a type of drink composed of multiple ingredients.
 */
public class Cocktail extends Drink {
    private List<Liquid> ingredients;

    /**
     * Creates a Cocktail object with the given name and ingredients.
     *
     * @param name        The name of the cocktail.
     * @param ingredients The list of ingredients in the cocktail.
     */
    public Cocktail(String name, List<Liquid> ingredients) {
        super(name);
        this.ingredients = ingredients;
    }

    /**
     * Returns the total volume of the cocktail.
     *
     * @return The volume of the cocktail in liters.
     */
    @Override
    public double getVolume() {
        double volume = 0.0;
        for (Liquid ingredient : ingredients) {
            volume += ingredient.getVolume();
        }
        return volume;
    }

    /**
     * Returns the average alcohol percentage of the cocktail.
     *
     * @return The average alcohol volume percent of the cocktail.
     */
    @Override
    public double getAlcoholPercent() {
        double alcoholPercent = 0.0;
        for (Liquid ingredient : ingredients) {
            alcoholPercent += ingredient.getAlcoholPercent();
        }
        return alcoholPercent / ingredients.size();
    }

    /**
     * Determines if the cocktail is alcoholic or not.
     *
     * @return true if the cocktail contains any alcoholic ingredient, false otherwise.
     */
    @Override
    public boolean isAlcoholic() {
        for (Liquid ingredient : ingredients){
            if (ingredient.getAlcoholPercent() > 0){
                return true;
            }
        }
        return false;
    }

    /**
     * Returns the name of the cocktail.
     *
     * @return The name of the cocktail.
     */
    public String getName(){return name;}

    /**
     * Sets the name of the cocktail.
     *
     * @param name The name of the cocktail.
     */
    public void setName(String name){this.name = name;}

    /**
     * Prints the information of the cocktail, including its name, alcohol percentage,
     * and list of ingredients.
     */
    public void printCocktailInformation(){
        System.out.println("Cocktail name is: " + getName());
        System.out.println("Alcohol Percent is: " + getAlcoholPercent());
        System.out.println("List of ingredients is: ");
        for (Liquid ingredient : ingredients){
            System.out.printf("|%7s|\n", ingredient.getName());
        }
    }
}
