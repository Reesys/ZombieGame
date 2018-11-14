package zombie.controller;

import javax.swing.JOptionPane;

import zombie.model.ZombieModel;

public class ZombieController
{
	private ZombieModel user;

	public ZombieController()
	{
		user = new ZombieModel();
	}

	public void start()
	{
		gameStart();
	}

	public void gameStart()
	{
		JOptionPane.showMessageDialog(null, "Welcome to my Zombie Game. \n Here you will make various decisions to find a way\n to escape the zombie hord chasing you. \n Good Luck!");
	}
}
