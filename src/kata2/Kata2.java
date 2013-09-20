/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package kata2;

import java.util.Date;

public class Kata2 {

    public static void main(String[] args) {
        Student student = new Student ("Bruno",new Date(89,11,5));
        System.out.println(student.getAge());
    }

}
