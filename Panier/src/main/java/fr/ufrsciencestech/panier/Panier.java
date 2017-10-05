/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.ufrsciencestech.panier;
import java.util.ArrayList;
/**
 *
 * @author ah154489
 */
public class Panier {
    private int Contenance;
    private ArrayList listProd;
    
    public Panier(int cont){
        this.setContenance(cont);
    }

    public int getContenance() {
        return Contenance;
    }

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
