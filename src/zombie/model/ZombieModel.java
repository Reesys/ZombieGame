package zombie.model;

public class ZombieModel
{
	private String player;
	private char left;
	private String dialog;
	private String death;
	private String win;
	private int health;

	public ZombieModel()
	{

	}

	public ZombieModel(String gamer, char leftTurn, String messages, String hasDied, String hasWon, int hp)
	{
		this.player = gamer;
		this.left = leftTurn;
		this.dialog = messages;
		this.death = hasDied;
		this.win = hasWon;
		this.health = hp;
	}

	public String getPlayer()
	{
		return player;
	}

	public char getLeft()
	{
		return left;
	}

	public String getDialog()
	{
		return dialog;
	}

	public String getDeath()
	{
		return death;
	}

	public String getWin()
	{
		return win;
	}

	public int health()
	{
		return health;
	}

	public void setPlayer(String gamer)
	{
		this.player = gamer;
	}

	public void setLeft(char leftTurn)
	{
		this.left = leftTurn;
	}

	public void setDialog(String messages)
	{
		this.dialog = messages;
	}

	public void setDeath(String hasDied)
	{
		this.death = hasDied;
	}

	public void setWin(String hasWon)
	{
		this.win = hasWon;
	}

	public void setHealth(int hp)
	{
		this.health = hp;
	}

}
