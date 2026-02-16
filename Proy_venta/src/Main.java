/**
 * Clase principal para probar el sistema de ventas
 * @author [Nombre del estudiante]
 * @version 1.0
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("=== SISTEMA DE VENTAS - FLOTILLAS URBANAS ===\n");
        
        // TODO: Paso 1 - Crear al menos 2 vehículos diferentes
        // Ejemplo:
        // Vehiculo v1 = new Vehiculo("Nissan", "NP300", 2024, 285000.0, 1000.0);
        // Vehiculo v2 = new Vehiculo("Toyota", "Hilux", 2024, 320000.0, 1200.0);
        
        
        // TODO: Paso 2 - Crear al menos 2 clientes diferentes
        // Ejemplo:
        // Cliente c1 = new Cliente("Transportes Rápidos S.A.", "TRA950615XY3", "3331234567", "contacto@transportes.com");
        // Cliente c2 = new Cliente("Logística Express", "LOG850920AB7", "3339876543", "info@logistica.com");
        
        
        // TODO: Paso 3 - Crear al menos 3 ventas con diferentes cantidades
        // Recuerda: asignar folios manualmente
        // Venta 1: menos de 5 vehículos (sin descuento)
        // Venta 2: entre 5 y 9 vehículos (5% de descuento)
        // Venta 3: 10 o más vehículos (10% de descuento)
        
        // Ejemplo:
        // Venta venta1 = new Venta("VTA-001", 3, v1, c1);
        // Venta venta2 = new Venta("VTA-002", 8, v1, c2);
        // Venta venta3 = new Venta("VTA-003", 12, v2, c1);
        
        
        // TODO: Paso 4 - Mostrar información de cada venta
        // Muestra el folio, cliente, vehículo, cantidad, subtotal, descuento y total
        
        // Ejemplo para cada venta:
        // System.out.println("========================================");
        // System.out.println("           VENTA #1");
        // System.out.println("========================================");
        // System.out.println("Folio: " + venta1.getFolio());
        // System.out.println("Cliente: " + venta1.getCliente().getNombre());
        // System.out.println("RFC: " + venta1.getCliente().getRfc());
        // System.out.println("Vehículo: " + venta1.getVehiculo().getMarca() + " " + venta1.getVehiculo().getModelo() + " " + venta1.getVehiculo().getAnio());
        // System.out.println("Capacidad de Carga: " + venta1.getVehiculo().getCapacidadCarga() + " kg");
        // System.out.println("Cantidad: " + venta1.getCantidadVehiculos() + " unidades");
        // System.out.printf("Precio Unitario: $%,.2f%n", venta1.getVehiculo().getPrecio());
        // System.out.println("----------------------------------------");
        // System.out.printf("Subtotal: $%,.2f%n", venta1.calcularTotal());
        
        // double totalConDescuento = venta1.aplicarDescuentoPorVolumen();
        // double descuento = venta1.calcularTotal() - totalConDescuento;
        // double porcentajeDesc = (descuento / venta1.calcularTotal()) * 100;
        // System.out.printf("Descuento: $%,.2f (%.0f%%)%n", descuento, porcentajeDesc);
        // System.out.println("========================================");
        // System.out.printf("TOTAL A PAGAR: $%,.2f%n", totalConDescuento);
        // System.out.println("========================================\n");
        
        
        // TODO: Paso 5 - Mostrar resumen final
        // System.out.println("Total de ventas procesadas: " + [número de ventas]);
    }
}