package net.missdjoko.variablelenghtarguments;

/**
 * Created by Miss_ on 31.01.2016.
 */
public class VarArgs {// метод с параметрами переменной длины
    static void vaTest(String msg,int...v){  // v является массивом и принимает в себя все параметры обьявленного типа, другие типы параметров обьявляют перед массивом
        System.out.println(msg + v.length  + "  Soderzhimoe :");
        for (int x : v){
            System.out.print(x + "  ");
        }
        System.out.println();

    }
}
