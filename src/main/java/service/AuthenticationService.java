package service;

import exception.AuthenticationException;
import model.Driver;

public interface AuthenticationService {
    Driver login(String login, String password) throws AuthenticationException;
}
