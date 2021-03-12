/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ss.mar;

import org.junit.jupiter.api.Test;
//import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;


/**
 *
 * @author Anthony
 */
public class LineTest {
    
    public LineTest() {
    }
    
    Line line1 = new Line(0,0,1,1);
    Line line2 = new Line(0,1,1,2);
    Line line3 = new Line(1,2,2,2);
    Line line4 = new Line(0,0,1,0);
    Line line5 = new Line(0,0,0,-1);
    Line line6 = new Line(1,1,0,2);
    Line line7 = new Line(50,2,100,2);

    /**
     * Test of getSlope method, of class Line.
     */
    @org.junit.jupiter.api.Test
    public void testGetSlopeHP() {
        assertEquals(1, line1.getSlope(), 0.0001);
        assertEquals(-1,line6.getSlope(), 0.0001);
        assertEquals(line1.getSlope(), line2.getSlope(), 0.0001);
        assertEquals(0, line4.getSlope(), 0.0001);  
    }
    
    @org.junit.jupiter.api.Test
    public void testGetSlopeFP(){
        assertNotEquals(5, line1.getSlope());
        assertNotEquals(1, line6.getSlope());
    }
    
    @org.junit.jupiter.api.Test
    public void testGetSlopeException(){
        assertThrows(ArithmeticException.class,() -> {line5.getSlope();});
    }

    /**
     * Test of getDistance method, of class Line.
     */
    @org.junit.jupiter.api.Test
    public void testGetDistanceHP() {
        assertEquals(1, line4.getDistance(), 0.0001);
        assertEquals(1, line5.getDistance(), 0.0001);
        assertEquals(Math.sqrt(2), line1.getDistance(), 0.0001);
        assertEquals(50, line7.getDistance(), 0.0001);
        assertEquals(1, line5.getDistance(), 0.0001);
    }
    
    @org.junit.jupiter.api.Test
    public void testGetDistanceFP() {
        assertNotEquals(2, line6.getDistance());
        assertNotEquals(-1, line6.getDistance());
    }


    /**
     * Test of parallelTo method, of class Line.
     */
    @org.junit.jupiter.api.Test
    public void testParallelToFP() {
        assertTrue(line1.parallelTo(line1));
        assertTrue(line1.parallelTo(line2));
        assertTrue(line4.parallelTo(line7));
    }
    
        @org.junit.jupiter.api.Test
    public void testParallelToHP() {
        assertFalse(line1.parallelTo(line4));
    }
    
}
