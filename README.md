# 🚗 U1-E01-B - Sistema de Ventas de Vehículos

[![Autograding](../../workflows/Autograding%20Tests/badge.svg)](../../actions)

## 👨‍🎓 Información del Estudiante

- **Nombre:** [Tu nombre completo]
- **Matrícula:** [Tu número de control]
- **Grupo:** POO-EJ-[A/B/C]-2026
- **Semestre:** Enero-Junio 2026

---

## 📋 Descripción del Problema

Una empresa dedicada a la venta de vehículos para flotillas de reparto necesita un sistema básico para registrar sus ventas. La empresa se especializa en un único modelo de vehículo diseñado específicamente para reparto urbano.

Tu tarea es desarrollar un sistema orientado a objetos que permita:
- Registrar información de vehículos
- Gestionar datos de clientes
- Procesar ventas de flotillas
- Calcular totales y aplicar descuentos por volumen

---

## 🎯 Objetivos de Aprendizaje

Al completar este ejercicio, habrás:

✅ Aplicado los conceptos de **clase** y **objeto**  
✅ Implementado **encapsulamiento** mediante modificadores de acceso  
✅ Creado **constructores** para inicializar objetos  
✅ Establecido **relaciones entre objetos** (composición)  
✅ Sobrescrito el método **toString()** para representación de objetos  

---

## 📦 Clases a Implementar

### 1️⃣ Clase `Vehiculo`

Representa el modelo de vehículo que vende la empresa.

#### Atributos Privados:
```java
- marca (String)          // Ejemplo: "Nissan"
- modelo (String)         // Ejemplo: "NP300"
- anio (int)             // Ejemplo: 2024
- precio (double)        // Ejemplo: 285000.0
- capacidadCarga (double) // Ejemplo: 1000.0 (en kg)
```

#### Métodos Requeridos:
```java
// Constructor
public Vehiculo(String marca, String modelo, int anio, double precio, double capacidadCarga)

// Getters y Setters (todos los atributos)
public String getMarca()
public void setMarca(String marca)
public String getModelo()
public void setModelo(String modelo)
public int getAnio()
public void setAnio(int anio)
public double getPrecio()
public void setPrecio(double precio)
public double getCapacidadCarga()
public void setCapacidadCarga(double capacidadCarga)

// Método para aplicar descuento
public void aplicarDescuento(double porcentaje)
// Reduce el precio actual según el porcentaje dado

// Representación en texto
@Override
public String toString()
// Retorna información formateada del vehículo
```

#### Ejemplo de Uso:
```java
Vehiculo v1 = new Vehiculo("Nissan", "NP300", 2024, 285000.0, 1000.0);
System.out.println(v1);
// Salida esperada: Nissan NP300 2024 - $285,000.00 - Capacidad: 1000.0 kg
```

---

### 2️⃣ Clase `Cliente`

Representa al cliente que realiza la compra.

#### Atributos Privados:
```java
- nombre (String)    // Ejemplo: "Transportes Rápidos S.A. de C.V."
- rfc (String)       // Ejemplo: "TRA950615XY3"
- telefono (String)  // Ejemplo: "3331234567"
- email (String)     // Ejemplo: "contacto@transportes.com"
```

#### Métodos Requeridos:
```java
// Constructor
public Cliente(String nombre, String rfc, String telefono, String email)

// Getters y Setters (todos los atributos)
public String getNombre()
public void setNombre(String nombre)
public String getRfc()
public void setRfc(String rfc)
public String getTelefono()
public void setTelefono(String telefono)
public String getEmail()
public void setEmail(String email)

// Representación en texto
@Override
public String toString()
// Retorna información formateada del cliente
```

#### Ejemplo de Uso:
```java
Cliente c1 = new Cliente("Transportes Rápidos S.A.", "TRA950615XY3", "3331234567", "contacto@transportes.com");
System.out.println(c1);
// Salida: Cliente: Transportes Rápidos S.A. - RFC: TRA950615XY3
```

