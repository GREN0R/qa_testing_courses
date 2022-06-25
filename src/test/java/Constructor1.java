public class Constructor1{
    String studentName;
    int studentAge;
    //constructor
    Constructor1(String name, int age){
        studentName = name;
        studentAge = age;
    }
    void display(){
        System.out.println(studentName+ " "+studentAge);
    }
    public static void main(String args[])
    {
        Constructor1 myObj = new Constructor1("Grenor" , 32);
        myObj.display();
    }
}