package dao;

import java.util.Optional;
import model.Driver;

public interface DriverDao extends GenericDao<Driver> {
    Optional<Driver> findByDriverLogin(String driverLogin);
}
