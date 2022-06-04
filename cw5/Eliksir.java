package PGO_12c.cw5;

import java.util.ArrayList;
import java.util.List;

public class Eliksir {

    private String name;
    private boolean isCreated;
    private int power;
    private List<Ingredient> ingredients = new ArrayList<>();
    private Liquid catalyst;

    public Eliksir(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null || name.isEmpty()) {
            throw new RuntimeException("Elixir must have a name.");
        } else {
            this.name = name;
        }
    }

    public boolean isCreated() {
        return isCreated;
    }

    public int getPower() {
        if (isCreated == false) {
            throw new RuntimeException("Cannot check the power.");
        } else {
            return power;
        }
    }

    public List<Ingredient> getIngredients() {
        return ingredients;
    }

    public void setIngredients(List<Ingredient> ingredients) {
        this.ingredients = ingredients;
    }

    public Liquid getCatalyst() {
        return catalyst;
    }

    public void setCatalyst(Liquid catalyst) {
        if (isCreated == true) {
            throw new RuntimeException("Elixir is already done.");
        } else {
            this.catalyst = catalyst;
        }
    }

    public void addIngredient(Ingredient toAdd) {
        if (isCreated == true) {
            throw new RuntimeException("Elixir is already done.");
        } else {
            ingredients.add(toAdd);
        }
    }

    public void removeIngredient(Ingredient toRemove) {
        if (isCreated == true) {
            throw new RuntimeException("Elixir is already done.");
        } else {
            ingredients.remove(toRemove);
        }
    }

    public void Create() {
        if (ingredients.isEmpty()) {
            throw new RuntimeException("No ingredients addad.");
        } else if (catalyst == null) {
            throw new RuntimeException("No catalyst added.");
        } else {
            isCreated = true;
            for (Ingredient i : ingredients) {
                power += i.getReagent();
            }
            power /= catalyst.getReagent();
        }
    }

    @Override
    public String toString()
    {
        return name + getIngredients();
    }
}
