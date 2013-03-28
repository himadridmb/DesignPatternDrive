package behavioral.tek.chainofresponsibility;

/* Chain of responsibility is a design pattern where a sender sends a request to a chain of objects, where the objects in 
 * the chain decide themselves who to honor the request. If an object in the chain decides not to serve the request, it 
 * forwards the request to the next object in the chain.*/

public interface Chain {

	public abstract void setNext(Chain nextInChain);

	public abstract void process(Number request);
}

/* There is a possibility where none of the node may serve the request
 * If the chain becomes too long there is a possibility of messing up the code*/
 