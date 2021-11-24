public class Cleric extends Protagonist {
        /*String _name;
        int _hitPts, _strength, _defense;
        double _attack;*/

	public Cleric() {
		super();
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
                return "A skilled tradesman at healing, giving him great strength! HOWEVER, he is also able to make poisonous potions and therefore has moderate attack. He is trash at all else.";
        }
}
