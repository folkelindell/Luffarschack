package org.ics.FoJaJo.Luffarschack.ejb.EAO;

import java.util.List;

import javax.ejb.Local;

import org.ics.FoJaJo.Luffarschack.ejb.entities.Game;
import org.ics.FoJaJo.Luffarschack.ejb.entities.Move;
import org.ics.FoJaJo.Luffarschack.ejb.entities.Player;

@Local
public interface MoveEAOLocal {
	public List<Move> findMovesInGame(Game game);
	public List<Move> findMovesInGameByPlayer(Game game, Player player);
	public void createMove(Move move);
}
