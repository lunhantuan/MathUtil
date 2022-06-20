/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mathutil.core;

import com.mycompany.mathuti.core.MathUtil;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

/**
 *
 * @author Admin
 */
@RunWith(value = Parameterized.class)// class nay choi voi tham so 
public class AdvancedFactorialTest {
    
    // ta viet ky thuat moi, tach data ra han cac lenh kiem tra ham
    //data nay ta co the dat o file .text, . csv, .excel, database ben sql
    //input va out put la nhung cap 
    //nhieu cap can phai test, => data de test ham se la mang 2 chieu 
    //mang 2 chieu nay se duoc nap tu file text hoac tu data base
    //hoac tao luon mang 2 chieu o day
    @Parameters
    public static Object[][] initData(){
        return new Integer[][]{
                                {0,1},
                                {1,1},
                                {2,2},
                                {3,6},
                                {4,24},
                                {5,120},
                                {6,720}
                                };
    }
    // ta can map 2 cot vao 2 bien de lat feed vao ham check factorial
    //viec nay ta goi la testing kieu tham so hoa 
    // parameterized testing
    @Parameter(value=0) 
    public int input;
    @Parameter(value=1)
    public long expected;
    
    @Test
    public void checkFactorialGivenRightAgrumentReturnsWell(){
        Assert.assertEquals(expected,MathUtil.getFactorial(input));    
    }
    
    
    
    
}
