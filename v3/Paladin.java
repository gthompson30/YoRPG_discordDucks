public class Paladin extends Protagonist {
	public Paladin() {
		_name = "Generic Paladin";
		_hitPts = 3;
		_strength = 9;
		_defense = 2;
		_attack = 4.0;
	}

	public Paladin( String name ) {
		this();
		_name = name;
	}
}
