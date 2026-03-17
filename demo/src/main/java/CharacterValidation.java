
public class CharacterValidation
{
    public boolean hasUpperLower(String input) {
    boolean hasUpper = false;
    boolean hasLower = false;

    for (int i = 0; i < input.length(); i++) {
        char ch = input.charAt(i);

        if (Character.isUpperCase(ch)) {
            hasUpper = true;
        }
        if (Character.isLowerCase(ch)) {
            hasLower = true;
        }
    }

    return hasUpper && hasLower;
}
    // public static void main(String[] args)
    // {
    //     CharacterValidation charValObj = new CharacterValidation();
    //     System.out.println(charValObj.hasUpperLower("hi"));
    //     System.out.println(charValObj.hasUpperLower("Hello"));
    //     System.out.println(charValObj.hasUpperLower("bYe"));
    // }    
}
