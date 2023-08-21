package ait.user.model;

public class User {

//    В проекте User из домашней работы, исправить валидацию емейла так, чтобы валидный емейл с пробелами вначале и в конце исправлялся и проходил валидаци. Скорректировать тест
    private String email;
    private String password;

    public User(String email, String password) {
        setEmail(email);
        setPassword(password);
//        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
//      email = email.trim();
        if (emailIsValid(email)) {
            this.email = email.trim();
        } else {
            System.out.println(email + " is not valid");
        }

    }

    /*
    1) '@' - exist and only one -> Done
    2) '.' - min one dot after @ -> Done
    3) min two symbols after last dot -> Done
    4) alphabetic, digits, '@', '.', '_', '-' -> Done
     */
    private boolean emailIsValid(String email) {
        int at = email.indexOf('@');
        if (at == -1 || email.lastIndexOf('@') != at) {
            return false;
        }
        if (email.indexOf('.', at + 1) == -1) {
            return false;
        }
        if (email.lastIndexOf('.') >= email.length() - 2) {
            return false;
        }
        for (int i = 0; i < email.length(); i++) {
            char c = email.charAt(i);
            if (!(Character.isDigit(c) || Character.isAlphabetic(c) || c == '@' || c == '.' || c == '_' || c == '-')) {
                return false;
            }
        }
        return true;
    }

    public String getPassword() {
        return password;
    }

    /*
    TODO Homework
    1) Min 8 symbols --Done
    2) Min one symbol in uppercase
    3) Min one symbol in lowercase
    4) Min one symbol is digit
    5) Min one symbol is a special symbol (!%@*&)
     */
    public void setPassword(String password) {

        if (passwordIsValid(password)) {
            this.password = password;
        } else {
            System.out.println(password + " is not valid");
        }
    }
    public boolean passwordIsValid(String password) {
        for (int i = 0; i < password.length(); i++) {
            if (password.length() < 8) {
                System.out.println("Min 8 symbols");
                return false;
            }
        }
        int upperCase = 0;
        int lowerCase = 0;
        int digit = 0;
        int simb = 0;

        char[] ch = password.toCharArray();
        for(char chh : ch) {
            if(chh >='A' && chh <='Z') {
                upperCase++;
            } else if (chh >= 'a' && chh <= 'z') {
                lowerCase++;
            } else if(chh >= '0' && chh <= '9'){
                digit++;
            } else if((chh == '!') || (chh == '%') || (chh == '@') || (chh == '*') || (chh == '&')){
                simb++;
            } else {
                continue;
            }
        }

        if (upperCase == 0) {
            System.out.println("*** Min one symbol in uppercase ***");
            return false;
        } else if( lowerCase == 0){
            System.out.println("*** Min one symbol in lowercase ***");
            return false;
        } else if(digit == 0) {
            System.out.println("*** Min one symbol is digit ***");
            return false;
        } else if (simb == 0) {
            System.out.println("*** Min one symbol is a special symbol (!%@*&) ***");
            return false;
        }
        return true;
    }


    @Override
    public String toString() {
        return "User{" +
                "email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}