package fcu.iecs.oop.pokemon;

public class Psyduck extends Pokemon {

	@Override
	public void attack() {
		System.out.println("Aqua Tail...");

	}

	public Psyduck(String name, PokemonType type, int cp) {
		super(name, type, cp);
	}
	

}
