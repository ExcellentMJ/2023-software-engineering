package ocp;

public class PokemonGame {
    public static void main(String[] args) {
        Pikachu pikachu = new Pikachu("귀요미전기쥐", 5, 20);
        Charizard charizard = new Charizard("미친용가리", 67, 300);

        pikachu.attack();
        charizard.attack();
        pikachu.evolve();
        charizard.evolve();
    }
}
