package ocp;

public class Charizard extends Pokemon {
    public Charizard(String name, int level, int hp) {
        super(name, level, hp);
        System.out.println("리자몽~~~");
    }

    @Override
    public void attack() {
        System.out.println(getName() + "이(가) 화염방사를 사용합니다.");
    }

    @Override
    public void evolve() {
        hp += 60;
        level++;
        System.out.println(getName() + "이 레벨 "+level+"으로 Up, 체력은 "+hp+"으로 증가");
    }
}
