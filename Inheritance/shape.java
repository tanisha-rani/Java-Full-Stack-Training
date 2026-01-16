// package Inheritance;
public class shape{
    String category="Triangle";
}
public class Triangle extends shape{
    int sides=3;
    Triangle(){

    }
    Triangle( int sides){
        public void display(){
            System.out.println("catogory of shape: "+super.catogory);
            System.out.println("No of sides are: "+ this.sides);
        }
    }

}
public class RightTriangle{
    int largestangle=90;
    RightTriangle(){

    }
    RightTriangle(int largestangle){
        public void show(){
        System.out.println("catogory of shape: "+super.catogory);
        System.out.println("No of sides are: "+ super.sides);
        System.out.println("largest angle is "+this.largestangle);
        }
    }
    public static void main(String [] args){
        RightTriangle t=new RightTriangle();
        t.show();
    }
    
}