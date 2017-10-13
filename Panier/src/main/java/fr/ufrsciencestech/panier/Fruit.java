package fr.ufrsciencestech.panier;

import java.util.IllegalFormatException;

public class Fruit {
    public double Prix;
    public String Origine;
    
    public Fruit(String Origine,double prix) throws FruitException
    {
        try
        {
            setOrigine(Origine);
        }
        catch(NumberFormatException e)
        {
            System.out.println("Erreur Creation Orange");
        }
    }    
    
    public String getOrigine()
    {
        return this.Origine;
    }
     
    public void setOrigine(String O) throws FruitException
    {
        try{
            if(!O.equals("")||!O.equals(null))
                this.Origine=O;
        
            else
            {
                System.out.println("ErreurOrigine");
                throw new FruitException("Mauvaise Origine");
            }
        }
        catch(IllegalFormatException e)
        {
            throw new FruitException("Mauvaise rentrée");
        }
    }
    
    public boolean equals(Fruit c)
    {
        return (this.Prix==c.Prix&&this.Origine.equals(c.getOrigine()));
    }
   
    public String toString(){
        return "Prix : "+Prix+" Origine : "+Origine;
    }
}
