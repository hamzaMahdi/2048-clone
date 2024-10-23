// The "Two_zero_four_eight" class.
// this is a commit from 2024
import java.awt.*;
import hsa.Console;

public class Two_zero_four_eight
{
    static Console c;           // The output console

    static final char LEFT = 'a';
    static final char RIGHT = 'd';
    static final char UP = 'w';
    static final char DOWN = 's';
    static final int TIME_DELAY = 1000;

    public static void main (String[] args)
    {
	c = new Console ();
	Two_zero_four_eight z = new Two_zero_four_eight ();

	int n = 4;
	int A[] [] = new int [n] [n];
	for (int i = 0 ; i <= n - 1 ; ++i)
	    for (int j = 0 ; j <= n - 1 ; ++j)
	    {
		A [i] [j] = 0;
	    }

	char key;
	while (true)
	{
	    //z.spawnrandom (A, n);
	    if (c.isCharAvail ())
	    {
		key = c.getChar ();
		if (key == UP)
		{
		    z.movenumbersup (A, n);
		    z.displacenumbersup (A);
		}
		if (key == LEFT)
		{
		    z.movenumbersleft (A, n);
		    z.displacenumbersleft (A);
		}
		if (key == RIGHT)
		{
		    z.movenumbersright (A, n);
		    z.displacenumbersright (A);
		}
		if (key == DOWN)
		{
		    z.movenumbersdown (A, n);
		    z.displacenumbersdown (A);
		}


	    }
	    for (int i = 0 ; i <= n - 1 ; ++i)
	    {
		c.println ();
		for (int j = 0 ; j <= n - 1 ; ++j)
		{
		    c.print (A [i] [j]);
		    c.print("  ");
		}
	    }
	    try
	    {
		Thread.sleep (TIME_DELAY);
	    }
	    catch (InterruptedException e)

	    {
	    }
	    c.clear ();

	}




    } // main method


    public static void spawnrandom (int A[] [], int n)
    {
	int k = 1;
	for (int i = 0 ; i <= n - 1 ; ++i)
	{
	    for (int j = 0 ; j <= n - 1 ; ++j)
	    {
		if (A [i] [j] == 0)
		{
		    A [i] [j] = (int) Math.round (2 * Math.random ()) / 2 * 2 + 2;
		    k = 0;
		}
		if (k == 0)
		    break;
	    }
	    if (k == 0)
		break;
	}
	/*while(true)
	{
	    if( A[Math.round(Math.random)+Math.round(Math.random)+Math.round(Math.random)+Math.round(Math.random)][Math.round(Math.random)+Math.round(Math.random)+Math.round(Math.random)+Math.round(Math.random)]==0)
	    {
	    }*/
    }


    public static void movenumbersup (int A[] [], int n)
    {

	for (int i = 0 ; i <= n - 2 ; ++i)
	{
	    if (A [i] [0] == A [i + 1] [0])
	    {
		A [i] [0] = A [i] [0] + A [i + 1] [0];
		A [i + 1] [0] = 0;
	    }
	}
	for (int i = 0 ; i <= n - 2 ; ++i)
	{
	    if (A [i] [1] == A [i + 1] [1])
	    {
		A [i] [1] = A [i] [1] + A [i + 1] [1];
		A [i + 1] [1] = 0;
	    }
	}
	for (int i = 0 ; i <= n - 2 ; ++i)
	{
	    if (A [i] [2] == A [i + 1] [2])
	    {
		A [i] [2] = A [i] [2] + A [i + 1] [2];
		A [i + 1] [2] = 0;
	    }
	}
	for (int i = 0 ; i <= n - 2 ; ++i)
	{
	    if (A [i] [3] == A [i + 1] [3])
	    {
		A [i] [3] = A [i] [3] + A [i + 1] [3];
		A [i + 1] [3] = 0;
	    }
	}
	spawnrandom (A, n);
    }


