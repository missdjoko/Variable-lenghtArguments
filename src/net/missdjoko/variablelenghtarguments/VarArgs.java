package net.missdjoko.variablelenghtarguments;

/**
 * Created by Miss_ on 31.01.2016.
 */
public class VarArgs {// ����� � ����������� ���������� �����
    static void vaTest(String msg,int...v){  // v �������� �������� � ��������� � ���� ��� ��������� ������������ ����, ������ ���� ���������� ��������� ����� ��������
        System.out.println(msg + v.length  + "  Soderzhimoe :");
        for (int x : v){
            System.out.print(x + "  ");
        }
        System.out.println();

    }
}
