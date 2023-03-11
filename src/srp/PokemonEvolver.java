package srp;

public class PokemonEvolver {
    public void evolve(Pokemon pokemon) {
        //가져와서 레벨 업
        pokemon.setLevel(pokemon.getLevel() + 1);
        System.out.println("레벨 up!");
        //포켓몬 이볼버 클래스와 포켓몬 클래스는 디펜던시 관계(의존 관계)
    }
}
