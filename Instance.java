 /*2)Write a Java program to create a class named Student with two
  instance variables: name and rollNo. Initialize them using a parameterized
   constructor and display their values..*/
 class Stud {
    String name;
    int rollno;
    Stud(String name, int rollno){
        this.name = name;
        this.rollno = rollno;     
    }
    void show(){
        System.out.println("Name:"+ name);
        System.out.println("rollno:"+ rollno);
    }
    public static void main(String[]args){
        Stud s1 = new Stud("Harshad", 101);
        s1.show();
    }
}
