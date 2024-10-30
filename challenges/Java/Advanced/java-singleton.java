import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.lang.reflect.*;


class Singleton{
    public static String str;
    private static Singleton onlyInstance;
    
    private Singleton(){
    }
    public static Singleton getSingleInstance(){
        if(onlyInstance == null){
            onlyInstance = new Singleton();
        }
        return onlyInstance;
    }

}