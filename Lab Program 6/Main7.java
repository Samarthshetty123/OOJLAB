import CIEp.*;
import SEEp.*;
import java.util.*;
public class Main7{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Externals[] e = new Externals[2];
        Internals[] in = new Internals[2];
        for(int i=0;i<2;i++){
            int usn1 = input.nextInt();
            String name1 = input.next();
            int sem1 = input.nextInt();
            int[][] cie = new int[2][5];
            int[][] see = new int[2][5];
            for(int j=0;j<5;j++){
                cie[i][j] = input.nextInt();
            }
            for(int j=0;j<5;j++){
                see[i][j] = input.nextInt();
            }
            e[i] = new Externals(usn1,name1,sem1,see[i]);
            in[i] = new Internals(usn1,name1,sem1,cie[i]);
            int total = 0;
            System.out.println("Name: "+e[i].name);
            System.out.println("USN: "+e[i].usn);
            System.out.println("sem: "+e[i].sem);
            for(int j=0;j<5;j++){
                total = e[i].seeMarks[j]+in[i].cieMarks[j];
                System.out.print("Final marks: "+total+" ");
            }
            System.out.println();
        }
    }
}