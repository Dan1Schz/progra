public class Figuras 
{
  public void imprimirFigura1(int n)
    {
        
        for (int i = 0; i < n; i++) 
        {
            
            for (int j = 0; j < n; j++) 
                System.out.print("*");
            
            System.out.println();
            
        }
    }
    

    public void imprimirFigura2(int n) 
    {
        
        for (int i = 1; i <= n; i++) 
        {
            
            for (int j = 0; j < i; j++) 
                System.out.print("*");
            
            System.out.println();
            
        }
    }
    

    public void imprimirFigura3(int n) 
    {
        
        for (int i = n; i > 0; i--) 
        {
            
            for (int j = 0; j < i; j++) 
                System.out.print("*");
            
            System.out.println();
            
        }
    }
    

    public void imprimirFigura4(int n) 
    {
        for (int i = 1; i <= n; i++) 
        {
 
            for (int j = 0; j < n - i; j++) 
                System.out.print(" ");

            for (int j = 0; j < i; j++) 
                System.out.print("*");
            
            System.out.println();
        }
    }
    

    public void imprimirFigura5(int n) 
    {
        for (int i = n; i > 0; i--) 
        {

            for (int j = 0; j < n - i; j++) 
                System.out.print(" ");

            for (int j = 0; j < i; j++) 
                System.out.print("*");
            
            System.out.println();
        }
    }

    
}

