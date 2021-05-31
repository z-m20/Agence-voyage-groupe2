package com.lip6.daos;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import org.springframework.stereotype.Repository;

import com.lip6.entities.Reservation;
import com.lip6.util.JpaUtil;


@Repository("RepoReservation")
public class DAOReservation implements IDAOReservation {
	//static private Map<String, Reservation> reservationContentProvider= new HashMap<>();
	/*
	public static Map<String, Reservation> getReservationContentProvider() {
		return reservationContentProvider;
	}

	public static void addReservationtoContentProvider(Reservation reservation) {
		reservationContentProvider.put(Long.toString(reservation.getId()),reservation);
	}
*/
	@Override
	public boolean addReservation(Reservation reservation) {
		try {
			EntityManager em = JpaUtil.getEmf().createEntityManager();
			EntityTransaction tx = em.getTransaction();
			tx.begin();
			em.persist(reservation);
			/*addReservationtoContentProvider(reservation);
			System.out.println(Arrays.asList(reservationContentProvider));*/
			tx.commit();
			em.close();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

}
