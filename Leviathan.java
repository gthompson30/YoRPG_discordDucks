public class Leviathan extends Monster {
	public Leviathan() {
		_name = "Thomas Hobbes";
		_hitPts = 10;
		_strength = 5;
		_defense = 3;
		_attack = 7.0;
	}

	public Leviathan( String name ) {
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
