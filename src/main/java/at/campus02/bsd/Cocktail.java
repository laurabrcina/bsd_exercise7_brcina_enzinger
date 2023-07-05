package at.campus02.bsd;

import java.util.List;

public class Cocktail extends Drink {
    private String name;
    private List<Liquid> ingredients;

    public Cocktail(String name, List<Liquid> ingredients) {
        super(name);
        this.ingredients = ingredients;
    }

    @Override
    public double getVolume() {
        double volume = 0.0;
        for (Liquid ingredient : ingredients) {
            volume += ingredient.getVolume();
        }
        return volume;
    }

    @Override
    public double getAlcoholPercent() {
        double alcoholPercent = 0.0;
        for (Liquid ingredient : ingredients) {
            alcoholPercent += ingredient.getAlcoholPercent();
        }
        return alcoholPercent / ingredients.size();
    }

    @Override
    public boolean isAlcoholic() {
        for (Liquid ingredient : ingredients){
            if (ingredient.getAlcoholPercent() > 0){
                return true;
            }
        }
        return false;
    }

    public String getName(){return name;}

    public void setName(String name){this.name = name;}

    public void printCocktailInformation(){
        System.out.println("Cocktail name is: " + getName());
        System.out.println("Alcohol Percent is: " + getAlcoholPercent());
        System.out.println("List of ingredients is: ");
        for (Liquid ingredient : ingredients){
            System.out.printf("|%7s|\n", ingredient.getName());
        }
    }
}
