public class Cat {
    private String name;
    private int age;

    public Cat(){
        this.name = "unkown";
        this.age = 0;
    }
    public String getname(){
        return name;
    }
    public int getage(){
        return age;
    }
    public static void main(String[] arg){
        Cat myCat = new Cat();
        System.out.println(myCat.getname());
        System.out.println(myCat.getage());
    }
}
