
public class OutputObject
{
	public int estimate, numNodes;
	public BoardPosition b;
	public String toString()
	{
		return 	"BoardPosition:\t\t\t" + b + "\n" +
				"Positions Evaluated:\t" + numNodes + "\n" +
				"MINIMAX estimate:\t\t" + estimate;
	}
}
