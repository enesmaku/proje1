/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proje;

/**
 *
 * @author sasni
 */
public class ornek_6_104 {
        public static void main(String[] args) {

                for(int x=1;x<=50;x++){
                        for(int y=x;y<=50;y++){
                                for(int z=y;z<=50;z++){
                                        if(x*x+y*y+z*z==3*x*y*z){
                                                System.out.println(x+" "+y+" "+z);
                                        }

                                }

                        }

                }

        }

}