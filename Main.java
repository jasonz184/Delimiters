import java.util.ArrayList;
public class Main
{
    public static void main(String[] args)
    {
        String[] tokens = {"(", "x + y", ")", " * 5"};
        Delimiters d = new Delimiters("(", ")");
        System.out.println(d.getDelimitersList(tokens));
        String[] tokens2 = {"<q>", "yy", "</q>", "zz", "</q>"};
        d = new Delimiters("<q>", "</q>");
        System.out.println(d.getDelimitersList(tokens2));
        String open = "<sup>";
        String close = "</sup>";
        d = new Delimiters(open, close);
        ArrayList<String> delimiters = new ArrayList<String>();
        String[] delims = {open, open, close, open, close, close};
        for(String s : delims) delimiters.add(s);
        System.out.println(d.isBalanced(delimiters));
        ArrayList<String> delimiters2 = new ArrayList<String>();
        String[] delims2 = {open, close, close, open};
        for(String s : delims2) delimiters2.add(s);
        System.out.println(d.isBalanced(delimiters2));
        ArrayList<String> delimiters3 = new ArrayList<String>();
        delimiters3.add(close);
        System.out.println(d.isBalanced(delimiters3));
        ArrayList<String> delimiters4 = new ArrayList<String>();
        String[] delims4 = {open, open, close};
        for(String s : delims4) delimiters4.add(s);
        System.out.println(d.isBalanced(delimiters4));
    }
}