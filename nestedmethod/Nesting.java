class Nesting{ 
    int m,n;
    Nesting(int x, int y){ 
        m=x;
        n=y;
    }
    int largest(){ 
    if(m>n)
       return(m);
    else
        return(n);
    }

    int smallest(){ 
        if(m<n)
          return(m);
        else
            return(n);
        }

    void display(){
    int large= largest(); 
    System.out.println("Largest ="+large); 
    int small= smallest();
    System.out.println("Smallest ="+small);
   }
}
class Nest{
    public static void main(String args[]){ 
        Nesting n=new Nesting(20,30);
        n.display();
    }
}
