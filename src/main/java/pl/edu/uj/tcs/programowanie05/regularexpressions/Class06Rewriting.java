package pl.edu.uj.tcs.programowanie05.regularexpressions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Class06Rewriting {

    public static void main(String[] args) {
        Pattern pat = Pattern.compile("\\w*a(?=\\W)");
        Matcher mat = pat.matcher("Ala ma kota a kot ma Ale.");
        StringBuffer temp = new StringBuffer();
        int i = 0;
        while(mat.find()) {
            mat.appendReplacement(temp, mat.group().toUpperCase() + "(" + ++i + ")");
            System.out.println(i + " : " + temp);
        }
        mat.appendTail(temp);
        System.out.println(temp);
        
        temp.delete(0,temp.length());
        mat.reset();
        i = 0;
        while(mat.find()) {
            mat.appendReplacement(temp, mat.group().toLowerCase() + "(" + ++i + ")");
        }
        mat.appendTail(temp);
        System.out.println(temp);
    }

}
