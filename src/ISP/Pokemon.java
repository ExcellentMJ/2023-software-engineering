package ISP;

public interface Pokemon {
    void attack();
    void defend();
    void fly();
    void swim();


}


class Pikachu implements AttackablePokemon{
    // violate ISP
    // 날지못하는 피카츄도 날아야함.

    @Override
    public void attack() {
        System.out.println("10만 볼트 공격 성공");
    }

    @Override
    public void defend() {
        System.out.println("방어 성공!");
    }
}
