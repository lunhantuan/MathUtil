/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mathuti.core;

/**
 *
 * @author Admin
 */
public class MathUtil {
//    public static long getFactorial(int n){
//        if (n < 0 || n > 20) {
//            throw new IllegalArgumentException("n must be between 0..20");
//        }
//        
//        if (n==0 || n==1) {
//            return 1;
//        }
//        
//        long product = 1;
//        for (int i = 2; i <= n; i++) {
//            product *= i;
//        }
//        return product;
//    }
    
    //hoc de quy 30s 
    //de quy la hanh dong goi lai ching minh voi 1 quy mo khac
    //vi du: con bup be nga, giong nhau va long trong nhau
    
    public static long getFactorial(int n){
        if (n < 0 || n > 20) {
            throw new IllegalArgumentException("n must be between 0..20");
        }
        
        if (n==0 || n==1) {
            return 1;
        }
        return n * getFactorial(n-1);
    }
    
    
    
}
