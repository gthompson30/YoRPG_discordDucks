public class Character {
	public int health;
	public int strength;
	public int defense;
	public int attackRating;
	
	public int damage;
	
	public boolean isAlive() {
		return health > 0;
	}
	
	public int getDefense() {
		return defense;
	}
	
	public void lowerHP(int hp) {
		health -= hp;
	}

	public void attack(Character ch) {
		damage = (strength * attackRating) - ch.getDefense();
	}
}
