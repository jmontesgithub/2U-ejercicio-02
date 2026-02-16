/**
 * Clase que representa un vehículo para flotilla de reparto
 * @author [Nombre del estudiante]
 * @version 1.0
 */
public class Vehiculo {
    // TODO: Declarar atributos privados
    // - marca (String)
    // - modelo (String)
    // - anio (int)
    // - precio (double)
    // - capacidadCarga (double)
    
    /**
     * Constructor de la clase Vehiculo
     * @param marca Marca del vehículo
     * @param modelo Modelo del vehículo
     * @param anio Año del vehículo
     * @param precio Precio unitario
     * @param capacidadCarga Capacidad de carga en kg
     */
    public Vehiculo(String marca, String modelo, int anio, double precio, double capacidadCarga) {
        // TODO: Inicializar todos los atributos
    }
    
    // TODO: Implementar getters y setters para todos los atributos
    
    /**
     * Obtiene la marca del vehículo
     * @return marca del vehículo
     */
    public String getMarca() {
        return null; // TODO: Retornar el valor correcto
    }
    
    /**
     * Establece la marca del vehículo
     * @param marca nueva marca del vehículo
     */
    public void setMarca(String marca) {
        // TODO: Asignar el valor al atributo
    }
    
    /**
     * Obtiene el modelo del vehículo
     * @return modelo del vehículo
     */
    public String getModelo() {
        return null; // TODO: Retornar el valor correcto
    }
    
    /**
     * Establece el modelo del vehículo
     * @param modelo nuevo modelo del vehículo
     */
    public void setModelo(String modelo) {
        // TODO: Asignar el valor al atributo
    }
    
    /**
     * Obtiene el año del vehículo
     * @return año del vehículo
     */
    public int getAnio() {
        return 0; // TODO: Retornar el valor correcto
    }
    
    /**
     * Establece el año del vehículo
     * @param anio nuevo año del vehículo
     */
    public void setAnio(int anio) {
        // TODO: Asignar el valor al atributo
    }
    
    /**
     * Obtiene el precio del vehículo
     * @return precio del vehículo
     */
    public double getPrecio() {
        return 0.0; // TODO: Retornar el valor correcto
    }
    
    /**
     * Establece el precio del vehículo
     * @param precio nuevo precio del vehículo
     */
    public void setPrecio(double precio) {
        // TODO: Asignar el valor al atributo
    }
    
    /**
     * Obtiene la capacidad de carga del vehículo
     * @return capacidad de carga en kg
     */
    public double getCapacidadCarga() {
        return 0.0; // TODO: Retornar el valor correcto
    }
    
    /**
     * Establece la capacidad de carga del vehículo
     * @param capacidadCarga nueva capacidad de carga en kg
     */
    public void setCapacidadCarga(double capacidadCarga) {
        // TODO: Asignar el valor al atributo
    }
    
    /**
     * Aplica un descuento al precio del vehículo
     * @param porcentaje Porcentaje de descuento a aplicar (por ejemplo: 10 para 10%)
     */
    public void aplicarDescuento(double porcentaje) {
        // TODO: Reducir el precio según el porcentaje dado
        // Ejemplo: si precio = 100 y porcentaje = 10, nuevo precio = 90
    }
    
    /**
     * Retorna una representación en String del vehículo
     * @return String con la información del vehículo
     */
    @Override
    public String toString() {
        // TODO: Retornar un String formateado con la información del vehículo
        // Formato sugerido: "Marca Modelo Año - $Precio - Capacidad: X kg"
        return "";
    }
}