public class Wizard extends Protagonist {
        /*String _name;
        int _hitPts, _strength, _defense;
        double _attack;*/

	public Wizard() {
		super();
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
                return "Similar to the cleric, but optimizes strength instead of attack. The wizard is strong in his/her ability to cast spells, has a fair attack damage, but has little hp or defense.";
        }
}
