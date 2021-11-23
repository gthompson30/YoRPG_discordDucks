public class Cleric extends Protagonist {
	public Cleric() {
		_name = "Generic Cleric";
		_hitPts = 3;
		_strength = 9;
		_defense = 2;
		_attack = 4.0;
	}

	public Cleric( String name ) {
		this();
		_name = name;
	}
}
