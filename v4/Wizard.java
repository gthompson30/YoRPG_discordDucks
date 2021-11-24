public class Wizard extends Protagonist {
        String _name;
        int _hitPts, _strength, _defense;
        double _attack;

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

        public String about() {
                String out = "";    
                out += "-----------------\n";
                out += " Name: " + _name + "\n";
                out += " Hit Points: " + _hitPts + "\n";
                out += " Strength: " + _strength + "\n";
                out += " Defense: " + _defense + "\n";
                out += " Attack: " + _attack + "\n";
                out += "-----------------\n";
                return out;
        }
}
