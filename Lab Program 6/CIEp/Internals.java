package CIEp;
public class Internals extends Student{
    public int[] cieMarks = new int[5];
    public Internals(int usn,String name,int sem,int[] cieMarks){
        super(usn,name,sem);
        this.cieMarks = cieMarks;
    }
}