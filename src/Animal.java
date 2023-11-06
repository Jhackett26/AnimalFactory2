public class Animal {

    //var declarations
    public boolean isFast;
    public String color;
    public int size;

    public Animal(boolean paramSpeed, String paramCol, int paramSize){
        isFast = paramSpeed;
        size = paramSize;
        color = paramCol;

    }
    public void printInfo(){
        if (isFast == true){
            System.out.println("the animal is fast");
        }
        else{
            System.out.println("the animal is not fast");
        }
        System.out.println(color);
        System.out.println(size+"ft");
    }

}
