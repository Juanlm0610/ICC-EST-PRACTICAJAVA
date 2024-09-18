public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");



        String cadena = "hola mundo";
        System.out.println(cadena);
        System.out.print("Tamaño de la cadena:  ");
        System.out.println(cadena.length());
        System.out.println(cadena.split(" ")[0]);

        for (int i = 0; i < cadena.length(); i++)
        {
        if (i != 0) System.out.print(" - ");

        System.out.print(cadena.charAt(i));
        }

    //CONTAR PALABRAS

    int palabras = cadena.split(" ").length;
    System.out.println("Existen "+ palabras +" palabras");

    
     int cont = 0;
        for (int i = 0; i < cadena.length(); i++){;
            if (cadena.charAt(i) == 'a')
                cont++;
         }

         System.out.println("Existen "+ cont +" letras a ");     
    }

}