---

### 3️⃣ Clase `Venta`

Representa una transacción de venta de vehículos.

#### Atributos Privados:
```java
- folio (String)            // Folio único de la venta (ej: "VTA-001")
- cantidadVehiculos (int)   // Número de vehículos vendidos
- vehiculo (Vehiculo)       // El vehículo que se vende
- cliente (Cliente)         // El cliente que compra
```

#### Métodos Requeridos:
```java
// Constructor
public Venta(String folio, int cantidadVehiculos, Vehiculo vehiculo, Cliente cliente)
// Recibe el folio como parámetro

// Getters únicamente (NO setters - la venta es inmutable)
public String getFolio()
public int getCantidadVehiculos()
public Vehiculo getVehiculo()
public Cliente getCliente()

// Cálculo del total SIN descuento
public double calcularTotal()
// Retorna: cantidadVehiculos * precio del vehículo

// Aplicar descuento por volumen
public double aplicarDescuentoPorVolumen()
// Lógica:
// - Si cantidadVehiculos >= 10: descuento del 10%
// - Si cantidadVehiculos >= 5: descuento del 5%
// - Si cantidadVehiculos < 5: sin descuento (0%)
// Retorna: total con descuento aplicado

// Representación en texto
@Override
public String toString()
// Retorna toda la información de la venta formateada
```

#### Ejemplo de Uso:
```java
Vehiculo v1 = new Vehiculo("Nissan", "NP300", 2024, 285000.0, 1000.0);
Cliente c1 = new Cliente("Transportes Rápidos S.A.", "TRA950615XY3", "3331234567", "contacto@transportes.com");
Venta venta1 = new Venta("VTA-001", 3, v1, c1);

System.out.println(venta1.getFolio());                   // VTA-001
System.out.println(venta1.calcularTotal());              // 855000.0
System.out.println(venta1.aplicarDescuentoPorVolumen()); // 855000.0 (sin descuento)
```

---

### 4️⃣ Clase `Main`

Clase principal para probar el sistema.

#### Requerimientos:

Debes crear un método `main` que:

1. **Cree al menos 2 vehículos diferentes**
```java
   Vehiculo v1 = new Vehiculo("Nissan", "NP300", 2024, 285000.0, 1000.0);
   Vehiculo v2 = new Vehiculo("Toyota", "Hilux", 2024, 320000.0, 1200.0);
```

2. **Cree al menos 2 clientes diferentes**
```java
   Cliente c1 = new Cliente("Transportes Rápidos S.A.", "TRA950615XY3", "3331234567", "contacto@transportes.com");
   Cliente c2 = new Cliente("Logística Express", "LOG850920AB7", "3339876543", "info@logistica.com");
```

3. **Cree al menos 3 ventas con diferentes cantidades**
   - Una venta con menos de 5 vehículos (sin descuento)
   - Una venta con 5-9 vehículos (descuento 5%)
   - Una venta con 10 o más vehículos (descuento 10%)

4. **Asigna manualmente los folios a cada venta**
   - Primer venta: "VTA-001"
   - Segunda venta: "VTA-002"
   - Tercera venta: "VTA-003"

5. **Muestre información completa de cada venta**
   - Folio de la venta
   - Información del cliente
   - Información del vehículo
   - Cantidad vendida
   - Subtotal (sin descuento)
   - Descuento aplicado
   - Total final

---

## 📤 Ejemplo de Salida Esperada

