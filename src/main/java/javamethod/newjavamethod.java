package javamethod;

public class newjavamethod {
    int i, count=0;
    void display()
    {
        for(i=0;i<=1000;i++){
            if(i%23==0)
            {
                System.out.println(i);
                count++;
            }
        }
        System.out.println("count of numbers divisible by 23 is "+count);
    }
    public static void main(String[] args){
        newjavamethod obj = new newjavamethod();
        obj.display();
    }
}
