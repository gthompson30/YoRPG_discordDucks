public class Wizard extends Protagonist {
        /*String _name;
        int _hitPts, _strength, _defense;
        double _attack;*/

	public Wizard() {
		super();
		_name = "Harry";
		_hitPts = 30;
		_strength = 90;
		_defense = 20;
		_attack = 40.0;
	}

	public Wizard( String name ) {
		this();
		_name = name;
	}

        public String about() {
                return "Similar to the cleric, but optimizes strength instead of attack. The wizard is strong in his/her ability to cast spells, has a fair attack damage, but has little hp or defense.";
        }
}
