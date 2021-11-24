public class Ogre extends Monster {
	public Ogre() {
		super();
		_name = "Shrek";
		_hitPts = 5;
		_strength = 5;
		_defense = 2;
		_attack = 8.0;
	}

	public Ogre( String name ) {
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