    public static void movenumbersdown (int A[] [], int n)
    {

	for (int i = 3 ; i >= 1 ; --i)
	{
	    if (A [i] [0] == A [i - 1] [0])
	    {
		A [i] [0] = A [i] [0] + A [i - 1] [0];
		A [i - 1] [0] = 0;
	    }
	}
	for (int i = 3 ; i >= 1 ; --i)
	{
	    if (A [i] [1] == A [i - 1] [1])
	    {
		A [i] [1] = A [i] [1] + A [i - 1] [1];
		A [i - 1] [1] = 0;
	    }
	}
	for (int i = 3 ; i >= 1 ; --i)
	{
	    if (A [i] [2] == A [i - 1] [2])
	    {
		A [i] [2] = A [i] [2] + A [i - 1] [2];
		A [i - 1] [2] = 0;
	    }
	}
	for (int i = 3 ; i >= 1 ; --i)
	{
	    if (A [i] [3] == A [i - 1] [3])
	    {
		A [i] [3] = A [i] [3] + A [i - 1] [3];
		A [i - 1] [3] = 0;
	    }
	}
	spawnrandom (A, n);
    }


    public static void movenumbersleft (int A[] [], int n)
    {
	for (int j = 0 ; j <= n - 2 ; ++j)
	{
	    if (A [0] [j] == A [0] [j + 1])
	    {
		A [0] [j] = A [0] [j] + A [0] [j + 1];
		A [0] [j + 1] = 0;
	    }
	}
	for (int j = 0 ; j <= n - 2 ; ++j)
	{
	    if (A [1] [j] == A [1] [j + 1])
	    {
		A [1] [j] = A [1] [j] + A [1] [j + 1];
		A [1] [j + 1] = 0;
	    }
	}
	for (int j = 0 ; j <= n - 2 ; ++j)
	{
	    if (A [2] [j] == A [2] [j + 1])
	    {
		A [2] [j] = A [2] [j] + A [2] [j + 1];
		A [2] [j + 1] = 0;
	    }
	}
	for (int j = 0 ; j <= n - 2 ; ++j)
	{
	    if (A [3] [j] == A [3] [j + 1])
	    {
		A [3] [j] = A [3] [j] + A [3] [j + 1];
		A [3] [j + 1] = 0;
	    }
	}
	spawnrandom (A, n);


    }


    public static void movenumbersright (int A[] [], int n)
    {
	for (int j = 3 ; j >= 1 ; --j)
	{
	    if (A [0] [j] == A [0] [j - 1])
	    {
		A [0] [j] = A [0] [j] + A [0] [j - 1];
		A [0] [j - 1] = 0;
	    }
	}
	for (int j = 3 ; j >= 1 ; --j)
	{
	    if (A [1] [j] == A [1] [j - 1])
	    {
		A [1] [j] = A [1] [j] + A [1] [j - 1];
		A [1] [j - 1] = 0;
	    }
	}
	for (int j = 3 ; j >= 1 ; --j)
	{
	    if (A [2] [j] == A [2] [j - 1])
	    {
		A [2] [j] = A [2] [j] + A [2] [j - 1];
		A [2] [j - 1] = 0;
	    }
	}
	for (int j = 3 ; j >= 1 ; --j)
	{
	    if (A [3] [j] == A [3] [j - 1])
	    {
		A [3] [j] = A [3] [j] + A [3] [j - 1];
		A [3] [j - 1] = 0;
	    }
	}
	spawnrandom (A, n);
    }


