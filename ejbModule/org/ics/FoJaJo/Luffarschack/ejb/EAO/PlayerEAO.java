package org.ics.FoJaJo.Luffarschack.ejb.EAO;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.ics.FoJaJo.Luffarschack.ejb.entities.Player;

/**
 * Session Bean implementation class PlayerEAO
 */
@Stateless
public class PlayerEAO implements PlayerEAOLocal {

	 @PersistenceContext(unitName="Luffarschack")
	 private EntityManager em;

    public PlayerEAO() {
        // TODO Auto-generated constructor stub
    }

	public Player findPlayer(String username) {
		return em.find(Player.class, username);
	}

	public void createPlayer(Player player) {
		em.persist(player);
	}

	public void updatePlayer(Player player) {
		em.merge(player);
	}

	public void deletePlayer(String username) {
		Player p = this.findPlayer(username);
		if(p != null) {
			em.remove(p);
		}
	}

	public List<Player> getTopPlayers() {
		//om denna inte fungerar kolla NamedQueryn efter DESC i queryn
		TypedQuery<Player> tq = em.createNamedQuery("Player.getTopPlayers", Player.class);
		tq.setFirstResult(0);
		tq.setMaxResults(5);
		
		List<Player> list = tq.getResultList();
		return list;
	}

}
