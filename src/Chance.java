public class Chance {
    private int chance;

    Chance(int chance){
        this.chance = chance;
    }

    @Override
    public boolean equals(Object obj){
        if (getClass() != obj.getClass()) return false;
        Chance otherChance = (Chance) obj;
        return this.chance == otherChance.chance;
    }

    @Override
    public int hashCode() {
        return this.chance;
    }

    public Chance opposite() {
        return new Chance(100-this.chance);
    }


}
