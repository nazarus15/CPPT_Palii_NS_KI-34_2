package KI34.Palii.lab5;
import java.util.Scanner;
import java.io.*;
import static java.lang.System.out;

class CalcException extends ArithmeticException
{
    public CalcException(){}
    public CalcException(String cause)
    {
        super(cause);
    }
}