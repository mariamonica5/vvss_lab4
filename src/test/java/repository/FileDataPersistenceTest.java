package repository;

import model.Laboratory;
import model.Student;
import org.junit.Test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.assertEquals;

/**
 * Created by Moni on 3/28/2017.
 */
public class FileDataPersistenceTest {

    FileDataPersistence data;
    FileDataPersistence data2;
    BufferedReader reader, reader2;
    String line= null;

    @org.junit.Before
    public void setUp() throws Exception {

        data= new FileDataPersistence("src/test/studTest.txt");
        data2= new FileDataPersistence("src/test/labTest.txt");
        reader = new BufferedReader(new FileReader("src/test/studTest.txt"));
        reader2 = new BufferedReader(new FileReader("src/test/labTest.txt"));
    }

    @org.junit.After
    public void tearDown() throws Exception {
        reader.close();
        reader2.close();
    }

    @Test
    public void testGetFile() throws Exception {
        String data3= data.getFile();
        assertEquals("src/test/studTest.txt", data3);
        String data4= data2.getFile();
        assertEquals("src/test/labTest.txt", data4);
    }

    @Test
    public void testSetFile() throws Exception {
        data.setFile("studTest2.txt");
        assertEquals("studTest2.txt", data.getFile());

    }

    @Test
    public void testSaveStudent() throws Exception {

    }

    @Test
    public void testSaveLaboratory() throws Exception {

    }

    @Test
    public void testAddGrade() throws Exception {

    }

//    @Test
//    public void testGetLaboratoryMap() throws Exception {
//        Map<String, List<Laboratory>> laburi= data2.getLaboratoryMap();
//        Map<String, List<Laboratory>> laburi2 = new HashMap<String, List<Laboratory>>();
//        Laboratory lab1= new Laboratory(2, "10/10/2017", 4, 4f, "abcd1234");
//        Laboratory lab2= new Laboratory(2, "10/10/2017", 4, 8f, "dfgh4563");
//        Laboratory lab3= new Laboratory(2, "10/10/2017", 4, 7f, "oiuy3214");
//        Laboratory lab4= new Laboratory(2, "10/10/2017", 4, 5f, "fghs5679");
//        Laboratory lab5= new Laboratory(3, "12/03/2018", 3, 6f, "abcd1234");
//        Laboratory lab6= new Laboratory(3, "12/03/2018", 3, 9f, "dfgh4563");
//        Laboratory lab7= new Laboratory(3, "12/03/2018", 3, 5f, "oiuy3214");
//        Laboratory lab8= new Laboratory(4, "03/03/2018", 1, 2f, "abcd1234");
//        Laboratory lab9= new Laboratory(4, "03/03/2018", 1, 8f, "dfgh4563");
//        Laboratory lab10= new Laboratory(4, "03/03/2018", 1, 6f, "oiuy3214");
//        Laboratory lab11= new Laboratory(4, "03/03/2018", 1, 6f, "fghs5679");
//        List<Laboratory> laboratoare = new ArrayList<>();
//        laboratoare.add(lab1);
//        laboratoare.add(lab5);
//        laboratoare.add(lab8);
//        List<Laboratory> laboratoare1 = new ArrayList<>();
//        laboratoare1.add(lab2);
//        laboratoare1.add(lab6);
//        laboratoare1.add(lab9);
//        List<Laboratory> laboratoare2 = new ArrayList<>();
//        laboratoare2.add(lab3);
//        laboratoare2.add(lab7);
//        laboratoare2.add(lab10);
//        List<Laboratory> laboratoare3 = new ArrayList<>();
//        laboratoare3.add(lab4);
//        laboratoare3.add(lab11);
//        laburi2.put("abcd1234",laboratoare);
//        laburi2.put("dfgh4562", laboratoare1);
//        laburi2.put("oiuy3214", laboratoare2);
//        laburi2.put("fghs5679", laboratoare3);
//        assertEquals(laburi, laburi2);
//
//
//
//
//    }

    @Test
    public void testGetStudentsList()  {
        List<Student> studenti= null;
        try {
            studenti = data.getStudentsList();
           // System.out.println(studenti.size());
            List<Student> studenti2= new ArrayList<Student>();
            Student stud1= new Student("dfgh4563", "Costin", "Aurica", 300);
            Student stud2= new Student("oiuy3214", "Bala", "Dorel", 120);
            Student stud3= new Student("abcd1234", "Pop", "Viorica", 212);
            Student stud4= new Student ("fghs5679", "Pop", "Gigel", 342);
            studenti2.add(stud3);
            studenti2.add(stud1);
            studenti2.add(stud2);
            studenti2.add(stud4);
            assertEquals(studenti2, studenti);

        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}