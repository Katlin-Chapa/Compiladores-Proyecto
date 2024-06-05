lib int sumaEnteros(int e1, int e2);

programa int Prueba
{
    int resultado; 
    int valor1;
    int valor2;

    resultado = sumaEnteros(10, 20);

    if (resultado > 15)
    {
        valor1 = 1;
    }
    else
    {
        valor2 = 2;
    }

    while (resultado < 50)
    {
        resultado = resultado + 5;
    }

    return resultado;
}
