/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.ufrsciencestech.panier;
import java.util.ArrayList;
import java.util.Iterator;
/**
 *
 * @author ah154489
 */
public class Panier {
    private int Contenance;
    private ArrayList listProd;
    
    public Panier(int cont){
        this.setContenance(cont);
        listProd = new ArrayList();
    }

    public int getContenance() {
        return Contenance;
    }

    /**
     * pas utile mais fait quand meme
     * @param Contenance 
     */
    public void setContenance(int Contenance) {
        if(Contenance>0)
            this.Contenance = Contenance;
        else
            System.out.println("erreur Contenance");
    }
    
    public boolean estPlein(){
        if(listProd.size()==Contenance)
            return true;
        return false;
    }
    
    public boolean estVide(){
        if(listProd.size()==0)
            return true;
        return false;
    }
    
    public void boycotteOrange(String ori){
        Iterator<Orange> it = listProd.iterator();
        while(it.hasNext()){
            Orange courante = it.next();
            if(courante.getOrigine().equals(ori))
                listProd.remove(courante);
            else
                System.out.println("Rien");
        }
    }
    
    public void ajoutOrange(Orange o) throws OrangeException
    {
        try
        {
            if(!estPlein())
                listProd.add(o);
            else
            {
                System.out.println("Panier plein");
                throw new OrangeException("Panier plein");
            }
        
        }
        catch(NumberFormatException e)
        {
            throw new OrangeException("Mauvaise rentrée");
        }
    }
    
    
    public String toString(){
        String s;
        s="contenance du Panier:";
        if(!estVide())
            for(int i=0;i<listProd.size();i++)
                s+=listProd.toString();
        else
            s+="Panier vide.";
        return s;
    }
}
