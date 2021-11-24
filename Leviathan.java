public class Leviathan extends Monster {
	public Leviathan() {
		super();
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
		return "The all-powerful creature, with epic hit points and great attack. Moderately strong, but Leviathan's tragic insecurity is an inability to defend itself.";
        }
}
