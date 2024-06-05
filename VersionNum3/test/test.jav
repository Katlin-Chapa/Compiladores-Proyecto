lib float calcular_promedio(float num_1, float num_2, float num_3);

programa float Promedio_Calculadora {
    float número_1;
    float número_2;
    float número_3;
    float promedio;
    
    número_1 = 85.5;
    número_2 = 90.75;
    número_3 = 78.25;
    
    promedio = (número_1 + número_2 + número_3)/3;
    
    if (promedio >= 85.0) {
        print("Año aprobado");
    } else {
        print("Año reprobado:");
    }
    
    print("El promedio es de:");
    return promedio;
}