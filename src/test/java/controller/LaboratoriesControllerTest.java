package controller;

import model.Laboratory;
import model.Student;
import org.junit.Test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;


/**
 * Created by Moni on 3/28/2017.
 */
public class LaboratoriesControllerTest {

    LaboratoriesController controller;
    BufferedReader reader, reader2;
    String line= null;

    @org.junit.Before
    public void setUp() throws Exception {

        controller= new LaboratoriesController("src/test/studTest.txt", "src/test/labTest.txt");
        reader = new BufferedReader(new FileReader("src/test/studTest.txt"));
        reader2 = new BufferedReader(new FileReader("src/test/labTest.txt"));
    }

    @org.junit.After
    public void tearDown() throws Exception {
        reader.close();
        reader2.close();
    }

    @Test
    public void testSaveStudent() throws Exception {
        Student student1 = new Student("abcd1234", "Balas", "Gabriel", 123);
        controller.saveStudent(student1);
        line=reader.readLine();
        if (line != null) {
            String[] temp = line.split(" ");
            Student student = new Student(temp[0], temp[1], temp[2], Integer.valueOf(temp[3]));
            assertEquals(student1, student);
        } else System.out.println("Nu s-a salvat stud!");
    }

    @Test
    public void testSaveLaboratory() throws Exception {

        Laboratory lab1 = new Laboratory(1, "21/01/2018", 4, 8f, "jhgf5432");
        controller.saveLaboratory(lab1);
        line=reader2.readLine();
        if (line != null) {
            String[] temp = line.split(" ");
            Laboratory lab = new Laboratory(Integer.valueOf(temp[0]), temp[1], Integer.valueOf(temp[2]), Float.valueOf(temp[3]), temp[4]);
            assertEquals(lab1.toString(), lab.toString());
        } else System.out.println("Nu s-a salvat lab!");

    }

//    @Test
//    public void testAddGrade() throws Exception {
//        Laboratory lab1 = new Laboratory(1, "21/01/2018", 4, "jhgf5432");
//        controller.saveLaboratory(lab1);
//        lab1.setGrade(9f);
//        controller.addGrade("jhgf5432","1", 9f);
//        line=reader2.readLine();
//        if (line != null) {
//            String[] temp = line.split(" ");
//            Laboratory lab = new Laboratory(Integer.valueOf(temp[0]), temp[1], Integer.valueOf(temp[2]), Float.valueOf(temp[3]), temp[4]);
//            assertEquals(lab1, lab);
//        } else System.out.println("Nu s-a adaugat nota!");
//    }

//    @Test
//    public void testPassedStudents() throws Exception {
//        List<Student> studenti= controller.passedStudents();
//        List<Student> studenti2= new ArrayList<>();;
//        Student stud1= new Student("dfgh4563", "Costin", "Aurica", 300);
//        Student stud2= new Student("oiuy3214", "Bala", "Dorel", 120);
//        studenti2.add(stud1);
//        studenti2.add(stud2);
//        assertEquals(studenti2, studenti);
//
//
//    }
}