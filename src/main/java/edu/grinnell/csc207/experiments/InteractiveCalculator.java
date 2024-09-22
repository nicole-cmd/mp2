package edu.grinnell.csc207.experiments;

import edu.grinnell.csc207.util.*;
import java.lang.String;
import java.io.PrintWriter;

public class InteractiveCalculator {
    public static void main(String[] args){
        PrintWriter pen = new PrintWriter(System.out, true);

        for(int i = 0; i < args.length; i ++) {
            for(String s : args) {
                if(s.equals("STORE")) {
                    BFRegisterSet.store(args[i++], new BFCalculator(i++));
                } else if(s.length() == 1) {
                    char[] convert = s.toCharArray();
                    pen.println(" " + BFRegisterSet.get(convert[0]));
                } else if(s.equals("QUIT")) {

                } else {

                }

            } // for - evaluates strings of command line input
        } // for - cycle through each element of command line argument array
    } // main
} // class InteractiveCalculator
