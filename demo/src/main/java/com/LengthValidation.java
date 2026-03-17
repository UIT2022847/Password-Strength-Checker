class LengthValidation {
    //generate random length between 8 to 12
    private static final int MIN_LENGTH = 8;
    public boolean isValidLength(String password) {
        return password.length() >= MIN_LENGTH;
    }
}