Tu programa debe mostrar algo similar a esto:
```
=== SISTEMA DE VENTAS - FLOTILLAS URBANAS ===

========================================
           VENTA #1
========================================
Folio: VTA-001
Cliente: Transportes Rápidos S.A. de C.V.
RFC: TRA950615XY3
Vehículo: Nissan NP300 2024
Capacidad de Carga: 1000.0 kg
Cantidad: 3 unidades
Precio Unitario: $285,000.00
----------------------------------------
Subtotal: $855,000.00
Descuento: $0.00 (0%)
========================================
TOTAL A PAGAR: $855,000.00
========================================

========================================
           VENTA #2
========================================
Folio: VTA-002
Cliente: Logística Express
RFC: LOG850920AB7
Vehículo: Nissan NP300 2024
Capacidad de Carga: 1000.0 kg
Cantidad: 8 unidades
Precio Unitario: $285,000.00
----------------------------------------
Subtotal: $2,280,000.00
Descuento: $114,000.00 (5%)
========================================
TOTAL A PAGAR: $2,166,000.00
========================================

========================================
           VENTA #3
========================================
Folio: VTA-003
Cliente: Distribuidora del Norte
RFC: DIS900315CD2
Vehículo: Toyota Hilux 2024
Capacidad de Carga: 1200.0 kg
Cantidad: 12 unidades
Precio Unitario: $320,000.00
----------------------------------------
Subtotal: $3,840,000.00
Descuento: $384,000.00 (10%)
========================================
TOTAL A PAGAR: $3,456,000.00
========================================

Total de ventas procesadas: 3
```

---

## ✅ Criterios de Evaluación

| Criterio | Puntos | Descripción |
|----------|--------|-------------|
| **Compilación exitosa** | 3.0 | El código compila sin errores |
| **Clase Vehiculo** | 2.0 | Implementación completa y correcta |
| **Clase Cliente** | 2.0 | Implementación completa y correcta |
| **Clase Venta** | 3.0 | Implementación completa y correcta |
| **Cálculo de totales** | 1.5 | Totales calculados correctamente |
| **Descuentos por volumen** | 2.0 | Lógica de descuentos correcta |
| **Clase Main completa** | 1.5 | Casos de prueba adecuados |
| **Encapsulamiento** | 1.0 | Uso correcto de modificadores de acceso |
| **Código limpio** | 1.0 | Código bien comentado y organizado |
| **TOTAL** | **15.0** | |

---

## 🚀 Instrucciones de Trabajo

### Paso 1: Aceptar el Assignment
✅ Ya lo hiciste al llegar aquí

### Paso 2: Clonar tu Repositorio
```bash
git clone [URL-de-tu-repositorio]
cd [nombre-del-repositorio]
```

### Paso 3: Implementar las Clases
Completa el código en los archivos:
- `src/Vehiculo.java`
- `src/Cliente.java`
- `src/Venta.java`
- `src/Main.java`

### Paso 4: Compilar y Probar Localmente
```bash
cd src
javac *.java
java Main
```

### Paso 5: Hacer Commits Frecuentes
```bash
git add .
git commit -m "Implementa clase Vehiculo"
git push
```

**Repite este proceso** cada vez que completes una parte significativa.

### Paso 6: Verificar Autograding
- Ve a la pestaña **Actions** en tu repositorio
- Observa si los tests pasan ✅ o fallan ❌
- Corrige errores si es necesario
- Vuelve a hacer push

---

## 📊 Estado del Autograding

Puedes ver el estado de tus tests en tiempo real:

1. Ve a tu repositorio en GitHub
2. Click en la pestaña **Actions**
3. Selecciona el workflow más reciente
4. Revisa qué tests pasaron y cuáles fallaron

**Badge de estado:** El badge al inicio de este README muestra el estado actual.

---

## ⏰ Información de Entrega

- **Fecha límite:** [FECHA Y HORA - será definida por el profesor]
- **Método de entrega:** Automático mediante GitHub (último push antes del deadline)
- **Penalización por retraso:** 10% por día (máximo 3 días)

---

## 💡 Consejos y Buenas Prácticas

### ✨ Para obtener la mejor calificación:

