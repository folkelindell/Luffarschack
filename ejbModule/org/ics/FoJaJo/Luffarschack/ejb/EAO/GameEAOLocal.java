package org.ics.FoJaJo.Luffarschack.ejb.EAO;

import javax.ejb.Local;

import org.ics.FoJaJo.Luffarschack.ejb.entities.*;

@Local
public interface GameEAOLocal {
	public void createGame(Game game);
	public Game findGame(long id);
	public void updateGame(Game game);
	public void deleteGame(long id);
}
