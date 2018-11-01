
public class Champions {
	
		private float health;
		private float armour;
		private String name ;
		
		private static float xp ;
		
		public Champions()
		{
			
		}
		
		public Champions (float health, float armour, float xp)
		{
			this.health = health;
			this.armour = armour;
			this.xp = xp;
		}
		public Champions(String name)
		{
			this.name = name;
		}
		public float getHealth()
		{
			return health;
		}
		public String getName()
		{
			return name;
		}
		public void setHealth(float health)
		{
			this.health = health;
		}
		
		public void Punch()
		{
			//Punch other players
		}
		
		public void CastSpell(float damage)
		{
			//Will cast spell
			health -= damage;
			
		}
}