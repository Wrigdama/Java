/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package studentdetails;

/** M (model)
 * V (view)
 * C (controller) design pattern
 *
 * @author Daman
 */
public class StudentDetails {

    /** 
     * print 3 student details name, age using array
     * view class (v0 showing - user interaction i/o and o/p
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // define 3 student details and store, print array
        Student s1 = new Student();
        s1.setName("Peter");
        s1.setAge(20);
        Student s2 = new Student();
        s2.setName("Ashley");
        s2.setAge(21);
        Student s3 = new Student();
        s2.setName("Chris");
        s2.setAge(18);
        //aray of object
        Student[] list = new Student[3];
        list[0] = s1;
        list[1] = s2;
        list[2] = s3;
        for(int i=0;i<list.length;i++)
        {
           System.out.println(list[i].getName()+ " "+list[i].getAge());
        }
        
        
        
    }
    
}
