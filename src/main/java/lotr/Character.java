package lotr;

public abstract class Character {
    protected int power;
    protected int hp;

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        if (hp < 0)
            hp = 0;
        this.hp = hp;
    }

    public int getPower() {
        return power;
    }

    public void decreasePower() {
        --power;
    }

    abstract public void kick(Character c);

    public boolean isAlive() {
        return hp > 0;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "{" +
                "hp=" + hp +
                ", power=" + power +
                '}';
    }
}
