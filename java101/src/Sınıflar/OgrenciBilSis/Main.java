/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sınıflar.OgrenciBilSis;

/**
 *
 * @author Muammer Agtas
 */
public class Main {

    public static void main(String[] args) {

        Course mat = new Course("Matematik", "MAT101", "MAT");
        Course fizik = new Course("Fizik", "FZK101", "FZK");
        Course kimya = new Course("Kimya", "KMY101", "KMY");

        Teacher t1 = new Teacher("Mahmut Hoca", "90550000000", "MAT");
        Teacher t2 = new Teacher("Fatma Ayşe", "90550000001", "FZK");
        Teacher t3 = new Teacher("Ali Veli", "90550000002", "KMY");

        mat.addTeacher(t1);
        fizik.addTeacher(t2);
        kimya.addTeacher(t3);

        Student s1 = new Student("Ali Akın", 4, "140144015", mat, fizik, kimya);
        s1.addBulkExamNote(50, 70, 20, 55, 40, 75);
        s1.isPass();

        Student s2 = new Student("Veli Tekin", 4, "2211133", mat, fizik, kimya);
        s2.addBulkExamNote(100, 0, 55, 56, 50, 40);
        s2.isPass();

        Student s3 = new Student("Ayşe Metin", 4, "221121312", mat, fizik, kimya);
        s3.addBulkExamNote(50, 100, 85, 20, 15, 40);
        s3.isPass();

        Student s4 = new Student("Işıl Seçkin", 4, "1234567890", mat, fizik, kimya);
        s4.addBulkExamNote(100, 100, 85, 0, 5, 0);
        s4.isPass();
    }
}
