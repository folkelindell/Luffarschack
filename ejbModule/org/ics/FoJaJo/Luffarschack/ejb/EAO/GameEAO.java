package org.ics.FoJaJo.Luffarschack.ejb.EAO;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.ics.FoJaJo.Luffarschack.ejb.entities.Game;

/**
 * Session Bean implementation class GameEAO
 */
@Stateless
public class GameEAO implements GameEAOLocal {

	@PersistenceContext(unitName = "Luffarschack")
	private EntityManager em;

	public void createGame(Game game) {
		em.persist(game);
	}

	public Game findGame(long id) {
		return em.find(Game.class, id);
	}

	public void updateGame(Game game) {
		em.merge(game);
	}

	public void deleteGame(long id) {
		Game game = this.findGame(id);
		if (game != null) {
			em.remove(game);
		}
	}
	public List<Game> findAllGames(){
		TypedQuery<Game> tq = em.createNamedQuery("Game.findAllGames", Game.class);
		return tq.getResultList();
	}
	public List<Game> findAllOpenGames(){
		TypedQuery<Game> tq = em.createNamedQuery("Game.findAllOpenGames", Game.class);
		return tq.getResultList();
	}

	/**
	 * Default constructor.
	 */
	public GameEAO() {
		// TODO Auto-generated constructor stub
	}

	

}
