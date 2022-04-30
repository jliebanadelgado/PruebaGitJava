package one;
import java.util.*;
import javax.swing.*;

public class Areas {

	public static void main(String[] args) {

		
		/*Creo un objeto de tipo scanner para que el usuario pueda introducir informacion en consola.
		 * A ese objeto lo voy a llamar "entrada".
		 * Llamamos al constructor de la clase scanner con operador "new" y el nombre de la clase, y
		 * por parametro le decimos (system.in) para decirle que vamos introducir informacion por
		 * consola
		 */
		Scanner entrada = new Scanner(System.in);
		
		
		/*Imprimimos por consola utilizando una estructura nueva que sirve para hacer saltos de linea
		 * dentro de un string. Utilizamos (\n) para hacer un salto de linea.
		 */
		System.out.println ("Elije una figura para obtener el area:  \n1: Cuadrado \n2: Rectangulo "
				+ "\n3: Triangulo \n4: Circulo");
		
		
		/*Almacenamos una variable de tipo entero la cual voy a llamar "figura". Esta variable va a ser 
		 * igual a "entrada" (que es el objeto de tipo scanner) ".nextint()". Es decir vamos a almacenar en
		 * figura el numero entero que el usuario introduzca en consola. 
		 */
		int figura = entrada.nextInt();
		
		
		/*Utilizamos el condicional "switch" para evaluar si el usuario ha introducido por consola un 1, 2,
		 * 3, 4, o una opcion que no esta disponible.
		 */
		switch (figura){
		/*Con esto le estamos diciendo al programa que si figura es igual a 1 tendra que ejecutar lo que
		 * haya dentro de este "case 1"
		 */
		case 1:
		/*Declaramos una variable de tipo entero "lado" y almacenamos lo que el usuario introduzca en una
		 * ventana emergente de tipo "JOptionPane.showImputDialog("xxxxx").
		 * El problema es que "JOptionPane.showImputDialog("xxxxx") nos va a devolver un String y nosotros
		 * queremos almacenar lo que el usuario introduzca por ventana en una variable de tipo entero 
		 * "int lado", asi que tendremos que utilizar el metodo "parseInt" de la clase "Integer" para 
		 * convertir a numero entero un "string".
		 */
			int lado = Integer.parseInt(JOptionPane.showInputDialog("Introduce un lado"));
	
		/*Imprimimos por pantalla el resultado del area de este cuadrado. La operacion para saber el area de
		 * un cuadrado es (lado*lado) asi que elevaremos al cuadrado la informacion que haya en la variable
		 * de tipo entero (lado). Utilizamos el metodo "math.pow", metodo estatico que nos devuelve un double
		 * y que requiere 2 parametros: la base y el exponente.
		 */
			System.out.println("La area del cuadrado es " + Math.pow(lado, 2));
			
			/*"break" se utiliza para romper la ejecucion del programa y que no siga ejecutando los siguientes
			 * case en caso de que este mismo sea el caso correcto. Saldria del switch case.
			 */
			break;
		
		case 2:
			/*Creo una variable de tipo entero la cual vamos a llamar base y le digo que esto va a ser igual 
			 * a "Integer.parseInt(JOptionPane.showInputDialog("Introduce la base"));", igual que en el case
			 * anterior pero cambiando lado por base.
			 */
			int base = Integer.parseInt(JOptionPane.showInputDialog("Introduce la base"));
			
			/*Creamos otra variable la cual llamaremos altura donde haremos lo mismo. 
			 */
			int altura = Integer.parseInt(JOptionPane.showInputDialog("Introduce la altura"));
			
			/*Imprimiremos la formula correspondiente por pantalla. 
			 *Para obtener el area de un rectangulo multiplicamos la base por la altura.
			 */
			System.out.println("El area del rectangulo es " + base*altura);
			
			break;
			
		case 3:
			
			/*Reutilizo las variables de base y altura que he utilizado antes para no declarar dos variables
			 * nuevas.
			 */
			base = Integer.parseInt(JOptionPane.showInputDialog("Introduce la base"));
			
			altura = Integer.parseInt(JOptionPane.showInputDialog("Introduce la altura"));
			
			/*Imprimiremos el area por pantalla.
			 *Para obtener el area de un triangulo multiplicamos base*altura y dividimos ese resultado entre 2.
			 */
			System.out.println("El area del triangulo es " + (base*altura)/2);
			
			break;
			
		case 4:
			
			/*Declaro una variable nueva a la que voy a llamar "radio" y le decimos que el usuario tenga que 
			 * escribir en una ventana emergente con JOptionPane.showImputDialog("xxxxx"). Y transformaremos 
			 * este resultado de string a int haciendo un parseo, como en los ejemplos anteriores.
			 */
			int radio = Integer.parseInt(JOptionPane.showInputDialog("Introduce el radio"));
			
			//Imprimo sin salto de linea 
			System.out.print("El area del circulo es ");
			
			/*printf permite imprimir con formato, con esto quiero conseguir que la parte decimal tenga solamente 
			 * 2 decimales (%1.2f) y como segundo parametro o instruccion la formula que me permita hayar el area
			 * de un circulo. 
			 * La formula para hallar el area de un circulo es (PI*(radio elevado al cuadrado))
			 * Para elevar al cuadrado un dato utilizamos el metodo pow de la clase math.
			 */
			System.out.printf("%1.2f", Math.PI*(Math.pow(radio, 2)));
			
			break;
			
		/*default podemos compararlo a un else. Se utiliza para indicar que la respuesta del usuario no es ninguna
		 * de las opciones anteriores
		 */
		default:
			System.out.println("La opcion no es correcta");
		}			
	}
}

