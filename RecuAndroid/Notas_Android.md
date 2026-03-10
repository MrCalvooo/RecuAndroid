**Fecha de inicio:** 25 de Febrero 2026  
**Fecha estimada de examen:** Finales de Mayo - Principios de Junio 2026

---

# 📚 Guía de Estudio - Programación Android con Java

**Preparación para Examen de Recuperación**

---

## 📑 ÍNDICE GENERAL

### 📅 ÍNDICE DE SESIONES POR SEMANAS

**[SEMANAS 1-2: FUNDAMENTOS Y UI BÁSICA](#semanas-1-2-fundamentos-y-ui-b%C3%A1sica)**

- [Día 1 - Introducción y Botones](#d%C3%ADa-1---introducci%C3%B3n-y-botones)
- [Día 2 - Formularios y EditText](#d%C3%ADa-2---formularios-y-edittext)
- [Día 3 - Spinner y Layouts](#d%C3%ADa-3---spinner-y-layouts) ✅
- Día 4 - Spinner y Layouts ✅

**[SEMANAS 3-4: LISTAS Y ADAPTADORES](#semanas-3-4-listas-y-adaptadores)**

- Día 5 - ListView Básico _(Próximamente)_
- Día 6 - ArrayAdapter Personalizado _(Próximamente)_
- Día 7 - GridView _(Próximamente)_
- Día 8 - Eventos en ListView _(Próximamente)_

**[SEMANAS 5-6: MENÚS Y DIÁLOGOS](#semanas-5-6-men%C3%BAs-y-di%C3%A1logos)**

- Día 9 - Menú de Opciones _(Próximamente)_
- Día 10 - AlertDialog _(Próximamente)_
- Día 11 - TimePickerDialog y DatePickerDialog _(Próximamente)_
- Día 12 - Context Menu y PopupMenu _(Próximamente)_

**[SEMANAS 7-8: PERSISTENCIA DE DATOS](#semanas-7-8-persistencia-de-datos)**

- Día 13 - SharedPreferences _(Próximamente)_
- Día 14 - Ficheros Internos _(Próximamente)_
- Día 15 - Ficheros Externos _(Próximamente)_
- Día 16 - Repaso Persistencia _(Próximamente)_

**[SEMANAS 9-10: MULTIMEDIA Y RECURSOS](#semanas-9-10-multimedia-y-recursos)**

- Día 17 - MediaPlayer (Audio) _(Próximamente)_
- Día 18 - VideoView _(Próximamente)_
- Día 19 - SplashScreen _(Próximamente)_
- Día 20 - Internacionalización _(Próximamente)_

**[SEMANAS 11-12: RED Y JSON](#semanas-11-12-red-y-json)**

- Día 21 - Volley (Introducción) _(Próximamente)_
- Día 22 - JSON y Parsing _(Próximamente)_
- Día 23 - Picasso (Imágenes desde URL) _(Próximamente)_
- Día 24 - Proyecto Completo (ListView + Volley + Picasso) _(Próximamente)_

**[SEMANAS 13-14: INTENTS Y NAVEGACIÓN](#semanas-13-14-intents-y-navegaci%C3%B3n)**

- Día 25 - Intent Explícito _(Próximamente)_
- Día 26 - Intent Implícito _(Próximamente)_
- Día 27 - Orientación de Pantalla _(Próximamente)_
- Día 28 - Permisos en AndroidManifest _(Próximamente)_

**[SEMANAS 15-16: REPASO Y EXÁMENES DE PRÁCTICA](#semanas-15-16-repaso-y-ex%C3%A1menes-de-pr%C3%A1ctica)**

- Día 29 - Revisión ExamenJSON _(Próximamente)_
- Día 30 - Revisión ExamenRecu _(Próximamente)_
- Día 31 - Simulacro de Examen _(Próximamente)_
- Día 32 - Revisión Final _(Próximamente)_

---

### 📖 ÍNDICE DETALLADO DEL DÍA 1

1. [¿Qué es Android?](#1-qu%C3%A9-es-android)
2. [Estructura de un Proyecto Android](#2-estructura-de-un-proyecto-android)
3. [Componentes clave de una Activity](#3-componentes-clave-de-una-activity)
4. [Ciclo de vida básico](#4-ciclo-de-vida-b%C3%A1sico)
5. [Ejercicio 1: Contador de Clics](#ejercicio-1-contador-de-clics)
6. [Ejercicio 2: Cambiar Color de Fondo](#ejercicio-2-cambiar-color-de-fondo)
7. [Solución Ejercicio 1](#soluci%C3%B3n-ejercicio-1-contador-de-clics)
8. [Solución Ejercicio 2](#soluci%C3%B3n-ejercicio-2-cambiar-color-de-fondo)
9. [Checklist Día 1](#checklist-d%C3%ADa-1)
10. [Conceptos Clave Día 1](#conceptos-clave-del-d%C3%ADa-1)

---

### 📖 ÍNDICE DETALLADO DEL DÍA 2

1. [EditText - Campo de texto editable](#1-edittext---campo-de-texto-editable)
2. [Toast - Mensajes emergentes](#2-toast---mensajes-emergentes)
3. [CheckBox - Casillas de verificación](#3-checkbox---casillas-de-verificaci%C3%B3n)
4. [RadioButton y RadioGroup](#4-radiobutton-y-radiogroup---botones-de-opci%C3%B3n)
5. [Diferencia entre CheckBox y RadioButton](#5-diferencia-entre-checkbox-y-radiobutton)
6. [Validaciones básicas](#6-validaciones-b%C3%A1sicas)
7. [Ejercicio 3: Formulario de Registro](#ejercicio-3-formulario-de-registro)
8. [Ejercicio 4: Calculadora Simple](#ejercicio-4-calculadora-simple)
9. [Solución Ejercicio 3](#soluci%C3%B3n-ejercicio-3-formulario-de-registro)
10. [Solución Ejercicio 4](#soluci%C3%B3n-ejercicio-4-calculadora-simple)
11. [Checklist Día 2](#checklist-d%C3%ADa-2)
12. [Conceptos Clave Día 2](#conceptos-clave-del-d%C3%ADa-2)

---

### 🔍 BÚSQUEDA RÁPIDA POR CONCEPTOS

**Controles básicos:**

- [Button](#3-componentes-clave-de-una-activity)
- [TextView](#3-componentes-clave-de-una-activity)
- [EditText](#1-edittext---campo-de-texto-editable)
- [CheckBox](#3-checkbox---casillas-de-verificaci%C3%B3n)
- [RadioButton](#4-radiobutton-y-radiogroup---botones-de-opci%C3%B3n)

**Eventos:**

- [onClick](#3-componentes-clave-de-una-activity)
- [OnCheckedChangeListener](#3-checkbox---casillas-de-verificaci%C3%B3n)

**Validaciones:**

- [Validar campos vacíos](#6-validaciones-b%C3%A1sicas)
- [Validar números](#6-validaciones-b%C3%A1sicas)
- [Validar email](#6-validaciones-b%C3%A1sicas)

**Mensajes:**

- [Toast](#2-toast---mensajes-emergentes)
- [setError()](#6-validaciones-b%C3%A1sicas)

---

[🔝 Volver al índice](#-%C3%ADndice-general)

---

# 🎯 DÍA 1 - Introducción y Botones

**Fecha:** 25 de Febrero 2026  
**Duración:** 2-3 horas  
**Objetivos:** Entender la estructura de un proyecto Android y trabajar con Button y TextView

---

## 📖 1. ¿Qué es Android?

Android es un sistema operativo móvil basado en Linux desarrollado por Google. Para crear aplicaciones Android usamos:

**Características principales:** ✅ Desarrollo en **Java** o Kotlin (nosotros usaremos Java) ✅ Interfaz diseñada en **XML** ✅ Basado en **eventos** (onClick, onLongClick, etc.) ✅ Arquitectura de **Activities** (pantallas) ✅ Recursos separados del código

**Analogía conceptual:**

```
┌─────────────────────────────────┐
│  ACTIVITY (Pantalla/Ventana)    │
│                                 │
│  ┌──────────┐  ┌──────────┐   │
│  │  Button  │  │ TextView │   │ ← VIEWS (Controles)
│  └──────────┘  └──────────┘   │
│                                 │
│  ┌─────────────────────────┐   │
│  │      ImageView          │   │
│  └─────────────────────────┘   │
│                                 │
└─────────────────────────────────┘
         ↓ EVENTS (Acciones)
   onClick, onLongClick, etc.
```

---

## 🗂 2. Estructura de un Proyecto Android

Todo proyecto Android tiene esta estructura básica:

```
MiApp/
├── app/
│   ├── src/
│   │   ├── main/
│   │   │   ├── java/
│   │   │   │   └── com.ejemplo.miapp/
│   │   │   │       └── MainActivity.java    → Código Java (lógica)
│   │   │   ├── res/
│   │   │   │   ├── layout/
│   │   │   │   │   └── activity_main.xml    → Diseño XML
│   │   │   │   ├── values/
│   │   │   │   │   ├── strings.xml          → Textos
│   │   │   │   │   └── colors.xml           → Colores
│   │   │   │   ├── drawable/                → Imágenes
│   │   │   │   └── raw/                     → Audio, video
│   │   │   └── AndroidManifest.xml          → Configuración app
│   └── build.gradle.kts                     → Dependencias
```

---

## 📱 3. Componentes clave de una Activity

### MainActivity.java - Código Java

```java
package com.ejemplo.miapp;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    
    // 1️⃣ DECLARACIÓN de vistas (fuera de métodos, como atributos)
    private Button btnSaludar;
    private TextView txtResultado;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
        // 2️⃣ VINCULAR con el layout XML
        setContentView(R.layout.activity_main);
        
        // 3️⃣ REFERENCIAR elementos del layout (por su ID)
        btnSaludar = findViewById(R.id.btnSaludar);
        txtResultado = findViewById(R.id.txtResultado);
        
        // 4️⃣ CONFIGURAR listeners (eventos)
        // Forma tradicional (anónima)
        btnSaludar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtResultado.setText("¡Hola Mundo!");
            }
        });
        
        // Forma con lambda (más corta) - EQUIVALENTE
        // btnSaludar.setOnClickListener(v -> txtResultado.setText("¡Hola!"));
    }
}
```

**🔑 Conceptos importantes:**

|Concepto|Explicación|
|---|---|
|`AppCompatActivity`|Clase base de toda Activity Android|
|`onCreate()`|Método que se ejecuta al crear la Activity|
|`setContentView()`|Vincula el código Java con el XML|
|`findViewById()`|Busca un elemento del XML por su ID|
|`setOnClickListener()`|Define qué ocurre al pulsar un botón|

---

### activity_main.xml - Layout XML

```xml
<?xml version="1.0" encoding="utf-8"?>
<LinearLayout 
    xmlns:android="http://schemas.android.com/apk/res/android"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:orientation="vertical"
    android:padding="16dp"
    android:gravity="center">

    <!-- TextView: muestra texto -->
    <TextView
        android:id="@+id/txtResultado"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:text="Pulsa el botón"
        android:textSize="20sp"
        android:textAlignment="center"
        android:layout_marginBottom="20dp"/>

    <!-- Button: botón clickeable -->
    <Button
        android:id="@+id/btnSaludar"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:text="Saludar"/>

</LinearLayout>
```

**🔑 Atributos XML importantes:**

|Atributo|Explicación|
|---|---|
|`android:id="@+id/nombre"`|Identificador único para referenciar desde Java|
|`android:layout_width`|Ancho: `match_parent` (ocupa todo) o `wrap_content` (mínimo)|
|`android:layout_height`|Alto: igual que width|
|`android:text`|Texto que muestra el control|
|`android:orientation`|`vertical` u `horizontal` (solo en LinearLayout)|
|`android:padding`|Espaciado interno|
|`android:layout_marginBottom`|Margen externo inferior|

---

## 💡 4. Ciclo de vida básico

```
┌─────────────────┐
│   onCreate()    │ ← Se ejecuta UNA VEZ al crear la Activity
└─────────────────┘
         ↓
┌─────────────────┐
│   onStart()     │ ← La Activity es visible
└─────────────────┘
         ↓
┌─────────────────┐
│   onResume()    │ ← La Activity está en primer plano (interactiva)
└─────────────────┘
         ↓
    [Usuario usa la app]
         ↓
┌─────────────────┐
│   onPause()     │ ← La Activity pierde el foco
└─────────────────┘
         ↓
┌─────────────────┐
│   onStop()      │ ← La Activity ya no es visible
└─────────────────┘
         ↓
┌─────────────────┐
│   onDestroy()   │ ← La Activity se destruye
└─────────────────┘
```

**Por ahora nos centramos en `onCreate()` — el resto lo veremos más adelante.**

---

## 🎯 EJERCICIO 1: Contador de Clics

**📝 Objetivo:** Crear una app con un botón que cuente cuántas veces se ha pulsado.

**📋 Requisitos:**

1. Un `TextView` que muestre el número de clics (inicialmente "Clics: 0")
2. Un `Button` que al pulsarlo incremente el contador
3. Un segundo `Button` para resetear el contador a 0

**💡 Pistas:**

- Necesitarás una variable `int contador = 0;` como atributo de la clase
- En el onClick del primer botón:
    
    ```java
    contador++;txtContador.setText("Clics: " + contador);
    ```
    
- En el onClick del segundo botón: resetea `contador` a 0 y actualiza el TextView

---

### 📄 Código de apoyo (MainActivity.java)

```java
package com.ejemplo.contador;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    
    // TODO: Declarar TextView y dos Buttons
    private TextView txtContador;
    private Button btnIncrementar;
    private Button btnResetear;
    
    // Variable para contar clics
    private int contador = 0;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        // TODO: Referenciar las vistas con findViewById
        txtContador = findViewById(R.id.txtContador);
        btnIncrementar = findViewById(R.id.btnIncrementar);
        btnResetear = findViewById(R.id.btnResetear);
        
        // TODO: Configurar listener del botón incrementar
        btnIncrementar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TU CÓDIGO AQUÍ
            }
        });
        
        // TODO: Configurar listener del botón resetear
        btnResetear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TU CÓDIGO AQUÍ
            }
        });
    }
}
```

---

### 📄 Layout XML (activity_main.xml)

```xml
<?xml version="1.0" encoding="utf-8"?>
<LinearLayout 
    xmlns:android="http://schemas.android.com/apk/res/android"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:orientation="vertical"
    android:padding="20dp"
    android:gravity="center">

    <TextView
        android:id="@+id/txtContador"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="Clics: 0"
        android:textSize="32sp"
        android:textStyle="bold"
        android:layout_marginBottom="30dp"/>

    <Button
        android:id="@+id/btnIncrementar"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:text="Incrementar"
        android:layout_marginBottom="10dp"/>

    <Button
        android:id="@+id/btnResetear"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:text="Resetear"/>

</LinearLayout>
```

---

## 🎯 EJERCICIO 2: Cambiar Color de Fondo

**📝 Objetivo:** Tres botones que cambien el color de fondo de la pantalla.

**📋 Requisitos:**

1. Tres botones: "Rojo", "Verde", "Azul"
2. Al pulsar cada botón, el fondo del layout cambia a ese color
3. **EXTRA (opcional):** Añade un botón "Aleatorio" que ponga un color random

**💡 Pistas:**

- En el layout XML, dale un `android:id="@+id/layoutPrincipal"` al LinearLayout
- En Java:
    
    ```java
    LinearLayout layoutPrincipal = findViewById(R.id.layoutPrincipal);layoutPrincipal.setBackgroundColor(Color.RED);
    ```
    
- Importar: `import android.graphics.Color;`
- Para color aleatorio:
    
    ```java
    Random random = new Random();int color = Color.rgb(random.nextInt(256), random.nextInt(256), random.nextInt(256));layoutPrincipal.setBackgroundColor(color);
    ```
    

---

### 📄 Layout XML sugerido

```xml
<?xml version="1.0" encoding="utf-8"?>
<LinearLayout 
    xmlns:android="http://schemas.android.com/apk/res/android"
    android:id="@+id/layoutPrincipal"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:orientation="vertical"
    android:padding="20dp"
    android:gravity="center">

    <Button
        android:id="@+id/btnRojo"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:text="Rojo"
        android:layout_marginBottom="10dp"/>

    <Button
        android:id="@+id/btnVerde"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:text="Verde"
        android:layout_marginBottom="10dp"/>

    <Button
        android:id="@+id/btnAzul"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:text="Azul"
        android:layout_marginBottom="30dp"/>

    <!-- EXTRA: Botón aleatorio -->
    <Button
        android:id="@+id/btnAleatorio"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:text="Color Aleatorio"/>

</LinearLayout>
```

---

## ✅ SOLUCIÓN EJERCICIO 1: Contador de Clics

```java
package com.ejemplo.contador;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    
    private TextView txtContador;
    private Button btnIncrementar;
    private Button btnResetear;
    private int contador = 0;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        // Referenciar vistas
        txtContador = findViewById(R.id.txtContador);
        btnIncrementar = findViewById(R.id.btnIncrementar);
        btnResetear = findViewById(R.id.btnResetear);
        
        // Listener incrementar
        btnIncrementar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                contador++;
                txtContador.setText("Clics: " + contador);
            }
        });
        
        // Listener resetear
        btnResetear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                contador = 0;
                txtContador.setText("Clics: " + contador);
            }
        });
    }
}
```

**🔑 Puntos clave de la solución:**

- El contador se declara como **atributo de clase** (fuera de métodos)
- Se incrementa en el onClick del primer botón
- Se resetea a 0 en el onClick del segundo botón
- Siempre actualizamos el TextView después de cambiar el contador

---

## ✅ SOLUCIÓN EJERCICIO 2: Cambiar Color de Fondo

```java
package com.ejemplo.colores;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import androidx.appcompat.app.AppCompatActivity;
import java.util.Random;

public class MainActivity extends AppCompatActivity {
    
    private LinearLayout layoutPrincipal;
    private Button btnRojo, btnVerde, btnAzul, btnAleatorio;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        // Referenciar vistas
        layoutPrincipal = findViewById(R.id.layoutPrincipal);
        btnRojo = findViewById(R.id.btnRojo);
        btnVerde = findViewById(R.id.btnVerde);
        btnAzul = findViewById(R.id.btnAzul);
        btnAleatorio = findViewById(R.id.btnAleatorio);
        
        // Listener Rojo
        btnRojo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                layoutPrincipal.setBackgroundColor(Color.RED);
            }
        });
        
        // Listener Verde
        btnVerde.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                layoutPrincipal.setBackgroundColor(Color.GREEN);
            }
        });
        
        // Listener Azul
        btnAzul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                layoutPrincipal.setBackgroundColor(Color.BLUE);
            }
        });
        
        // Listener Aleatorio (EXTRA)
        btnAleatorio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random random = new Random();
                int r = random.nextInt(256);
                int g = random.nextInt(256);
                int b = random.nextInt(256);
                layoutPrincipal.setBackgroundColor(Color.rgb(r, g, b));
            }
        });
    }
}
```

**🔑 Puntos clave de la solución:**

- Referenciamos el **LinearLayout** principal para cambiarle el fondo
- Usamos `Color.RED`, `Color.GREEN`, `Color.BLUE` (constantes predefinidas)
- Para el aleatorio: `Color.rgb(r, g, b)` con valores de 0 a 255
- `random.nextInt(256)` genera un número entre 0 y 255

---

## 📝 CHECKLIST DÍA 1

Antes de pasar al siguiente día, asegúrate de que:

- [ ] Entiendes la estructura básica de un proyecto Android
- [ ] Sabes qué es una Activity y para qué sirve `onCreate()`
- [ ] Entiendes la diferencia entre el archivo `.java` y el `.xml`
- [ ] Sabes cómo referenciar vistas con `findViewById()`
- [ ] Puedes configurar un `OnClickListener` en un botón
- [ ] Has completado el Ejercicio 1 (Contador)
- [ ] Has completado el Ejercicio 2 (Cambiar Color)
- [ ] Entiendes cómo declarar variables como atributos de clase
- [ ] Sabes usar `setText()` para cambiar texto de un TextView
- [ ] Sabes usar `setBackgroundColor()` para cambiar color de fondo

---

## 🏠 TAREA PARA PRACTICAR

**Proyecto: "Calculadora de Propinas"**

Crea una app que calcule propinas:

1. Un `EditText` para introducir el total de la cuenta
2. Tres botones: "10%", "15%", "20%"
3. Un `TextView` que muestre la propina calculada

**Ejemplo de funcionamiento:**

- Usuario escribe "50" en el EditText
- Pulsa "15%"
- El TextView muestra: "Propina: 7.5€"

**Pista extra:** Para obtener el texto del EditText:

```java
EditText etTotal = findViewById(R.id.etTotal);
String textoTotal = etTotal.getText().toString();
double total = Double.parseDouble(textoTotal);
double propina = total * 0.15; // Para 15%
txtResultado.setText("Propina: " + propina + "€");
```

---

## 📚 RECURSOS ADICIONALES

**Documentación oficial Android:**

- [Developer Android - Activity](https://developer.android.com/guide/components/activities/intro-activities)
- [Developer Android - Layouts](https://developer.android.com/guide/topics/ui/declaring-layout)

**Colores en Android:**

- Color.RED, Color.GREEN, Color.BLUE
- Color.WHITE, Color.BLACK, Color.GRAY
- Color.rgb(r, g, b) → valores de 0 a 255
- Color.parseColor("#FF5733") → color hexadecimal

---

## 🎓 CONCEPTOS CLAVE DEL DÍA 1

|Concepto|Definición|
|---|---|
|**Activity**|Pantalla de la app (como un Form en Windows Forms)|
|**Layout**|Contenedor que organiza los controles (LinearLayout, RelativeLayout, etc.)|
|**View**|Clase base de todos los controles (Button, TextView, EditText, etc.)|
|**findViewById()**|Método para obtener una referencia a un elemento del XML|
|**setOnClickListener()**|Asigna un evento al pulsar un botón|
|**R.id**|Acceso a los recursos (layouts, strings, ids, etc.)|
|**onCreate()**|Método que se ejecuta al crear la Activity|
|**setContentView()**|Vincula el código Java con el layout XML|

---

## 💬 NOTAS DEL PROFESOR

**¡Buen trabajo en el primer día!** 🎉

Si has completado ambos ejercicios, ya dominas:

- La estructura básica de una Activity
- Cómo conectar Java con XML
- Eventos onClick
- Modificar propiedades de vistas (texto, color)

**Próximo día:** Trabajaremos con EditText, CheckBox, RadioButton y Toast para crear formularios más interactivos.

**Recuerda:** La práctica es clave. Si tienes tiempo, intenta hacer la tarea de la calculadora de propinas.

---

📌 **Guardado:** 25/02/2026 - 17:30h  
📌 **Próxima sesión:** Día 2 - Formularios y EditText

---

# 🎯 DÍA 2 - Formularios y EditText

**Fecha:** 25 de Febrero 2026  
**Duración:** 2-3 horas  
**Objetivos:** Trabajar con EditText, CheckBox, RadioButton, Toast y validaciones básicas

---

## 📖 1. EditText - Campo de texto editable

El `EditText` es el control que permite al usuario **introducir texto**. Es como el TextBox de Windows Forms.

### Propiedades importantes del EditText:

```xml
<EditText
    android:id="@+id/etNombre"
    android:layout_width="match_parent"
    android:layout_height="wrap_content"
    android:hint="Escribe tu nombre"
    android:inputType="textPersonName"
    android:maxLines="1"
    android:imeOptions="actionDone"/>
```

|Atributo|Explicación|
|---|---|
|`android:hint`|Texto de ayuda que aparece cuando el campo está vacío (placeholder)|
|`android:inputType`|Tipo de teclado: `text`, `number`, `phone`, `textEmailAddress`, `textPassword`|
|`android:maxLines`|Número máximo de líneas|
|`android:imeOptions`|Acción del botón del teclado: `actionDone`, `actionNext`, `actionSearch`|

### Tipos de inputType comunes:

```java
// Texto normal
android:inputType="text"

// Texto de una persona (capitaliza primera letra)
android:inputType="textPersonName"

// Solo números
android:inputType="number"

// Números decimales
android:inputType="numberDecimal"

// Contraseña (oculta caracteres)
android:inputType="textPassword"

// Email
android:inputType="textEmailAddress"

// Teléfono
android:inputType="phone"
```

---

### Obtener y establecer texto en Java:

```java
EditText etNombre = findViewById(R.id.etNombre);

// OBTENER texto
String nombre = etNombre.getText().toString();

// ESTABLECER texto
etNombre.setText("Juan");

// LIMPIAR campo
etNombre.setText("");

// VERIFICAR si está vacío
if (etNombre.getText().toString().isEmpty()) {
    // Está vacío
}
```

---

## 📖 2. Toast - Mensajes emergentes

Los **Toast** son mensajes breves que aparecen en la parte inferior de la pantalla durante unos segundos.

```java
// Sintaxis básica
Toast.makeText(context, "Mensaje", duración).show();

// Ejemplo en una Activity
Toast.makeText(MainActivity.this, "¡Hola Mundo!", Toast.LENGTH_SHORT).show();

// Duraciones disponibles
Toast.LENGTH_SHORT  // ~2 segundos
Toast.LENGTH_LONG   // ~3.5 segundos
```

**⚠️ IMPORTANTE:** Siempre terminar con `.show()` o el Toast no aparecerá.

```
┌─────────────────────────┐
│                         │
│      Tu Activity        │
│                         │
│                         │
│                         │
│  ┌───────────────────┐  │
│  │ ✅ Datos guardados │  │ ← Toast
│  └───────────────────┘  │
│                         │
└─────────────────────────┘
```

---

## 📖 3. CheckBox - Casillas de verificación

Los `CheckBox` permiten seleccionar **múltiples opciones** (no excluyentes).

### XML:

```xml
<CheckBox
    android:id="@+id/cbJava"
    android:layout_width="wrap_content"
    android:layout_height="wrap_content"
    android:text="Java"/>

<CheckBox
    android:id="@+id/cbKotlin"
    android:layout_width="wrap_content"
    android:layout_height="wrap_content"
    android:text="Kotlin"/>
```

### Java:

```java
CheckBox cbJava = findViewById(R.id.cbJava);
CheckBox cbKotlin = findViewById(R.id.cbKotlin);

// Verificar si está marcado
if (cbJava.isChecked()) {
    Toast.makeText(this, "Java seleccionado", Toast.LENGTH_SHORT).show();
}

// Marcar/desmarcar programáticamente
cbJava.setChecked(true);  // Marcar
cbKotlin.setChecked(false); // Desmarcar

// Listener de cambio de estado
cbJava.setOnCheckedChangeListener((buttonView, isChecked) -> {
    if (isChecked) {
        // Se ha marcado
    } else {
        // Se ha desmarcado
    }
});
```

---

## 📖 4. RadioButton y RadioGroup - Botones de opción

Los `RadioButton` permiten seleccionar **UNA SOLA opción** de un grupo (excluyentes).

**⚠️ IMPORTANTE:** Deben estar dentro de un `RadioGroup`.

### XML:

```xml
<RadioGroup
    android:id="@+id/rgGenero"
    android:layout_width="wrap_content"
    android:layout_height="wrap_content"
    android:orientation="vertical">

    <RadioButton
        android:id="@+id/rbMasculino"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="Masculino"/>

    <RadioButton
        android:id="@+id/rbFemenino"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="Femenino"/>

    <RadioButton
        android:id="@+id/rbOtro"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="Otro"/>
</RadioGroup>
```

### Java:

```java
RadioGroup rgGenero = findViewById(R.id.rgGenero);
RadioButton rbMasculino = findViewById(R.id.rbMasculino);

// Obtener el ID del RadioButton seleccionado
int selectedId = rgGenero.getCheckedRadioButtonId();

if (selectedId == R.id.rbMasculino) {
    Toast.makeText(this, "Masculino", Toast.LENGTH_SHORT).show();
}

// Marcar un RadioButton programáticamente
rbMasculino.setChecked(true);

// Listener de cambio
rgGenero.setOnCheckedChangeListener((group, checkedId) -> {
    RadioButton rb = findViewById(checkedId);
    Toast.makeText(this, "Seleccionado: " + rb.getText(), Toast.LENGTH_SHORT).show();
});
```

---

## 📖 5. Diferencia entre CheckBox y RadioButton

```
┌──────────────────────────────────────────────────────┐
│ CHECKBOX (Múltiple selección)                        │
├──────────────────────────────────────────────────────┤
│ ☑ Java                                               │
│ ☑ Kotlin        ← Puedes marcar varios a la vez     │
│ ☐ C#                                                 │
└──────────────────────────────────────────────────────┘

┌──────────────────────────────────────────────────────┐
│ RADIOBUTTON (Una sola opción)                        │
├──────────────────────────────────────────────────────┤
│ ◯ Masculino                                          │
│ ⦿ Femenino      ← Solo UNO puede estar marcado      │
│ ◯ Otro                                               │
└──────────────────────────────────────────────────────┘
```

---

## 📖 6. Validaciones básicas

### Validar que un campo no esté vacío:

```java
EditText etNombre = findViewById(R.id.etNombre);
String nombre = etNombre.getText().toString().trim(); // trim() quita espacios

if (nombre.isEmpty()) {
    Toast.makeText(this, "El nombre no puede estar vacío", Toast.LENGTH_SHORT).show();
    etNombre.setError("Campo obligatorio"); // Muestra error en el campo
    return; // No continuar
}
```

### Validar que sea un número:

```java
EditText etEdad = findViewById(R.id.etEdad);
String edadTexto = etEdad.getText().toString();

try {
    int edad = Integer.parseInt(edadTexto);
    if (edad < 0 || edad > 120) {
        Toast.makeText(this, "Edad no válida", Toast.LENGTH_SHORT).show();
        return;
    }
} catch (NumberFormatException e) {
    Toast.makeText(this, "Introduce un número válido", Toast.LENGTH_SHORT).show();
    return;
}
```

### Validar email (simple):

```java
String email = etEmail.getText().toString();

if (!email.contains("@") || !email.contains(".")) {
    Toast.makeText(this, "Email no válido", Toast.LENGTH_SHORT).show();
    etEmail.setError("Formato de email incorrecto");
    return;
}
```

---

## 🎯 EJERCICIO 3: Formulario de Registro

**📝 Objetivo:** Crear un formulario de registro completo con validaciones.

**📋 Requisitos:**

1. **Campos:**
    
    - Nombre (EditText)
    - Email (EditText con inputType email)
    - Edad (EditText con inputType number)
    - Género (RadioGroup con 3 opciones: Masculino, Femenino, Otro)
    - Acepto términos y condiciones (CheckBox)
2. **Botón "Registrar"** que:
    
    - Valide que el nombre no esté vacío
    - Valide que el email contenga @ y .
    - Valide que la edad sea un número entre 18 y 100
    - Valide que se haya seleccionado un género
    - Valide que se haya aceptado el CheckBox de términos
3. **Si todo es válido:**
    
    - Mostrar un Toast con: "Bienvenido [nombre], [edad] años, [género]"
4. **Si algo falla:**
    
    - Mostrar Toast específico del error

---

### 📄 Layout XML sugerido (activity_main.xml):

```xml
<?xml version="1.0" encoding="utf-8"?>
<ScrollView xmlns:android="http://schemas.android.com/apk/res/android"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:padding="20dp">

    <LinearLayout
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:orientation="vertical">

        <!-- Título -->
        <TextView
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:text="FORMULARIO DE REGISTRO"
            android:textSize="24sp"
            android:textStyle="bold"
            android:layout_gravity="center"
            android:layout_marginBottom="30dp"/>

        <!-- Nombre -->
        <TextView
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:text="Nombre:"
            android:textStyle="bold"/>

        <EditText
            android:id="@+id/etNombre"
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:hint="Introduce tu nombre"
            android:inputType="textPersonName"
            android:layout_marginBottom="15dp"/>

        <!-- Email -->
        <TextView
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:text="Email:"
            android:textStyle="bold"/>

        <EditText
            android:id="@+id/etEmail"
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:hint="ejemplo@correo.com"
            android:inputType="textEmailAddress"
            android:layout_marginBottom="15dp"/>

        <!-- Edad -->
        <TextView
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:text="Edad:"
            android:textStyle="bold"/>

        <EditText
            android:id="@+id/etEdad"
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:hint="18"
            android:inputType="number"
            android:layout_marginBottom="15dp"/>

        <!-- Género -->
        <TextView
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:text="Género:"
            android:textStyle="bold"
            android:layout_marginBottom="5dp"/>

        <RadioGroup
            android:id="@+id/rgGenero"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:layout_marginBottom="15dp">

            <RadioButton
                android:id="@+id/rbMasculino"
                android:layout_width="wrap_content"
                android:layout_height="wrap_content"
                android:text="Masculino"/>

            <RadioButton
                android:id="@+id/rbFemenino"
                android:layout_width="wrap_content"
                android:layout_height="wrap_content"
                android:text="Femenino"/>

            <RadioButton
                android:id="@+id/rbOtro"
                android:layout_width="wrap_content"
                android:layout_height="wrap_content"
                android:text="Otro"/>
        </RadioGroup>

        <!-- Términos y condiciones -->
        <CheckBox
            android:id="@+id/cbTerminos"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:text="Acepto los términos y condiciones"
            android:layout_marginBottom="20dp"/>

        <!-- Botón registrar -->
        <Button
            android:id="@+id/btnRegistrar"
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:text="REGISTRAR"/>

    </LinearLayout>
</ScrollView>
```

---

### 📄 Código de apoyo (MainActivity.java):

```java
package com.ejemplo.formularioregistro;

import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    
    private EditText etNombre, etEmail, etEdad;
    private RadioGroup rgGenero;
    private CheckBox cbTerminos;
    private Button btnRegistrar;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        // TODO: Referenciar todas las vistas
        
        btnRegistrar.setOnClickListener(view -> {
            // TODO: Implementar validaciones
            
            // 1. Validar nombre no vacío
            
            // 2. Validar email
            
            // 3. Validar edad (18-100)
            
            // 4. Validar género seleccionado
            
            // 5. Validar términos aceptados
            
            // 6. Si todo OK, mostrar mensaje de bienvenida
        });
    }
}
```

---

## 🎯 EJERCICIO 4: Calculadora Simple

**📝 Objetivo:** Crear una calculadora que sume, reste, multiplique y divida dos números.

**📋 Requisitos:**

1. Dos `EditText` para introducir números (inputType="numberDecimal")
2. Cuatro botones: "+", "-", "×", "÷"
3. Un `TextView` para mostrar el resultado
4. **Validaciones:**
    - Verificar que ambos campos tengan números
    - En la división, verificar que el divisor no sea 0

**💡 Pistas:**

```java
// Convertir String a double
String texto = etNumero1.getText().toString();
double numero = Double.parseDouble(texto);

// Formatear resultado con 2 decimales
String resultado = String.format("%.2f", suma);
txtResultado.setText("Resultado: " + resultado);
```

---

### 📄 Layout XML sugerido:

```xml
<?xml version="1.0" encoding="utf-8"?>
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:orientation="vertical"
    android:padding="20dp"
    android:gravity="center">

    <TextView
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="CALCULADORA"
        android:textSize="24sp"
        android:textStyle="bold"
        android:layout_marginBottom="30dp"/>

    <EditText
        android:id="@+id/etNumero1"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:hint="Primer número"
        android:inputType="numberDecimal"
        android:textAlignment="center"
        android:layout_marginBottom="10dp"/>

    <EditText
        android:id="@+id/etNumero2"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:hint="Segundo número"
        android:inputType="numberDecimal"
        android:textAlignment="center"
        android:layout_marginBottom="20dp"/>

    <!-- Botones de operaciones -->
    <LinearLayout
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:orientation="horizontal"
        android:layout_marginBottom="20dp">

        <Button
            android:id="@+id/btnSumar"
            android:layout_width="0dp"
            android:layout_height="wrap_content"
            android:layout_weight="1"
            android:text="+"
            android:textSize="20sp"
            android:layout_margin="5dp"/>

        <Button
            android:id="@+id/btnRestar"
            android:layout_width="0dp"
            android:layout_height="wrap_content"
            android:layout_weight="1"
            android:text="-"
            android:textSize="20sp"
            android:layout_margin="5dp"/>

        <Button
            android:id="@+id/btnMultiplicar"
            android:layout_width="0dp"
            android:layout_height="wrap_content"
            android:layout_weight="1"
            android:text="×"
            android:textSize="20sp"
            android:layout_margin="5dp"/>

        <Button
            android:id="@+id/btnDividir"
            android:layout_width="0dp"
            android:layout_height="wrap_content"
            android:layout_weight="1"
            android:text="÷"
            android:textSize="20sp"
            android:layout_margin="5dp"/>
    </LinearLayout>

    <!-- Resultado -->
    <TextView
        android:id="@+id/txtResultado"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:text="Resultado: "
        android:textSize="20sp"
        android:textAlignment="center"
        android:textStyle="bold"
        android:padding="20dp"
        android:background="#E0E0E0"/>

</LinearLayout>
```

---

## ✅ SOLUCIÓN EJERCICIO 3: Formulario de Registro

```java
package com.ejemplo.formularioregistro;

import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    
    private EditText etNombre, etEmail, etEdad;
    private RadioGroup rgGenero;
    private CheckBox cbTerminos;
    private Button btnRegistrar;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        // Referenciar vistas
        etNombre = findViewById(R.id.etNombre);
        etEmail = findViewById(R.id.etEmail);
        etEdad = findViewById(R.id.etEdad);
        rgGenero = findViewById(R.id.rgGenero);
        cbTerminos = findViewById(R.id.cbTerminos);
        btnRegistrar = findViewById(R.id.btnRegistrar);
        
        btnRegistrar.setOnClickListener(view -> {
            // 1. Validar nombre
            String nombre = etNombre.getText().toString().trim();
            if (nombre.isEmpty()) {
                Toast.makeText(this, "El nombre no puede estar vacío", Toast.LENGTH_SHORT).show();
                etNombre.setError("Campo obligatorio");
                return;
            }
            
            // 2. Validar email
            String email = etEmail.getText().toString().trim();
            if (!email.contains("@") || !email.contains(".")) {
                Toast.makeText(this, "Email no válido", Toast.LENGTH_SHORT).show();
                etEmail.setError("Formato incorrecto");
                return;
            }
            
            // 3. Validar edad
            String edadTexto = etEdad.getText().toString();
            if (edadTexto.isEmpty()) {
                Toast.makeText(this, "La edad no puede estar vacía", Toast.LENGTH_SHORT).show();
                etEdad.setError("Campo obligatorio");
                return;
            }
            
            int edad;
            try {
                edad = Integer.parseInt(edadTexto);
                if (edad < 18 || edad > 100) {
                    Toast.makeText(this, "La edad debe estar entre 18 y 100", Toast.LENGTH_SHORT).show();
                    etEdad.setError("Edad no válida");
                    return;
                }
            } catch (NumberFormatException e) {
                Toast.makeText(this, "Introduce un número válido", Toast.LENGTH_SHORT).show();
                etEdad.setError("Debe ser un número");
                return;
            }
            
            // 4. Validar género
            int selectedId = rgGenero.getCheckedRadioButtonId();
            if (selectedId == -1) {
                Toast.makeText(this, "Debes seleccionar un género", Toast.LENGTH_SHORT).show();
                return;
            }
            RadioButton rbSeleccionado = findViewById(selectedId);
            String genero = rbSeleccionado.getText().toString();
            
            // 5. Validar términos
            if (!cbTerminos.isChecked()) {
                Toast.makeText(this, "Debes aceptar los términos y condiciones", Toast.LENGTH_SHORT).show();
                return;
            }
            
            // 6. Todo correcto - Mensaje de bienvenida
            String mensaje = "Bienvenido " + nombre + ", " + edad + " años, " + genero;
            Toast.makeText(this, mensaje, Toast.LENGTH_LONG).show();
        });
    }
}
```

**🔑 Puntos clave de la solución:**

- Validaciones en orden lógico con `return` para detener si falla
- Uso de `trim()` para eliminar espacios en blanco
- `try-catch` para capturar errores de conversión numérica
- `setError()` para mostrar mensajes en los EditText
- Verificar RadioGroup con `getCheckedRadioButtonId() == -1`
- Verificar CheckBox con `isChecked()`

---

## ✅ SOLUCIÓN EJERCICIO 4: Calculadora Simple

```java
package com.ejemplo.calculadora;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    
    private EditText etNumero1, etNumero2;
    private Button btnSumar, btnRestar, btnMultiplicar, btnDividir;
    private TextView txtResultado;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        // Referenciar vistas
        etNumero1 = findViewById(R.id.etNumero1);
        etNumero2 = findViewById(R.id.etNumero2);
        btnSumar = findViewById(R.id.btnSumar);
        btnRestar = findViewById(R.id.btnRestar);
        btnMultiplicar = findViewById(R.id.btnMultiplicar);
        btnDividir = findViewById(R.id.btnDividir);
        txtResultado = findViewById(R.id.txtResultado);
        
        // Botón sumar
        btnSumar.setOnClickListener(view -> {
            if (validarNumeros()) {
                double num1 = Double.parseDouble(etNumero1.getText().toString());
                double num2 = Double.parseDouble(etNumero2.getText().toString());
                double resultado = num1 + num2;
                mostrarResultado(resultado);
            }
        });
        
        // Botón restar
        btnRestar.setOnClickListener(view -> {
            if (validarNumeros()) {
                double num1 = Double.parseDouble(etNumero1.getText().toString());
                double num2 = Double.parseDouble(etNumero2.getText().toString());
                double resultado = num1 - num2;
                mostrarResultado(resultado);
            }
        });
        
        // Botón multiplicar
        btnMultiplicar.setOnClickListener(view -> {
            if (validarNumeros()) {
                double num1 = Double.parseDouble(etNumero1.getText().toString());
                double num2 = Double.parseDouble(etNumero2.getText().toString());
                double resultado = num1 * num2;
                mostrarResultado(resultado);
            }
        });
        
        // Botón dividir
        btnDividir.setOnClickListener(view -> {
            if (validarNumeros()) {
                double num1 = Double.parseDouble(etNumero1.getText().toString());
                double num2 = Double.parseDouble(etNumero2.getText().toString());
                
                if (num2 == 0) {
                    Toast.makeText(this, "No se puede dividir entre cero", Toast.LENGTH_SHORT).show();
                    return;
                }
                
                double resultado = num1 / num2;
                mostrarResultado(resultado);
            }
        });
    }
    
    // Método auxiliar para validar que los campos tengan números
    private boolean validarNumeros() {
        String texto1 = etNumero1.getText().toString();
        String texto2 = etNumero2.getText().toString();
        
        if (texto1.isEmpty() || texto2.isEmpty()) {
            Toast.makeText(this, "Debes introducir ambos números", Toast.LENGTH_SHORT).show();
            return false;
        }
        
        try {
            Double.parseDouble(texto1);
            Double.parseDouble(texto2);
            return true;
        } catch (NumberFormatException e) {
            Toast.makeText(this, "Introduce números válidos", Toast.LENGTH_SHORT).show();
            return false;
        }
    }
    
    // Método auxiliar para mostrar el resultado formateado
    private void mostrarResultado(double resultado) {
        String resultadoFormateado = String.format("%.2f", resultado);
        txtResultado.setText("Resultado: " + resultadoFormateado);
    }
}
```

**🔑 Puntos clave de la solución:**

- Método auxiliar `validarNumeros()` para no repetir código
- Método auxiliar `mostrarResultado()` para formatear con 2 decimales
- Validación especial en la división (divisor != 0)
- `try-catch` para capturar errores de conversión
- Uso de `String.format("%.2f", numero)` para limitar decimales

---

## 📝 CHECKLIST DÍA 2

Antes de pasar al siguiente día, asegúrate de que:

- [✅] Entiendes qué es un EditText y cómo obtener su texto
- [✅] Sabes usar `getText().toString()` y `setText()`
- [✅] Conoces los diferentes `inputType` (text, number, email, password)
- [✅] Sabes mostrar Toast con `Toast.makeText()`
- [✅] Entiendes la diferencia entre CheckBox y RadioButton
- [✅] Sabes trabajar con RadioGroup
- [✅] Puedes hacer validaciones básicas (vacío, número, email)
- [✅] Sabes usar `setError()` en EditText
- [✅] Has completado el Ejercicio 3 (Formulario de Registro)
- [✅] Has completado el Ejercicio 4 (Calculadora Simple)

---

## 🎓 CONCEPTOS CLAVE DEL DÍA 2

|Concepto|Definición|
|---|---|
|**EditText**|Campo de texto editable para que el usuario introduzca datos|
|**inputType**|Define el tipo de teclado que aparece (texto, número, email, etc.)|
|**Toast**|Mensaje emergente breve que aparece en pantalla|
|**CheckBox**|Casilla de verificación (permite múltiples selecciones)|
|**RadioButton**|Botón de opción (solo una selección dentro del grupo)|
|**RadioGroup**|Contenedor de RadioButtons que garantiza selección única|
|**trim()**|Elimina espacios en blanco al inicio y final de un String|
|**setError()**|Muestra un mensaje de error en un EditText|
|**String.format()**|Formatea un String con patrón específico (ej: decimales)|

---

## 💬 NOTAS DEL PROFESOR

**¡Excelente progreso!** 🎉

Has aprendido a:

- Crear formularios interactivos
- Validar datos de usuario
- Trabajar con diferentes tipos de controles
- Manejar errores de conversión con try-catch
- Crear métodos auxiliares para código reutilizable

**Próximo día:** Trabajaremos con Spinner (listas desplegables) y diferentes tipos de Layouts para organizar mejor la interfaz.

---

📌 **Guardado:** 25/02/2026 - 19:45h  
📌 **Próxima sesión:** Día 3 - Spinner y Layouts

---

## 🏁 FIN DEL DOCUMENTO ACTUAL

**Última actualización:** 25/02/2026 - 19:45h  
**Días completados:** 4 de 32  
**Progreso:** 12.5% ⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜

---

### 📊 RESUMEN DE PROGRESO

|Semana|Días|Estado|
|---|---|---|
|Semanas 1-2|Día 1-3|✅ Completados|
|Semanas 1-2|Día 1-4|✅ Completados|
|Semanas 3-4|Día 5-8|⏳ Pendientes|
|Semanas 5-6|Día 9-12|⏳ Pendientes|
|Semanas 7-8|Día 13-16|⏳ Pendientes|
|Semanas 9-10|Día 17-20|⏳ Pendientes|
|Semanas 11-12|Día 21-24|⏳ Pendientes|
|Semanas 13-14|Día 25-28|⏳ Pendientes|
|Semanas 15-16|Día 29-32|⏳ Pendientes|

---

### 🎯 EJERCICIOS COMPLETADOS

|Ejercicio|Día|Estado|
|---|---|---|
|Ejercicio 1: Contador de Clics|Día 1|✅|
|Ejercicio 2: Cambiar Color de Fondo|Día 1|✅|
|Ejercicio 3: Formulario de Registro|Día 2|⏳ Pendiente|
|Ejercicio 4: Calculadora Simple|Día 2|✅|
|Ejercicio 5: Conversor de Unidades|Día 3|✅|
|Ejercicio 6: Calculadora IMC|Día 3|✅|
|Ejercicio 7: Lista de Tareas|Día 4|⏳ Pendiente|
|Ejercicio 8: Lista de Contactos|Día 4|⏳ Pendiente|

---

[🔝 Volver al índice principal](#-%C3%ADndice-general)

---

**📌 Próxima sesión:** Día 3 - Spinner y Layouts  
**📧 Contacto:** Envía tus ejercicios completados para revisión

---

# 🎯 DÍA 3 - Spinner y Layouts

**Fecha:** 26 de Febrero 2026  
**Duración:** 2-3 horas  
**Objetivos:** Dominar el Spinner (listas desplegables) y diferentes tipos de Layouts para organizar la interfaz

---

## 📖 1. Spinner - Lista desplegable

El `Spinner` es como un ComboBox en Windows Forms: una lista desplegable donde el usuario selecciona una opción.

### Características del Spinner:

```
┌─────────────────────────────┐
│  Spinner                   ▼│  ← Estado cerrado
└─────────────────────────────┘

        ↓ Al pulsar

┌─────────────────────────────┐
│  Opción 1                    │
│  Opción 2                    │  ← Lista desplegada
│  Opción 3                    │
│  Opción 4                    │
└─────────────────────────────┘
```

---

### XML básico del Spinner:

```xml
<Spinner
    android:id="@+id/spinnerPaises"
    android:layout_width="match_parent"
    android:layout_height="wrap_content"
    android:prompt="@string/selecciona_pais"/>
```

**Atributos importantes:**

|Atributo|Explicación|
|---|---|
|`android:prompt`|Título que aparece en el diálogo de selección|
|`android:spinnerMode`|`dropdown` (por defecto) o `dialog`|

---

### Java - Spinner con ArrayAdapter:

**Opción 1: Desde un array en código**

```java
Spinner spinnerPaises = findViewById(R.id.spinnerPaises);

// Array de opciones
String[] paises = {"España", "Francia", "Italia", "Alemania", "Portugal"};

// Crear adaptador
ArrayAdapter<String> adapter = new ArrayAdapter<>(
    this,
    android.R.layout.simple_spinner_item,
    paises
);

// Especificar el layout para las opciones desplegadas
adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

// Asignar adaptador al Spinner
spinnerPaises.setAdapter(adapter);
```

**Opción 2: Desde strings.xml (MEJOR PRÁCTICA)**

**strings.xml:**

```xml
<string-array name="paises">
    <item>España</item>
    <item>Francia</item>
    <item>Italia</item>
    <item>Alemania</item>
    <item>Portugal</item>
</string-array>
```

**Java:**

```java
Spinner spinnerPaises = findViewById(R.id.spinnerPaises);

ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(
    this,
    R.array.paises,
    android.R.layout.simple_spinner_item
);

adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
spinnerPaises.setAdapter(adapter);
```

---

### Obtener el elemento seleccionado:

```java
// Obtener como String
String seleccionado = spinnerPaises.getSelectedItem().toString();

// Obtener la posición (índice)
int posicion = spinnerPaises.getSelectedItemPosition();

// Verificar si está seleccionado el primero (posición 0)
if (posicion == 0) {
    // Primera opción seleccionada
}
```

---

### Listener de selección:

```java
spinnerPaises.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        String seleccionado = parent.getItemAtPosition(position).toString();
        Toast.makeText(MainActivity.this, "Seleccionado: " + seleccionado, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {
        // Se llama cuando no hay nada seleccionado
    }
});
```

---

## 📖 2. LinearLayout - Organización lineal

Ya lo hemos usado, pero vamos a profundizar.

### Orientación vertical (por defecto):

```xml
<LinearLayout
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:orientation="vertical"
    android:padding="16dp">

    <Button
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:text="Botón 1"/>

    <Button
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:text="Botón 2"/>

    <Button
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:text="Botón 3"/>
</LinearLayout>
```

**Resultado:**

```
┌─────────────────────┐
│     Botón 1         │
├─────────────────────┤
│     Botón 2         │
├─────────────────────┤
│     Botón 3         │
└─────────────────────┘
```

---

### Orientación horizontal:

```xml
<LinearLayout
    android:layout_width="match_parent"
    android:layout_height="wrap_content"
    android:orientation="horizontal">

    <Button
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="Botón 1"/>

    <Button
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="Botón 2"/>

    <Button
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="Botón 3"/>
</LinearLayout>
```

**Resultado:**

```
┌───────┬───────┬───────┐
│Botón 1│Botón 2│Botón 3│
└───────┴───────┴───────┘
```

---

### layout_weight - Distribuir espacio

El atributo `layout_weight` permite distribuir el espacio proporcionalmente:

```xml
<LinearLayout
    android:layout_width="match_parent"
    android:layout_height="wrap_content"
    android:orientation="horizontal">

    <Button
        android:layout_width="0dp"
        android:layout_height="wrap_content"
        android:layout_weight="1"
        android:text="1"/>

    <Button
        android:layout_width="0dp"
        android:layout_height="wrap_content"
        android:layout_weight="2"
        android:text="2"/>

    <Button
        android:layout_width="0dp"
        android:layout_height="wrap_content"
        android:layout_weight="1"
        android:text="3"/>
</LinearLayout>
```

**Resultado:** El botón 2 ocupa el doble de espacio que los otros (peso 2 vs 1)

```
┌────┬─────────┬────┐
│ 1  │    2    │ 3  │
└────┴─────────┴────┘
```

**⚠️ IMPORTANTE:** Cuando usas `layout_weight`, el `layout_width` debe ser `0dp` (en horizontal) o `layout_height` debe ser `0dp` (en vertical).

---

### Atributos de alineación:

```xml
<LinearLayout
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:orientation="vertical"
    android:gravity="center"          <!-- Alinea el contenido dentro -->
    android:padding="20dp">           <!-- Espaciado interno -->

    <Button
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_gravity="end"   <!-- Alinea este elemento -->
        android:text="Botón"/>
</LinearLayout>
```

**Diferencia entre `gravity` y `layout_gravity`:**

|Atributo|¿Dónde se usa?|Efecto|
|---|---|---|
|`android:gravity`|En el **contenedor**|Alinea el **contenido** dentro del contenedor|
|`android:layout_gravity`|En el **elemento hijo**|Alinea el **propio elemento** dentro de su contenedor|

**Valores comunes:**

- `center` - Centro
- `start` - Inicio (izquierda en LTR)
- `end` - Final (derecha en LTR)
- `top` - Arriba
- `bottom` - Abajo
- `center_horizontal` - Centro horizontal
- `center_vertical` - Centro vertical

---

## 📖 3. RelativeLayout - Posicionamiento relativo

Permite posicionar elementos **relativos unos a otros** o **relativos al contenedor**.

```xml
<RelativeLayout
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:padding="16dp">

    <!-- Elemento A: centrado en el contenedor -->
    <TextView
        android:id="@+id/textoCentral"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_centerInParent="true"
        android:text="Centro"
        android:textSize="24sp"/>

    <!-- Elemento B: arriba del A -->
    <Button
        android:id="@+id/btnArriba"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_above="@id/textoCentral"
        android:layout_centerHorizontal="true"
        android:text="Arriba"/>

    <!-- Elemento C: abajo del A -->
    <Button
        android:id="@+id/btnAbajo"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_below="@id/textoCentral"
        android:layout_centerHorizontal="true"
        android:text="Abajo"/>

    <!-- Elemento D: izquierda del A -->
    <Button
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_toStartOf="@id/textoCentral"
        android:layout_centerVertical="true"
        android:text="Izq"/>

    <!-- Elemento E: derecha del A -->
    <Button
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_toEndOf="@id/textoCentral"
        android:layout_centerVertical="true"
        android:text="Der"/>

</RelativeLayout>
```

**Resultado:**

```
       [Arriba]
          ↓
[Izq] [Centro] [Der]
          ↓
       [Abajo]
```

---

### Atributos de RelativeLayout más usados:

**Relativos al contenedor:**

```xml
android:layout_alignParentTop="true"        <!-- Arriba del contenedor -->
android:layout_alignParentBottom="true"     <!-- Abajo del contenedor -->
android:layout_alignParentStart="true"      <!-- Izquierda del contenedor -->
android:layout_alignParentEnd="true"        <!-- Derecha del contenedor -->
android:layout_centerInParent="true"        <!-- Centro absoluto -->
android:layout_centerHorizontal="true"      <!-- Centro horizontal -->
android:layout_centerVertical="true"        <!-- Centro vertical -->
```

**Relativos a otro elemento:**

```xml
android:layout_above="@id/elemento"         <!-- Encima de -->
android:layout_below="@id/elemento"         <!-- Debajo de -->
android:layout_toStartOf="@id/elemento"     <!-- A la izquierda de -->
android:layout_toEndOf="@id/elemento"       <!-- A la derecha de -->
android:layout_alignTop="@id/elemento"      <!-- Alineado arriba con -->
android:layout_alignBottom="@id/elemento"   <!-- Alineado abajo con -->
android:layout_alignStart="@id/elemento"    <!-- Alineado izquierda con -->
android:layout_alignEnd="@id/elemento"      <!-- Alineado derecha con -->
```

---

## 🎯 EJERCICIO 5: Conversor de Unidades

**📝 Objetivo:** Crear un conversor que transforme entre diferentes unidades según la selección del Spinner.

**📋 Requisitos:**

1. **Un Spinner** con opciones:
    
    - Kilómetros a Millas
    - Millas a Kilómetros
    - Celsius a Fahrenheit
    - Fahrenheit a Celsius
2. **Un EditText** para introducir el valor a convertir
    
3. **Un Button** "Convertir"
    
4. **Un TextView** que muestre el resultado
    
5. **Conversiones:**
    
    - km a millas: `millas = km * 0.621371`
    - millas a km: `km = millas * 1.60934`
    - °C a °F: `fahrenheit = (celsius * 9/5) + 32`
    - °F a °C: `celsius = (fahrenheit - 32) * 5/9`

**💡 Pistas:**

```java
// Obtener la opción seleccionada del Spinner
String opcion = spinner.getSelectedItem().toString();

// Comparar con equals()
if (opcion.equals("Kilómetros a Millas")) {
    // Hacer conversión
}

// Formatear resultado con 2 decimales
String resultado = String.format("%.2f", valorConvertido);
```

[Ver código completo y layout en la sección anterior]

---

## 🎯 EJERCICIO 6: Calculadora de IMC

**📝 Objetivo:** Crear una calculadora de IMC con diseño en RelativeLayout.

**📋 Requisitos:**

1. **EditText** para peso (kg)
2. **EditText** para altura (cm)
3. **Button** "Calcular IMC"
4. **TextView** que muestre el IMC calculado
5. **TextView** que muestre la categoría

**💡 Fórmulas:**

```java
// IMC = peso (kg) / (altura (m))²
double alturaMetros = alturaCm / 100.0;
double imc = peso / (alturaMetros * alturaMetros);

// Categorías:
// IMC < 18.5 → Bajo peso
// IMC 18.5 - 24.9 → Normal
// IMC 25 - 29.9 → Sobrepeso
// IMC >= 30 → Obesidad
```

[Ver código completo y layout en la sección anterior]

---

## 📝 CHECKLIST DÍA 3

Antes de pasar al siguiente día, asegúrate de que:

- [ ] Entiendes qué es un Spinner y cómo funciona
- [ ] Sabes crear un ArrayAdapter para el Spinner
- [ ] Conoces la diferencia entre crear adaptador desde código vs strings.xml
- [ ] Sabes obtener el elemento seleccionado con `getSelectedItem()`
- [ ] Puedes usar `setOnItemSelectedListener()`
- [ ] Entiendes LinearLayout con orientación vertical y horizontal
- [ ] Sabes usar `layout_weight` para distribuir espacio
- [ ] Conoces la diferencia entre `gravity` y `layout_gravity`
- [ ] Entiendes los conceptos básicos de RelativeLayout
- [ ] Has completado el Ejercicio 5 (Conversor de Unidades)
- [ ] Has completado el Ejercicio 6 (Calculadora IMC)

---

## 🎓 CONCEPTOS CLAVE DEL DÍA 3

|Concepto|Definición|
|---|---|
|**Spinner**|Lista desplegable de selección única (como ComboBox)|
|**ArrayAdapter**|Adaptador que conecta datos (array) con vistas (Spinner, ListView)|
|**createFromResource()**|Crea ArrayAdapter desde strings.xml|
|**getSelectedItem()**|Obtiene el elemento seleccionado del Spinner|
|**LinearLayout**|Organiza elementos en línea (vertical u horizontal)|
|**layout_weight**|Distribuye espacio proporcionalmente entre elementos|
|**gravity**|Alinea el contenido dentro de un contenedor|
|**layout_gravity**|Alinea un elemento dentro de su contenedor|
|**RelativeLayout**|Posiciona elementos relativos entre sí o al contenedor|

---

## 💬 NOTAS DEL PROFESOR

**¡Gran avance!** 🎉

Has aprendido a:

- Trabajar con Spinner y ArrayAdapter
- Organizar interfaces con diferentes Layouts
- Usar layout_weight para distribución proporcional
- Posicionar elementos con RelativeLayout

**Próximo día:** Comenzaremos con ListView, uno de los componentes más importantes para mostrar listas de datos.

---

[🔝 Volver al índice](#-%C3%ADndice-general)

---

📌 **Guardado:** 26/02/2026 - 15:30h  
📌 **Próxima sesión:** Día 4 - ListView Básico

---

# 🎯 DÍA 4 - ListView Básico

**Fecha:** 27 de Febrero 2026  
**Duración:** 2-3 horas  
**Objetivos:** Dominar el ListView para mostrar listas de datos con ArrayAdapter

---

## 📖 1. ¿Qué es un ListView?

El `ListView` es un componente que muestra una lista **desplazable** de elementos. Es uno de los componentes más importantes en Android para mostrar colecciones de datos.

### Analogía conceptual:

```
┌─────────────────────────────┐
│  ListView                   │
│  ┌───────────────────────┐  │
│  │ Item 1                │  │ ← Elemento
│  ├───────────────────────┤  │
│  │ Item 2                │  │
│  ├───────────────────────┤  │
│  │ Item 3                │  │ ← Scroll vertical
│  ├───────────────────────┤  │
│  │ Item 4                │  │
│  ├───────────────────────┤  │
│  │ Item 5                │  │
│  └───────────────────────┘  │
│         ↕ Scroll            │
└─────────────────────────────┘
```

**Características:**

- 📜 Lista vertical desplazable
- 🔄 Reutiliza vistas (eficiente)
- 👆 Eventos de click en items
- 🎨 Personalizable con adaptadores

---

## 📖 2. Componentes del ListView

Para usar un ListView necesitas **3 elementos**:

```
┌──────────────────────────────────────┐
│  1. ListView (en el XML)             │
│     ↓                                │
│  2. ArrayAdapter (conecta datos)     │
│     ↓                                │
│  3. Datos (Array o ArrayList)        │
└──────────────────────────────────────┘
```

---

## 📖 3. ListView básico con String[]

### XML del ListView:

```xml
<ListView
    android:id="@+id/listView"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:divider="#CCCCCC"
    android:dividerHeight="1dp"/>
```

**Atributos importantes:**

|Atributo|Explicación|
|---|---|
|`android:divider`|Color de la línea divisoria entre items|
|`android:dividerHeight`|Altura de la línea divisoria|
|`android:choiceMode`|`none`, `singleChoice`, `multipleChoice`|

---

### Java - ListView con Array simple:

```java
public class MainActivity extends AppCompatActivity {
    
    private ListView listView;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        // 1. Referenciar ListView
        listView = findViewById(R.id.listView);
        
        // 2. Crear array de datos
        String[] paises = {
            "España", "Francia", "Italia", "Alemania", 
            "Portugal", "Grecia", "Holanda", "Bélgica"
        };
        
        // 3. Crear ArrayAdapter
        ArrayAdapter<String> adapter = new ArrayAdapter<>(
            this,
            android.R.layout.simple_list_item_1,  // Layout predefinido
            paises
        );
        
        // 4. Asignar adaptador al ListView
        listView.setAdapter(adapter);
    }
}
```

---

## 📖 4. Layouts predefinidos para ListView

Android proporciona varios layouts predefinidos:

```java
// Simple (solo texto)
android.R.layout.simple_list_item_1

// Con checkbox
android.R.layout.simple_list_item_checked

// Con radio button
android.R.layout.simple_list_item_single_choice

// Con checkbox múltiple
android.R.layout.simple_list_item_multiple_choice

// Dos líneas de texto
android.R.layout.simple_list_item_2
```

---

## 📖 5. Eventos onClick en ListView

### OnItemClickListener:

```java
listView.setOnItemClickListener((parent, view, position, id) -> {
    String itemSeleccionado = paises[position];
    Toast.makeText(this, "Seleccionado: " + itemSeleccionado, Toast.LENGTH_SHORT).show();
});
```

### OnItemLongClickListener:

```java
// Click largo (mantener pulsado)
listView.setOnItemLongClickListener((parent, view, position, id) -> {
    String item = paises[position];
    Toast.makeText(this, "Long click: " + item, Toast.LENGTH_SHORT).show();
    return true; // true = consumir evento
});
```

---

## 📖 6. ArrayList vs Array

|Array `String[]`|ArrayList `ArrayList<String>`|
|---|---|
|Tamaño fijo|Tamaño dinámico|
|`String[] arr = new String[5]`|`ArrayList<String> list = new ArrayList<>()`|
|`arr[0] = "Hola"`|`list.add("Hola")`|
|No se puede cambiar tamaño|`add()`, `remove()`, `clear()`|

---

## 📖 7. Operaciones con ArrayList en ListView

### Añadir elemento:

```java
listaNombres.add(nombre);
adapter.notifyDataSetChanged();  // ¡IMPORTANTE!
```

### Eliminar elemento:

```java
listaNombres.remove(position);
adapter.notifyDataSetChanged();
```

### Limpiar lista:

```java
listaNombres.clear();
adapter.notifyDataSetChanged();
```

**⚠️ MUY IMPORTANTE:** Después de modificar el ArrayList, **SIEMPRE** debes llamar a `adapter.notifyDataSetChanged()`.

---

## 📖 8. AlertDialog - Cuadros de diálogo

### AlertDialog básico:

```java
new AlertDialog.Builder(this)
    .setTitle("Título")
    .setMessage("Mensaje del diálogo")
    .setPositiveButton("Aceptar", (dialog, which) -> {
        // Acción al pulsar Aceptar
    })
    .setNegativeButton("Cancelar", null)
    .show();
```

### AlertDialog con input:

```java
EditText input = new EditText(this);
input.setHint("Introduce un nombre");

new AlertDialog.Builder(this)
    .setTitle("Añadir nombre")
    .setView(input)
    .setPositiveButton("Añadir", (dialog, which) -> {
        String nombre = input.getText().toString().trim();
        if (!nombre.isEmpty()) {
            listaNombres.add(nombre);
            adapter.notifyDataSetChanged();
        }
    })
    .setNegativeButton("Cancelar", null)
    .show();
```

---

## 🎯 EJERCICIO 7: Lista de Tareas (To-Do List)

**📝 Objetivo:** Crear una app de lista de tareas con operaciones CRUD.

**📋 Requisitos:**

1. ListView para mostrar tareas
2. EditText + Button para añadir
3. Click en item → Toast
4. Click largo → Eliminar con confirmación
5. Button "Limpiar Todo"
6. Contador de tareas

[Ver layout y código completo en la sección anterior]

---

## 🎯 EJERCICIO 8: Lista de Contactos

**📝 Objetivo:** Lista de contactos con nombre y teléfono.

**📋 Requisitos:**

1. ListView con contactos
2. Button "Añadir" → AlertDialog con dos EditText
3. Click en contacto → Opciones (Ver, Llamar, Eliminar)
4. Intent implícito para llamar

[Ver layout y código completo en la sección anterior]

---

## 📝 CHECKLIST DÍA 4

- [ ] Entiendes qué es un ListView
- [ ] Sabes crear un ArrayAdapter
- [ ] Conoces los layouts predefinidos
- [ ] Puedes usar `setOnItemClickListener()`
- [ ] Puedes usar `setOnItemLongClickListener()`
- [ ] Entiendes ArrayList y sus métodos
- [ ] Recuerdas `notifyDataSetChanged()`
- [ ] Sabes crear AlertDialog
- [ ] Has completado Ejercicio 7
- [ ] Has completado Ejercicio 8

---

## 🎓 CONCEPTOS CLAVE DEL DÍA 4

|Concepto|Definición|
|---|---|
|**ListView**|Componente para mostrar listas desplazables|
|**ArrayAdapter**|Conecta datos con el ListView|
|**ArrayList**|Lista dinámica que puede crecer/decrecer|
|**notifyDataSetChanged()**|Actualiza el ListView tras cambios en datos|
|**OnItemClickListener**|Evento al pulsar un item|
|**OnItemLongClickListener**|Evento al mantener pulsado un item|
|**AlertDialog**|Cuadro de diálogo modal|

---

[🔝 Volver al índice](#-%C3%ADndice-general)

---

📌 **Guardado:** 27/02/2026 - 16:00h  
📌 **Próxima sesión:** Día 5 - ArrayAdapter Personalizado

---

# 🎯 DÍA 5 - ArrayAdapter Personalizado

**Fecha:** 28 de Febrero 2026  
**Duración:** 2-3 horas  
**Objetivos:** Crear adaptadores personalizados para listas complejas con imágenes y múltiples datos

---

## 📖 1. ¿Por qué ArrayAdapter Personalizado?

Hasta ahora: `android.R.layout.simple_list_item_1` → solo una línea de texto.

Ahora queremos:

- 📷 Imagen + múltiples textos
- 🎨 Diseños personalizados
- ⭐ Iconos, botones, etc.

**Solución:** Crear nuestro **propio ArrayAdapter** y **layout XML** personalizado.

---

## 📖 2. Los 3 componentes necesarios

```
┌──────────────────────────────────────────┐
│  1. Clase Modelo (Producto, Persona...)  │
│     ↓                                    │
│  2. Layout XML del item                  │
│     ↓                                    │
│  3. ArrayAdapter Personalizado           │
└──────────────────────────────────────────┘
```

---

## 📖 3. Ejemplo completo: Lista de Productos

### PASO 1: Clase Modelo

```java
public class Producto {
    private String nombre;
    private String descripcion;
    private double precio;
    private int imagen; // R.drawable.producto1
    
    public Producto(String nombre, String descripcion, double precio, int imagen) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
        this.imagen = imagen;
    }
    
    // Getters...
}
```

### PASO 2: Layout del item (item_producto.xml)

```xml
<LinearLayout ...
    android:orientation="horizontal">

    <ImageView
        android:id="@+id/imgProducto"
        android:layout_width="80dp"
        android:layout_height="80dp"/>

    <LinearLayout
        android:orientation="vertical">
        
        <TextView android:id="@+id/txtNombre" ... />
        <TextView android:id="@+id/txtDescripcion" ... />
        <TextView android:id="@+id/txtPrecio" ... />
        
    </LinearLayout>

</LinearLayout>
```

### PASO 3: Adapter Personalizado

```java
public class ProductoAdapter extends ArrayAdapter<Producto> {
    
    private Context context;
    private ArrayList<Producto> productos;
    
    public ProductoAdapter(Context context, ArrayList<Producto> productos) {
        super(context, 0, productos);
        this.context = context;
        this.productos = productos;
    }
    
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // 1. Obtener producto
        Producto producto = productos.get(position);
        
        // 2. Inflar layout si es necesario
        if (convertView == null) {
            convertView = LayoutInflater.from(context).inflate(R.layout.item_producto, parent, false);
        }
        
        // 3. Referenciar vistas
        ImageView imgProducto = convertView.findViewById(R.id.imgProducto);
        TextView txtNombre = convertView.findViewById(R.id.txtNombre);
        TextView txtPrecio = convertView.findViewById(R.id.txtPrecio);
        
        // 4. Rellenar datos
        imgProducto.setImageResource(producto.getImagen());
        txtNombre.setText(producto.getNombre());
        txtPrecio.setText(String.format("%.2f€", producto.getPrecio()));
        
        // 5. Devolver vista
        return convertView;
    }
}
```

### PASO 4: Uso en MainActivity

```java
ArrayList<Producto> productos = new ArrayList<>();
productos.add(new Producto("Laptop", "Intel i5", 599.99, R.drawable.laptop));

ProductoAdapter adapter = new ProductoAdapter(this, productos);
listView.setAdapter(adapter);
```

---

## 📖 4. ViewHolder Pattern (Optimización)

```java
public class ProductoAdapter extends ArrayAdapter<Producto> {
    
    // ViewHolder: Almacena referencias
    static class ViewHolder {
        ImageView imgProducto;
        TextView txtNombre;
        TextView txtPrecio;
    }
    
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder;
        
        if (convertView == null) {
            convertView = LayoutInflater.from(context).inflate(R.layout.item_producto, parent, false);
            
            holder = new ViewHolder();
            holder.imgProducto = convertView.findViewById(R.id.imgProducto);
            holder.txtNombre = convertView.findViewById(R.id.txtNombre);
            holder.txtPrecio = convertView.findViewById(R.id.txtPrecio);
            
            convertView.setTag(holder); // Guardar
        } else {
            holder = (ViewHolder) convertView.getTag(); // Reutilizar
        }
        
        // Rellenar datos
        Producto producto = productos.get(position);
        holder.imgProducto.setImageResource(producto.getImagen());
        holder.txtNombre.setText(producto.getNombre());
        holder.txtPrecio.setText(String.format("%.2f€", producto.getPrecio()));
        
        return convertView;
    }
}
```

**🔑 Ventaja:** `findViewById()` solo se ejecuta **una vez** por vista.

---

## 🎯 EJERCICIO 9: Lista de Películas

**Requisitos:**

1. Clase Pelicula (titulo, director, año, calificacion, imagen)
2. Layout personalizado con póster + info
3. Adapter con ViewHolder
4. Color según calificación (verde >= 7, naranja 5-6.9, rojo < 5)
5. Click → AlertDialog con info completa

[Ver layout y código completo en la sección anterior]

---

## 🎯 EJERCICIO 10: Contactos Mejorada

**Requisitos:**

1. Añadir foto y email a Contacto
2. Layout con avatar circular
3. Adapter personalizado
4. Click largo → Editar/Eliminar
5. EXTRA: Botón favorito ⭐

[Ver layout y código completo en la sección anterior]

---

## 📝 CHECKLIST DÍA 5

- [ ] Entiendes por qué usar adapter personalizado
- [ ] Sabes crear clase modelo
- [ ] Puedes crear layout XML para items
- [ ] Sabes extender ArrayAdapter
- [ ] Entiendes LayoutInflater.inflate()
- [ ] Conoces el patrón ViewHolder
- [ ] Entiendes convertView (reutilización)
- [ ] Has completado Ejercicio 9
- [ ] Has completado Ejercicio 10

---

## 🎓 CONCEPTOS CLAVE DEL DÍA 5

|Concepto|Definición|
|---|---|
|**ArrayAdapter personalizado**|Adaptador que usa layout propio para items|
|**getView()**|Método que crea/reutiliza la vista de cada item|
|**LayoutInflater**|Convierte XML en objetos View|
|**ViewHolder**|Patrón para optimizar findViewById()|
|**convertView**|Vista reutilizada (null si es nueva)|
|**setTag() / getTag()**|Guardar/recuperar objetos en vistas|

---

[🔝 Volver al índice](#-%C3%ADndice-general)

---

📌 **Guardado:** 28/02/2026 - 17:00h  
📌 **Próxima sesión:** Día 6 - GridView

---

# 🎯 DÍA 6 - GridView

**Fecha:** 1 de Marzo 2026  
**Duración:** 2-3 horas  
**Objetivos:** Crear listas en formato cuadrícula usando GridView

---

## 📖 1. ¿Qué es un GridView?

El `GridView` muestra elementos en **cuadrícula** en lugar de lista vertical.

### Comparación visual:

```
ListView:                GridView (2x2):
┌──────────────┐         ┌─────┬─────┐
│   Item 1     │         │ 1   │ 2   │
├──────────────┤         ├─────┼─────┤
│   Item 2     │         │ 3   │ 4   │
├──────────────┤         └─────┴─────┘
│   Item 3     │
└──────────────┘
```

**Casos de uso:**

- 📷 Galerías de fotos
- 🛍️ Catálogos de productos
- 📱 Grids de apps
- 🎬 Carteles de películas

---

## 📖 2. GridView básico

### XML:

```xml
<GridView
    android:id="@+id/gridView"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:numColumns="2"
    android:verticalSpacing="10dp"
    android:horizontalSpacing="10dp"
    android:padding="10dp"
    android:stretchMode="columnWidth"/>
```

**Atributos clave:**

|Atributo|Uso|
|---|---|
|`numColumns`|Número de columnas (2, 3, auto_fit)|
|`verticalSpacing`|Espacio vertical entre items|
|`horizontalSpacing`|Espacio horizontal entre items|
|`columnWidth`|Ancho de columna (con auto_fit)|

---

## 📖 3. GridView con adaptador personalizado

**Igual que ListView:** Usar ViewHolder, LayoutInflater, getView()

**Diferencia:** Layout del item típicamente vertical (imagen arriba, texto abajo)

---

## 🎯 EJERCICIO 11: Galería de Imágenes

**Requisitos:**

1. Clase Imagen (titulo, recurso)
2. GridView 2 columnas
3. Item: ImageView 150x150 + TextView
4. Adaptador con ViewHolder
5. 9+ imágenes
6. Click → AlertDialog con imagen grande

---

## 🎯 EJERCICIO 12: Catálogo de Apps

**Requisitos:**

1. Clase App (nombre, categoría, valoración, icono)
2. GridView 3 columnas
3. Icono circular 80dp
4. Estrellas de valoración
5. 12+ apps
6. Click → AlertDialog con botón "Instalar"

---

## 📝 CHECKLIST DÍA 6

- [ ] Entiendes GridView vs ListView
- [ ] Sabes usar numColumns
- [ ] Puedes crear adaptador para GridView
- [ ] Has completado Ejercicio 11
- [ ] Has completado Ejercicio 12

---

## 🎓 CONCEPTOS CLAVE DEL DÍA 6

|Concepto|Definición|
|---|---|
|**GridView**|Lista en formato cuadrícula|
|**numColumns**|Número de columnas del grid|
|**auto_fit**|Ajusta columnas automáticamente|
|**columnWidth**|Ancho de cada columna|

---

[🔝 Volver al índice](#-%C3%ADndice-general)

---

📌 **Guardado:** 01/03/2026 - 11:45h  
📌 **Próxima sesión:** Día 7 - Eventos avanzados en listas

---

# 🎯 DÍA 7 - Eventos Avanzados en Listas

**Fecha:** 2 de Marzo 2026  
**Duración:** 2-3 horas  
**Objetivos:** Dominar eventos avanzados y técnicas en ListView/GridView

---

## 📖 1. OnItemClickListener vs onClick en el item

**OnItemClickListener:** Click en TODO el item (desde la Activity) **onClick en adaptador:** Botones ESPECÍFICOS dentro del item

```java
// OPCIÓN 1: Click en todo el item
listView.setOnItemClickListener((parent, view, position, id) -> {
    // ...
});

// OPCIÓN 2: Botón específico (en getView del adaptador)
holder.btnComprar.setOnClickListener(v -> {
    // ...
});
```

---

## 📖 2. Botones dentro de items

**Problema:** position puede estar desactualizado por reutilización

**✅ Solución:** Usar setTag()

```java
holder.btnComprar.setTag(position);
holder.btnComprar.setOnClickListener(v -> {
    int pos = (int) v.getTag();
    Producto p = productos.get(pos);
    // ...
});
```

---

## 📖 3. Selección múltiple con CheckBox

Mantener ArrayList<Boolean> con estados:

```java
private ArrayList<Boolean> seleccionados;

// En getView():
holder.checkbox.setChecked(seleccionados.get(position));
holder.checkbox.setOnCheckedChangeListener((btn, isChecked) -> {
    seleccionados.set(position, isChecked);
});
```

---

## 📖 4. Filtrar lista (búsqueda)

```java
private void filtrar(String texto) {
    productosFiltrados.clear();
    if (texto.isEmpty()) {
        productosFiltrados.addAll(productosTodos);
    } else {
        for (Producto p : productosTodos) {
            if (p.getNombre().toLowerCase().contains(texto.toLowerCase())) {
                productosFiltrados.add(p);
            }
        }
    }
    adapter.notifyDataSetChanged();
}
```

---

## 📖 5. EmptyView

```java
listView.setEmptyView(emptyTextView);
// Se muestra automáticamente cuando la lista está vacía
```

---

## 🎯 EJERCICIO 13: To-Do List Avanzada

**Requisitos:**

1. CheckBox para marcar completadas
2. Contador "X de Y completadas"
3. Botón "Eliminar completadas"
4. Búsqueda/filtro
5. EmptyView
6. Texto tachado cuando completada

---

## 🎯 EJERCICIO 14: Carrito de Compras

**Requisitos:**

1. Botones +/- para cantidad
2. Mostrar cantidad actual
3. Botón eliminar por item
4. Total dinámico
5. Botón "Vaciar carrito"

---

## 📝 CHECKLIST DÍA 7

- [ ] Entiendes OnItemClickListener vs onClick
- [ ] Sabes usar setTag() para posiciones
- [ ] Puedes implementar selección múltiple
- [ ] Sabes filtrar listas
- [ ] Has completado Ejercicio 13
- [ ] Has completado Ejercicio 14

---

## 🎓 CONCEPTOS CLAVE DEL DÍA 7

|Concepto|Definición|
|---|---|
|**setTag()**|Guardar datos en una vista|
|**TextWatcher**|Detectar cambios en EditText|
|**setEmptyView()**|Vista cuando lista vacía|
|**STRIKE_THRU_TEXT_FLAG**|Texto tachado|

---

[🔝 Volver al índice](#-%C3%ADndice-general)

---

📌 **Guardado:** 02/03/2026 - 13:00h  
📌 **Próxima sesión:** Día 8 - Repaso Semanas 1-2

---

# 🎯 DÍA 9 - Menús en Android

**Fecha:** 4 de Marzo 2026  
**Duración:** 2-3 horas  
**Objetivos:** Dominar Options Menu, Context Menu y Popup Menu

---

## 📖 TIPOS DE MENÚS

### 1. Options Menu

- Barra superior (⋮ tres puntos)
- `onCreateOptionsMenu()` + `onOptionsItemSelected()`

### 2. Context Menu

- Click largo en vistas
- `registerForContextMenu()` + `onContextItemSelected()`

### 3. Popup Menu

- Click en botón/vista
- `PopupMenu` + `setOnMenuItemClickListener()`

---

## 📖 OPTIONS MENU

**res/menu/menu_main.xml:**

```xml
<menu xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto">
    
    <item
        android:id="@+id/action_search"
        android:icon="@android:drawable/ic_menu_search"
        android:title="Buscar"
        app:showAsAction="ifRoom"/>
        
    <item
        android:id="@+id/action_settings"
        android:title="Configuración"
        app:showAsAction="never"/>
</menu>
```

**En Activity:**

```java
@Override
public boolean onCreateOptionsMenu(Menu menu) {
    getMenuInflater().inflate(R.menu.menu_main, menu);
    return true;
}

@Override
public boolean onOptionsItemSelected(MenuItem item) {
    if (item.getItemId() == R.id.action_search) {
        // Acción
        return true;
    }
    return super.onOptionsItemSelected(item);
}
```

---

## 📖 CONTEXT MENU

```java
// Registrar vista
registerForContextMenu(listView);

@Override
public void onCreateContextMenu(ContextMenu menu, View v, ...) {
    getMenuInflater().inflate(R.menu.menu_context, menu);
}

@Override
public boolean onContextItemSelected(MenuItem item) {
    AdapterView.AdapterContextMenuInfo info = 
        (AdapterView.AdapterContextMenuInfo) item.getMenuInfo();
    int position = info.position; // Posición del item
    
    if (item.getItemId() == R.id.context_delete) {
        lista.remove(position);
        return true;
    }
    return super.onContextItemSelected(item);
}
```

---

## 📖 POPUP MENU

```java
private void mostrarPopupMenu(View view) {
    PopupMenu popup = new PopupMenu(this, view);
    popup.getMenuInflater().inflate(R.menu.menu_popup, popup.getMenu());
    
    popup.setOnMenuItemClickListener(item -> {
        if (item.getItemId() == R.id.popup_edit) {
            // Acción
            return true;
        }
        return false;
    });
    
    popup.show();
}
```

---

## 🎯 EJERCICIO 15: App de Notas con Menús

**Requisitos:**

1. Options Menu: Nueva nota, buscar, estadísticas
2. Context Menu: Editar, eliminar, compartir, favorita
3. Popup Menu en cada nota: Editar, duplicar, color
4. Clase Nota (titulo, contenido, fecha, favorita)
5. Compartir con Intent.ACTION_SEND

---

## 🎯 EJERCICIO 16: Contactos con Menús

**Requisitos:**

1. Options Menu: Añadir, buscar, ordenar, exportar
2. Context Menu: Editar, eliminar, llamar, email, VIP
3. Estadísticas: total, VIP, último añadido

---

## 📝 CHECKLIST DÍA 9

- [ ] Entiendes los 3 tipos de menús
- [ ] Sabes crear XMLs de menús
- [ ] Puedes inflar y manejar menús
- [ ] Usas AdapterContextMenuInfo para posiciones
- [ ] Has completado Ejercicio 15
- [ ] Has completado Ejercicio 16

---

## 🎓 CONCEPTOS CLAVE DEL DÍA 9

|Concepto|Uso|
|---|---|
|**showAsAction**|never/ifRoom/always|
|**registerForContextMenu()**|Activar menú contextual|
|**AdapterContextMenuInfo**|Obtener posición en lista|
|**PopupMenu**|Menú anclado a vista|

---

[🔝 Volver al índice](#-%C3%ADndice-general)

---

📌 **Guardado:** 04/03/2026 - 16:00h  
📌 **Próxima sesión:** Día 10 - Diálogos avanzados