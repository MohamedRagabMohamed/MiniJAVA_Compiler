/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lexer;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import jdk.nashorn.internal.runtime.regexp.RegExp;

/**
 *
 * @author abdulaziz
 */
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MainClass {

    public static void main( String args[] ) throws FileNotFoundException, IOException {
      // String to be scanned to find the pattern.
     // TokenLabel t =new TokenLabel("label", "token");
       // System.err.println(t.initializeTokensArray().get(2).toString());
       ArrayList<TokenLabel> output = new ArrayList<>();
       
       FileClass file=new FileClass();
       for (int i=1;i<4;i++){
           String read="TESTCASE"+i+".txt";
       
       String data=file.BufferMethod(read);
        //System.out.println(data);
        
        String write="output"+i;
        file.OpenWrite(write);
       output= LexerClass.test(data);
       file.WriteData(output);
       file.closeWrite();
       }
       
       
/*"int value = 3;\n" +
"String text = \"int x = 1\";\n" +
"/*\n" +
"if (num < 1)\n" +
"num = num +1 ;\n" +
"*//*\n" +
"private void print()	\n" +
"{\n" +
"System.out.println(\"/*hello*//*\");	\n" +
"}\n" +
"};");*/
     /*  for (int i=0;i<output.size();i++){
           System.out.println(output.get(i));
       }
        */
        /*Map<Integer,String> z=new HashMap<Integer,String>();
z.put(2, "mody");
z.put(1, "zizo");
        System.out.println(z.toString());
        int _5=5;*/   }
}
    
