package SEEp;

import CIEp.*;

public class Externals extends Student{
    public int[] seeMarks = new int[5];
    public Externals(int usn,String name,int sem,int[] seeMarks){
        super(usn,name,sem);
        this.seeMarks = seeMarks;
    }
}