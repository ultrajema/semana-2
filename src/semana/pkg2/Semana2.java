/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana.pkg2;

import java.io.IOException;
import static java.lang.Math.sqrt;
import java.util.Scanner;

/**
 *
 * @author Carrillo
 */
public class Semana2 {

    public static void main(String[] args) throws IOException {
   //for (int i=0;i<100;i++ ){
        //System.out.print(i);
       // i = i+4;                      //finalizado 1
       //int mul = 0;     // ejercicio 
       //int j = 0;
        //while (j<=100)
        //{
          //  mul += 5;
            //j++;
            //System.out.print(mul); //finalizado 2
        //}
       // int i=0;      //ejercicio
        //int mat = 0;
         //do{  mat+=5; 

          //i++;// ejercicio
          //System.out.print(mat);// finalizado 3
      //}while(i<=100); 
      //for (int i=320;i>160;i-- ){ //4
        //System.out.print(i);
        //i = i-19;             // finalizado 4
        
        //int mul = 0;     // ejercicio //5
       //int j = 320;
        //while (j>=160)
        //{
          //mul -= 20;
            //j--;
            //System.out.print(j); //finalizado 5
         //    int res = 0; //ejercicio 6
           //  int t = 0;
            // do{ res = 320;
             
           // res -= 20;
           // res --;
           //  System.out.print(res);
             
           //  } while (res <=160);  /// 6 ejercicio
           
        
               
             
       // Scanner sc = new Scanner(System.in); // ejercicio 8
        //int n;
        //System.out.print("Introduce un número entero: ");
        //n = sc.nextInt();
        //System.out.println("Tabla del " + n);
        //for(int i = 1; i<=10; i++){
          //   System.out.println(n + " * " + i + " = " + n*i);
           //}                                                    ///finalizado
           
             //ejercicio 7
   
        //Scanner teclado= new Scanner(System.in);
	//	int login=0;
	//	int pass=0;
	//	int intentos=1;
	//	int maximo=3;
	//		
	//	while((login!=1809)||(pass!=1234)&& (intentos<maximo)){
					
	//	System.out.print("introduzca un login: ");
	//	login=teclado.nextInt();
	//	System.out.print("Introduzca su pass:");
	//	pass=teclado.nextInt();
					
	//	if(intentos==3){
	//	System.out.println("acceso denegado..");
	//	intentos=intentos-maximo;
	//	}
				
	//	intentos++;
	//				
				
				
				
	//	}
			
			
	//System.out.println("login y pass, correctos..."); //finalizado
			
	//Scanner sc = new Scanner(System.in);// ejercicio 9
        //int n, cifras;
        //char car;
        //do{
          //  System.out.print("Introduce un número entero: ");
           // n = sc.nextInt();
            //cifras= 0;    
            //while(n!=0){             
             //n = n/10;        
            //cifras++;          
           // }
            //System.out.println("El número tiene " + cifras+ " cifras");
            //System.out.print("Continuar? ");
            //car = (char)System.in.read();
        //}while(car!='n' && car != 'N');   //finalizado
    // Scanner sc = new Scanner(System.in); //ejercicio 10
      //  int N;
        //System.out.print("Introduzca valor de N: ");
        //N = sc.nextInt(); //supondremos que el número introducido tiene 5 cifras
        //System.out.println(N/10000);
        //System.out.println(N/1000);
        //System.out.println(N/100);
        //System.out.println(N/10);
        //System.out.println(N);  //finalizado
    //Scanner sc = new Scanner(System.in); //ejercicio 11
    //int conteo =0;
    //int num1 = 1;
    //System.out.print("Ingrese un numero");
    //num1 = sc.nextInt();
    //for(conteo = num1; conteo<=num1+5; conteo++){
    //System.out.println(conteo+"el cuadrado es "+ conteo*conteo+"el cubo es "+ conteo*conteo*conteo); //finalizado
    //}
  //  Scanner sc = new Scanner(System.in); // ejercicio 12
    //    int numero,fibo1,fibo2,i;
      //  do{
        //    System.out.print("Introduce numero mayor que 1: ");
          //  numero = sc.nextInt();
        //}while(numero<=1);
        //System.out.println("Los " + numero + " primeros términos de la serie de Fibonacci son:");

        //fibo1=1;
        //fibo2=1;

        //System.out.print(fibo1 + " ");
        //for(i=2;i<=numero;i++){
          //   System.out.print(fibo2 + " ");
            // fibo2 = fibo1 + fibo2;
             //fibo1 = fibo2 - fibo1;
        //}
        //System.out.println();// finalizado
    
     //Scanner sc = new Scanner(System.in); //ejercicio 13
      //  int[] numeros = new int[10];
        //int pos = 0, neg = 0, cero = 0; 
        //int i;
       

        //System.out.println("Lectura de los elementos del array: ");
        //for (i = 0; i < numeros.length; i++) {
            //System.out.print("numeros[" + i + "]= ");
          //  numeros[i] = sc.nextInt();
        //}
      
        //for (i = 0; i < numeros.length; i++) {
            //if (numeros[i] > 0) {
             //   pos++;
           // } else if (numeros[i] < 0) {
              //  neg++;
            //} else {
           //     cero++;
         //   }
       // }
       
        //System.out.println("Positivos: " + pos);
        //System.out.println("Negativos: " + neg);
       // System.out.println("Ceros: " + cero);// finalziado
       
      // Scanner obtenerNumero = new Scanner(System.in);// ejercicio 16
        //int contador,I,numero;
        //System.out.print("Ingresa un numero: ");
        //numero = obtenerNumero.nextInt();
        //contador = 0;
        //for(I = 1; I <= numero; I++)
        //{
         //   if((numero % I) == 0)
           // {
            //    contador++;
            //}
        //}
        //if(contador <= 2)
        //{
         //   System.out.println("El numero es primo");
        //}else{
         //   System.out.println("El numero no es primo");
        //}//finalizado
      // int sumaPositivos = 0; //ejercicio 17

     
        //Scanner sc=new Scanner(System.in);
        //int n;
        //do {
          //  System.out.println("Ingresa un numero; cuando quieras terminar escribe 98765");
            //n= sc.nextInt();
            //if(n==0){
              //  System.out.println("El numero "+n+" es Cero");
            //} else{
              //  if(n>0 && n!= 98765){
                //    System.out.println("El numero "+n+" es positivo");
                  //  sumaPositivos = sumaPositivos + n;
                //}else{
                  //  System.out.println("El numero "+n+" es negativo");
                //}
            //}
        //}while(n != 98765);

        //System.out.println("la suma de los numeros positivos introducidos es "+sumaPositivos);// finalizado
        
   		//Scanner entrada = new Scanner (System.in); //ejercicio 18
		//int num1 = 0;
		//int num2;
		//System.out.println("Di un numero:");
		//num1 = entrada.nextInt();
		//System.out.println("Di un numero:");
		//num2 = entrada.nextInt();
		//for (int i = num1; i < num2+1; i++) {
		//	System.out.println(num1);
		//	num1 = num1 + 1; //finalizado
		//}
             //   Scanner sc = new Scanner(System.in); // ejercicio 19
        //System.out.print("Introduzca numero de filas: ");
        //int numFilas = sc.nextInt();
        //sc.close();
 
        //System.out.println();
        //for(int altura = 1; altura<=numFilas; altura++){
          //  //Espacios en blanco
            //for(int blancos = 1; blancos<=numFilas-altura; blancos++){
             //   System.out.print(" ");
           // }
 
            //Asteriscos
            //for(int asteriscos=1; asteriscos<=(altura*2)-1; asteriscos++){
              //  System.out.print("*");
           // }
            //System.out.println(); //finalizado
        //}
      //  int i=0, j=0, div=0,raiz=0;//ejercicio 22
    //for (i=1;i<101;i++) { 
    //div=0; 
    //raiz=(int)sqrt(i);
    //for (j=1;j<=raiz;j++) { 
    //if (i%j==0)
    //div++;
    //}
    //if (div<=1)
    //System.out.println (i + " es numero primo" );
    //}// finalizado
  //  int cont=0; //ejercicio 24
//int num2 = 0;
//int num=0;

//for(int i=0; i<=5;i++){
//num=0;
//while(num<=num2){
//cont=cont+1;
//System.out.print(cont + "-");
//num++;
//}
//num2++;
//System.out.println("");
//}

//int v = num;
//int cont2=1;
//for(int a=0; a<=5;a++){
//num=v-cont2;
//while(num2>=num){
//System.out.print(cont + "-");
//cont=cont-1;
//num--;
//if (num<0) {break;}
//}
//num2--;
//cont2++;
//System.out.println("");    
//}// finalizado

//double area; // ejercicio 5 clase 2
  //      Scanner sc=new Scanner(System.in);
    //    System.out.println("ingrese ancho del rectangulo");
      //  double a=sc.nextDouble();  
       // System.out.println("ingrese alto del rectangulo");
        //double b=sc.nextDouble(); 
       // area=a*b;
        //System.out.println(area);  //finalizado
        
      //  Scanner sc = new Scanner(System.in);//ejercicio 6 clase 2
        //double b,h;
        //System.out.println("Ingresa base");
        //b=sc.nextDouble();
       // System.out.println("Ingresa altura");
       // h=sc.nextDouble();
       // double area;
       // area=b*h/2;
       //System.out.print(area);// finalizado
       
       
    }
}
