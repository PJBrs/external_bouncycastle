package org.bouncycastle.util;

import java.math.BigInteger;

/**
 * General array utilities.
 */
public final class Arrays
{
    private Arrays() 
    {
        // static class, hide constructor
    }
    
    public static boolean areEqual(
        boolean[]  a,
        boolean[]  b)
    {
        if (a == b)
        {
            return true;
        }

        if (a == null || b == null)
        {
            return false;
        }

        if (a.length != b.length)
        {
            return false;
        }

        for (int i = 0; i != a.length; i++)
        {
            if (a[i] != b[i])
            {
                return false;
            }
        }

        return true;
    }

    public static boolean areEqual(
        byte[]  a,
        byte[]  b)
    {
        if (a == b)
        {
            return true;
        }

        if (a == null || b == null)
        {
            return false;
        }

        if (a.length != b.length)
        {
            return false;
        }

        for (int i = 0; i != a.length; i++)
        {
            if (a[i] != b[i])
            {
                return false;
            }
        }

        return true;
    }

    /**
     * A constant time equals comparison - does not terminate early if
     * test will fail.
     *
     * @param a first array
     * @param b second array
     * @return true if arrays equal, false otherwise.
     */
    public static boolean constantTimeAreEqual(
        byte[]  a,
        byte[]  b)
    {
        if (a == b)
        {
            return true;
        }

        if (a == null || b == null)
        {
            return false;
        }

        if (a.length != b.length)
        {
            return false;
        }

        int nonEqual = 0;

        for (int i = 0; i != a.length; i++)
        {
            nonEqual |= (a[i] ^ b[i]);
        }

        return nonEqual == 0;
    }

    public static boolean areEqual(
        int[]  a,
        int[]  b)
    {
        if (a == b)
        {
            return true;
        }

        if (a == null || b == null)
        {
            return false;
        }

        if (a.length != b.length)
        {
            return false;
        }

        for (int i = 0; i != a.length; i++)
        {
            if (a[i] != b[i])
            {
                return false;
            }
        }

        return true;
    }

    public static boolean areEqual(
        long[]  a,
        long[]  b)
    {
        if (a == b)
        {
            return true;
        }

        if (a == null || b == null)
        {
            return false;
        }

        if (a.length != b.length)
        {
            return false;
        }

        for (int i = 0; i != a.length; i++)
        {
            if (a[i] != b[i])
            {
                return false;
            }
        }

        return true;
    }

    public static boolean areEqual(
        BigInteger[]  a,
        BigInteger[]  b)
    {
        if (a == b)
        {
            return true;
        }

        if (a == null || b == null)
        {
            return false;
        }

        if (a.length != b.length)
        {
            return false;
        }

        for (int i = 0; i != a.length; i++)
        {
            if (a[i] != b[i])
            {
                return false;
            }
        }

        return true;
    }

    public static void fill(
        byte[] array,
        byte value)
    {
        for (int i = 0; i < array.length; i++)
        {
            array[i] = value;
        }
    }
    
    public static void fill(
        long[] array,
        long value)
    {
        for (int i = 0; i < array.length; i++)
        {
            array[i] = value;
        }
    }

    public static void fill(
        short[] array, 
        short value)
    {
        for (int i = 0; i < array.length; i++)
        {
            array[i] = value;
        }
    }

    public static int hashCode(byte[] data)
    {
        if (data == null)
        {
            return 0;
        }

        int i = data.length;
        int hc = i + 1;

        while (--i >= 0)
        {
            hc *= 257;
            hc ^= data[i];
        }

        return hc;
    }

    public static int hashCode(int[] data)
    {
        if (data == null)
        {
            return 0;
        }

        int i = data.length;
        int hc = i + 1;

        while (--i >= 0)
        {
            hc *= 257;
            hc ^= data[i];
        }

        return hc;
    }

    public static int hashCode(BigInteger[] data)
    {
        if (data == null)
        {
            return 0;
        }

        int i = data.length;
        int hc = i + 1;

        while (--i >= 0)
        {
            hc *= 257;
            hc ^= data[i].hashCode();
        }

        return hc;
    }

    public static byte[] clone(byte[] data)
    {
        if (data == null)
        {
            return null;
        }
        byte[] copy = new byte[data.length];

        System.arraycopy(data, 0, copy, 0, data.length);

        return copy;
    }

    public static int[] clone(int[] data)
    {
        if (data == null)
        {
            return null;
        }
        int[] copy = new int[data.length];

        System.arraycopy(data, 0, copy, 0, data.length);

        return copy;
    }

    public static byte[] copyOf(byte[] data, int newLength)
    {
        byte[] tmp = new byte[newLength];

        if (newLength < data.length)
        {
            System.arraycopy(data, 0, tmp, 0, newLength);
        }
        else
        {
            System.arraycopy(data, 0, tmp, 0, data.length);
        }

        return tmp;
    }

    public static int[] copyOf(int[] data, int newLength)
    {
        int[] tmp = new int[newLength];

        if (newLength < data.length)
        {
            System.arraycopy(data, 0, tmp, 0, newLength);
        }
        else
        {
            System.arraycopy(data, 0, tmp, 0, data.length);
        }

        return tmp;
    }

    public static long[] copyOf(long[] data, int newLength)
    {
        long[] tmp = new long[newLength];

        if (newLength < data.length)
        {
            System.arraycopy(data, 0, tmp, 0, newLength);
        }
        else
        {
            System.arraycopy(data, 0, tmp, 0, data.length);
        }

        return tmp;
    }

    public static BigInteger[] copyOf(BigInteger[] data, int newLength)
    {
        BigInteger[] tmp = new BigInteger[newLength];

        if (newLength < data.length)
        {
            System.arraycopy(data, 0, tmp, 0, newLength);
        }
        else
        {
            System.arraycopy(data, 0, tmp, 0, data.length);
        }

        return tmp;
    }

    public static byte[] copyOfRange(byte[] data, int from, int to)
    {
        int newLength = getLength(from, to);

        byte[] tmp = new byte[newLength];

        if (data.length - from < newLength)
        {
            System.arraycopy(data, from, tmp, 0, data.length - from);
        }
        else
        {
            System.arraycopy(data, from, tmp, 0, newLength);
        }

        return tmp;
    }

    public static int[] copyOfRange(int[] data, int from, int to)
    {
        int newLength = getLength(from, to);

        int[] tmp = new int[newLength];

        if (data.length - from < newLength)
        {
            System.arraycopy(data, from, tmp, 0, data.length - from);
        }
        else
        {
            System.arraycopy(data, from, tmp, 0, newLength);
        }

        return tmp;
    }

    public static long[] copyOfRange(long[] data, int from, int to)
    {
        int newLength = getLength(from, to);

        long[] tmp = new long[newLength];

        if (data.length - from < newLength)
        {
            System.arraycopy(data, from, tmp, 0, data.length - from);
        }
        else
        {
            System.arraycopy(data, from, tmp, 0, newLength);
        }

        return tmp;
    }

    public static BigInteger[] copyOfRange(BigInteger[] data, int from, int to)
    {
        int newLength = getLength(from, to);

        BigInteger[] tmp = new BigInteger[newLength];

        if (data.length - from < newLength)
        {
            System.arraycopy(data, from, tmp, 0, data.length - from);
        }
        else
        {
            System.arraycopy(data, from, tmp, 0, newLength);
        }

        return tmp;
    }

    private static int getLength(int from, int to)
    {
        int newLength = to - from;
        if (newLength < 0)
        {
            throw new IllegalArgumentException(from + " > " + to);
        }
        return newLength;
    }
}
