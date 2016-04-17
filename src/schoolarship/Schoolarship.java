package schoolarship;

import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author ABC
 */
public class Schoolarship {

    public Schoolarship() {
    }

    public int Schoolarship(double point) {
        if (point < 0 || point >= 5) {
            return 0;
        }
        if (point > 3.8) {
            return 100;
        }
        if (point > 3.5) {
            return 80;
        }
        if (point > 3) {
            return 70;
        }

        return 50;
    }

    public static void main(String[] args) {
        Schoolarship s = new Schoolarship();
        Scanner sc = new Scanner(System.in);
        System.out.println("Please input your point: ");
        double p = Double.parseDouble(sc.nextLine());
        int output = s.Schoolarship(p);
        System.out.println("Your schoolarship: " + output);
        
        

    }
}
