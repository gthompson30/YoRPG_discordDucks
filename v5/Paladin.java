public class Paladin extends Protagonist {
        /*String _name;
	int _hitPts, _strength, _defense;
	double _attack;*/

	public Paladin() {
		super();
		_name = "Generic Paladin";
		_hitPts = 100;
		_strength = 40;
		_defense = 20;
		_attack = 40.0;
	}

	public Paladin( String name ) {
		this();
		_name = name;
	}

	public String about() {
		return "An army leader, fierce and resilient. Has very high hitpoints, fair strength and attack, but tragically low defense.\n";
	}
}
