
public class MyClass {
	
		//Attributs
		private String name;
		private float health;
		public float mana;
		
		private float armour;
		
		private float xp;
		private int level;
		
		//Constructeurs
		public MyClass(float health, float xp, int level)
		{
			this.health = health;
			this.xp = xp;
			this.level = level;
		}
		
		
		//Getter et setter
		public void setName(String name)
		{
			this.name = name;
		}
		public void setMana(float mana)
		{
			this.mana = mana;
		}
		
		public float getHealth()
		{
			return health;
		}
		
		public void CastSpell()
		{
			mana -= 10f;
		}


}
