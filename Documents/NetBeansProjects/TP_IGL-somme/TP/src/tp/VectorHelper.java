/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp;

import java.util.*;

/**
 *
 * @author block
 */




public class VectorHelper {
    	private int taille;
	private ArrayList<Integer> val  ;
	
	
	
	public VectorHelper(int a) {
		// TODO Auto-generated constructor stub
		taille=a;
		this.val=new ArrayList<Integer>();
        }
                
	
	
	public int get_taille()
	{
		return this.taille;
	}
		
	public ArrayList<Integer> get_table()
	{
		return this.val;
	}
	
	
	
	public void chang_val(int ind,Integer v)
	{
		val.set(ind, v);
	}
	
	
	public void ajout_val(Integer v)
	{
		val.add( v);
		taille++;
	}
		
	
        	
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
   
	

}


