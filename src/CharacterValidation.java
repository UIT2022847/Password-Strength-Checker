
class CharacterValidation
{
<<<<<<< HEAD
    public static boolean hasUpper(String input){

        boolean flag=false;
        int i;
        for(i=0, i<input.length(), )



        return flag;
    } 
=======
    public static boolean hasSpecialCharacter(String password)
    {
        boolean hasSpecialCharacter=false;

        for(char ch: password.toCharArray())
        {
            if(!Character.isLetterOrDigit(ch))
            {
                hasSpecialCharacter=true;
                break;
            }
        }
        return hasSpecialCharacter;
    }
>>>>>>> a73a1857612a7a5784c5d139a2a7c4800b7b5227
}