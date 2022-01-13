package fields;

import game.*;

public class Field_Start extends Field
{
	@Override
	public void landedOn(Player player)
	{
		player.deposite(4000);
		System.out.println("you landed on GO, recieve 4000");
	}
	/*
	Reasoning: if a player's original position is an array index is a greater number
	than the new index, that you mean that the player must have passed Start.
	If that condition is then met, the player will then recieve 4000 as a reward,
	according to the rules of the game.
	 */
	public void passStart(Player player){
		if(player.getPosition() < player.movePlayer(player.getPosition())){
			player.deposite(4000);
			System.out.println("you landed on GO, recieve 4000");
		}
		else{
			if(player.getPosition() < player.movePlayer(player.getPosition([19]))){
		/* nothing will happen - the player is going to jail - array index 19 is jail -
		and will not recieve those 4000 bucks.
		 */
			}
		}