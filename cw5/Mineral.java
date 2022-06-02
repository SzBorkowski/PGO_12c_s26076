package PGO_12c.cw5;

class Mineral extends Ingredient {

    private int power;

    public Mineral(String name, int baseReagent, int power) {
        super(name, baseReagent);
        this.power = power;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    @Override
    public int getReagent() {
        return getBaseReagent() + power;
    }
}

class Ore extends Mineral {

    private boolean metallic;

    public Ore(String name, int baseReagent, int power, boolean metallic) {
        super(name, baseReagent, power);
        this.metallic = metallic;
    }

    public boolean isMetallic() {
        return metallic;
    }

    public void setMetallic(boolean metallic) {
        this.metallic = metallic;
    }

    @Override
    public int getReagent() {
        if (metallic == false) {
            return super.getReagent() - 2;
        } else {
            return super.getReagent();
        }
    }
 }

 class Crystal extends Mineral {

    private int magicPower;

     public Crystal(String name, int baseReagent, int power, int magicPower) {
         super(name, baseReagent, power);
         this.magicPower = magicPower;
     }

     public int getMagicPower() {
         return magicPower;
     }

     public void setMagicPower(int magicPower) {
         this.magicPower = magicPower;
     }

     @Override
     public int getReagent() {
        return super.getReagent() + magicPower;
    }
 }