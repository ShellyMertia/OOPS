 # Final Keyword
 Can be used with:
1. Attribute  : attribute value will constant once the object it created.
 - we can't un-initialized or default initialization not possible.
2. Methods : can't override
- override not possible
3. Classes : can't extend it/ can't have any child classes
- extend is not possible
4. Constructor :
5. Block :

       public class User {
       //private final String galaxy ; // milk way galaxy
       //this will give error since the final variable is not initialized
       private final Strig galacy = " Milk Way ";
       
       }

  or 
  
    public class User {
     private final String galaxy ; // milk way galaxy

     public User(String galaxy) {
        this.galaxy = galaxy;
     }
    }

Once a object is created that data won't be allowed to be changed.