1. **Comienza temprano** - No esperes al último día
2. **Lee cuidadosamente** - Asegúrate de entender todos los requisitos
3. **Prueba constantemente** - Ejecuta tu código después de cada cambio
4. **Commits pequeños** - Haz commits frecuentes con mensajes descriptivos
```bash
   ✅ git commit -m "Implementa constructor de Vehiculo"
   ✅ git commit -m "Agrega método calcularTotal en Venta"
   ❌ git commit -m "cambios"
   ❌ git commit -m "asdasd"
```
5. **Usa nombres descriptivos** - Variables y métodos con nombres claros
6. **Comenta tu código** - Explica la lógica compleja
7. **Respeta el encapsulamiento** - Atributos privados, métodos públicos
8. **Formatea tu código** - Usa indentación consistente

### 🐛 Si encuentras problemas:

1. **Revisa los mensajes de error** - El compilador te dice qué está mal
2. **Consulta la documentación** - [Java Docs](https://docs.oracle.com/en/java/)
3. **Revisa los ejemplos** - Lee los ejemplos de uso en este README
4. **Pregunta en clase** - No dudes en solicitar aclaraciones
5. **Revisa el autograding** - Los tests te indican qué falta

---

## 📚 Recursos de Apoyo

- [Documentación Oficial de Java](https://docs.oracle.com/en/java/)
- [Java String Formatting](https://docs.oracle.com/javase/tutorial/java/data/numberformat.html)
- Material del curso sobre Clases y Objetos (Unidad 2)
- Ejemplos vistos en clase

---

## ❓ Preguntas Frecuentes

### P: ¿Cómo asigno el folio a cada venta?
**R:** Simplemente pasa el folio como String en el constructor:
```java
Venta venta1 = new Venta("VTA-001", 3, v1, c1);
Venta venta2 = new Venta("VTA-002", 8, v1, c2);
```

### P: ¿Debo validar los datos de entrada?
**R:** Para este ejercicio básico no es obligatorio, pero es buena práctica. Puedes agregar validaciones extras para puntos adicionales.

### P: ¿Puedo agregar métodos o atributos adicionales?
**R:** Sí, siempre y cuando incluyas todos los métodos y atributos requeridos. Los extras pueden darte puntos de bonificación.

### P: ¿Cómo formateo los números como moneda?
**R:** Puedes usar `String.format()`:
```java
String.format("$%,.2f", precio);  // $285,000.00
```

### P: El autograding falla pero mi código funciona localmente, ¿qué hago?
**R:** Verifica que:
- Todos los archivos estén en el directorio `src/`
- Los nombres de las clases coincidan exactamente
- No tengas declaraciones de `package`
- La salida del programa sea similar a la especificada

### P: ¿Puedo trabajar en equipo?
**R:** NO. Este es un assignment individual. El código debe ser 100% tuyo.

---

## 🎯 Checklist Final

Antes de hacer tu push final, verifica:

- [ ] Todas las clases compilan sin errores
- [ ] La clase `Vehiculo` está completa
- [ ] La clase `Cliente` está completa
- [ ] La clase `Venta` está completa
- [ ] El cálculo de totales es correcto
- [ ] Los descuentos por volumen funcionan
- [ ] La clase `Main` tiene al menos 3 ventas de prueba
- [ ] Los atributos son privados
- [ ] Los getters y setters están implementados
- [ ] Los métodos `toString()` funcionan correctamente
- [ ] El código está comentado
- [ ] Hice commits con mensajes descriptivos
- [ ] El autograding pasa todos los tests

---

## 📞 Contacto

Si tienes dudas sobre el assignment:

- **Clase:** Lunes y Miércoles [horario]
- **Asesorías:** [días y horarios]
- **Email:** [email del profesor]

---

## 🏆 Créditos

**Asignatura:** Programación Orientada a Objetos (AED-1286)  
**Unidad:** 1 - Introducción al Paradigma de POO  
**Tipo de ejercicio:** Básico (B)  
**Institución:** Tecnológico Nacional de México  
**Semestre:** Enero-Junio 2026

---

**¡Mucho éxito en tu assignment! 🚀**

---

> 💡 **Recuerda:** El verdadero aprendizaje viene de enfrentar los desafíos por ti mismo. No busques soluciones en internet, ¡tú puedes resolverlo! 💪