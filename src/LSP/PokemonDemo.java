package LSP;

interface Pokemon {
    public void attack(); // abstract 자동 생략
}

class FirePokemon implements Pokemon {
    @Override
    public void attack() {
        System.out.println("불 속성 공격 성공");
    }

}

class WaterPokemon implements Pokemon {
    //미구현
    @Override
    public void attack() {
        System.out.println("물 속성 공격 성공");

    }
}

class ElectricPokemon implements Pokemon {
    @Override
    public void attack() {
        System.out.println("전기 속성 공격 성공!");
        //throw new UnsupportedOperationException("전기 공격이 아직 완성되지 않았습니다.");
    }

}
class Trainer{
    public void attackPokemon(Pokemon pokemon){
        pokemon.attack();
    }
}

public class PokemonDemo{
    public static void main(String[] args) {
        Trainer trainer = new Trainer();
        trainer.attackPokemon(new FirePokemon());
        trainer.attackPokemon(new WaterPokemon());
        trainer.attackPokemon(new ElectricPokemon());
    }
}