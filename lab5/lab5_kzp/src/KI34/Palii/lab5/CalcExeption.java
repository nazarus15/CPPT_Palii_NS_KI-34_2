package KI34.Palii.lab5;
import java.util.Scanner;
import java.io.*;
import static java.lang.System.out;

/**
 * Class <code>CalcException</code> more precises ArithmeticException
 * @author EOM Stuff
 * @version 1.0
 */
class CalcException extends ArithmeticException
{
    public CalcException(){}

    public CalcException(String cause)
    {
        super(cause);
    }
}