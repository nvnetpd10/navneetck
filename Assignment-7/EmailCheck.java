class InvalidEmailException extends Exception {
    InvalidEmailException(String msg) { super(msg); }
}
class EmailCheck {
    static void validate(String email) throws InvalidEmailException {
        if (!email.contains("@")) throw new InvalidEmailException("Invalid email");
    }
    public static void main(String[] args) {
        try { validate("navneet.com"); }
        catch (InvalidEmailException e) { System.out.println(e.getMessage()); }
    }
}
