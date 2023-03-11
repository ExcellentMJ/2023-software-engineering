package ocp;

public class Pikachu extends Pokemon {
    public Pikachu(String name, int level, int hp) {
        // 부모 생성자를 불러서 그걸로 처리
        super(name, level, hp);
        System.out.println("삐까삐까! ><");
    }

    @Override
    public void attack() {
        System.out.println(getName() + "이(가) 100만볼트를 사용합니다.");
    }

    @Override
    public void evolve() {
        hp += 30;
        level++;
        System.out.println(getName() + "이 레벨 "+level+"으로 Up, 체력은 "+hp+"으로 증가");
    }
}
