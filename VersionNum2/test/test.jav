/* Este es un comentario de bloque al inicio del archivo */

lib int sumaEnteros(int e1, int e2); // Declaración de la función sumaEnteros

programa int Prueba
{
    int resultado; // Variable para almacenar el resultado
    int valor1; // Variable para almacenar valor1
    int valor2; // Variable para almacenar valor2

    resultado = sumaEnteros(10, 20); // Llamada a la función sumaEnteros

    if (resultado > 15) //Verifica si el resultado es mayor que 15
    { 
        valor1 = 1; // Asigna 1 a valor1 si la condición es verdadera
    }
    else
    {
        valor2 = 2; // Asigna 2 a valor2 si la condición es falsa
    }

    /* 
    Bucle while que incrementa el resultado en 5
    mientras el resultado sea menor que 50
    */
    
    while (resultado < 50) // Se incia el bucle
    {
        resultado = resultado + 5; // Incrementa el resultado en 5
    }

    return resultado; // Retorna el resultado final
}

/* Fin del programa */
