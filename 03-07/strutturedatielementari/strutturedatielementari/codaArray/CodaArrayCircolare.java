package codaArray;

import java.util.Arrays;

import asdlab.libreria.Eccezioni.EccezioneStrutturaVuota;
import asdlab.libreria.StruttureElem.Coda;

public class CodaArrayCircolare implements Coda {

	  private Object[] buffer; // Array di oggetti
	  private int head;		     // Dequeuing index
	  private int tail;		     // Enqueuing index
	  private int size;		     // Numero di elementi nella coda

	  public CodaArrayCircolare(int max) { 
		  buffer = new Object[max];
		  head = tail = size = 0; 
		  }
	  
	  @Override
	  public boolean isEmpty() { return (size==0); }

	  @Override
	  public Object first() throws EccezioneStrutturaVuota{ 
	    if (size == 0) throw new EccezioneStrutturaVuota("Coda vuota");
	    else return buffer[head]; 
	  }
	  
	  @Override
	  public void enqueue(Object o) {
		  if (size == buffer.length) 
		       throw new EccezioneArrayPieno("Coda piena");
		    buffer[tail] = o;
		    tail =(tail+1) % buffer.length;
		    size++;	
	  }


	  @Override
	  public Object dequeue() {
		
		  if (size == 0) throw new EccezioneStrutturaVuota("Coda vuota");
		    Object res = buffer[head];
		    head =(head+1) % buffer.length;
		    size--;
		    return res;
	  }

	@Override
	public String toString() {
		return "CodaArrayCircolare [buffer=" + Arrays.toString(buffer)
				+ ", head=" + head + ", tail=" + tail + ", size=" + size + "]";
	}

}
