public class CharacterValidation
{
    boolean upperCase=false;  
    boolean lowerCase=false;

    public boolean hasUpper(String input){
        int i;
        for(i=0; i<input.length(); i++)
        {
            if(Character.isUpperCase(input.charAt(i)))
            {
                upperCase=true;
            }
        }

        return upperCase;
    }
    
    public boolean hasLower(String input){

        int i;
        for(i=0; i<input.length(); i++)
        {
            if(Character.isLowerCase(input.charAt(i)))
            {
                lowerCase=true;
            }

        }
        
        return lowerCase;
    }

    public boolean hasUpperLower(String input)
    {
        boolean uC = hasUpper(input);
        boolean lC = hasLower(input);
        if(uC==true && lC==true)
        {
            return true;
        }
        return false;
    }

    // public static void main(String[] args)
    // {
    //     CharacterValidation charValObj = new CharacterValidation();
    //     System.out.println(charValObj.hasUpperLower("hi"));
    //     System.out.println(charValObj.hasUpperLower("Hello"));
    //     System.out.println(charValObj.hasUpperLower("bYe"));
    // }    
}
