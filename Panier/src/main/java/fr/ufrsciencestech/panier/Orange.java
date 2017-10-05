package fr.ufrsciencestech.panier;

import java.util.IllegalFormatException;

/**
 *
 * @author ah154489
 */
public class Orange {
    private double Prix;
    private String Origine;
    
    public Orange(double Prix,String Origine) throws OrangeException
    {
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
    
    public String getOrigine()
    {
        return this.Origine;
    }
    
    public void setPrix(double P) throws OrangeException
    {
        try
        {
            if(P>0)
                this.Prix=P;
            else
            {
                System.out.println("ErreurPrix");
                throw new OrangeException("Mauvais prix");
            }
        }
        catch(NumberFormatException e){
            throw new OrangeException("Mauvaise rentrée");
        }
    }
     
    public void setOrigine(String O) throws OrangeException
    {
        try{
            if(!O.equals("")||!O.equals(null))
                this.Origine=O;
        
            else
            {
                System.out.println("ErreurOrigine");
                throw new OrangeException("Mauvaise Origine");
            }
        }
        catch(IllegalFormatException e)
        {
            throw new OrangeException("Mauvaise rentrée");
        }
    }
    
    public boolean equals(Orange c)
    {
        return (this.Prix==c.getPrix()&&this.Origine.equals(c.getOrigine()));
    }
   
    public String toString(){
        return "Prix : "+Prix+" Origine : "+Origine;
    }
}
