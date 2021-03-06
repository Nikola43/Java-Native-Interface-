public class LeerTeclasUsandoC
{

	//creamos un nuevo metodo nativo en c
    native int leerTecla();

    //Cargamos la libreria compilada 'leerTeclasC.dll' que contiene el metodo leerTecla()
    static 
    {
        System.loadLibrary("leerTeclasC");
    }

    //Clase principal
    static public void main(String argv[]) 
    {
    	//Definicion de constantes con las teclas que usara el programa
    	final int ESC = 27; 

    	//Instanciamos un objeto tipo 'LeerTeclasUsandoC' para acceder a metodo
    	//leerTeclas() escrito en C e importado de la libreria leerTeclas.c
        LeerTeclasUsandoC teclas = new LeerTeclasUsandoC();

        //Creamos una variable para almacenar el codigo de la tecla pulsada
        int teclaPulsada = 0;

	System.out.println("Pulsa cualquier tecla");
        
        //Mientras la tecla pulsada sea distinto de ESC
        while( teclaPulsada != ESC )
        {
        	//leemos la tecla usando el metodo escrito en c que esta dentro de la libreria que compilamos
        	teclaPulsada = teclas.leerTecla(); 

        	//Imprimimos el codigo de la tecla pulsada
        	System.out.println("\nCodigo ASCII: "+teclaPulsada+"    Tecla pulsada: "+(char)teclaPulsada);
        }
    }
}
