package Day7;

import java.util.Arrays;
import java.util.Iterator;

public class Sequence implements Iterable{

	int default_size = 10;
	Object[] array= new Object[default_size];
	int count=0;
	void add(Object o) throws Exception
	{
	
		if(count<default_size)
			array[count++]=o;
		else
		throw new Exception("Size Exceeded");
		/*	int i=0;
		for(i=0;i<array.length;i++)
		{
			if(array[i]!=null)
				array[i]=o;
			
			
		}
		
		if(i>(default_size/2))
				{
			default_size*=2;
			Object[] temp=Arrays.copyOf(array, default_size);
			array=temp;
				}
*/
	}
	
	Object get(int idx)
	{
		return array[idx];
	}
	
	int size()
	{
	/*	int count=0;
		while(array[count++]!=null)
		{
			continue;
		}
		*/
		return count;
	}

	@Override
	public Iterator iterator() {
		
		return new SequenceIterator();
	}
	
	public class SequenceIterator implements Iterator{

		
		int progress=0;
		
		@Override
		public boolean hasNext() {
			
			if(progress<count)
			 return true;
			else
			 return false;
		}

		@Override
		public Object next() {
			
			return array[progress++];
		}
		
		@Override
		public void remove(){
			throw new UnsupportedOperationException("");
		}
		
	}
	
}
