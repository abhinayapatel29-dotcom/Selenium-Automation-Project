package AbhinayaPatel;

import theQAGuy007.important;

public class testconstructor {
    int y =1;
    testconstructor(){
        important imp = new important();
        y=(imp.x);
    }
    public static void main(String[] args){
        testconstructor tc=new testconstructor();
        System.out.println(tc.y);
    }
}
