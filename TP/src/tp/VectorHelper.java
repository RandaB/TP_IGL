-/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp;

import java.util.*;

/**
 *<b>VectorHelper est une classe conetant un vecteur de 'taille' de nombres entiers classés dans une liste </b>
 * <br><p>Cette classe assure plusieurs opérations sur ce vecteur tel que : son trie, son inversion, la founie de son min et max,...etc</p>
 * @author pc
 */


public class VectorHelper {
	
	 /**
    *La taille du vecteur. Cette taille est donnée par l'utilisateur
    * 
    * @see VectorHelper#get_taille()
    */
    	private int taille;
	
	/**
    *La liste des nombres constituant le vecteur
    *@see VectorHelper#get_table()
    */
	private ArrayList<Integer> val  ;
	
		
    /**
     *<b>Constructeur VectorHelper</b>
     * <br><p>A la construction d'un objet VectorHelper, la taille du vecteur
     * est fixée a 'a' (donnée par l'utilisateur).De plus, la liste des nombres 
     * des vecteurs est crée vide.
     * </p>
     * 
     * @param a
     *          la taille du vecteur
     *      * @param b
     *          la liste des entiers du vecteur
     * @param b
     * @see VectorHelper#taille
     * @see VectorHelper#val
     */
	
	public VectorHelper(int a) {
		// TODO Auto-generated constructor stub
		taille=a;
		this.val=new ArrayList<Integer>();
        }
                
	
/**
     *Retourne la taille du vecteur 
     * 
     * @return La taille du vecteur
     */
	public int get_taille()
	{
		return this.taille;
	}
	
	
 /**
     *Retourne la table des nombres du vecteur
     * @return Le vecteur
     */
	public ArrayList<Integer> get_table()
	{
		return this.val;
	}
	
	
	  /**
     *Change la valeur d'un entier dans un vecteur
     * @param ind
     *          La position de la valleur à changer dans le vecteur
     * @param v
     *          La nouvelle valeur changé
     */
	public void chang_val(int ind,Integer v)
	{
		val.set(ind, v);
	}
	
	
		
    /**
     *Ajoute une nouvelle valleur au vecteur et augmente sa taille
     * @param v
     *          La valleur à ajouter dans le vecteur
     */
	
	public void ajout_val(Integer v)
	{
		val.add( v);
		taille++;
	}
		
	
    /**
     *Trie le vecteur
     * 
     */
             public void trier(){
            int a,i=val.size()-1;
            
          while (i>0){
              for(int j=1;j<i;j++){
                //  System.out.println(val.get(i)); 
                  if(val.get(j-1)>val.get(j)){
                      a=val.get(j-1);
                      val.set(j-1,val.get(j));
                      val.set(j,a);
                       
                  }
              }
              i--;
            }
            for( i=0;i<val.size();i++){
                System.out.println(val.get(i));           }
        }	
	
	   /**
     *Retourne le minimum du vecteur
     * @return
     *          Le min du vecteur
     * 
     */
	
	public Integer min ()
	{int z;
		if (taille>0)
		{z=val.get(0);
		for (int i=1;i<taille;i++)
		{
			if (val.get(i)<z)
			{
				z=val.get(i);
			}
			
		}
		}else {z=-1;}
		return z;
	}
	
        
        /**
     *Retourne le maximum du vecteur
     * @return
     * 
     *          Le max du vecteur
     */
        	public Integer max ()
	{int z;
		if (taille>0)
		{z=val.get(0);
		for (int i=1;i<taille;i++)
		{
			if (val.get(i)>z)
			{
				z=val.get(i);
			}
			
		}
		}else {z=-1;}
		return z;
	}



	
	 /**
     *Inverse le vecteur 
     */
         public VectorHelper inverser()

	
	{Integer a;
		for(int i=0;i<(taille/2);i++)
		{
			a=val.get(i);
			val.set(i, val.get(taille-i));
			val.set(taille-i, a);
		}
		return this;

	}       
	
	
	 /**
     *Somme deux vecteurs 
     * @param v1
     *          Le vecteur à sommer avec le vecteur de cette classe
     * @return La somme des deux vecteurs 
     * @throws EqualException Si les tailles des deux vecteurs sont différentes
     */
	public VectorHelper somme(VectorHelper  v1)  throws EqualException          
	{Integer a=0;VectorHelper v=new VectorHelper(v1.get_taille());
	if(this.taille==v1.get_taille())
	{
		for (int i=0;i<v1.get_taille();i++)
		{
			a=this.get_table().get(i)+v1.get_table().get(i);
			v.ajout_val(a);
		}
	}else
	{
		throw new equalException ();
	}
		return v;
	}

	
	
	
    /**
     *Applique la formule sur vecteur
     */

public void formule ()
	{Integer a;
		for (int i=0;i<taille;i++)
		{
			a=val.get(i)*2;
			val.set(i, a);
		}
	}
}

