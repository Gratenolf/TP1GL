package fr.ufrsciencestech.panier;
import java.util.ArrayList;
import java.util.Iterator;
/**
 *
 * @author ah154489
 */
public class Panier {
    private int contenance;
    private ArrayList listProd;
    
    public Panier(int cont) throws OrangeException{
        try{
            System.out.println("try");
            if(cont>0){
                System.out.println("if");
                this.contenance = cont;
                listProd = new ArrayList();
            }
            else{
                System.out.println("erreur Contenance");
                throw new OrangeException("Panier non valide");
            }
        }
        catch(NumberFormatException e){
            throw new OrangeException("Panier non valide");
        }
    }

    public int getContenance() {
        System.out.println(""+this.contenance);
        return contenance;
    }
    
    public ArrayList getListProd() {
        return listProd;
    }
    
    public boolean estPlein(){
        if(listProd.size()==contenance)
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
