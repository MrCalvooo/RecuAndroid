# Notas_Android.md

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
- Día 3 - CheckBox, RadioButton y Toast _(Próximamente)_
- Día 4 - Spinner y Layouts _(Próximamente)_

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
**Días completados:** 2 de 32  
**Progreso:** 6.25% ⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜

---

### 📊 RESUMEN DE PROGRESO

|Semana|Días|Estado|
|---|---|---|
|Semanas 1-2|Día 1-2|✅ Completados|
|Semanas 1-2|Día 3-4|⏳ Pendientes|
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
|Ejercicio 4: Calculadora Simple|Día 2|⏳ Pendiente|

---

[🔝 Volver al índice principal](#-%C3%ADndice-general)

---

**📌 Próxima sesión:** Día 3 - Spinner y Layouts  
**📧 Contacto:** Envía tus ejercicios completados para revisión