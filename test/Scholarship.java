/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nguyen Thanh Nha
 */
public class Scholarship {
    private double gpa;

    public Scholarship(double gpa) {
        this.gpa=gpa;
    }

    public int getAward() {
        if(gpa>4.0  || gpa <0){
            return -1;
        }
        if(gpa>=3.7){
            return 100;
        }else if(gpa>=3.6){
            return 80;
        }else if(gpa>=3.4){
            return 70;
        }else{
            
        }
    }

    
    
}
