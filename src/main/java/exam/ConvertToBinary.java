package exam;

public class ConvertToBinary {

  public String toBinary(final int n) {
    int n,m;
    string x="";
    scanner s = new scanner(system.in);
    system.out.print("enter the decimal number:");
    n= s.nextlnt();
    while(n>0)
    {
      int a =n%2;
      x= a+x;
      n=n/2;
    }
    system.out.print(x);
    return "";
  }
}
