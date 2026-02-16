/**
 * Clase que representa una venta de vehículos
 * @author [Nombre del estudiante]
 * @version 1.0
 */
public class Venta {
    // TODO: Declarar atributos privados
    // - folio (String)
    // - cantidadVehiculos (int)
    // - vehiculo (Vehiculo)
    // - cliente (Cliente)
    
    /**
     * Constructor de la clase Venta
     * @param folio Folio único de la venta
     * @param cantidadVehiculos Cantidad de vehículos vendidos
     * @param vehiculo Vehículo que se está vendiendo
     * @param cliente Cliente que realiza la compra
     */
    public Venta(String folio, int cantidadVehiculos, Vehiculo vehiculo, Cliente cliente) {
        // TODO: Inicializar todos los atributos con los valores recibidos
    }
    
    // TODO: Implementar SOLO getters (NO setters - la venta es inmutable)
    
    /**
     * Obtiene el folio de la venta
     * @return folio de la venta
     */
    public String getFolio() {
        return null; // TODO: Retornar el valor correcto
    }
    
    /**
     * Obtiene la cantidad de vehículos vendidos
     * @return cantidad de vehículos
     */
    public int getCantidadVehiculos() {
        return 0; // TODO: Retornar el valor correcto
    }
    
    /**
     * Obtiene el vehículo vendido
     * @return objeto Vehiculo
     */
    public Vehiculo getVehiculo() {
        return null; // TODO: Retornar el valor correcto
    }
    
    /**
     * Obtiene el cliente que realizó la compra
     * @return objeto Cliente
     */
    public Cliente getCliente() {
        return null; // TODO: Retornar el valor correcto
    }
    
    /**
     * Calcula el total de la venta sin descuentos
     * @return Total de la venta (cantidad × precio)
     */
    public double calcularTotal() {
        // TODO: Calcular y retornar el total
        // Total = cantidadVehiculos * precio del vehículo
        return 0.0;
    }
    
    /**
     * Aplica descuento por volumen y retorna el total con descuento
     * Reglas:
     * - cantidadVehiculos >= 10: descuento del 10%
     * - cantidadVehiculos >= 5: descuento del 5%
     * - cantidadVehiculos < 5: sin descuento (0%)
     * @return Total con descuento aplicado
     */
    public double aplicarDescuentoPorVolumen() {
        // TODO: Implementar la lógica de descuentos
        // 1. Calcular el total sin descuento
        // 2. Determinar el porcentaje de descuento según la cantidad
        // 3. Calcular y retornar el total con descuento
        return 0.0;
    }
    
    /**
     * Retorna una representación en String de la venta
     * @return String con la información completa de la venta
     */
    @Override
    public String toString() {
        // TODO: Retornar un String formateado con toda la información de la venta
        // Debe incluir: folio, cliente, vehículo, cantidad, subtotal, descuento, total
        return "";
    }
}