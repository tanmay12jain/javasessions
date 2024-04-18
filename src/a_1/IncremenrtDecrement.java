package a_1;

public class IncremenrtDecrement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 Incremental/Decremental Operators:   

1) What will be the output of the following program?

public class IncrementDecrementQuiz 
{
	public static void main(String[] args) 
	{
		int i = 11;
		
		i = i++ + ++i;
		
		System.out.println(i);
	}
}

//24
 */ 
  

		int i = 11;
		
		i = i++ + ++i;
		
		System.out.println(i);
/*

2) Guess the output of the following program?

public class IncrementDecrementQuiz 
{
	public static void main(String[] args) 
	{
		int a=11, b=22, c;
		
		c = a + b + a++ + b++ + ++a + ++b;
		
		System.out.println("a="+a);
		System.out.println("b="+b);
		System.out.println("c="+c);
	}
}
//13,24,103
 */ int a=11, b=22, c;
		
		c = a + b + a++ + b++ + ++a + ++b;
		
		System.out.println("a="+a);
		System.out.println("b="+b);
		System.out.println("c="+c);
		
		/*

3) What will be the output of the below program?

public class IncrementDecrementQuiz

{

    public static void main(String[] args)

    {

        int i=0;
        i = i++ - --i + ++i - i--;
        System.out.println(i);
    }

}//
*/
		int i1 = 0;
		int ji = i1++ - --i1 + ++i1 - i1-- - --i1;
		System.out.println(ji);
		

/*

4) Is the below program written correctly?

public class IncrementDecrementQuiz

{

    public static void main(String[] args)

    {

        boolean b = true;

         

        b++;

         

        System.out.println(b);

    }

}

		boolean b = true;
		b++;
		System.out.println(b);
		
/*

5) What will be the output of the below program?

public class IncrementDecrementQuiz

{

    public static void main(String[] args)

    {

        int i=1, j=2, k=3;
        int m = i-- - j-- - k--;

      
        System.out.println("i="+i);

        System.out.println("j="+j);

        System.out.println("k="+k);

        System.out.println("m="+m);

    }

}
//
*/ 
		//0,1,2,
		int i2=1, j=2, k=3;
		int m = i2-- - j-- - k--;

		System.out.println("i="+i2);
		System.out.println("j="+j);
		System.out.println("k="+k);
		System.out.println("m="+m);
/*

6) What will be the output of the following program?

public class IncrementDecrementQuiz

{

    public static void main(String[] args)

    {

        int a=1, b=2;         

        System.out.println(--b - ++a + ++b - --a);

    }

}// 1-2+2-1=0
*/
		int aa=1, bb=2;
		System.out.println(--bb - ++aa + ++bb - --aa);
		
		
		 int i3=19, j3=29, k3=0; 
		 int m3 = i3-- - j3-- - k3--;
		 System.out.println("i3="+i3);
		 System.out.println("j3="+j3); 
		 System.out.println("k3="+k3); 
		 
		 //18,28,-1
		 
		 int i4 = 11;
		// int j4 = --(i4++); will thrugh the error
		 
		 int m4 = 0, n4 = 0;
		 int p4 = --m4 * --n4 * n4-- * m4--; 
		 System.out.println(p4);
		 
		//1
		 int a4=1;
		 a4 = a4++ + ++a4 * --a4 - a4--; 
		 System.out.println(a4);
		 System.out.println(a4);
		 
		// int abc = 11++; invalid 
		 System.out.println(a);
		 
		 int chq = 'A';
		 System.out.println(chq++);
		 //65
		 
		 char ch = 'A'; 
		 System.out.println(++ch);
		 //B
		 
		 double d = 1.5, D = 2.5; 
		 System.out.println(d++ + ++D);//1.5 + 3.5 = 5.0
	}

}
