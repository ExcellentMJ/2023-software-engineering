package ISP;

public interface Pokemon {
    void attack();
    void defend();
    void fly();
    void swim();


}


class Pikachu implements Pokemon{
    // violate ISP
    // 날지못하는 피카츄도 날아야함.
    @Override
    public void attack() {

    }

    @Override
    public void defend() {

    }

    @Override
    public void fly() {

    }

    @Override
    public void swim() {

    }
}
