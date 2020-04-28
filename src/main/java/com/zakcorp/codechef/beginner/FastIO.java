package com.zakcorp.codechef.beginner;

import java.io.InputStream;
import java.io.OutputStream;
class FasterReader
{
    private int length;
    private int index;
    private byte[] buffer;

    public FasterReader( InputStream stream, int max ) throws Exception
    {
        buffer = new byte[max];
        length = stream.read(buffer);
        index=0;
        buffer[length] = '\n';
    }

    public int readInt(char separator)
    {
        int result = 0;
        byte c = buffer[index++];
        while(c!=separator)
        {
            result *= 10;
            result += c-48;
            c = buffer[index++];
        }
        return result;
    }

    public int[] readIntArray( int n )
    {
        int[] array = new int[n];

        int n1 = n-1;
        for( int i=0; i<n1 ;i++ )
            array[i] = readInt(' ');

        array[n1] = readInt('\n');

        return array;
    }
}

class FasterWriter
{
    private byte[] buffer;
    private int index;

    public FasterWriter( OutputStream stream, int max ) throws Exception
    {
        buffer = new byte[max];
        index = -1;
    }

    public void writeInt( int n )
    {
        int l = (n==0 ? 1 : ((int)Math.log10(n)) + 1);

        for(int i=index+l; i>index ;i--)
        {
            buffer[i] = (byte)(n%10 + 48);
            n = n/10;
        }

        index += l;
        buffer[++index] = '\n';
    }

    public void flush() throws Exception
    {
        System.out.write( buffer,0,index+1);
        index = -1;
    }
}
