
public class Dictionnaire {
	
	public int nbMots = 0;
	private MotDict[] dict;
	private String nom;
	
	public Dictionnaire(int taille, String nom)
	{
		this.nom = nom;
		nbMots = taille;
		dict = new MotDict[taille];
	}
	
	public void AjouterMot(MotDict mot)
	{
		for(int i = 0; i < nbMots; i++)
		{
			if(dict[i] == null /*&& (dict[i].getMot().compareTo(mot.getMot()) == 1))*/)
			{
				
				dict[i] = mot;
				
				return;
			}
			
		}
		

	}
	
	public void SupprimerMot(MotDict mot)
	{


		for(int i =0; i < nbMots;  i++)
		{

			if(dict[i].Synonyme(mot))
			{
				for(int j = i+1; j < nbMots; j++, i++)
				{
					dict[i] = dict[j];

				}
				
				nbMots --;
				
				return;
			}
			
		}
	}
	public void ListerDictionnaire()
	{
		for(int i = 0; i< nbMots; i++ ) {
			if(dict[i]!= null)
			{
				System.out.println(i + "-----------------------");
				System.out.println("Mot: " + dict[i].getMot()  + "\nDefinition: " + dict[i].getDefinition());
				
			}
			

		}
	}
	public int NombreSynonyme(MotDict mot)
	{
		int nbMotsSynonyme = 0;
		for(int i = 0; i < nbMots; i++)
		{
			if(dict[i] != null)
			{
				if(dict[i].Synonyme(mot) )
				{
					nbMotsSynonyme ++;
				}
			}

		}
		return nbMotsSynonyme;
	}
	public void Triee()
	{
		for(int i = 0; i < nbMots; i++)
		{
			if((dict[i] != null) && (dict[i+1]!= null))
			{
				char ch1 = dict[i].getMot().charAt(0);
				char ch2 = dict[i+1].getMot().charAt(0);
				MotDict temp = new MotDict();
				
				if((int)ch1 > (int)ch2)
				{
					temp = dict[i+1];
					dict[i+1] = dict[i];
					dict[i] = temp;
				}
			}

		}
	}
	public static void main(String[] args) {
			
		Dictionnaire diction =  new Dictionnaire(5, "LaRousse") ;
		MotDict mot1 = new MotDict("A", "Premier etc");
		MotDict mot2 = new MotDict("D", "Deuxieme test");
		MotDict mot3 = new MotDict("C", "Troisieme test");
		MotDict mot4 = new MotDict("B", "Quatrieme test");


		//Ajout des mots
		diction.AjouterMot(mot1);
		diction.AjouterMot(mot2);
		diction.AjouterMot(mot3);
		diction.AjouterMot(mot4);


		diction.ListerDictionnaire();
		
		diction.SupprimerMot(mot2);
		
		//Affichage de tout les mots
		diction.ListerDictionnaire();
		
		
		/*System.out.println("============================================");
		
		//Triee le tableau
		System.out.println("============================================");
		diction.Triee();
		diction.ListerDictionnaire();


		//Suppression du deuxieme mot
		diction.SupprimerMot(mot2);
		System.out.println("============================================");

		//Affichage de tout les mots
		diction.ListerDictionnaire();
		System.out.println("============================================");
		//Affichage des nombres de synonymes
		System.out.println("Nombre de synonyme: " + diction.NombreSynonyme(mot3));*/
		

		
	}

}
