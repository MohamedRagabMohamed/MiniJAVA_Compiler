/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lexer;

import java.util.ArrayList;

/**
 *
 * @author anaconda
 */
 class TokenLabel {
    
    private String token;
    private String label;

    @Override
  public   String toString() {
        return "<"+label+"> : "+token;
    }
    
     TokenLabel(String label , String token){
        this.token = token;
        this.label = label;
    }
    
     String getLabel(){
        return label;
    }
     String getToken(){
        return token;
    }
    
    
    
     static ArrayList<TokenLabel> initializeTokensArray(){
        ArrayList<TokenLabel> tokenLabels = new ArrayList<>();
        
        String EOL = "\n" 
            , PLUS = "\\+"
, LEFT_CURLY_B = "\\{"
     , RIGHT_CURLY_B = "\\}"
     , LEFT_SQUARE_B = "\\["
     , RIGHT_SQUARE_B = "\\]"
     , LEFT_ROUND_B = "\\("
     , RIGHT_ROUND_B = "\\)"
	 , COMMA = ","
	 , SEMICOLON = ";"
     , DOT = "\\."
	 , NOT = "!"
	 , EQUAL = "\\="
	 ,EQUAL_EQUAL ="=="
     ,NOT_EQUAL ="!=" 
     , AND = "&&"
     , OR = "\\|\\|"
     , MINUS = "\\-"
     , MULTIPLY = "\\*"
     , DIVITION = "\\/"
        
      /** Mazen STARTED FROM HERE  **/ 
	   
	   , MOD = "\\%"        	// check
	   , LESSTHAN = "\\<"		// check
	   , GREATERTHAN = "\\>"	// check
           , LESS_EQ = "\\<\\="		// check
	   , GREATER_EQ = "\\>\\="	// check
	   , IF = "\\bif\\b"
           , INT = "\\bint\\b"
           , ELSE = "\\belse\\b"
           , MAIN = "\\bmain\\b"
           , THIS = "\\bthis\\b"
           , TRUE = "\\btrue\\b"
	   , VOID = "\\bvoid\\b"
           , CLASS = "\\bclass\\b"
           , FALSE = "\\bfalse\\b"
	   , WHILE = "\\bwhile\\b"
	   , LENGTH = "\\blength\\b"
           , PUBLIC = "\\bpublic\\b"
	   , PRIVATE = "\\bprivate\\b"
	   , PROTECTED = "\\bprotected\\b"
           , RETURN = "\\breturn\\b"
       
            /// Mazen END HERE
                
            /** AZZAM STARTED FROM HERE  **/ 
	   
	   , STATIC = "\\bstatic\\b"
	   , NEW = "\\bnew\\b"
	   , STRING = "\\bString\\b"
           , FLOAT = "\\bfloat\\b"
	   , CHARACTER = "\\bchar\\b"
	   , BOOLEAN = "\\bboolean\\b"
           , EXTENDS = "\\bextends\\b"
           , NULL = "\\bnull\\b"
           , ABSTRACT = "\\babstract\\b" 
           , ASSERT = "\\bassert\\b"
           , BREAK = "\\bbreak\\b"
           , CONTINUE = "\\bcontinue\\b"
           , BYTE = "\\bbyte\\b"    
           , CASE = "\\bcase\\b" 
           , CATCH = "\\bcatch\\b"
           , CONST = "\\bconst\\b"
           , DEFAULT = "\\bdefault\\b"
           , DO = "\\bdo\\b"
           , DOUBLE = "\\bdouble\\b"
           , ENUM = "\\benum\\b"
           , FINAL = "\\bfinal\\b"  
             
            /// AZZAM END HERE
                
            ///      Ragab


		
	 , FINALLY = "\\bfinally\\b"
	 , FOR  = "\\bfor\\b"
	 , GOTO = "\\bgoto\\b"
	 , IMPLEMENTS = "\\bimplements\\b"
	 , IMPORT = "\\bimport\\b"
	 , PACKAGE = "\\bpackage\\b"
	 , INSTANCEOF = "\\binstanceof\\b"
	 , INTERFACE = "\\binterface\\b"
	 , SHORT = "\\bshort\\b"
	 , SUPER = "\\bsuper\\b"
	 , SWITCH = "\\bswitch\\b"
	 , THROW = "\\bthrow\\b"
	 , TRY = "\\btry\\b"
	 ,SYSTEM_OUT_PRINTLN = "\\bSystem\\.out\\.println\\b"
     , INTEGRAL_LITERAL = "\\b(-?)\\d+\\b"
     , FLOAT_LITERAL = "\\b\\d+\\.\\d+\\b"
     , STRING_LITERAL = "\\\".*?\\\""
     , ID = "\\b[a-zA-Z]\\w*\\b"
     //,ID ="[a-zA-Z\\$\\_][a-zA-Z0-9\\$\\_]*"
	 
       , COMMENT_S = "\\/\\/.*"
     , COMMENT_M = "\\/\\*(.*?||\\n)*?\\*\\/"
     //, COMMENT_M = "/\\*(.|[\\r\\n])*?\\*/"   
     //  , COMMENT_M="/\\*([^*]|[\\r\\n]|(\\*+([^*/]|[\\r\\n])))*\\*+/"  
      // , COMMENT_M="(?s)/\\\\*(.)*?\\\\*/"
       , A_CHAR = "\'\\w\'";      
        
        
        
        
      
    //==========================================================================
    //ZIZO
     String EOL_LABEL = "EOL"
     , PLUS_LABEL = "PLUS"
     , LEFT_CURLY_B_LABEL = "LEFT_CURLY_B"
     , RIGHT_CURLY_B_LABEL = "RIGHT_CURLY_B"
     , LEFT_SQUARE_B_LABEL = "LEFT_SQUARE_B"
     , RIGHT_SQUARE_B_LABEL = "RIGHT_SQUARE_B"
     , LEFT_ROUND_B_LABEL = "LEFT_ROUND_B"
     , RIGHT_ROUND_B_LABEL = "RIGHT_ROUND_B"
     , COMMA_LABEL = "COMMA"
     , SEMICOLON_LABEL = "SEMICOLON"
     , DOT_LABEL = "DOT"
     , NOT_LABEL = "NOT"
     , EQUAL_LABEL = "EQUAL"
     ,EQUAL_EQUAL_LABEL ="EQUAL_EQUAL"
     ,NOT_EQUAL_LABEL ="NOT_EQUAL"
     , AND_LABEL = "AND"
     , OR_LABEL = "OR"
     , MINUS_LABEL = "MINUS"
     , MULTIPLY_LABEL = "MULTIPLY"
     , DIVITION_LABEL = "DIVITION"
             
             ////ZIZOEND
             
             
       /** Mazen STARTED FROM HERE  **/ 
	   
	   , MOD_LABEL = "MOD"        	
	   , LESSTHAN_LABEL = "LESSTHAN"		
	   , GREATERTHAN_LABEL = "GREATERTHAN"
           , LESS_EQ_LABEL = "LESS_EQ"
	   , GREATER_EQ_LABEL = "GREATER_EQ"
	   , IF_LABEL = "IF"
           , INT_LABEL = "INT"
           , ELSE_LABEL = "ELSE"
           , MAIN_LABEL = "MAIN"
           , THIS_LABEL = "THIS"
           , TRUE_LABEL = "TRUE"
	   , VOID_LABEL = "VOID"
           , CLASS_LABEL = "CLASS"
           , FALSE_LABEL = "FALSE"
	   , WHILE_LABEL = "WHILE"
	   , LENGTH_LABEL = "LENGTH"
           , PUBLIC_LABEL = "PUBLIC"
	   , PRIVATE_LABEL = "PRIVATE"
	   , PROTECTED_LABEL = "PROTECTED"
           , RETURN_LABEL = "RETURN"
       
            /// Mazen END HERE
    
            /** AZZAM STARTED FROM HERE  **/ 
       
	   , STATIC_LABEL = "STATIC"
           , NEW_LABEL = "NEW" 
	   , STRING_LABEL = "STRING"
           , FLOAT_LABEL = "FLOAT"
           , CHARACTER_LABEL = "CHARACTER"
           , BOOLEAN_LABEL = "BOOLEAN"
	   , EXTENDS_LABEL = "EXTENDS"
           , NULL_LABEL = "NULL"
           , ABSTRACT_LABEL = "ABSTRACT" 
           , ASSERT_LABEL = "ASSERT"
           , BREAK_LABEL = "BREAK"
           , CONTINUE_LABEL = "CONTINUE"
           , BYTE_LABEL = "BYTE"    
           , CASE_LABEL = "CASE" 
           , CATCH_LABEL = "CATCH"
           , CONST_LABEL = "CONST"
           , DEFAULT_LABEL = "DEFAULT"
           , DO_LABEL = "DO"
           , DOUBLE_LABEL = "DOUBLE"
           , ENUM_LABEL = "ENUM"
           , FINAL_LABEL = "FINAL"  
             
            /// AZZAM END HERE
             
             
             ///RAGEB 
         , FINALLY_LABEL = "FINALLY"
	 , FOR_LABEL  = "FOR"
	 , GOTO_LABEL = "GOTO"
	 , IMPLEMENTS_LABEL = "IMPLEMENTS"
	 , IMPORT_LABEL = "IMPORT"
	 , PACKAGE_LABEL = "PACKAGE"
	 , INSTANCEOF_LABEL = "INSTANCEOF"
	 , INTERFACE_LABEL = "INTERFACE"
	 , SHORT_LABEL = "SHORT"
	 , SUPER_LABEL = "SUPER"
	 , SWITCH_LABEL = "SWITCH"
	 , THROW_LABEL = "THROW"
	 , TRY_LABEL = "TRY"
	 , SYSTEM_OUT_PRINTLN_LABEL = "SYSTEM_OUT_PRINTLN"
         , INTEGRAL_LITERAL_LABEL = "INTEGRAL_LITERAL"
         , FLOAT_LITERAL_LABEL = "FLOAT_LITERAL"
         , STRING_LITERAL_LABEL = "STRING_LITERAL"
         , ID_LABEL = "ID"
            
	 , S_COMMENTS_LABEL = "S_COMMENTS"
	 , M_COMMENTS_LABEL =  "M_COMMENTS"
         ,A_CHAR_LABEL ="A_CHAR" ;  
             
             
             
     
     
        /////////////////////
        tokenLabels.add(new TokenLabel(STRING_LITERAL_LABEL , STRING_LITERAL));
        tokenLabels.add(new TokenLabel(M_COMMENTS_LABEL, COMMENT_M));
        tokenLabels.add(new TokenLabel(S_COMMENTS_LABEL , COMMENT_S));
        tokenLabels.add(new TokenLabel(SEMICOLON_LABEL, SEMICOLON));
        tokenLabels.add(new TokenLabel(SYSTEM_OUT_PRINTLN_LABEL, SYSTEM_OUT_PRINTLN));
        tokenLabels.add(new TokenLabel(EQUAL_EQUAL_LABEL , EQUAL_EQUAL));
        tokenLabels.add(new TokenLabel(GREATER_EQ_LABEL , GREATER_EQ));
        tokenLabels.add(new TokenLabel(LESS_EQ_LABEL , LESS_EQ));
        tokenLabels.add(new TokenLabel(NOT_EQUAL_LABEL , NOT_EQUAL));
        tokenLabels.add(new TokenLabel(FLOAT_LITERAL_LABEL , FLOAT_LITERAL));
        tokenLabels.add(new TokenLabel(DOT_LABEL , DOT));
        tokenLabels.add(new TokenLabel(INTEGRAL_LITERAL_LABEL , INTEGRAL_LITERAL));
        
        
        //ZIZO
        tokenLabels.add(new TokenLabel(EOL_LABEL , EOL));
        tokenLabels.add(new TokenLabel(PLUS_LABEL , PLUS));
        tokenLabels.add(new TokenLabel(MINUS_LABEL , MINUS));
        tokenLabels.add(new TokenLabel(MULTIPLY_LABEL , MULTIPLY));
        tokenLabels.add(new TokenLabel(EQUAL_LABEL , EQUAL));
        tokenLabels.add(new TokenLabel(DIVITION_LABEL , DIVITION));
        tokenLabels.add(new TokenLabel(LEFT_CURLY_B_LABEL , LEFT_CURLY_B));
        tokenLabels.add(new TokenLabel(RIGHT_CURLY_B_LABEL , RIGHT_CURLY_B));
        tokenLabels.add(new TokenLabel(LEFT_SQUARE_B_LABEL , LEFT_SQUARE_B));
        tokenLabels.add(new TokenLabel(RIGHT_SQUARE_B_LABEL , RIGHT_SQUARE_B));
        tokenLabels.add(new TokenLabel(LEFT_ROUND_B_LABEL , LEFT_ROUND_B));
        tokenLabels.add(new TokenLabel(RIGHT_ROUND_B_LABEL , RIGHT_ROUND_B));
        tokenLabels.add(new TokenLabel(LESSTHAN_LABEL , LESSTHAN));
        tokenLabels.add(new TokenLabel(GREATERTHAN_LABEL , GREATERTHAN));
        tokenLabels.add(new TokenLabel(NOT_LABEL , NOT));
        tokenLabels.add(new TokenLabel(AND_LABEL , AND));
        tokenLabels.add(new TokenLabel(OR_LABEL , OR));
        
        ///MAZEN 
        /**  MAZEN START HERE **/

          tokenLabels.add(new TokenLabel( MOD_LABEL , MOD ) ) ;
          tokenLabels.add(new TokenLabel( LESSTHAN_LABEL , LESSTHAN ) ) ;
          tokenLabels.add(new TokenLabel( GREATERTHAN_LABEL , GREATERTHAN ) ) ;
          tokenLabels.add(new TokenLabel( LESS_EQ_LABEL , LESS_EQ ) ) ;
          tokenLabels.add(new TokenLabel( GREATER_EQ_LABEL , GREATER_EQ ) ) ;
          tokenLabels.add(new TokenLabel( IF_LABEL , IF ) ) ;
          tokenLabels.add(new TokenLabel( INT_LABEL , INT ) ) ;
          tokenLabels.add(new TokenLabel( ELSE_LABEL , ELSE ) ) ;
          tokenLabels.add(new TokenLabel( MAIN_LABEL , MAIN ) ) ;
          tokenLabels.add(new TokenLabel( THIS_LABEL , THIS ) ) ;
          tokenLabels.add(new TokenLabel( TRUE_LABEL , TRUE ) ) ;
          tokenLabels.add(new TokenLabel( VOID_LABEL , VOID ) ) ;
          tokenLabels.add(new TokenLabel( CLASS_LABEL , CLASS ) ) ;
          tokenLabels.add(new TokenLabel( FALSE_LABEL , FALSE ) ) ;
          tokenLabels.add(new TokenLabel( WHILE_LABEL , WHILE ) ) ;
          tokenLabels.add(new TokenLabel( LENGTH_LABEL , LENGTH ) ) ;
          tokenLabels.add(new TokenLabel( PUBLIC_LABEL , PUBLIC ) ) ;
          tokenLabels.add(new TokenLabel( PRIVATE_LABEL , PRIVATE ) ) ;
          tokenLabels.add(new TokenLabel( PROTECTED_LABEL , PROTECTED ) ) ;
          tokenLabels.add(new TokenLabel( RETURN_LABEL , RETURN ) ) ;

          /** MAZEN END HERE **/

          /**  AZZAM START HERE **/

          tokenLabels.add(new TokenLabel(STATIC_LABEL , STATIC));
          tokenLabels.add(new TokenLabel(NEW_LABEL , NEW));
          tokenLabels.add(new TokenLabel(STRING_LABEL , STRING));
          tokenLabels.add(new TokenLabel(FLOAT_LABEL , FLOAT));
          tokenLabels.add(new TokenLabel(CHARACTER_LABEL , CHARACTER));
          tokenLabels.add(new TokenLabel(BOOLEAN_LABEL , BOOLEAN));
          tokenLabels.add(new TokenLabel(EXTENDS_LABEL , EXTENDS));
          tokenLabels.add(new TokenLabel( NULL_LABEL , NULL ) ) ;
          tokenLabels.add(new TokenLabel( ABSTRACT_LABEL , ABSTRACT ) ) ;
          tokenLabels.add(new TokenLabel( ASSERT_LABEL , ASSERT ) ) ;
          tokenLabels.add(new TokenLabel( BREAK_LABEL , BREAK ) ) ;
          tokenLabels.add(new TokenLabel( CONTINUE_LABEL , CONTINUE ) ) ;
          tokenLabels.add(new TokenLabel( BYTE_LABEL , BYTE ) ) ;
          tokenLabels.add(new TokenLabel( CASE_LABEL , CASE ) ) ;
          tokenLabels.add(new TokenLabel( CATCH_LABEL , CATCH ) ) ;
          tokenLabels.add(new TokenLabel( CONST_LABEL ,CONST ) ) ;
          tokenLabels.add(new TokenLabel( DEFAULT_LABEL , DEFAULT ) ) ;
          tokenLabels.add(new TokenLabel( DO_LABEL, DO ) ) ;
          tokenLabels.add(new TokenLabel( DOUBLE_LABEL , DOUBLE ) ) ;
          tokenLabels.add(new TokenLabel( ENUM_LABEL , ENUM) ) ;
          tokenLabels.add(new TokenLabel( FINAL_LABEL , FINAL ) ) ;

          /** AZZAM END HERE **/
          
          		
					//   Ragab
					
					
					//   Ragab
					
					
		tokenLabels.add(new TokenLabel(FINALLY_LABEL , FINALLY));
        tokenLabels.add(new TokenLabel(FOR_LABEL , FOR));
        tokenLabels.add(new TokenLabel(GOTO_LABEL , GOTO));
        tokenLabels.add(new TokenLabel(IMPLEMENTS_LABEL , IMPLEMENTS));
        tokenLabels.add(new TokenLabel(IMPORT_LABEL , IMPORT));
        tokenLabels.add(new TokenLabel(PACKAGE_LABEL , PACKAGE));
        tokenLabels.add(new TokenLabel(INSTANCEOF_LABEL , INSTANCEOF));
        tokenLabels.add(new TokenLabel(INTERFACE_LABEL , INTERFACE));
        tokenLabels.add(new TokenLabel(SHORT_LABEL , SHORT));
        tokenLabels.add(new TokenLabel(SUPER_LABEL , SUPER));
        tokenLabels.add(new TokenLabel(SWITCH_LABEL , SWITCH));
        tokenLabels.add(new TokenLabel(THROW_LABEL , THROW));
        tokenLabels.add(new TokenLabel(TRY_LABEL , TRY));
        
        tokenLabels.add(new TokenLabel(A_CHAR_LABEL , A_CHAR));
        tokenLabels.add(new TokenLabel(ID_LABEL , ID));
        return tokenLabels;
        
    }
    
    
}

