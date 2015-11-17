class ClassicDao {

public Ship getShip(String shipId) {
        TypedQuery<Ship> list = em.createNamedQuery("findShip",
                Ship.class).setParameter("shipId", shipId);
        List<Ship> shipList = list.getResultList();
        if (shipList.size() == 1) {
            return shipList.get(0);
        } else {
            return null;
        }
    }
    
}    
