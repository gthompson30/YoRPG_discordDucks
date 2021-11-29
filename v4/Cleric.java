public class Cleric extends Protagonist {
        String _name;
        int _hitPts, _strength, _defense;
        double _attack;

	public Cleric() {
		_name = "Generic Cleric";
		_hitPts = 3;
		_strength = 7;
		_defense = 3;
		_attack = 5.0;
	}

	public Cleric( String name ) {
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
