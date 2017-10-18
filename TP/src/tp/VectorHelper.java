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
		
	
        
        
        
        
        
    
}
