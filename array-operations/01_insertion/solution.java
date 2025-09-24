import java.util.*;
public classInsertion{
  public static void main (String[] args) {
	int a[]= new int[10];
	a[0]=10;
	a[1]=20;
	a[2]=30;
	a[3]=40;
	int n=4;
	int pos=2, value=25;
	System.out.println("Before Insertion: ");
	for(int i=0; i<n; i++)
		System.out.println(a[i]+"");
	for(int i=n; i>pos; i--) {
		a[i]=a[i-1];
	}
	a[pos] = value;
	n++;
	System.out.println("\nAfter Insertion: ");
	for(int i=0; i<n; i++)
		System.out.println(a[i]+" ");
    }
}
