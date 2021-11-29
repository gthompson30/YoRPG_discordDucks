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
                return "Axx axx axx axx axx b tf max lgxtdr zhuebg, uxmvat atw mh nlx t Vtxltk'l Vbiaxk wxvhwxk mh lheox fx! B tf oxkr wxyxglbox, hdtr tm tmmtvd, unm phklx tm ai tgw lmkxgzma.";
        }
}
