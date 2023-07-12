package service;

import dao.DriverDaoImpl;
import exception.AuthenticationException;
import java.util.Optional;
import lib.Injector;
import lib.Service;
import model.Driver;

@Service
public class AuthenticationServiceImpl implements AuthenticationService {
    private static final Injector injector = Injector.getInstance("taxi");
    private final DriverDaoImpl driverDao
            = (DriverDaoImpl) injector.getInstance(DriverDaoImpl.class);

    @Override
    public Driver login(String login, String password) throws AuthenticationException {
        Optional<Driver> driver = driverDao.findByDriverLogin(login);
        if (driver.isPresent() && driver.get().getPassword().equals(password)) {
            return driver.get();
        }
        throw new AuthenticationException("Login or password was incorrect");
    }
}
