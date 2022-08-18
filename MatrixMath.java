

public class MatrixMath {

public float data[][];

public String toString()	{
	String mat="",row;
	int i,j;
	for(i=0; i<data.length; i++)	{
		row="";
		for(j=0; j<data[0].length; j++)
			row += String.format("%8.3f" ,data[i][j]);
		mat += row + "\n";
	}
	return(mat);
}


public MatrixMath(int r, int c)	{
	data = new float[r][c];
}

public MatrixMath(float m[][])	{
	data = m.clone();
}

public static MatrixMath multiply(MatrixMath A, MatrixMath B)	{
	int nrowsA = A.data.length;
	int ncolsB = B.data[0].length;
	int ncolsA = A.data[0].length;
	int nrowsB = B.data.length;

	if (ncolsA != nrowsB)	{
	System.out.println("can't multiply!");
	return(null);
	}
	MatrixMath C = new MatrixMath(nrowsA,ncolsB);
	int i,j,k;
	float s;
	for(i=0; i<nrowsA; i++)
		for(j=0; j<ncolsB; j++)	{
			s=0;
			for(k=0; k<ncolsA; k++)
				s+= A.data[i][k] * B.data[k][j];
			C.data[i][j] = s;
		}
	return(C);
}


public static void main(String[] args)	{


	//Example initialization and multiplication of matrices
	MatrixMath A = new MatrixMath(new float[][]{{1,2},{3,4},});
	System.out.println(A);

	MatrixMath B = new MatrixMath(new float[][]{{5},{-4}});
	System.out.println(B);

	MatrixMath C = MatrixMath.multiply(A,B);

	System.out.println(C);

}
}