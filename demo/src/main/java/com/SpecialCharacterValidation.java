package com;
public class SpecialCharacterValidation{
    
    public boolean hasSpecialCharacter(String password)
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


}