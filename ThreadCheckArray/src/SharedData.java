import java.util.ArrayList;

public class SharedData 
{
	private  ArrayList <Integer> array;
	private boolean [] winArray;
	private boolean flag;
	private final int b;
	

	public SharedData(ArrayList <Integer> array, int b) {
		this.array = array;
		this.b = b;
	}

	/**
	 * @return a winner array
	 *  **/
	public boolean[] getWinArray() 
	{
		return winArray;
	}

	/**
	 * @param winArray
	 **/
	public void setWinArray(boolean [] winArray) 
	{
		this.winArray = winArray;
	}

	/**
	 * @return array **/
	public ArrayList<Integer> getArray() 
	{
		return array;
	}

	/**
	 * @return value of b **/
	public int getB() 
	{
		return b;
	}
	/**
	 * @return value of flag **/
	public boolean getFlag() 
	{
		return flag;
	}

	/**
	 * @param flag
	 *  **/
	public void setFlag(boolean flag) {
		this.flag = flag;
	}

}
