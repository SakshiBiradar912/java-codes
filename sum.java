import java.io.*;
class Add
{
    public static int sum(int num1,int num2)
    {
        return num1+num2;
    }

    public static void main(String[] args)
    {
        Add ob=new Add();
        int res=ob.sum(23,32);
        System.out.println(res);
    }
}