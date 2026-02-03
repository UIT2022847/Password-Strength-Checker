class LengthValidation {
    final int MIN_LENGTH = 8;
    public boolean isValidLength(String password) {
        return password.length() >= MIN_LENGTH;
    }
}