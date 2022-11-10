package com.epam.training.student_yangaliev_asaf;



import org.junit.jupiter.api.Test;

import static com.epam.training.student_yangaliev_asaf.Main.eraseString;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;


public class MainTest {
    @Test
    public void eraseStringTest1() {
        assertEquals("", eraseString(""));
    }

    @Test
    public void eraseStringTest2() {
        assertThrows(IllegalArgumentException.class, () -> eraseString(null));
    }

    @Test
    public void eraseStringTest3() {
        assertEquals("ewdldsff", eraseString("ew:-)))dl:-(((dsff"));
    }

    @Test
    public void eraseStringTest4() {
        assertEquals("oo", eraseString("oo"));
    }

    @Test
    public void eraseStringTest5() {
        assertEquals("llloo", eraseString(":-)llloo"));
    }

    @Test
    public void eraseStringTest6() {
        assertEquals("llloo(", eraseString("llloo:-)))("));
    }

    @Test
    public void eraseStringTest7() {
        assertEquals("llloo", eraseString("llloo:-)))"));
    }

    @Test
    public void eraseStringTest8() {
        assertEquals("llloo:-", eraseString("llloo:-)):-"));
    }

    @Test
    public void eraseStringTest9() {
        assertEquals(":)))(((:-:((:::--))((", eraseString(":)))(((:-::-)((:::--))((:-((("));
    }

    @Test
    public void eraseStringTest10() {
        assertEquals("wqewqeqweqweq", eraseString("wqewqeqweqweq"));
    }

    @Test
    public void eraseStringTest11() {
        assertEquals("wqeqwe", eraseString("wqeqwe:-)):-(("));
    }

    @Test
    public void eraseStringTest12() {
        assertEquals("", eraseString(":-)):-(("));
    }
}
