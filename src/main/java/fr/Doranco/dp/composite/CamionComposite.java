package fr.Doranco.dp.composite;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CamionComposite implements IComposant{
	
	Collection <Composant> children;
	
	 public CamionComposite() {
	        this.children = new ArrayList<>();
	        
	    }

	    public void add(Composant composant) {
	    	int nbreRemoques = 0;
	    	if(composant instanceof Tracteur) {
	    		for(Composant tracteurExistant : children) {
	    			if(tracteurExistant instanceof Tracteur) {
	    				throw new IllegalArgumentException("On ne peut avoir qu'un tracteur par camion");
	    			}
	    		}
	    		
	    	}
	    	
	    	if(composant instanceof Remorque) {
	    		for(Composant remorque : children) {
	    			if(remorque instanceof Remorque) {
	    				 nbreRemoques += 1 ;
	    				 if(nbreRemoques >= 2) {
	    					 throw new IllegalArgumentException("Vous avez atteint le maximum de remoques possible");
	  
	    				 }
	    			}
	    		}
	    	}
	    	
	        this.children.add(composant); 
	    }

	    public void remove(Composant composant) {
	    	if(this.children.isEmpty() ) {
	    		System.out.println("Le camion ne dispose plus de composants");
	    	}
	    	
	        this.children.remove(composant); 
	    }

	    public Collection<Composant> getChildren() {
	        return this.children;
	    }
	

	@Override
	public int getPoids() {
		int result = 0;
		for(Iterator<Composant> i = children.iterator(); i.hasNext();) {
			Object object = i.next();
			
			Composant composant = (Composant)object;
			
			result += composant.getPoids();
		}
		return result ;
	}

	
	
	
}