    public static void displacenumbersup (int A[] [])
    {
	int b = 0;
	do
	{
	    for (int i = 0 ; i <= 2 ; ++i)
	    {
		b = 0;
		    if (A [i] [0] == 0)
		    {
			A [i] [0] = A [i + 1] [0];
			if (A [i + 1] [0] != 0)
			    b = b + 1;
			A [i + 1] [0] = 0;

		    }
		    if (A [i] [1] == 0)
		    {
			A [i] [1] = A [i + 1] [1];
			if (A [i + 1] [1] != 0)
			    b = b + 1;
			A [i + 1] [1] = 0;

		    }
		    if (A [i] [2] == 0)
		    {
			A [i] [2] = A [i + 1] [2];
			if (A [i + 1] [2] != 0)
			    b = b + 1;
			A [i + 1] [2] = 0;

		    }
		    if (A [i] [3] == 0)
		    {
			A [i] [3] = A [i + 1] [3];
			if (A [i + 1] [3] != 0)
			    b = b + 1;
			A [i + 1] [3] = 0;

		    }
	    }
	}
	while (b != 0);

    }


    public static void displacenumbersdown (int A[] [])
    {
	int b = 0;
	do
	{
	    b = 0;
	    for (int i = 3 ; i >= 1 ; --i)
	    {
		if (A [i] [0] == 0)
		{
		    A [i] [0] = A [i - 1] [0];
		    if (A [i - 1] [0] != 0)
			b = b + 1;
		    A [i - 1] [0] = 0;

		}
		if (A [i] [1] == 0)
		{
		    A [i] [1] = A [i - 1] [1];
		    if (A [i - 1] [1] != 0)
			b = b + 1;
		    A [i - 1] [1] = 0;

		}
		if (A [i] [2] == 0)
		{
		    A [i] [2] = A [i - 1] [2];
		    if (A [i - 1] [2] != 0)
			b = b + 1;
		    A [i - 1] [2] = 0;

		}
		if (A [i] [3] == 0)
		{
		    A [i] [3] = A [i - 1] [3];
		    if (A [i - 1] [3] != 0)
			b = b + 1;
		    A [i - 1] [3] = 0;

		}
	    }
	}
	while (b != 0);
    }


    public static void displacenumbersleft (int A[] [])
    {
	int b = 0;
	do
	{
	    b = 0;
	    for (int j = 0 ; j <= 2 ; ++j)
	    {
		if (A [0] [j] == 0)
		{
		    A [0] [j] = A [0] [j + 1];
		    if (A [0] [j + 1] != 0)
			++b;
		    A [0] [j + 1] = 0;

		}
		if (A [1] [j] == 0)
		{
		    A [1] [j] = A [1] [j + 1];
		    if (A [1] [j + 1] != 0)
			++b;
		    A [1] [j + 1] = 0;

		}
		if (A [2] [j] == 0)
		{
		    A [2] [j] = A [2] [j + 1];
		    if (A [2] [j + 1] != 0)
			++b;
		    A [2] [j + 1] = 0;

		}
		if (A [3] [j] == 0)
		{
		    A [3] [j] = A [3] [j + 1];
		    if (A [3] [j + 1] != 0)
			++b;
		    A [3] [j + 1] = 0;

		}
	    }
	}
	while (b != 0);
    }


    public static void displacenumbersright (int A[] [])
    {
	int b = 0;
	do
	{
	    b = 0;
	    for (int j = 3 ; j >= 1 ; --j)
	    {
		if (A [0] [j] == 0)
		{
		    A [0] [j] = A [0] [j - 1];
		    if (A [0] [j - 1] != 0)
			++b;
		    A [0] [j - 1] = 0;

		}
		if (A [1] [j] == 0)
		{
		    A [1] [j] = A [1] [j - 1];
		    if (A [1] [j - 1] != 0)
			++b;
		    A [1] [j - 1] = 0;

		}
		if (A [2] [j] == 0)
		{
		    A [2] [j] = A [2] [j - 1];
		    if (A [2] [j - 1] != 0)
			++b;
		    A [2] [j - 1] = 0;

		}
		if (A [3] [j] == 0)
		{
		    A [3] [j] = A [3] [j - 1];
		    if (A [3] [j - 1] != 0)
			++b;
		    A [3] [j - 1] = 0;

		}

	    }
	}
	while (b != 0);
    }
} // Two_zero_four_eight class


