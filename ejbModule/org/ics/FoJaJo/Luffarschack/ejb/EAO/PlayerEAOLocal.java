package org.ics.FoJaJo.Luffarschack.ejb.EAO;

import java.util.List;

import javax.ejb.Local;

import org.ics.FoJaJo.Luffarschack.ejb.entities.Player;

@Local
public interface PlayerEAOLocal {
	
	public Player findPlayer(String username);
	public void createPlayer(Player player);
	public void updatePlayer(Player player);
	public void deletePlayer(String username);
	public List<Player> getTopPlayers();
	
}
