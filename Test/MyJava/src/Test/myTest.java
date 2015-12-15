package Test;

/**
 * 内部类是否能继承
 * @author Administrator
 *
 */
class WithInner 
{  
    class Inner 
    {  
        Inner()
        {  
           System.out.println("this is a constructor in WithInner.Inner");  
        };  
    }  
}  
   
public class myTest extends WithInner.Inner 
{  
    // ! InheritInner() {} // Won’t compile  
    myTest(WithInner wi) 
    {  
        wi.super();  
        System.out.println("this is a constructor in InheritInner");  
    }  
   
    public static void main(String args) 
    {  
        WithInner wi = new WithInner();  
        myTest ii = new myTest(wi);  
    }  
}  