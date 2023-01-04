package org.example;

public class CorrectFixedPasswordGenerator implements PasswordGenerator {
    @Override
    public String generatePassword() {
        return "asdfghjk"; //8글자
    }
}
