package oops.Introduction;

import javax.sound.midi.Soundbank;

public class main {
     public static void main(String[] args) {
        // store the 5 roll no
        int []number=new int[5];

        // store 5 names

        String []name= new String[5];

        // data of 5 students :{roll no,names,mrks}
        int[] roll=new int[5];

         String[] nam=new String[5];

         float [] marks=new float[5];

         Student stud=new Student();


         stud.roll=100;
         stud.name="pramod";
         stud.marks=85.80f;//reference


         System.out.println(stud.roll);
         System.out.println(stud.name);
         System.out.println(stud.marks);

        Student one=new Student();
        Student two=one;
        one.name="Something something";
        System.out.println(two.name);
 
     }

     // create the class
     /*class classname{
           class data type;
           data method

     }*/
};
// create the class
     class Student{
              int roll;//default value----0
              String name;// default value---null
              float marks;// default value---0.0

        // object-----instance of the class
        // class is the collections of the data member and data method called the class
           Student(){
            this.roll=200;
            this.name="pkkkk";
            this.marks=77.67f;
           } 
           Student(int roll,String name,float marks){
               //constructor---a specific method name same as class name----haven't any return type--Automatic invoke when we create the object
                  this.roll=roll;
                  this.name=name;
                  this.marks=marks;
           }

           

     }


