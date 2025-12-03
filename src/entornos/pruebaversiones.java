package entornos;


public class pruebaversiones {
//HEAD

 //comentario local

//comentario en remoto

//bd5f1becdd84c4603faae52816f8a9e73204b443
    public static double celsiusAFahrenheit(double celsius) {
        return celsius * 9.0 / 5.0 + 32.0;
    }

    
    public static double fahrenheitACelsius(double fahrenheit) {
        return (fahrenheit - 32.0) * 5.0 / 9.0;
    }

    
    public static void main(String[] args) {

        double c = 25;  
        double f = 77;  

        System.out.println("=== CONVERSOR DE TEMPERATURAS ===");
        System.out.println(c + " °C  =  " + celsiusAFahrenheit(c) + " °F");
        System.out.println(f + " °F  =  " + fahrenheitACelsius(f) + " °C");
    }
}

