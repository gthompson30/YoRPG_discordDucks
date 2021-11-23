public class Wizard extends Protagonist {
	public Wizard() {
		_name = "Harry";
		_hitPts = 3;
		_strength = 9;
		_defense = 2;
		_attack = 4.0;
	}

	public Wizard( String name ) {
		this();
		_name = name;
	}
}
