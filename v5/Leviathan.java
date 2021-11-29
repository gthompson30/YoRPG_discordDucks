public class Leviathan extends Monster {
	public Leviathan() {
		super();
		_name = "Thomas Hobbes";
		_hitPts = 100;
		_strength = 50;
		_defense = 35;
		_attack = 75.0;
	}

	public Leviathan( String name ) {
		this();
		_name = name;
	}

        public String about() {
		return "The all-powerful creature, with epic hit points and great attack. Moderately strong, but Leviathan's tragic insecurity is an inability to defend itself.";
        }
}
