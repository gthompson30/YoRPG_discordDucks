public class Goblin extends Monster {
	public Goblin() {
		super();
		_name = "gr33nb0y";
		_hitPts = 3;
		_strength = 4;
		_defense = 8;
		_attack = 5.0;
	}

	public Goblin( String name ) {
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
