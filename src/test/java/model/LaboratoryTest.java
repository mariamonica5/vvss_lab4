package model;

import org.junit.Test;

import java.text.SimpleDateFormat;
import java.util.Date;

import static org.junit.Assert.assertEquals;

/**
 * Created by Moni on 3/28/2017.
 */
public class LaboratoryTest {

    @Test
    public void testGetNumber() throws Exception {
        Laboratory lab1= new Laboratory(2, "10/10/2017", 4, 4f, "abcd1234");
        Laboratory lab2= new Laboratory(4, "03/03/2018", 1, 8f , "dfgh4563");
        assertEquals(2, lab1.getNumber());
        assertEquals(4, lab2.getNumber());

    }

    @Test
    public void testSetNumber() throws Exception {
        Laboratory lab1= new Laboratory(2, "10/10/2017", 4, 4f, "abcd1234");
        lab1.setNumber(5);
        assertEquals(5,lab1.getNumber());
    }

    @Test
    public void testGetDate() throws Exception {
        Laboratory lab1= new Laboratory(2, "10/10/2017", 4, 4f, "abcd1234");
        Laboratory lab2= new Laboratory(4, "03/03/2018", 1, 8f , "dfgh4563");
        SimpleDateFormat fmt = new SimpleDateFormat("dd/MM/yyyy");
        Date date = fmt.parse("10/10/2017");
        Date date2 = fmt.parse("03/03/2018");
        assertEquals(date, lab1.getDate());
        assertEquals(date2, lab2.getDate());

    }

    @Test
    public void testSetDate() throws Exception {
        Laboratory lab1= new Laboratory(2, "10/10/2017", 4, 4f, "abcd1234");
        SimpleDateFormat fmt = new SimpleDateFormat("dd/MM/yyyy");
        Date date = fmt.parse("23/08/2017");
        lab1.setDate(date);
        assertEquals(date, lab1.getDate());

    }

    @Test
    public void testGetProblemNumber() throws Exception {
        Laboratory lab1= new Laboratory(2, "10/10/2017", 4, 4f, "abcd1234");
        Laboratory lab2= new Laboratory(4, "03/03/2018", 1, 8f , "dfgh4563");
        assertEquals(4,lab1.getProblemNumber());
        assertEquals(1, lab2.getProblemNumber());

    }

    @Test
    public void testSetProblemNumber() throws Exception {
        Laboratory lab1= new Laboratory(2, "10/10/2017", 4, 4f, "abcd1234");
        lab1.setProblemNumber(5);
        assertEquals(5, lab1.getProblemNumber());
    }

    @Test
    public void testGetGrade() throws Exception {
        Laboratory lab1= new Laboratory(2, "10/10/2017", 4, 4f, "abcd1234");
        Laboratory lab2= new Laboratory(4, "03/03/2018", 1, 8f , "dfgh4563");
        assertEquals(Float.toString(4f),Float.toString(lab1.getGrade()));
        assertEquals(Float.toString(8f), Float.toString(lab2.getGrade()));

    }

    @Test
    public void testSetGrade() throws Exception {
        Laboratory lab1= new Laboratory(2, "10/10/2017", 4, 4f, "abcd1234");
        lab1.setGrade(5f);
        assertEquals(Float.toString(5f),Float.toString(lab1.getGrade()));
    }

    @Test
    public void testGetStudentRegNumber() throws Exception {
        Laboratory lab1= new Laboratory(2, "10/10/2017", 4, 4f, "abcd1234");
        Laboratory lab2= new Laboratory(4, "03/03/2018", 1, 8f , "dfgh4563");
        assertEquals("abcd1234",lab1.getStudentRegNumber());
        assertEquals("dfgh4563", lab2.getStudentRegNumber());
    }

    @Test
    public void testSetStudentRegNumber() throws Exception {
        Laboratory lab1= new Laboratory(2, "10/10/2017", 4, 4f, "abcd1234");
        lab1.setStudentRegNumber("aaaa1234");
        assertEquals("aaaa1234", lab1.getStudentRegNumber());
    }


}