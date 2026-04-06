/* Biblioteca
objetivo: gestionar libros con Poo y busqeda rapida
¿que se debe hacer?
1. clase: Libro con codigo (int), titulo (String) y paginas (int)
2. entrada: pide 5 libros y guadalos en Libro[]
3. ordenamiento: usa insercion (insertion sort) para ordenar el arreglo por codigo (ascendente)
4. busqueda:pide un codigo y buscala con busqueda binaria. muestra su titulo
5. minimo: indica el titulo del libro con menos paginas 
*/
import java.util.Scanner;

public class Biblioteca
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Libro[] libros = new Libro[5];

        // Entrada: pedir 5 libros
        for (int i = 0; i < libros.length; i++)
        {
            System.out.println("Ingrese el código del libro " + (i + 1) + ":");
            int codigo = sc.nextInt();
            sc.nextLine(); // Consumir el salto de línea
            System.out.println("Ingrese el título del libro " + (i + 1) + ":");
            String titulo = sc.nextLine();
            System.out.println("Ingrese la cantidad de páginas del libro " + (i + 1) + ":");
            int paginas = sc.nextInt();
            libros[i] = new Libro(codigo, titulo, paginas);
        }

        // Ordenamiento por inserción de sort por codigo
        for (int i = 1; i < libros.length; i++)
        {
            Libro aux = libros[i];
            int j = i - 1;
            while (j >= 0 && libros[j].getCodigo() > aux.getCodigo())
            {
                libros[j + 1] = libros[j];
                j--;
            }
            libros[j + 1] = aux;
        }

        // Mostrar los libros ordenados por código
        System.out.println("Libros ordenados por código:");
        for (Libro libro : libros)
        {
            System.out.println(libro);
        }
        // Busqueda binaria por codigo
        System.out.println("Ingrese el código del libro a buscar:");
        int codigoBusqueda = sc.nextInt();
        int left = 0;
        int right = libros.length - 1;
        boolean encontrado = false;
        while (left <= right)        {
            int mid = left + (right - left) / 2;
            if (libros[mid].getCodigo() == codigoBusqueda){ 
                System.out.println("Libro encontrado: " + libros[mid]);
                encontrado = true;
                break;
            } else if (libros[mid].getCodigo() < codigoBusqueda){
                left = mid + 1;
            } else            {
                right = mid - 1;
            }
        }
    }
}

class Libro {
    private int codigo;
    private String titulo;
    private int paginas;

    public Libro(int codigo, String titulo, int paginas) {
        this.titulo = titulo;
        this.codigo = codigo;
        this.paginas = paginas;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getPaginas() {
        return paginas;
    }

    @Override
    public String toString() {
        return "Libro{" +
                "codigo=" + codigo +
                ", titulo='" + titulo + '\'' +
                ", paginas=" + paginas +
                '}';
    }
}

    

