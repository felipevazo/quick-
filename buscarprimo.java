//Se debe ingresar un n, ya sea de un for, o directamente desde consola
int contadorDivisores=0;
if(n==1)
{ 
  System.out.println("Primo");
}
else
{
  for(int i=2;i<=n;i++)
  {
    if(n%i==0)
    {
      contadorDivisores+=1;
    }
  }
  if(contadorDivisores==1)
  {
    System.out.println("Primo");
  
  }
  else
  {
    System.out.println("Tío");
  }


}
