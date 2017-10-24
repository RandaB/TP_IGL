/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp_01;

import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author pc
 */
public class VectorHelperTest {
    
    /**
     *
     */
    public VectorHelperTest() {
    }
    
    /**
     *
     */
    @BeforeClass
    public static void setUpClass() {
    }
    
    /**
     *
     */
    @AfterClass
    public static void tearDownClass() {
    }
    
    /**
     *
     */
    @Before
    public void setUp() {
    }
    
    /**
     *
     */
    @After
    public void tearDown() {
    }





   

    /**
     * Test of trier method, of class VectorHelper.
     */
    @Test
    public void testTrier() {
        System.out.println("trier");
      ArrayList<Integer> s=new ArrayList<Integer>();
      s.add(2);
      s.add(1);
      s.add(10);
      s.add(5);
      VectorHelper instance=new VectorHelper(4,s);
      instance.trier();boolean b=true;int i=0,j;
      while (i<3 && b==true)
      {
          for (j=i+1;j<3;j++)
          {
              if (instance.get_table().get(i)>instance.get_table().get(j))
              {
                  b=false;
              }
          }
          i++;
      }
      assertFalse("the case is a prototype",b==false);
      
    }

    /**
     * Test of somme method, of class VectorHelper.
     * @throws java.lang.Exception
     */
    @Test //(expected =EqualException.class)
    public void testSomme() throws Exception {
        System.out.println("somme");
        ArrayList<Integer> s=new ArrayList<Integer>();
      s.add(2);
      s.add(1);
      s.add(10);
      s.add(5);
       ArrayList<Integer> z=new ArrayList<>();
      z.add(1);
      z.add(8);
      z.add(2);
      z.add(7);
      VectorHelper instance=new VectorHelper(4,s);
      VectorHelper instance2=new VectorHelper(4,z);
            ArrayList<Integer> resultat=new ArrayList<Integer>();
                  resultat=instance.somme(instance2);boolean b=true;int i=0;
      while (i<4 && b==true)
      {
          if(resultat.get(i)!=instance.get_table().get(i)+instance2.get_table().get(i))
          {
                          System.out.println(z.get(i));
              b=false;
            }
          i++;
      }
      assertFalse("the case is a prototype",b==false);
    
    }

    /**
     * Test of inverser method, of class VectorHelper.
     */
    @Test
    public void testInverser() {
        System.out.println("inverser");
          ArrayList<Integer> s=new ArrayList<Integer>();
      s.add(2);
      s.add(1);
      s.add(10);
      s.add(5);
       ArrayList<Integer> z=new ArrayList<Integer>();
      z.add(2);
      z.add(1);
      z.add(10);
      z.add(5);
      VectorHelper instance=new VectorHelper(4,s);

      instance.inverser();boolean b=true;int i=0;
      while (i<2 && b==true)
      {
          if(instance.get_table().get(i)!=z.get(3-i))
          {
                          System.out.println(z.get(i));
              b=false;
            }
          i++;
      }
      
         assertFalse("the case is a prototype",b==false);
    }

    /**
     * Test of min method, of class VectorHelper.
     */
    @Test
    public void testMin() {
       System.out.println("Test Min");
         ArrayList<Integer> s=new ArrayList<Integer>();
      s.add(2);
      s.add(1);
      s.add(10);
      s.add(5);
      VectorHelper instance=new VectorHelper(4,s);
      int min=instance.min();boolean b=true;int i=0;
      while (i<4 && b==true)
      {
          if(min>instance.get_table().get(i))
          {
              b=false;
          }
          i++;
      }
      
          assertFalse("the case is a prototype",b==false);
    }

    /**
     * Test of max method, of class VectorHelper.
     */
    @Test
    public void testMax() {
        System.out.println("max");
           ArrayList<Integer> s=new ArrayList<Integer>();
      s.add(2);
      s.add(1);
      s.add(10);
      s.add(5);
      VectorHelper instance=new VectorHelper(4,s);
      int max=instance.max();boolean b=true;int i=0;
      while (i<4 && b==true)
      {
          if(max<instance.get_table().get(i))
          {
              b=false;
          }
          i++;
      }
      
            assertFalse("the case is a prototype",b==false);
    }

    /**
     * Test of formule method, of class VectorHelper.
     */
    @Test
    public void testFormule() {
        System.out.println("formule");
         System.out.println("max");
           ArrayList<Integer> s=new ArrayList<Integer>();
      s.add(2);
      s.add(1);
      s.add(10);
      s.add(5);
          ArrayList<Integer> z=new ArrayList<Integer>();
      z.add(2);
      z.add(1);
      z.add(10);
      z.add(5);
      VectorHelper instance=new VectorHelper(4,s);
     instance.formule();boolean b=true;int i=0;
      while (i<4 && b==true)
      {
          if(instance.get_table().get(i)!=z.get(i)*2)
          {
              b=false;
          }
          i++;
      }
      
           assertFalse("the case is a prototype",b==false);
    }
    
}
