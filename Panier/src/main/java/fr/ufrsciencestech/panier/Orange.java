package fr.ufrsciencestech.panier;

import java.util.IllegalFormatException;

public class Orange extends Fruit {
    
    public Orange(double Prix,String Origine) throws FruitException
    {
        super(Origine,Prix);
        try
        {
            setPrix(Prix);
            setOrigine(Origine);
        }
        catch(NumberFormatException e)
        {
            System.out.println("Erreur Creation Orange");
        }
    }
    
    public double getPrix()
    {
        return this.Prix;
    }
    
    public void setPrix(double P) throws FruitException
    {
        try
        {
            if(P>0)
                this.Prix=P;
            else
            {
                System.out.println("ErreurPrix");
                throw new FruitException("Mauvais prix");
            }
        }
        catch(NumberFormatException e){
            throw new FruitException("Mauvaise rentrée");
        }
    }
}
