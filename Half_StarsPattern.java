//Star pattern 

import java.util.Scanner;
class Half_StarsPattern{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter the value of n: ");
int n=sc.nextInt();
sc.close();
System.out.println();
for(int i=1;i<=n;i++){
for(int j=1;j<=i;j++){
System.out.print("*");
}
System.out.println();
}
}
}
