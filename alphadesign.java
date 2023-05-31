import java.util.*;
 public class game2 {
    public static void main(String[] args)
    {
    String a1[][]=new String[7][7];
    String arr[][]=new String[7][7];
    String a2[][]=new String[7][7];
    String a3[][]=new String[7][7];
    String a4[][]=new String[7][7];
    String a5[][]=new String[7][7];
    String a6[][]=new String[7][7];
    String a7[][]=new String[7][7];
    String a8[][]=new String[7][7];
    String a9[][]=new String[7][7];
    String a10[][]=new String[7][7];
    String a11[][]=new String[7][7];
    String a12[][]=new String[7][7];
    String a13[][]=new String[7][7];
    String a14[][]=new String[7][7];
    String a15[][]=new String[7][7];
    String a16[][]=new String[7][7];
    String a17[][]=new String[7][7];
    String a18[][]=new String[7][7];
    String a19[][]=new String[7][7];
    String a20[][]=new String[7][7];
    String a21[][]=new String[7][7];
    String a22[][]=new String[7][7];
    String a23[][]=new String[7][7];
    String a24[][]=new String[7][7];
    String a25[][]=new String[7][7];
    String a26[][]=new String[7][7];
    String a27[][]=new String[7][7];

    Scanner sc=new Scanner(System.in);
    System.out.println("Enter string\n");
    String v=sc.nextLine();
    double l= v.length();
    int m= v.length();
    String var= v.toUpperCase();

 for(int i=0;i<l;i++)  
{
if((var.charAt(i)) == 'E')
{
 for (int r = 0; r < 7; r++)
 {
      for (int c = (0); c < (7); c++)
      {
        if (c == (1) || ((r == 0 || r == 6) && (c > (1) && c < (6))) || (r == 3 && c > (1) && c < (6)))
        arr[r][c]="ee";
        else
        arr[r][c]="  ";
    }
}}
//D
if((var.charAt(i))=='D')
{
 for (int r = 0; r < 7; r++)
 {
      for (int c = 0; c < 7; c++)
      {
        if (c == 1 || ((r == 0 || r == 6) && (c>1 && c < 5)) || (c == 5 && r != 0 && r!=6))
          a1[r][c]="dd";
          else
          a1[r][c]="  ";
      }
}}
if((var.charAt(i))=='A'){
     for (int r = 0; r < 7; r++) {
          for (int c = 0; c < 7; c++) {
            if (((c==1 || c==5) && r!=0) || ((r==0 || r==3) && (c>1 && c<5)))
              a2[r][c]="aa";
            else
              a2[r][c]="  ";
          }
    }}
    if((var.charAt(i))=='B'){
     for (int r = 0; r <7; r++) {
          for (int c = 0; c < 7; c++) {
            if (c == 1 || ((r == 0 || r == 3 || r == 6) && c > 1 && c < 5) || (c == 5 && ((r != 0 && r < 3)||(r > 3 && r < 6)) ))
              a3[r][c]="bb";
            else
              a3[r][c]="  ";
          }
    }}
    if((var.charAt(i))=='C'){
     for (int r = 0; r <7; r++) {
          for (int c = 0; c <7; c++) {
            if (((r == 0 || r == 6) && (c>1 && c < 5)) || (c == 1 && r != 0 && r!=6))
              a4[r][c]="cc";
            else
              a4[r][c]="  ";
          }
    }}
    if((var.charAt(i))=='F'){
     for (int r = 0; r <7; r++) {
          for (int c = 0; c <7; c++) {
            if (c == 1 || (r == 0  && (c > 1 && c < 6)) || (r == 3 && c > 1 && c < 5))
              a5[r][c]="ff";
            else
              a5[r][c]="  ";
          }
    }}
    if((var.charAt(i))=='G'){
     for (int r = 0; r < 7; r++) {
          for (int c = 0; c < 7; c++) {
            if ((c == 1 && r != 0 && r != 6) || ((r == 0 || r == 6) && c > 1 && c < 5) || (r == 3 && c > 2 && c < 6) || (c == 5 && r!= 0 && r != 2 && r != 6))
            a6[r][c]="gg";
            else
              a6[r][c]="  ";
          }
    }}
    if((var.charAt(i))=='H'){
     for (int r = 0; r <7; r++) {
          for (int c = 0; c<7; c++) {
            if (c == 1 || c == 5 || (r == 3 && c > 1 && c < 5))
              a7[r][c]="hh";
            else
              a7[r][c]="  ";
          }
    }}
    if((var.charAt(i))=='I'){
     for (int r = 0; r <7; r++) {
          for (int c = 0; c < 7; c++) {
            if (c==3 || ((r==0 || r == 6) && c>0 && c<6))
              a8[r][c]="ii";
            else
              a8[r][c]="  ";
          }
    }}
    if((var.charAt(i))=='J'){
     for (int r = 0; r <7; r++) {
          for (int c = 0; c < 7; c++) {
            if ((c==3&&(r>0&&r<6)) || (r==0 && c>0 && c<6) || (r == 5 && (c == 3 || c == 0) || (r == 6 && (c == 1 || c == 2))))
              a9[r][c]="jj";
            else
              a9[r][c]="  ";
          }
    }}
    if((var.charAt(i))=='K'){
     for (int r = 0; r < 7; r++) {
          for (int c = 0; c <7; c++) {
            if (c == 1 || (c == 2  && (r== 2||r==4)) ||(c==3&&(r==1||r==5))|| (c==4&&(r == 0 || r == 6)))
          a10[r][c]="kk";
            else
              a10[r][c]="  ";
          }
    }}
    if((var.charAt(i))=='L'){
     for (int r = 0; r <7; r++) {
          for (int c = 0; c <7; c++) {
            if (c == 1 || (r == 6 && c != 0 && c < 6))
              a11[r][c]="ll";
            else
              a11[r][c]="  ";
          }
    }}
    if((var.charAt(i))=='M'){
     for (int r = 0; r <7; r++) {
          for (int c = 0; c < 7; c++) {
            if (c == 1 || c == 5 || (r == 2 && (c == 2 || c == 4)) || (r == 3 && c == 3))
              a12[r][c]="mm";
            else
              a12[r][c]="  ";
          }
    }}
    if((var.charAt(i))=='N'){
     for (int r = 0; r < 7; r++) {
          for (int c = 0; c < 7; c++) {
            if (c == 0 || c == 5 || (c == r  && (r > 0 && r < 6)))
              a13[r][c]="nn";
            else
              a13[r][c]="  ";
          }
    }}
    if((var.charAt(i))=='O'){
     for (int r = 0; r < 7; r++) {
          for (int c = 0; c < 7; c++) {
            if (((c == 1 || c == 5) && r != 0 && r != 6) || ((r == 0 || r == 6) && c > 1 && c < 5))
              a14[r][c]="oo";
            else
              a14[r][c]="  ";
          }
    }}
    if((var.charAt(i))=='P'){
     for (int r = 0; r < 7; r++) {
          for (int c = 0; c < 7; c++) {
            if (c == 1 || ((r == 0 || r == 3) && c > 0 && c < 5) || ((c == 5 || c == 1) && (r == 1 || r == 2)))
          a15[r][c]="pp";
            else
          a15[r][c]="  ";
          }
    }}
    if((var.charAt(i))=='Q'){
     for (int r = 0; r < 7; r++) {
          for (int c = 0; c < 7; c++) {
            if (((c == 1 || c == 5) && r != 0 && r != 6) || ((r == 0 || r == 6) && c > 1 && c < 5) || (r==4&&c==3)||(r==5&&c==4)||(r==5&&c==6)||(r==6&&c==6))
              a16[r][c]="qq";
            else
              a16[r][c]="  ";
          }
     }}
     if((var.charAt(i))=='R'){
          for (int r = 0; r <7; r++) {
               for (int c = 0; c < 7; c++) {
                 if (c == 1 || ((r == 0 || r == 3) && c > 1 && c < 5) || (c == 5 && r != 0 && r < 3) || (c == r - 1 && r > 2))
                   a17[r][c]="rr";
                 else
                   a17[r][c]="  ";
               }
         }}
         if((var.charAt(i))=='S'){
          for (int r = 0; r < 7; r++) {
               for (int c = 0; c < 7; c++) {
                 if (((r == 0 || r == 3 || r == 6) && c > 1 && c < 5) || (c == 1 && (r == 1 || r == 2 || r == 6)) || (c == 5 && (r == 0 || r == 4 || r == 5)))
                   a18[r][c]="ss";
                 else
                   a18[r][c]="  ";
               }
         }}
         if((var.charAt(i))=='T'){
          for (int r = 0; r < 7; r++) {
               for (int c = 0; c <7; c++) {
                 if (c==3 || (r==0 && c>0 && c<6))  
                   a19[r][c]="**";
                 else
                   a19[r][c]="  ";
               }
         }}
         if((var.charAt(i))=='U'){
          for (int r = 0; r <7; r++) {
               for (int c = 0; c <7; c++) {
                 if (((c == 1 || c == 5) && r != 6) || (r == 6 && c > 1 && c < 5))
                   a20[r][c]="uu";
                 else
                   a20[r][c]="  ";
               }
         }}
         if((var.charAt(i))=='V'){
          for (int r = 0; r <7; r++) {
               for (int c = 0; c <7; c++) {
                 if ((r<4&&(c==0||c==6))||(r==5&&(c==2||c==4))||(r==4&&(c==1||c==5))||(r==6&&c==3))
                   a21[r][c]="vv";
                 else
                   a21[r][c]="  ";
               }
         }}
         if((var.charAt(i))=='W'){
          for (int r = 0; r < 7; r++) {
               for (int c = 0; c <7; c++) {
                 if (c == 1 || c == 5 || (r == 4 && (c == 2 || c == 4)) || (r == 3 && c == 3))
                 a22[r][c]="* ";
                 else
                   a22[r][c]="  ";
               }
         }}
         if((var.charAt(i))=='X'){
          for (int r = 0; r <7; r++) {
               for (int c = 0; c <7; c++) {
                 if (((c == 1 || c == 5) && (r > 4 || r < 2)) || r == c && c > 0 && c < 6 || (c == 2 && r == 4) || (c == 4 && r == 2))
                 a23[r][c]="xx";
                 else
                   a23[r][c]="  ";
               }
         }}
         if((var.charAt(i))=='Y'){
          for (int r = 0; r <7; r++) {
               for (int c = 0; c <7; c++) {
                 if ((r==0&&(c==0||c==6))||(r==2&&(c==2||c==4))||(r==6&&c==3)||(r==1&&(c==1||c==5))||(r==3&&c==3)||(r==4&&c==3)||(r==5&&c==3))
                   a24[r][c]="yy";
                 else
                   a24[r][c]="  ";
               }
         }}
         if((var.charAt(i))=='Z'){
          for (int r = 0; r < 7; r++) {
               for (int c = 0; c <7; c++) {
                 if (((r == 0 || r == 6) && c > 0 && c < 6) || r+c==6)
                 a25[r][c]="zz";
                 else
                   a25[r][c]="  ";
               }
         }}
         if((var.charAt(i))==' '){
          for (int r = 0; r < 7; r++) {
               for (int c = 0; c <7; c++) {
                 if (((r == 0 || r == 6) && c > 0 && c < 6) || r+c==6)
                 a26[r][c]="  ";
                 else
                   a26[r][c]="  ";
               }
         }}
         if((var.charAt(i))=='.'){
          for (int r = 0; r < 7; r++) {
               for (int c = 0; c <7; c++) {
                 if (r==6&&c==3)
                 a27[r][c]="* ";
                 else
                   a27[r][c]="  ";
               }
         }}
         


}//string for loop end

//sequence print
double n=l/8;
 double s=Math.ceil(n);
for(int k=0;k<s;k++){
  //System.out.println(s);
  int b=(k*8);
  int d=b+8;
  if(k==(s-1)){
  if(m%8!=0){
  d=(m%8)+b;
  //System.out.println(d);
}}

 
for (int r = 0; r < 7; r++)
{
for(int i=b;i<d;i++){
     //A
     for (int c = 0; c<7; c++){
          if((var.charAt(i))=='A')
          System.out.print(a2[r][c]);}
     //B
     for (int c = 0; c<7; c++){
          if((var.charAt(i))=='B')
          System.out.print(a3[r][c]);}
     //C
     for (int c = 0; c<7; c++){
          if((var.charAt(i))=='C')
          System.out.print(a4[r][c]);}
     //D
     for (int c = 0; c<7; c++){
          if((var.charAt(i))=='D')
          System.out.print(a1[r][c]);}
     //E
     for (int c = 0; c<7; c++) {
          if((var.charAt(i)) == 'E')
          System.out.print(arr[r][c]);}
     //F
     for (int c = 0; c<7; c++){
          if((var.charAt(i))=='F')
          System.out.print(a5[r][c]);}
     //G
     for (int c = 0; c<7; c++){
          if((var.charAt(i))=='G')
          System.out.print(a6[r][c]);}
     //H
     for (int c = 0; c<7; c++){
          if((var.charAt(i))=='H')
          System.out.print(a7[r][c]);}
     //I
     for (int c = 0; c<7; c++){
          if((var.charAt(i))=='I')
          System.out.print(a8[r][c]);}
     //J
     for (int c = 0; c<7; c++){
          if((var.charAt(i))=='J')
          System.out.print(a9[r][c]);}
     //K
     for (int c = 0; c<7; c++){
          if((var.charAt(i))=='K')
          System.out.print(a10[r][c]);}
     //L
     for (int c = 0; c<7; c++){
          if((var.charAt(i))=='L')
          System.out.print(a11[r][c]);}
     //M
     for (int c = 0; c<7; c++){
          if((var.charAt(i))=='M')
          System.out.print(a12[r][c]);}
     //N
     for (int c = 0; c<7; c++){
          if((var.charAt(i))=='N')
          System.out.print(a13[r][c]);}
     //O
     for (int c = 0; c<7; c++){
               if((var.charAt(i))=='O')
               System.out.print(a14[r][c]);}
     //P
     for (int c = 0; c<7; c++){
          if((var.charAt(i))=='P')
          System.out.print(a15[r][c]);}
     //Q
     for (int c = 0; c<7; c++){
          if((var.charAt(i))=='Q')
          System.out.print(a16[r][c]);}
     //R
     for (int c = 0; c<7; c++){
          if((var.charAt(i))=='R')
          System.out.print(a17[r][c]);}
     //S
     for (int c = 0; c<7; c++){
          if((var.charAt(i))=='S')
          System.out.print(a18[r][c]);}
     //T
     for (int c = 0; c<7; c++){
          if((var.charAt(i))=='T')
          System.out.print(a19[r][c]);}
     //U
     for (int c = 0; c<7; c++){
          if((var.charAt(i))=='U')
          System.out.print(a20[r][c]);}
     //V
     for (int c = 0; c<7; c++){
          if((var.charAt(i))=='V')
          System.out.print(a21[r][c]);}
     //W
     for (int c = 0; c<7; c++){
          if((var.charAt(i))=='W')
          System.out.print(a22[r][c]);}
     //x
     for (int c = 0; c<7; c++){
          if((var.charAt(i))=='X')
          System.out.print(a23[r][c]);}
     //Y
     for (int c = 0; c<7; c++){
          if((var.charAt(i))=='Y')
          System.out.print(a24[r][c]);}
     //Z
     for (int c = 0; c<7; c++){
          if((var.charAt(i))=='Z')
          System.out.print(a25[r][c]);}
      // .
      for (int c = 0; c<7; c++){
        if((var.charAt(i))=='.')
        System.out.print(a27[r][c]);}
      // " "
      for (int c = 0; c<7; c++){
        if((var.charAt(i))==' ')
        System.out.print(a26[r][c]);}
     }//string for
     System.out.println("");
}//row loop

System.out.println();
}
/*//+8 string sequence
for (int r = 0; r < 7; r++)
{
for(int i=8;i<l;i++){
     //A
     for (int c = 0; c<7; c++){
          if((var.charAt(i))=='A')
          System.out.print(a2[r][c]);}
     //B
     for (int c = 0; c<7; c++){
          if((var.charAt(i))=='B')
          System.out.print(a3[r][c]);}
     //C
     for (int c = 0; c<7; c++){
          if((var.charAt(i))=='C')
          System.out.print(a4[r][c]);}
     //D
     for (int c = 0; c<7; c++){
          if((var.charAt(i))=='D')
          System.out.print(a1[r][c]);}
     //E
     for (int c = 0; c<7; c++) {
          if((var.charAt(i)) == 'E')
          System.out.print(arr[r][c]);}
     //F
     for (int c = 0; c<7; c++){
          if((var.charAt(i))=='F')
          System.out.print(a5[r][c]);}
     //G
     for (int c = 0; c<7; c++){
          if((var.charAt(i))=='G')
          System.out.print(a6[r][c]);}
     //H
     for (int c = 0; c<7; c++){
          if((var.charAt(i))=='H')
          System.out.print(a7[r][c]);}
     //I
     for (int c = 0; c<7; c++){
          if((var.charAt(i))=='I')
          System.out.print(a8[r][c]);}
     //J
     for (int c = 0; c<7; c++){
          if((var.charAt(i))=='J')
          System.out.print(a9[r][c]);}
     //K
     for (int c = 0; c<7; c++){
          if((var.charAt(i))=='K')
          System.out.print(a10[r][c]);}
     //L
     for (int c = 0; c<7; c++){
          if((var.charAt(i))=='L')
          System.out.print(a11[r][c]);}
     //M
     for (int c = 0; c<7; c++){
          if((var.charAt(i))=='M')
          System.out.print(a12[r][c]);}
     //N
     for (int c = 0; c<7; c++){
          if((var.charAt(i))=='N')
          System.out.print(a13[r][c]);}
     //O
     for (int c = 0; c<7; c++){
               if((var.charAt(i))=='O')
               System.out.print(a14[r][c]);}
     //P
     for (int c = 0; c<7; c++){
          if((var.charAt(i))=='P')
          System.out.print(a15[r][c]);}
     //Q
     for (int c = 0; c<7; c++){
          if((var.charAt(i))=='Q')
          System.out.print(a16[r][c]);}
     //R
     for (int c = 0; c<7; c++){
          if((var.charAt(i))=='R')
          System.out.print(a17[r][c]);}
     //S
     for (int c = 0; c<7; c++){
          if((var.charAt(i))=='S')
          System.out.print(a18[r][c]);}
     //T
     for (int c = 0; c<7; c++){
          if((var.charAt(i))=='T')
          System.out.print(a19[r][c]);}
     //U
     for (int c = 0; c<7; c++){
          if((var.charAt(i))=='U')
          System.out.print(a20[r][c]);}
     //V
     for (int c = 0; c<7; c++){
          if((var.charAt(i))=='V')
          System.out.print(a21[r][c]);}
     //W
     for (int c = 0; c<7; c++){
          if((var.charAt(i))=='W')
          System.out.print(a22[r][c]);}
     //x
     for (int c = 0; c<7; c++){
          if((var.charAt(i))=='X')
          System.out.print(a23[r][c]);}
     //Y
     for (int c = 0; c<7; c++){
          if((var.charAt(i))=='Y')
          System.out.print(a24[r][c]);}
     //Z
     for (int c = 0; c<7; c++){
          if((var.charAt(i))=='Z')
          System.out.print(a25[r][c]);}
     }//string for
     System.out.println("");
}//row loop*/
}}//class end