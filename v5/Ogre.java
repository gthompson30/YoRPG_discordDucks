public class Ogre extends Monster {
	public Ogre() {
		super();
		_name = "Shrek";
		_hitPts = 5;
		_strength = 5;
		_defense = 2;
		_attack = 9.0;
	}

	public Ogre( String name ) {
		this();
		_name = name;
	}

        public String about() {
                return "I AM A BIG GIANT OGRE AND I WILL KILL YOUUUUU. It was hard not to make a shrek joke with my name. I have very strong attack, fine hp and strength, but lower defense, similarly to the Leviathan.";
        }
}
