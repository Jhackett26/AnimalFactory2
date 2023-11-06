public class Main {
    public static void main(String[] args) {
        Main myFactory =new Main();
    }
    public Main(){

        Animal squirrel;
        squirrel = new Animal(true, "red",1);
        squirrel.printInfo();

        System.out.println(' ');
        Animal deer;
        deer = new Animal(false,"brown",6);
        deer.printInfo();

    }
}