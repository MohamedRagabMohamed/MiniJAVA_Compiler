/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lexer;

/**
 *
 * @author abdulaziz
 */import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javafx.print.Collation;

/**
 *
 * @author anaconda
 */
public class LexerClass {
    
    private static ArrayList<TokenLabel> tokenLabels = null;
    
    public static ArrayList<TokenLabel> test(String codeLine){
        ArrayList<TokenLabel> returned = new ArrayList<>();
        Map<Integer,TokenLabel> tokensMap = new HashMap<Integer,TokenLabel>() {};
        
        if(tokenLabels == null){
            tokenLabels = TokenLabel.initializeTokensArray();
        }
        for(TokenLabel tl : tokenLabels){
            codeLine = matchPattern(codeLine, tl , tokensMap);
        }
        
        int index=-1;
        for (int i=0;i<codeLine.length();i++){
            char c=codeLine.charAt(i);
        if (c!=' '){
            index=i;
            codeLine=codeLine.replaceAll(" ", "");
            tokensMap.put(index, new TokenLabel("unknownToken"
                    , codeLine));
            break;
            
        }
        }
        String unknown=codeLine;
       
        
        
        Set<Integer> keySet = tokensMap.keySet();
        ArrayList<Integer> keys=new ArrayList<>();
        for(Integer key : keySet){
            keys.add(key);
        }
        Collections.sort(keys);
        System.out.println(keys.toString());
        for(Integer key : keys){
            returned.add(tokensMap.get(key));
        }
        
        return returned;
    }
    
    private static String matchPattern(String codeLine , TokenLabel tokenLabel 
            , Map<Integer , TokenLabel> output){
        Pattern pattern = Pattern.compile(tokenLabel.getToken());
        Matcher matcher = pattern.matcher(codeLine);
        StringBuffer sb = new StringBuffer();
        
        
        while(matcher.find()){
            output.put(matcher.start(), new TokenLabel(tokenLabel.getLabel() 
                    , codeLine.substring(matcher.start(),matcher.end())));
            matcher.appendReplacement(sb, makeRepeatedString(matcher.end()-matcher.start()));
        }
        matcher.appendTail(sb);
        return sb.toString();
        
    }
    private static String matchPattern2(String codeLine , TokenLabel tokenLabel 
            ,ArrayList < TokenLabel> output){
        Pattern pattern = Pattern.compile(tokenLabel.getToken());
        Matcher matcher = pattern.matcher(codeLine);
        StringBuffer sb = new StringBuffer();
        while(matcher.find()){
            output.add( new TokenLabel(tokenLabel.getLabel() 
                    , codeLine.substring(matcher.start(),matcher.end())));
            matcher.appendReplacement(sb, makeRepeatedString(matcher.end()-matcher.start()));
        }
        matcher.appendTail(sb);
        return sb.toString();
        
    }
    
    
    private static String makeRepeatedString(int repeat){
        char[] chars = new char[repeat];
        Arrays.fill(chars , ' ');
        return new String(chars);
    }
}

