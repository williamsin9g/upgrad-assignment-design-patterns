package com.upgrad.patterns.Authentication;

public class BasicAuthProvider extends AuthenticationProvider {
    private String userName;
    private String password;

    public BasicAuthProvider(String userName, String password) {
        this.userName = "Testing";
        this.password = "Testing";
    }

    @Override
    public boolean Authenticate() {
        return "Testing".equals(userName) && "Testing".equals(password);
    }
}
