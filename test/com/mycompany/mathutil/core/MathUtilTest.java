/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mathutil.core;

import com.mycompany.mathuti.core.MathUtil;
import org.junit.Assert;
import org.junit.Test;



/**
 *
 * @author Admin
 */
public class MathUtilTest {
    
    @Test
    public void checkFactorialGivenRightAgrumentReturnsWell(){
        long expected = 120;
        long actual = MathUtil.getFactorial(5);
        Assert.assertEquals(expected, actual);
        Assert.assertEquals(720, MathUtil.getFactorial(6));
        Assert.assertEquals(1, MathUtil.getFactorial(0)); 
    }
    
    
    //check xem co ngoai le khong co nem ve ngoai le ko
    // ky vong nem ve ngoai le ma ko co dinh ngoai le thi ra mau do
    // dung ky vong nem ve ngoai le la co mau xanh 
    @Test(expected = IllegalArgumentException.class)
    public void checkFactorialGivenWrongAgrumentThrowsException(){
        // ham equal can co gia tri
        // nen ta chi check xem co ngoai le ko
        MathUtil.getFactorial(-5);
    }
    
     
}
