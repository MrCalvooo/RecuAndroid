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

- [Día 9 - Menú de Opciones](#d%C3%ADa-9---men%C3%BAs-en-android) ✅
- [Día 10 - AlertDialog](#d%C3%ADa-10---alertdialog) ✅
- [Día 11 - TimePickerDialog y DatePickerDialog](#d%C3%ADa-11---timepickerdialog-y-datepickerdialog) ✅
- Día 12 - Context Menu y PopupMenu _(Próximamente)_

**[SEMANAS 7-8: PERSISTENCIA DE DATOS](#semanas-7-8-persistencia-de-datos)**

- [Día 13 - SharedPreferences](#d%C3%ADa-13---sharedpreferences) ✅
- [Día 14 - Ficheros Internos](#d%C3%ADa-14---ficheros-internos) ✅
- [Día 15 - Ficheros Externos](#d%C3%ADa-15---ficheros-externos) ✅
- Día 16 - Repaso Persistencia _(Próximamente)_

**[SEMANAS 9-10: MULTIMEDIA Y RECURSOS](#semanas-9-10-multimedia-y-recursos)**

- [Día 17 - MediaPlayer (Audio)](#d%C3%ADa-17---mediaplayer-audio) ✅
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

### 📖 ÍNDICE DETALLADO DEL DÍA 10

1. [Introducción a AlertDialog](#1-introducci%C3%B3n-a-alertdialog)
2. [AlertDialog Simple](#2-alertdialog-simple)
3. [AlertDialog con Botones](#3-alertdialog-con-botones-positivo-negativo-neutral)
4. [AlertDialog con Lista](#4-alertdialog-con-lista-simple)
5. [AlertDialog con SingleChoice](#5-alertdialog-con-singlechoice-radio-buttons)
6. [AlertDialog con MultipleChoice](#6-alertdialog-con-multiplechoice-checkboxes)
7. [AlertDialog con EditText](#7-alertdialog-con-edittext-layout-personalizado)
8. [ProgressDialog](#8-progressdialog)
9. [Ejercicio 17: Sistema de Confirmaciones](#ejercicio-17-sistema-de-confirmaciones)
10. [Ejercicio 18: Configurador de Perfil](#ejercicio-18-configurador-de-perfil)
11. [Checklist Día 10](#checklist-d%C3%ADa-10)
12. [Conceptos Clave Día 10](#conceptos-clave-del-d%C3%ADa-10)

---

### 📖 ÍNDICE DETALLADO DEL DÍA 11

1. [Introducción a DatePicker y TimePicker](#1-introducci%C3%B3n-a-datepicker-y-timepicker)
2. [TimePickerDialog](#2-timepickerdialog)
3. [DatePickerDialog](#3-datepickerdialog)
4. [Formatear Fecha y Hora](#4-formatear-fecha-y-hora)
5. [Calendar - Obtener fecha actual](#5-calendar---obtener-fecha-actual)
6. [Validaciones de Fechas](#6-validaciones-de-fechas)
7. [DatePicker y TimePicker en XML](#7-datepicker-y-timepicker-en-xml-vistas-embebidas)
8. [Ejercicio 19: Agenda de Citas](#ejercicio-19-agenda-de-citas)
9. [Ejercicio 20: Recordatorios](#ejercicio-20-recordatorios)
10. [Checklist Día 11](#checklist-d%C3%ADa-11)
11. [Conceptos Clave Día 11](#conceptos-clave-del-d%C3%ADa-11)

---

### 📖 ÍNDICE DETALLADO DEL DÍA 13

1. [Introducción a SharedPreferences](#1-introducci%C3%B3n-a-sharedpreferences)
2. [Guardar datos simples](#2-guardar-datos-simples)
3. [Leer datos guardados](#3-leer-datos-guardados)
4. [Tipos de datos soportados](#4-tipos-de-datos-soportados)
5. [Eliminar datos](#5-eliminar-datos)
6. [Modos de SharedPreferences](#6-modos-de-sharedpreferences)
7. [Casos de uso comunes](#7-casos-de-uso-comunes)
8. [Ejercicio 21: Sistema de Login](#ejercicio-21-sistema-de-login)
9. [Ejercicio 22: Configuración de App](#ejercicio-22-configuraci%C3%B3n-de-app)
10. [Checklist Día 13](#checklist-d%C3%ADa-13)
11. [Conceptos Clave Día 13](#conceptos-clave-del-d%C3%ADa-13)

---

### 📖 ÍNDICE DETALLADO DEL DÍA 14

1. [Introducción a Ficheros Internos](#1-introducci%C3%B3n-a-ficheros-internos)
2. [Escribir en fichero interno](#2-escribir-en-fichero-interno)
3. [Leer desde fichero interno](#3-leer-desde-fichero-interno)
4. [Listar ficheros internos](#4-listar-ficheros-internos)
5. [Eliminar ficheros internos](#5-eliminar-ficheros-internos)
6. [Modos de apertura](#6-modos-de-apertura)
7. [Trabajar con JSON](#7-trabajar-con-json)
8. [Ejercicio 23: Bloc de Notas](#ejercicio-23-bloc-de-notas)
9. [Ejercicio 24: Historial de Búsquedas](#ejercicio-24-historial-de-b%C3%BAsquedas)
10. [Checklist Día 14](#checklist-d%C3%ADa-14)
11. [Conceptos Clave Día 14](#conceptos-clave-del-d%C3%ADa-14)

---

### 📖 ÍNDICE DETALLADO DEL DÍA 15

1. [Introducción a Ficheros Externos](#1-introducci%C3%B3n-a-ficheros-externos)
2. [Permisos necesarios](#2-permisos-necesarios)
3. [Verificar almacenamiento externo](#3-verificar-almacenamiento-externo)
4. [Escribir en almacenamiento externo](#4-escribir-en-almacenamiento-externo)
5. [Leer desde almacenamiento externo](#5-leer-desde-almacenamiento-externo)
6. [Directorios públicos](#6-directorios-p%C3%BAblicos)
7. [Scoped Storage (Android 10+)](#7-scoped-storage-android-10)
8. [Ejercicio 25: Exportar Datos](#ejercicio-25-exportar-datos)
9. [Ejercicio 26: Galería de Imágenes](#ejercicio-26-galer%C3%ADa-de-im%C3%A1genes)
10. [Checklist Día 15](#checklist-d%C3%ADa-15)
11. [Conceptos Clave Día 15](#conceptos-clave-del-d%C3%ADa-15)

---

### 📖 ÍNDICE DETALLADO DEL DÍA 17

1. [Introducción a MediaPlayer](#1-introducci%C3%B3n-a-mediaplayer)
2. [Reproducir audio desde recursos](#2-reproducir-audio-desde-recursos-raw)
3. [Reproducir audio desde almacenamiento](#3-reproducir-audio-desde-almacenamiento)
4. [Controles básicos](#4-controles-b%C3%A1sicos-play-pause-stop)
5. [SeekBar y progreso](#5-seekbar-y-progreso)
6. [Estados del MediaPlayer](#6-estados-del-mediaplayer)
7. [Listeners y eventos](#7-listeners-y-eventos)
8. [Ejercicio 27: Reproductor de Audio](#ejercicio-27-reproductor-de-audio)
9. [Ejercicio 28: Lista de Reproducción](#ejercicio-28-lista-de-reproducci%C3%B3n)
10. [Checklist Día 17](#checklist-d%C3%ADa-17)
11. [Conceptos Clave Día 17](#conceptos-clave-del-d%C3%ADa-17)

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

Mantener ArrayList<\Boolean> con estados:

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
📌 **Próxima sesión:** Día 10 - AlertDialog

---

# 🎯 DÍA 10 - AlertDialog

**Fecha:** 6 de Marzo 2026  
**Duración:** 2-3 horas  
**Objetivos:** Dominar AlertDialog en todas sus variantes y crear diálogos personalizados

---

## 📖 1. Introducción a AlertDialog

Un **AlertDialog** es una ventana emergente que interrumpe el flujo de la aplicación para mostrar información importante o solicitar confirmación del usuario.

### ¿Cuándo usar AlertDialog?

✅ **SÍ usar para:**

- Confirmaciones de eliminación
- Advertencias importantes
- Selección de opciones
- Formularios cortos
- Progreso de tareas

❌ **NO usar para:**

- Mensajes informativos breves → usar **Toast**
- Notificaciones del sistema → usar **Notification**
- Selección de fecha/hora → usar **DatePickerDialog/TimePickerDialog**

---

## 📖 2. AlertDialog Simple

El diálogo más básico con título, mensaje y un botón.

```java
new AlertDialog.Builder(this)
    .setTitle("Título del Diálogo")
    .setMessage("Este es un mensaje informativo")
    .setPositiveButton("Aceptar", null)
    .show();
```

**Explicación:**

- `Builder(this)` → Constructor que necesita el contexto (Activity)
- `setTitle()` → Título del diálogo
- `setMessage()` → Contenido del mensaje
- `setPositiveButton()` → Botón principal (null = no hace nada al pulsar)
- `show()` → **IMPORTANTE**: siempre al final para mostrar el diálogo

---

## 📖 3. AlertDialog con Botones (Positivo, Negativo, Neutral)

```java
new AlertDialog.Builder(this)
    .setTitle("Confirmación")
    .setMessage("¿Deseas eliminar este elemento?")
    .setPositiveButton("Sí, eliminar", (dialog, which) -> {
        // Acción al confirmar
        Toast.makeText(this, "Eliminado", Toast.LENGTH_SHORT).show();
    })
    .setNegativeButton("Cancelar", (dialog, which) -> {
        // Acción al cancelar
        dialog.dismiss(); // Cerrar diálogo
    })
    .setNeutralButton("Más info", (dialog, which) -> {
        // Acción alternativa
        Toast.makeText(this, "Mostrando info...", Toast.LENGTH_SHORT).show();
    })
    .setCancelable(false) // No cerrar al tocar fuera
    .show();
```

**Tipos de botones:**

|Botón|Uso|Posición|Color|
|---|---|---|---|
|`setPositiveButton`|Acción principal (Aceptar, Sí, Guardar)|Derecha|Azul|
|`setNegativeButton`|Cancelar, No|Izquierda|Gris|
|`setNeutralButton`|Acción secundaria (Más info, Ayuda)|Centro|Gris|

**Método `setCancelable()`:**

- `true` (por defecto) → Se cierra al tocar fuera o pulsar BACK
- `false` → Solo se cierra con los botones

---

## 📖 4. AlertDialog con Lista Simple

Muestra una lista de opciones sin selección previa.

```java
String[] opciones = {"Opción 1", "Opción 2", "Opción 3"};

new AlertDialog.Builder(this)
    .setTitle("Selecciona una opción")
    .setItems(opciones, (dialog, which) -> {
        // which = índice de la opción seleccionada (0, 1, 2...)
        String seleccionada = opciones[which];
        Toast.makeText(this, "Seleccionaste: " + seleccionada, Toast.LENGTH_SHORT).show();
    })
    .show();
```

**Ejemplo práctico - Menú de acciones:**

```java
String[] acciones = {"Compartir", "Editar", "Eliminar"};

new AlertDialog.Builder(this)
    .setTitle("Acciones disponibles")
    .setItems(acciones, (dialog, which) -> {
        switch (which) {
            case 0: // Compartir
                compartir();
                break;
            case 1: // Editar
                editar();
                break;
            case 2: // Eliminar
                confirmarEliminar();
                break;
        }
    })
    .show();
```

---

## 📖 5. AlertDialog con SingleChoice (Radio Buttons)

Permite seleccionar **UNA** opción de varias. Ideal para configuraciones.

```java
String[] colores = {"Rojo", "Verde", "Azul"};
int seleccionado = 0; // Índice seleccionado por defecto

new AlertDialog.Builder(this)
    .setTitle("Selecciona un color")
    .setSingleChoiceItems(colores, seleccionado, (dialog, which) -> {
        // Este listener se ejecuta al SELECCIONAR (no al pulsar OK)
        seleccionado = which;
    })
    .setPositiveButton("Aceptar", (dialog, which) -> {
        // Este listener se ejecuta al pulsar OK
        String colorElegido = colores[seleccionado];
        Toast.makeText(this, "Color: " + colorElegido, Toast.LENGTH_SHORT).show();
    })
    .setNegativeButton("Cancelar", null)
    .show();
```

**⚠️ ERROR COMÚN:**

```java
// ❌ MAL: usar "which" del listener de setSingleChoiceItems
.setSingleChoiceItems(colores, 0, (dialog, which) -> {
    String color = colores[which]; // ❌ Se ejecuta al seleccionar
})
.setPositiveButton("Aceptar", (dialog, w) -> {
    // ❌ No tenemos acceso a "which" aquí
})

// ✅ BIEN: guardar en variable externa
int[] seleccionado = {0}; // Array para usar en lambda

.setSingleChoiceItems(colores, seleccionado[0], (dialog, which) -> {
    seleccionado[0] = which; // Guardar selección
})
.setPositiveButton("Aceptar", (dialog, w) -> {
    String color = colores[seleccionado[0]]; // ✅ Usar variable
})
```

---

## 📖 6. AlertDialog con MultipleChoice (Checkboxes)

Permite seleccionar **VARIAS** opciones. Ideal para filtros.

```java
String[] ingredientes = {"Tomate", "Lechuga", "Cebolla", "Queso"};
boolean[] seleccionados = {false, true, false, true}; // Estados iniciales

new AlertDialog.Builder(this)
    .setTitle("Selecciona ingredientes")
    .setMultiChoiceItems(ingredientes, seleccionados, (dialog, which, isChecked) -> {
        // which = índice del item
        // isChecked = true si se marcó, false si se desmarcó
        seleccionados[which] = isChecked;
    })
    .setPositiveButton("Confirmar", (dialog, which) -> {
        StringBuilder resultado = new StringBuilder("Seleccionados: ");
        for (int i = 0; i < ingredientes.length; i++) {
            if (seleccionados[i]) {
                resultado.append(ingredientes[i]).append(", ");
            }
        }
        Toast.makeText(this, resultado.toString(), Toast.LENGTH_LONG).show();
    })
    .setNegativeButton("Cancelar", null)
    .show();
```

**Ejemplo con ArrayList:**

```java
ArrayList<String> seleccionados = new ArrayList<>();

new AlertDialog.Builder(this)
    .setTitle("Filtros")
    .setMultiChoiceItems(opciones, null, (dialog, which, isChecked) -> {
        String item = opciones[which];
        if (isChecked) {
            seleccionados.add(item);
        } else {
            seleccionados.remove(item);
        }
    })
    .setPositiveButton("Aplicar", (dialog, which) -> {
        filtrarPor(seleccionados);
    })
    .show();
```

---

## 📖 7. AlertDialog con EditText (Layout Personalizado)

Para crear formularios dentro de diálogos.

### Opción 1: EditText directo (simple)

```java
EditText input = new EditText(this);
input.setHint("Escribe tu nombre");

new AlertDialog.Builder(this)
    .setTitle("Nuevo Usuario")
    .setView(input) // ✅ Añadir EditText al diálogo
    .setPositiveButton("Guardar", (dialog, which) -> {
        String nombre = input.getText().toString().trim();
        if (nombre.isEmpty()) {
            Toast.makeText(this, "El nombre no puede estar vacío", Toast.LENGTH_SHORT).show();
        } else {
            guardarNombre(nombre);
        }
    })
    .setNegativeButton("Cancelar", null)
    .show();
```

### Opción 2: Layout XML personalizado (avanzado)

**res/layout/dialog_custom.xml:**

```xml
<?xml version="1.0" encoding="utf-8"?>
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
    android:layout_width="match_parent"
    android:layout_height="wrap_content"
    android:orientation="vertical"
    android:padding="16dp">

    <EditText
        android:id="@+id/etNombre"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:hint="Nombre"/>

    <EditText
        android:id="@+id/etEmail"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:hint="Email"
        android:inputType="textEmailAddress"/>

</LinearLayout>
```

**En Java:**

```java
// Inflar layout personalizado
View dialogView = getLayoutInflater().inflate(R.layout.dialog_custom, null);
EditText etNombre = dialogView.findViewById(R.id.etNombre);
EditText etEmail = dialogView.findViewById(R.id.etEmail);

new AlertDialog.Builder(this)
    .setTitle("Registro")
    .setView(dialogView) // ✅ Añadir layout completo
    .setPositiveButton("Registrar", (dialog, which) -> {
        String nombre = etNombre.getText().toString().trim();
        String email = etEmail.getText().toString().trim();
        
        if (nombre.isEmpty() || email.isEmpty()) {
            Toast.makeText(this, "Completa todos los campos", Toast.LENGTH_SHORT).show();
        } else {
            registrarUsuario(nombre, email);
        }
    })
    .setNegativeButton("Cancelar", null)
    .show();
```

---

## 📖 8. ProgressDialog

⚠️ **DEPRECADO** desde Android 8.0, pero útil para entender el concepto.

**Alternativa moderna:** ProgressBar dentro de AlertDialog

```java
// Crear diálogo con ProgressBar
ProgressBar progressBar = new ProgressBar(this);

AlertDialog dialog = new AlertDialog.Builder(this)
    .setTitle("Cargando...")
    .setMessage("Por favor espera")
    .setView(progressBar)
    .setCancelable(false)
    .create();

dialog.show();

// Simular tarea larga
new Handler().postDelayed(() -> {
    dialog.dismiss();
    Toast.makeText(this, "Completado", Toast.LENGTH_SHORT).show();
}, 3000);
```

**Mejor práctica moderna:**

```java
// Layout con ProgressBar personalizado
View dialogView = getLayoutInflater().inflate(R.layout.dialog_progress, null);
ProgressBar progressBar = dialogView.findViewById(R.id.progressBar);
TextView tvMensaje = dialogView.findViewById(R.id.tvMensaje);

AlertDialog dialog = new AlertDialog.Builder(this)
    .setView(dialogView)
    .setCancelable(false)
    .create();

dialog.show();

// Actualizar mensaje dinámicamente
tvMensaje.setText("Procesando...");
```

---

## 🎯 EJERCICIO 17: Sistema de Confirmaciones

Crea una app de **Gestión de Tareas** con las siguientes funcionalidades:

**Requisitos:**

1. **ListView** con tareas (String simple)
2. **Botón "Añadir"**: AlertDialog con EditText para nueva tarea
3. **Click en tarea**: AlertDialog con lista de acciones:
    - Marcar como completada
    - Editar
    - Eliminar
    - Cancelar
4. **Al editar**: AlertDialog con EditText prellenado
5. **Al eliminar**: AlertDialog de confirmación con botones Sí/No
6. **Validaciones**: No permitir tareas vacías

**Pistas:**

- Usa `ArrayList<String>` para las tareas
- `ArrayAdapter` para el ListView
- `adapter.notifyDataSetChanged()` después de modificar

**Layout sugerido:**

```xml
<!-- activity_main.xml -->
<LinearLayout
    android:orientation="vertical"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:padding="16dp">

    <Button
        android:id="@+id/btnAnadir"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:text="Añadir Tarea"/>

    <ListView
        android:id="@+id/listViewTareas"
        android:layout_width="match_parent"
        android:layout_height="0dp"
        android:layout_weight="1"/>

</LinearLayout>
```

---

## 🎯 EJERCICIO 18: Configurador de Perfil

Crea una app de **Configuración de Perfil** con diálogos avanzados:

**Requisitos:**

1. **TextView** mostrando configuración actual
2. **Botón "Nombre"**: AlertDialog con EditText
3. **Botón "Tema"**: SingleChoice (Claro, Oscuro, Automático)
4. **Botón "Notificaciones"**: MultipleChoice (Email, SMS, Push, Sonido)
5. **Botón "Guardar"**: AlertDialog de confirmación
6. **Botón "Resetear"**: AlertDialog de confirmación peligrosa
7. Actualizar TextView al cambiar configuración

**Datos a gestionar:**

```java
private String nombre = "Usuario";
private String tema = "Claro";
private ArrayList<String> notificaciones = new ArrayList<>();
```

**Layout sugerido:**

```xml
<LinearLayout
    android:orientation="vertical"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:padding="16dp">

    <TextView
        android:id="@+id/tvConfiguracion"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:textSize="16sp"
        android:padding="12dp"
        android:background="#f0f0f0"/>

    <Button
        android:id="@+id/btnNombre"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:text="Cambiar Nombre"/>

    <Button
        android:id="@+id/btnTema"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:text="Seleccionar Tema"/>

    <Button
        android:id="@+id/btnNotificaciones"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:text="Configurar Notificaciones"/>

    <Button
        android:id="@+id/btnGuardar"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:text="Guardar Cambios"/>

    <Button
        android:id="@+id/btnResetear"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:text="Resetear a Valores por Defecto"
        android:backgroundTint="#d32f2f"
        android:textColor="#ffffff"/>

</LinearLayout>
```

---

## 📝 CHECKLIST DÍA 10

- [ ] Entiendes cuándo usar AlertDialog vs Toast
- [ ] Sabes crear diálogos con 1, 2 o 3 botones
- [ ] Diferencias setItems, setSingleChoice y setMultiChoice
- [ ] Puedes añadir EditText a un diálogo
- [ ] Sabes inflar layouts personalizados
- [ ] Usas setCancelable correctamente
- [ ] Has completado Ejercicio 17
- [ ] Has completado Ejercicio 18

---

## 🎓 CONCEPTOS CLAVE DEL DÍA 10

|Concepto|Definición|
|---|---|
|**AlertDialog.Builder**|Patrón constructor para crear diálogos|
|**setPositiveButton**|Botón de acción principal (derecha, azul)|
|**setNegativeButton**|Botón de cancelar (izquierda, gris)|
|**setNeutralButton**|Botón de acción alternativa (centro, gris)|
|**setItems**|Lista de opciones sin selección previa|
|**setSingleChoiceItems**|RadioButtons (una sola opción)|
|**setMultiChoiceItems**|CheckBoxes (múltiples opciones)|
|**setView**|Añadir vista personalizada (EditText, layout XML)|
|**setCancelable**|Permitir/bloquear cierre al tocar fuera|
|**show()**|OBLIGATORIO al final para mostrar el diálogo|

---

## 🔍 COMPARATIVA RÁPIDA

```java
// ❌ MAL - Olvidar show()
new AlertDialog.Builder(this)
    .setTitle("Error")
    .setMessage("Mensaje"); // No se muestra nada

// ✅ BIEN
new AlertDialog.Builder(this)
    .setTitle("Correcto")
    .setMessage("Mensaje")
    .setPositiveButton("OK", null)
    .show(); // ✅
```

```java
// ❌ MAL - Usar "which" equivocado
.setSingleChoiceItems(items, 0, (d, which) -> {
    String item = items[which]; // Se ejecuta al seleccionar
})
.setPositiveButton("OK", (d, which) -> {
    // "which" aquí es el botón, no el item
})

// ✅ BIEN - Guardar en variable
final int[] selected = {0};
.setSingleChoiceItems(items, 0, (d, which) -> {
    selected[0] = which;
})
.setPositiveButton("OK", (d, w) -> {
    String item = items[selected[0]]; // ✅
})
```

---

## 💡 CONSEJOS PROFESIONALES

1. **Validaciones siempre en el botón Positivo**, no en el listener del EditText
2. **Usa setCancelable(false)** para acciones críticas (eliminar, pagar)
3. **No abuses de diálogos** → UX molesta si hay demasiados
4. **Títulos concisos** → "Eliminar contacto" mejor que "¿Estás seguro de que quieres eliminar este contacto?"
5. **Iconos opcionales** → `setIcon(R.drawable.ic_warning)` solo para alertas importantes
6. **Texto de botones claro** → "Eliminar" mejor que "Aceptar" en confirmaciones de borrado

---

[🔝 Volver al índice](#-%C3%ADndice-general)

---

📌 **Guardado:** 06/03/2026 - 18:30h  
📌 **Próxima sesión:** Día 11 - TimePickerDialog y DatePickerDialog

---

# 🎯 DÍA 11 - TimePickerDialog y DatePickerDialog

**Fecha:** 9 de Marzo 2026  
**Duración:** 2-3 horas  
**Objetivos:** Dominar la selección de fechas y horas en Android

---

## 📖 1. Introducción a DatePicker y TimePicker

Android proporciona diálogos especializados para seleccionar fechas y horas:

|Diálogo|Propósito|Uso común|
|---|---|---|
|**TimePickerDialog**|Seleccionar hora (HH:mm)|Alarmas, recordatorios, citas|
|**DatePickerDialog**|Seleccionar fecha (dd/MM/yyyy)|Reservas, cumpleaños, eventos|

**Ventajas:**

- ✅ Interfaz nativa de Android
- ✅ Validación automática (no permite fechas inválidas)
- ✅ Compatibilidad con diferentes versiones de Android
- ✅ Fácil de implementar

---

## 📖 2. TimePickerDialog

Permite seleccionar una hora (horas y minutos).

### Sintaxis básica

```java
// Obtener hora actual
Calendar calendario = Calendar.getInstance();
int horaActual = calendario.get(Calendar.HOUR_OF_DAY);
int minutoActual = calendario.get(Calendar.MINUTE);

// Crear TimePickerDialog
TimePickerDialog timePickerDialog = new TimePickerDialog(
    this,                           // Contexto (Activity)
    (view, hourOfDay, minute) -> {  // Listener cuando se selecciona
        // hourOfDay = hora seleccionada (0-23)
        // minute = minuto seleccionado (0-59)
        String horaSeleccionada = String.format("%02d:%02d", hourOfDay, minute);
        Toast.makeText(this, "Hora: " + horaSeleccionada, Toast.LENGTH_SHORT).show();
    },
    horaActual,    // Hora inicial mostrada
    minutoActual,  // Minuto inicial mostrado
    true           // true = formato 24h, false = formato AM/PM
);

timePickerDialog.show();
```

### Ejemplo completo

```java
public class MainActivity extends AppCompatActivity {
    
    private Button btnSeleccionarHora;
    private TextView tvHora;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        btnSeleccionarHora = findViewById(R.id.btnSeleccionarHora);
        tvHora = findViewById(R.id.tvHora);
        
        btnSeleccionarHora.setOnClickListener(v -> mostrarTimePickerDialog());
    }
    
    private void mostrarTimePickerDialog() {
        // Obtener hora actual como predeterminada
        Calendar c = Calendar.getInstance();
        int hora = c.get(Calendar.HOUR_OF_DAY);
        int minuto = c.get(Calendar.MINUTE);
        
        TimePickerDialog dialog = new TimePickerDialog(
            this,
            (view, selectedHour, selectedMinute) -> {
                // Formatear con 2 dígitos (08:05 en vez de 8:5)
                String horaFormateada = String.format("%02d:%02d", selectedHour, selectedMinute);
                tvHora.setText("Hora seleccionada: " + horaFormateada);
            },
            hora,
            minuto,
            true  // Formato 24 horas
        );
        
        dialog.show();
    }
}
```

### Formato 12 horas (AM/PM)

```java
TimePickerDialog dialog = new TimePickerDialog(
    this,
    (view, hourOfDay, minute) -> {
        // Convertir a formato 12h
        String periodo = (hourOfDay >= 12) ? "PM" : "AM";
        int hora12 = (hourOfDay > 12) ? hourOfDay - 12 : hourOfDay;
        if (hora12 == 0) hora12 = 12; // Medianoche = 12 AM
        
        String horaFormateada = String.format("%02d:%02d %s", hora12, minute, periodo);
        tvHora.setText(horaFormateada);
    },
    12,
    0,
    false  // false = formato 12h con AM/PM
);
```

---

## 📖 3. DatePickerDialog

Permite seleccionar una fecha (día, mes, año).

### Sintaxis básica

```java
// Obtener fecha actual
Calendar calendario = Calendar.getInstance();
int anioActual = calendario.get(Calendar.YEAR);
int mesActual = calendario.get(Calendar.MONTH);  // 0 = Enero, 11 = Diciembre
int diaActual = calendario.get(Calendar.DAY_OF_MONTH);

// Crear DatePickerDialog
DatePickerDialog datePickerDialog = new DatePickerDialog(
    this,                                // Contexto
    (view, year, month, dayOfMonth) -> { // Listener
        // year = año seleccionado
        // month = mes (0-11, donde 0 = Enero)
        // dayOfMonth = día seleccionado
        String fechaSeleccionada = dayOfMonth + "/" + (month + 1) + "/" + year;
        Toast.makeText(this, "Fecha: " + fechaSeleccionada, Toast.LENGTH_SHORT).show();
    },
    anioActual,  // Año inicial
    mesActual,   // Mes inicial (0-11)
    diaActual    // Día inicial
);

datePickerDialog.show();
```

### Ejemplo completo

```java
public class MainActivity extends AppCompatActivity {
    
    private Button btnSeleccionarFecha;
    private TextView tvFecha;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        btnSeleccionarFecha = findViewById(R.id.btnSeleccionarFecha);
        tvFecha = findViewById(R.id.tvFecha);
        
        btnSeleccionarFecha.setOnClickListener(v -> mostrarDatePickerDialog());
    }
    
    private void mostrarDatePickerDialog() {
        Calendar c = Calendar.getInstance();
        int anio = c.get(Calendar.YEAR);
        int mes = c.get(Calendar.MONTH);
        int dia = c.get(Calendar.DAY_OF_MONTH);
        
        DatePickerDialog dialog = new DatePickerDialog(
            this,
            (view, year, month, dayOfMonth) -> {
                // ⚠️ IMPORTANTE: month va de 0 a 11, así que sumamos 1
                String fechaFormateada = String.format("%02d/%02d/%d", 
                    dayOfMonth, month + 1, year);
                tvFecha.setText("Fecha: " + fechaFormateada);
            },
            anio,
            mes,
            dia
        );
        
        dialog.show();
    }
}
```

---

## 📖 4. Formatear Fecha y Hora

### Con SimpleDateFormat

```java
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

// Crear Calendar con fecha seleccionada
Calendar c = Calendar.getInstance();
c.set(2026, 2, 9);  // 9 de Marzo de 2026 (mes 2 = Marzo)

// Formatear
SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy", Locale.getDefault());
String fechaFormateada = sdf.format(c.getTime());
// Resultado: "09/03/2026"

// Diferentes formatos
SimpleDateFormat sdf1 = new SimpleDateFormat("EEEE, dd 'de' MMMM 'de' yyyy", new Locale("es", "ES"));
// Resultado: "domingo, 09 de marzo de 2026"

SimpleDateFormat sdf2 = new SimpleDateFormat("dd-MMM-yyyy", Locale.getDefault());
// Resultado: "09-mar-2026"

SimpleDateFormat sdf3 = new SimpleDateFormat("HH:mm:ss", Locale.getDefault());
// Resultado: "14:30:45"
```

### Patrones comunes

|Patrón|Resultado|Ejemplo|
|---|---|---|
|`dd/MM/yyyy`|Día/Mes/Año|09/03/2026|
|`yyyy-MM-dd`|Año-Mes-Día (ISO)|2026-03-09|
|`EEEE, dd MMMM yyyy`|Día completo|domingo, 09 marzo 2026|
|`HH:mm`|Hora 24h|14:30|
|`hh:mm a`|Hora 12h|02:30 PM|

---

## 📖 5. Calendar - Obtener fecha actual

```java
import java.util.Calendar;

Calendar c = Calendar.getInstance();

// Obtener componentes
int anio = c.get(Calendar.YEAR);              // 2026
int mes = c.get(Calendar.MONTH);              // 2 (0=Enero, 11=Diciembre)
int dia = c.get(Calendar.DAY_OF_MONTH);       // 9
int hora = c.get(Calendar.HOUR_OF_DAY);       // 14 (formato 24h)
int minuto = c.get(Calendar.MINUTE);          // 30
int segundo = c.get(Calendar.SECOND);         // 45

// Establecer fecha específica
c.set(2026, 11, 25);  // 25 de Diciembre de 2026
c.set(Calendar.HOUR_OF_DAY, 23);
c.set(Calendar.MINUTE, 59);

// Sumar/restar tiempo
c.add(Calendar.DAY_OF_MONTH, 7);   // Sumar 7 días
c.add(Calendar.MONTH, -1);          // Restar 1 mes
c.add(Calendar.YEAR, 1);            // Sumar 1 año
```

---

## 📖 6. Validaciones de Fechas

### Limitar fecha mínima y máxima

```java
DatePickerDialog dialog = new DatePickerDialog(this, listener, anio, mes, dia);

// Establecer fecha mínima (por ejemplo, solo fechas futuras)
Calendar minDate = Calendar.getInstance();
dialog.getDatePicker().setMinDate(minDate.getTimeInMillis());

// Establecer fecha máxima (por ejemplo, hasta dentro de 1 año)
Calendar maxDate = Calendar.getInstance();
maxDate.add(Calendar.YEAR, 1);
dialog.getDatePicker().setMaxDate(maxDate.getTimeInMillis());

dialog.show();
```

### Validar que una fecha sea posterior a otra

```java
private boolean esFechaPosterior(Calendar fecha1, Calendar fecha2) {
    return fecha1.after(fecha2);
}

// Uso:
Calendar fechaInicio = Calendar.getInstance();
fechaInicio.set(2026, 2, 9);

Calendar fechaFin = Calendar.getInstance();
fechaFin.set(2026, 2, 15);

if (esFechaPosterior(fechaFin, fechaInicio)) {
    Toast.makeText(this, "Fechas válidas", Toast.LENGTH_SHORT).show();
} else {
    Toast.makeText(this, "La fecha fin debe ser posterior", Toast.LENGTH_SHORT).show();
}
```

### Calcular diferencia entre fechas

```java
private long calcularDiferenciaDias(Calendar fecha1, Calendar fecha2) {
    long diferenciaMilisegundos = fecha2.getTimeInMillis() - fecha1.getTimeInMillis();
    return diferenciaMilisegundos / (1000 * 60 * 60 * 24);
}

// Uso:
long dias = calcularDiferenciaDias(fechaInicio, fechaFin);
Toast.makeText(this, "Diferencia: " + dias + " días", Toast.LENGTH_SHORT).show();
```

---

## 📖 7. DatePicker y TimePicker en XML (Vistas embebidas)

A diferencia de los diálogos, puedes mostrar los controles directamente en el layout.

### DatePicker en XML

```xml
<DatePicker
    android:id="@+id/datePicker"
    android:layout_width="wrap_content"
    android:layout_height="wrap_content"
    android:calendarViewShown="false"
    android:datePickerMode="spinner"/>
```

### TimePicker en XML

```xml
<TimePicker
    android:id="@+id/timePicker"
    android:layout_width="wrap_content"
    android:layout_height="wrap_content"
    android:timePickerMode="spinner"/>
```

### Leer valores en Java

```java
DatePicker datePicker = findViewById(R.id.datePicker);
TimePicker timePicker = findViewById(R.id.timePicker);

// Obtener fecha del DatePicker
int dia = datePicker.getDayOfMonth();
int mes = datePicker.getMonth();  // 0-11
int anio = datePicker.getYear();

// Obtener hora del TimePicker
int hora = timePicker.getHour();    // API 23+
int minuto = timePicker.getMinute(); // API 23+

// Para versiones anteriores a API 23:
// int hora = timePicker.getCurrentHour();
// int minuto = timePicker.getCurrentMinute();
```

---

## 🎯 EJERCICIO 19: Agenda de Citas

Crea una app de **Agenda de Citas Médicas** con las siguientes funcionalidades:

**Requisitos:**

1. **Botón "Nueva Cita"**: Abre diálogo con:
    
    - EditText para nombre del paciente
    - Botón para seleccionar fecha (DatePickerDialog)
    - Botón para seleccionar hora (TimePickerDialog)
    - Botón "Guardar"
2. **ListView** mostrando las citas guardadas con formato:
    
    ```
    Juan Pérez
    09/03/2026 - 14:30
    ```
    
3. **Validaciones**:
    
    - Fecha no puede ser anterior a hoy
    - Hora debe estar entre 08:00 y 20:00
    - Nombre no puede estar vacío
4. **Click en cita**: Mostrar AlertDialog con opciones:
    
    - Ver detalles
    - Editar
    - Eliminar

**Clase sugerida:**

```java
public class Cita {
    private String nombrePaciente;
    private Calendar fechaHora;
    
    public Cita(String nombre, Calendar fechaHora) {
        this.nombrePaciente = nombre;
        this.fechaHora = fechaHora;
    }
    
    // Getters y setters
    
    @Override
    public String toString() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy - HH:mm", Locale.getDefault());
        return nombrePaciente + "\n" + sdf.format(fechaHora.getTime());
    }
}
```

**Layout sugerido:**

```xml
<LinearLayout
    android:orientation="vertical"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:padding="16dp">

    <Button
        android:id="@+id/btnNuevaCita"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:text="Nueva Cita"/>

    <ListView
        android:id="@+id/listViewCitas"
        android:layout_width="match_parent"
        android:layout_height="0dp"
        android:layout_weight="1"
        android:layout_marginTop="16dp"/>

</LinearLayout>
```

---

## 🎯 EJERCICIO 20: Recordatorios

Crea una app de **Recordatorios** con las siguientes funcionalidades:

**Requisitos:**

1. **Formulario para crear recordatorio**:
    
    - EditText: Título
    - EditText: Descripción
    - TextView + Botón: Seleccionar fecha (DatePickerDialog)
    - TextView + Botón: Seleccionar hora (TimePickerDialog)
    - Spinner: Prioridad (Alta, Media, Baja)
    - CheckBox: ¿Repetir diariamente?
    - Botón "Guardar"
2. **ListView** mostrando recordatorios ordenados por fecha
    
3. **Indicadores visuales**:
    
    - Color rojo para prioridad alta
    - Color amarillo para prioridad media
    - Color verde para prioridad baja
    - Icono de repetición si es recurrente
4. **Validaciones**:
    
    - Título obligatorio
    - Fecha no puede ser en el pasado
    - Si la fecha es hoy, la hora debe ser futura
5. **Context Menu** en cada recordatorio:
    
    - Marcar como completado
    - Editar
    - Duplicar
    - Eliminar

**Clase sugerida:**

```java
public class Recordatorio {
    private String titulo;
    private String descripcion;
    private Calendar fechaHora;
    private String prioridad;  // "Alta", "Media", "Baja"
    private boolean repetirDiariamente;
    private boolean completado;
    
    // Constructor, getters y setters
}
```

**Layout sugerido:**

```xml
<ScrollView
    android:layout_width="match_parent"
    android:layout_height="match_parent">

    <LinearLayout
        android:orientation="vertical"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:padding="16dp">

        <EditText
            android:id="@+id/etTitulo"
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:hint="Título del recordatorio"/>

        <EditText
            android:id="@+id/etDescripcion"
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:hint="Descripción"
            android:minLines="3"/>

        <LinearLayout
            android:orientation="horizontal"
            android:layout_width="match_parent"
            android:layout_height="wrap_content">

            <TextView
                android:id="@+id/tvFecha"
                android:layout_width="0dp"
                android:layout_height="wrap_content"
                android:layout_weight="1"
                android:text="Seleccionar fecha"
                android:padding="12dp"/>

            <Button
                android:id="@+id/btnFecha"
                android:layout_width="wrap_content"
                android:layout_height="wrap_content"
                android:text="📅"/>

        </LinearLayout>

        <LinearLayout
            android:orientation="horizontal"
            android:layout_width="match_parent"
            android:layout_height="wrap_content">

            <TextView
                android:id="@+id/tvHora"
                android:layout_width="0dp"
                android:layout_height="wrap_content"
                android:layout_weight="1"
                android:text="Seleccionar hora"
                android:padding="12dp"/>

            <Button
                android:id="@+id/btnHora"
                android:layout_width="wrap_content"
                android:layout_height="wrap_content"
                android:text="🕐"/>

        </LinearLayout>

        <Spinner
            android:id="@+id/spinnerPrioridad"
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:entries="@array/prioridades"/>

        <CheckBox
            android:id="@+id/cbRepetir"
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:text="Repetir diariamente"/>

        <Button
            android:id="@+id/btnGuardar"
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:text="Guardar Recordatorio"/>

        <ListView
            android:id="@+id/listViewRecordatorios"
            android:layout_width="match_parent"
            android:layout_height="300dp"
            android:layout_marginTop="16dp"/>

    </LinearLayout>
</ScrollView>
```

**res/values/arrays.xml:**

```xml
<?xml version="1.0" encoding="utf-8"?>
<resources>
    <string-array name="prioridades">
        <item>Alta</item>
        <item>Media</item>
        <item>Baja</item>
    </string-array>
</resources>
```

---

## 📝 CHECKLIST DÍA 11

- [ ] Entiendes la diferencia entre TimePickerDialog y DatePickerDialog
- [ ] Sabes obtener la fecha/hora actual con Calendar
- [ ] Puedes formatear fechas con SimpleDateFormat
- [ ] Sabes establecer límites min/max en DatePickerDialog
- [ ] Puedes calcular diferencias entre fechas
- [ ] Conoces la diferencia entre diálogos y vistas embebidas
- [ ] Has completado Ejercicio 19
- [ ] Has completado Ejercicio 20

---

## 🎓 CONCEPTOS CLAVE DEL DÍA 11

|Concepto|Definición|
|---|---|
|**TimePickerDialog**|Diálogo para seleccionar hora (HH:mm)|
|**DatePickerDialog**|Diálogo para seleccionar fecha (dd/MM/yyyy)|
|**Calendar**|Clase para trabajar con fechas y horas|
|**SimpleDateFormat**|Clase para formatear fechas como String|
|**setMinDate()**|Establecer fecha mínima permitida|
|**setMaxDate()**|Establecer fecha máxima permitida|
|**Calendar.MONTH**|Mes (0-11, donde 0=Enero, 11=Diciembre)|
|**Calendar.HOUR_OF_DAY**|Hora en formato 24h (0-23)|
|**getTimeInMillis()**|Obtener timestamp en milisegundos|
|**after() / before()**|Comparar si una fecha es posterior/anterior|

---

## 🔍 ERRORES COMUNES

```java
// ❌ ERROR 1: Olvidar que Calendar.MONTH va de 0 a 11
Calendar c = Calendar.getInstance();
c.set(2026, 3, 9);  // ❌ Esto es 9 de ABRIL, no Marzo
// ✅ CORRECTO:
c.set(2026, 2, 9);  // 9 de Marzo (mes 2)

// ❌ ERROR 2: No sumar 1 al mostrar el mes
String fecha = dia + "/" + mes + "/" + anio;  // ❌ Mostrará mes 0-11
// ✅ CORRECTO:
String fecha = dia + "/" + (mes + 1) + "/" + anio;

// ❌ ERROR 3: No formatear con ceros a la izquierda
String hora = hora + ":" + minuto;  // ❌ "8:5" en vez de "08:05"
// ✅ CORRECTO:
String hora = String.format("%02d:%02d", hora, minuto);

// ❌ ERROR 4: Confundir HOUR con HOUR_OF_DAY
int hora = c.get(Calendar.HOUR);  // ❌ Formato 12h (0-11)
// ✅ CORRECTO:
int hora = c.get(Calendar.HOUR_OF_DAY);  // Formato 24h (0-23)
```

---

## 💡 CONSEJOS PROFESIONALES

1. **Usa Calendar.getInstance()** para obtener la fecha actual, no `new Calendar()`
2. **Siempre formatea con 2 dígitos** → `String.format("%02d/%02d/%d", dia, mes, anio)`
3. **Recuerda: Calendar.MONTH va de 0 a 11** → siempre suma 1 al mostrar
4. **Para validar fechas futuras** → `c.after(Calendar.getInstance())`
5. **Usa SimpleDateFormat** para formateos complejos → `new SimpleDateFormat("dd MMMM yyyy", Locale.getDefault())`
6. **Limita fechas razonables** → setMinDate() y setMaxDate() mejoran UX
7. **Para apps profesionales** → considera usar **Material Date Picker** (más moderno)

---

## 🌟 EJEMPLO COMPLETO: Selector Fecha + Hora

```java
public class MainActivity extends AppCompatActivity {
    
    private TextView tvFechaHora;
    private Button btnSeleccionar;
    private Calendar fechaHoraSeleccionada;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        tvFechaHora = findViewById(R.id.tvFechaHora);
        btnSeleccionar = findViewById(R.id.btnSeleccionar);
        
        fechaHoraSeleccionada = Calendar.getInstance();
        
        btnSeleccionar.setOnClickListener(v -> seleccionarFecha());
    }
    
    private void seleccionarFecha() {
        Calendar c = Calendar.getInstance();
        
        DatePickerDialog dateDialog = new DatePickerDialog(
            this,
            (view, year, month, dayOfMonth) -> {
                fechaHoraSeleccionada.set(Calendar.YEAR, year);
                fechaHoraSeleccionada.set(Calendar.MONTH, month);
                fechaHoraSeleccionada.set(Calendar.DAY_OF_MONTH, dayOfMonth);
                
                // Después de seleccionar fecha, seleccionar hora
                seleccionarHora();
            },
            c.get(Calendar.YEAR),
            c.get(Calendar.MONTH),
            c.get(Calendar.DAY_OF_MONTH)
        );
        
        // Solo fechas futuras
        dateDialog.getDatePicker().setMinDate(c.getTimeInMillis());
        dateDialog.show();
    }
    
    private void seleccionarHora() {
        Calendar c = Calendar.getInstance();
        
        TimePickerDialog timeDialog = new TimePickerDialog(
            this,
            (view, hourOfDay, minute) -> {
                fechaHoraSeleccionada.set(Calendar.HOUR_OF_DAY, hourOfDay);
                fechaHoraSeleccionada.set(Calendar.MINUTE, minute);
                
                // Mostrar resultado
                mostrarFechaHora();
            },
            c.get(Calendar.HOUR_OF_DAY),
            c.get(Calendar.MINUTE),
            true
        );
        
        timeDialog.show();
    }
    
    private void mostrarFechaHora() {
        SimpleDateFormat sdf = new SimpleDateFormat(
            "EEEE, dd 'de' MMMM 'de' yyyy - HH:mm", 
            new Locale("es", "ES")
        );
        String texto = sdf.format(fechaHoraSeleccionada.getTime());
        tvFechaHora.setText(texto);
    }
}
```

---

[🔝 Volver al índice](#-%C3%ADndice-general)

---

📌 **Guardado:** 09/03/2026 - 17:00h  
📌 **Próxima sesión:** Día 13 - SharedPreferences

---

# 🎯 DÍA 13 - SharedPreferences

**Fecha:** 11 de Marzo 2026  
**Duración:** 2-3 horas  
**Objetivos:** Dominar la persistencia de datos simples con SharedPreferences

---

## 📖 1. Introducción a SharedPreferences

**SharedPreferences** es un sistema de almacenamiento **clave-valor** para guardar datos simples de forma permanente en el dispositivo.

### ¿Qué es?

- **Sistema de persistencia ligero** para datos pequeños
- Guarda pares **clave-valor** (como un HashMap)
- Los datos **sobreviven** al cierre de la app
- Se almacenan en archivos **XML** internos

### ¿Cuándo usar SharedPreferences?

✅ **SÍ usar para:**

- Configuración de la app (tema, idioma, notificaciones)
- Credenciales de sesión (recordar usuario)
- Preferencias de usuario (primera vez, tutorial completado)
- Datos simples (puntuación máxima, última fecha de uso)
- Flags booleanos (mostrar ayuda, modo oscuro)

❌ **NO usar para:**

- Grandes cantidades de datos → usar **Base de Datos SQLite**
- Datos complejos (objetos, listas) → usar **Archivos JSON o BD**
- Datos sensibles (contraseñas) → usar **EncryptedSharedPreferences**
- Multimedia → usar **Archivos en almacenamiento**

---

## 📖 2. Guardar datos simples

### Proceso básico

```java
// 1️⃣ OBTENER la instancia de SharedPreferences
SharedPreferences prefs = getSharedPreferences("MisPreferencias", MODE_PRIVATE);

// 2️⃣ CREAR el editor
SharedPreferences.Editor editor = prefs.edit();

// 3️⃣ GUARDAR datos (clave-valor)
editor.putString("nombre", "Juan Pérez");
editor.putInt("edad", 25);
editor.putBoolean("esVIP", true);

// 4️⃣ APLICAR cambios
editor.apply();  // ✅ Recomendado (asíncrono)
// o
editor.commit(); // También válido (síncrono, retorna boolean)
```

### Ejemplo completo

```java
public class MainActivity extends AppCompatActivity {
    
    private EditText etNombre;
    private Button btnGuardar;
    private SharedPreferences prefs;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        etNombre = findViewById(R.id.etNombre);
        btnGuardar = findViewById(R.id.btnGuardar);
        
        // Obtener SharedPreferences
        prefs = getSharedPreferences("MisPreferencias", MODE_PRIVATE);
        
        btnGuardar.setOnClickListener(v -> guardarDatos());
    }
    
    private void guardarDatos() {
        String nombre = etNombre.getText().toString();
        
        // Guardar en SharedPreferences
        SharedPreferences.Editor editor = prefs.edit();
        editor.putString("nombre_usuario", nombre);
        editor.putLong("fecha_guardado", System.currentTimeMillis());
        editor.apply();
        
        Toast.makeText(this, "Datos guardados", Toast.LENGTH_SHORT).show();
    }
}
```

---

## 📖 3. Leer datos guardados

```java
// Leer String
String nombre = prefs.getString("nombre_usuario", "Invitado"); // Valor por defecto si no existe

// Leer Int
int puntuacion = prefs.getInt("puntuacion_maxima", 0);

// Leer Boolean
boolean esPrimeraVez = prefs.getBoolean("primera_vez", true);

// Leer Float
float volumen = prefs.getFloat("volumen", 0.5f);

// Leer Long
long timestamp = prefs.getLong("fecha_guardado", 0);
```

### Ejemplo completo

```java
public class MainActivity extends AppCompatActivity {
    
    private TextView tvBienvenida;
    private SharedPreferences prefs;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        tvBienvenida = findViewById(R.id.tvBienvenida);
        prefs = getSharedPreferences("MisPreferencias", MODE_PRIVATE);
        
        cargarDatos();
    }
    
    private void cargarDatos() {
        // Leer datos guardados
        String nombre = prefs.getString("nombre_usuario", "Invitado");
        int visitas = prefs.getInt("contador_visitas", 0);
        
        // Incrementar contador
        SharedPreferences.Editor editor = prefs.edit();
        editor.putInt("contador_visitas", visitas + 1);
        editor.apply();
        
        // Mostrar
        tvBienvenida.setText("Bienvenido " + nombre + "\nVisita #" + (visitas + 1));
    }
}
```

---

## 📖 4. Tipos de datos soportados

SharedPreferences soporta **5 tipos de datos primitivos**:

|Tipo|Método guardar|Método leer|Ejemplo|
|---|---|---|---|
|**String**|`putString()`|`getString()`|`editor.putString("nombre", "Ana")`|
|**int**|`putInt()`|`getInt()`|`editor.putInt("edad", 30)`|
|**boolean**|`putBoolean()`|`getBoolean()`|`editor.putBoolean("activo", true)`|
|**float**|`putFloat()`|`getFloat()`|`editor.putFloat("precio", 19.99f)`|
|**long**|`putLong()`|`getLong()`|`editor.putLong("timestamp", 123456789L)`|

### ⚠️ NO soporta directamente:

- ❌ ArrayList, arrays
- ❌ Objetos personalizados
- ❌ HashMaps

**Solución para datos complejos:**

```java
// Guardar ArrayList como String (con separador)
ArrayList<String> lista = new ArrayList<>(Arrays.asList("Rojo", "Verde", "Azul"));
String listaString = String.join(",", lista);
editor.putString("colores", listaString);
editor.apply();

// Leer ArrayList
String listaString = prefs.getString("colores", "");
ArrayList<String> lista = new ArrayList<>(Arrays.asList(listaString.split(",")));
```

**Mejor opción para objetos:** Convertir a **JSON** con Gson o usar **Base de Datos SQLite**.

---

## 📖 5. Eliminar datos

### Eliminar una clave específica

```java
SharedPreferences.Editor editor = prefs.edit();
editor.remove("nombre_usuario");  // Elimina solo esta clave
editor.apply();
```

### Eliminar TODO

```java
SharedPreferences.Editor editor = prefs.edit();
editor.clear();  // ⚠️ Elimina TODAS las preferencias
editor.apply();
```

### Verificar si existe una clave

```java
if (prefs.contains("nombre_usuario")) {
    String nombre = prefs.getString("nombre_usuario", "");
    // La clave existe
} else {
    // La clave no existe
}
```

### Ejemplo: Cerrar sesión

```java
private void cerrarSesion() {
    SharedPreferences.Editor editor = prefs.edit();
    editor.remove("usuario_logueado");
    editor.remove("token_sesion");
    editor.putBoolean("sesion_activa", false);
    editor.apply();
    
    Toast.makeText(this, "Sesión cerrada", Toast.LENGTH_SHORT).show();
    finish();
}
```

---

## 📖 6. Modos de SharedPreferences

Al obtener SharedPreferences, puedes especificar el **modo de acceso**:

```java
SharedPreferences prefs = getSharedPreferences("nombre", MODO);
```

|Modo|Descripción|¿Usar?|
|---|---|---|
|`MODE_PRIVATE`|Solo esta app puede acceder|✅ **SÍ** (recomendado)|
|`MODE_WORLD_READABLE`|Otras apps pueden leer|❌ **DEPRECADO**|
|`MODE_WORLD_WRITEABLE`|Otras apps pueden escribir|❌ **DEPRECADO**|
|`MODE_MULTI_PROCESS`|Compartir entre procesos|⚠️ Raramente necesario|

**Recomendación:** Usar siempre **`MODE_PRIVATE`**

---

## 📖 7. Casos de uso comunes

### 1. Recordar "Recordar Usuario"

```java
// Al hacer login
private void login(String usuario, String password, boolean recordar) {
    if (credencialesCorrectas(usuario, password)) {
        SharedPreferences.Editor editor = prefs.edit();
        
        if (recordar) {
            editor.putString("usuario_guardado", usuario);
            editor.putBoolean("recordar", true);
        } else {
            editor.remove("usuario_guardado");
            editor.putBoolean("recordar", false);
        }
        
        editor.apply();
        // Ir a MainActivity
    }
}

// Al abrir LoginActivity
@Override
protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_login);
    
    prefs = getSharedPreferences("Login", MODE_PRIVATE);
    
    boolean recordar = prefs.getBoolean("recordar", false);
    if (recordar) {
        String usuario = prefs.getString("usuario_guardado", "");
        etUsuario.setText(usuario);
        cbRecordar.setChecked(true);
    }
}
```

### 2. Primera vez que se abre la app

```java
@Override
protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    
    prefs = getSharedPreferences("App", MODE_PRIVATE);
    boolean esPrimeraVez = prefs.getBoolean("primera_vez", true);
    
    if (esPrimeraVez) {
        // Mostrar tutorial o bienvenida
        mostrarTutorial();
        
        // Marcar como no primera vez
        SharedPreferences.Editor editor = prefs.edit();
        editor.putBoolean("primera_vez", false);
        editor.apply();
    } else {
        // Ir directo a la app
        setContentView(R.layout.activity_main);
    }
}
```

### 3. Configuración de tema

```java
// Guardar tema seleccionado
private void guardarTema(String tema) {
    SharedPreferences.Editor editor = prefs.edit();
    editor.putString("tema_seleccionado", tema);  // "claro", "oscuro", "auto"
    editor.apply();
    aplicarTema(tema);
}

// Cargar tema al iniciar
@Override
protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    
    prefs = getSharedPreferences("Configuracion", MODE_PRIVATE);
    String tema = prefs.getString("tema_seleccionado", "claro");
    aplicarTema(tema);
    
    setContentView(R.layout.activity_main);
}

private void aplicarTema(String tema) {
    if (tema.equals("oscuro")) {
        setTheme(R.style.TemaOscuro);
    } else {
        setTheme(R.style.TemaClaro);
    }
}
```

### 4. Contador de usos

```java
private void incrementarContador() {
    int usos = prefs.getInt("veces_usado", 0);
    
    SharedPreferences.Editor editor = prefs.edit();
    editor.putInt("veces_usado", usos + 1);
    editor.apply();
    
    // Pedir valoración cada 10 usos
    if ((usos + 1) % 10 == 0) {
        pedirValoracion();
    }
}
```

---

## 🎯 EJERCICIO 21: Sistema de Login

Crea una app de **Login con Recordar Usuario** con las siguientes funcionalidades:

**Requisitos:**

1. **LoginActivity** con:
    
    - EditText: Usuario
    - EditText: Contraseña (inputType="textPassword")
    - CheckBox: "Recordar usuario"
    - Button: "Iniciar Sesión"
2. **Validaciones**:
    
    - Usuario y contraseña no vacíos
    - Usuario hardcodeado: "admin"
    - Contraseña hardcodeada: "1234"
3. **Funcionalidad**:
    
    - Si CheckBox marcado → guardar usuario en SharedPreferences
    - Si CheckBox NO marcado → eliminar usuario guardado
    - Al abrir la app, si hay usuario guardado → prellenar el campo
4. **MainActivity**:
    
    - Mostrar "Bienvenido [usuario]"
    - Botón "Cerrar Sesión" → volver a LoginActivity
5. **Control de sesión**:
    
    - Si ya hay sesión activa → ir directo a MainActivity
    - Al cerrar sesión → limpiar SharedPreferences

**Pistas:**

- Usar `getSharedPreferences("Login", MODE_PRIVATE)`
- Guardar: `usuario_guardado`, `recordar`, `sesion_activa`
- Usar `finish()` para cerrar Activities

**Layout sugerido (activity_login.xml):**

```xml
<LinearLayout
    android:orientation="vertical"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:padding="24dp"
    android:gravity="center">

    <TextView
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:text="Iniciar Sesión"
        android:textSize="24sp"
        android:textStyle="bold"
        android:gravity="center"
        android:layout_marginBottom="32dp"/>

    <EditText
        android:id="@+id/etUsuario"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:hint="Usuario"/>

    <EditText
        android:id="@+id/etPassword"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:hint="Contraseña"
        android:inputType="textPassword"/>

    <CheckBox
        android:id="@+id/cbRecordar"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:text="Recordar usuario"/>

    <Button
        android:id="@+id/btnLogin"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:text="Iniciar Sesión"
        android:layout_marginTop="16dp"/>

</LinearLayout>
```

---

## 🎯 EJERCICIO 22: Configuración de App

Crea una app de **Configuración** que persista todas las preferencias del usuario:

**Requisitos:**

1. **Pantalla de Configuración** con:
    
    - EditText: Nombre de usuario
    - Spinner: Tema (Claro, Oscuro, Automático)
    - Spinner: Idioma (Español, English, Français)
    - CheckBox: Notificaciones activadas
    - CheckBox: Sonido activado
    - SeekBar: Tamaño de fuente (10-30)
    - Button: "Guardar Configuración"
    - Button: "Restablecer por Defecto"
2. **Funcionalidad**:
    
    - Al abrir la app → cargar configuración guardada
    - Al pulsar "Guardar" → persistir en SharedPreferences
    - Al pulsar "Restablecer" → volver a valores por defecto
3. **TextView dinámico**:
    
    - Mostrar resumen de configuración actual
    - Actualizar al cambiar cualquier opción
4. **Aplicar configuración**:
    
    - Cambiar tamaño de fuente de TextView según SeekBar
    - Mostrar Toast con tema seleccionado al guardar

**Valores por defecto:**

```java
String nombreDefault = "Usuario";
String temaDefault = "Claro";
String idiomaDefault = "Español";
boolean notificacionesDefault = true;
boolean sonidoDefault = true;
int fuenteDefault = 16;
```

**Layout sugerido:**

```xml
<ScrollView
    android:layout_width="match_parent"
    android:layout_height="match_parent">

    <LinearLayout
        android:orientation="vertical"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:padding="16dp">

        <TextView
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:text="Configuración"
            android:textSize="24sp"
            android:textStyle="bold"
            android:gravity="center"
            android:layout_marginBottom="24dp"/>

        <!-- Resumen de configuración -->
        <TextView
            android:id="@+id/tvResumen"
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:background="#f0f0f0"
            android:padding="12dp"
            android:layout_marginBottom="16dp"/>

        <!-- Nombre -->
        <TextView
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:text="Nombre de Usuario"
            android:textStyle="bold"/>

        <EditText
            android:id="@+id/etNombre"
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:hint="Escribe tu nombre"/>

        <!-- Tema -->
        <TextView
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:text="Tema"
            android:textStyle="bold"
            android:layout_marginTop="16dp"/>

        <Spinner
            android:id="@+id/spinnerTema"
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:entries="@array/temas"/>

        <!-- Idioma -->
        <TextView
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:text="Idioma"
            android:textStyle="bold"
            android:layout_marginTop="16dp"/>

        <Spinner
            android:id="@+id/spinnerIdioma"
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:entries="@array/idiomas"/>

        <!-- Notificaciones -->
        <CheckBox
            android:id="@+id/cbNotificaciones"
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:text="Activar notificaciones"
            android:layout_marginTop="16dp"/>

        <!-- Sonido -->
        <CheckBox
            android:id="@+id/cbSonido"
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:text="Activar sonido"/>

        <!-- Tamaño de fuente -->
        <TextView
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:text="Tamaño de Fuente"
            android:textStyle="bold"
            android:layout_marginTop="16dp"/>

        <LinearLayout
            android:orientation="horizontal"
            android:layout_width="match_parent"
            android:layout_height="wrap_content">

            <SeekBar
                android:id="@+id/seekBarFuente"
                android:layout_width="0dp"
                android:layout_height="wrap_content"
                android:layout_weight="1"
                android:max="20"
                android:progress="6"/>

            <TextView
                android:id="@+id/tvTamanoFuente"
                android:layout_width="wrap_content"
                android:layout_height="wrap_content"
                android:text="16"
                android:layout_marginStart="8dp"/>

        </LinearLayout>

        <!-- Botones -->
        <Button
            android:id="@+id/btnGuardar"
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:text="Guardar Configuración"
            android:layout_marginTop="24dp"/>

        <Button
            android:id="@+id/btnRestablecer"
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:text="Restablecer por Defecto"
            android:backgroundTint="#ff9800"/>

    </LinearLayout>
</ScrollView>
```

**res/values/arrays.xml:**

```xml
<?xml version="1.0" encoding="utf-8"?>
<resources>
    <string-array name="temas">
        <item>Claro</item>
        <item>Oscuro</item>
        <item>Automático</item>
    </string-array>
    
    <string-array name="idiomas">
        <item>Español</item>
        <item>English</item>
        <item>Français</item>
    </string-array>
</resources>
```

---

## 📝 CHECKLIST DÍA 13

- [ ] Entiendes qué es SharedPreferences y cuándo usarlo
- [ ] Sabes guardar datos con `editor.putXXX()`
- [ ] Sabes leer datos con `prefs.getXXX()`
- [ ] Conoces los 5 tipos de datos soportados
- [ ] Sabes eliminar datos con `remove()` y `clear()`
- [ ] Entiendes la diferencia entre `apply()` y `commit()`
- [ ] Has completado Ejercicio 21
- [ ] Has completado Ejercicio 22

---

## 🎓 CONCEPTOS CLAVE DEL DÍA 13

|Concepto|Definición|
|---|---|
|**SharedPreferences**|Sistema de almacenamiento clave-valor persistente|
|**getSharedPreferences()**|Obtener instancia de SharedPreferences|
|**Editor**|Objeto para modificar SharedPreferences|
|**putString/Int/Boolean()**|Guardar datos (String, int, boolean, float, long)|
|**getString/Int/Boolean()**|Leer datos (con valor por defecto)|
|**apply()**|Guardar cambios de forma asíncrona (recomendado)|
|**commit()**|Guardar cambios de forma síncrona (retorna boolean)|
|**remove()**|Eliminar una clave específica|
|**clear()**|Eliminar TODAS las preferencias|
|**contains()**|Verificar si existe una clave|
|**MODE_PRIVATE**|Modo de acceso privado (recomendado)|

---

## 🔍 ERRORES COMUNES

```java
// ❌ ERROR 1: Olvidar apply() o commit()
SharedPreferences.Editor editor = prefs.edit();
editor.putString("nombre", "Ana");
// ❌ No se guardó nada porque falta apply()

// ✅ CORRECTO:
editor.putString("nombre", "Ana");
editor.apply();

// ❌ ERROR 2: No proporcionar valor por defecto
String nombre = prefs.getString("nombre");  // ❌ Error de compilación

// ✅ CORRECTO:
String nombre = prefs.getString("nombre", "Invitado");

// ❌ ERROR 3: Guardar objetos directamente
Usuario usuario = new Usuario("Ana", 25);
editor.putString("usuario", usuario);  // ❌ Error

// ✅ CORRECTO: Guardar por partes o convertir a JSON
editor.putString("usuario_nombre", usuario.getNombre());
editor.putInt("usuario_edad", usuario.getEdad());

// ❌ ERROR 4: Usar getDefaultSharedPreferences vs getSharedPreferences
SharedPreferences prefs1 = PreferenceManager.getDefaultSharedPreferences(this);
SharedPreferences prefs2 = getSharedPreferences("MisPrefs", MODE_PRIVATE);
// Son archivos XML diferentes → no comparten datos

// ❌ ERROR 5: No usar MODE_PRIVATE
SharedPreferences prefs = getSharedPreferences("datos", 0);  // ❌ Poco claro
// ✅ CORRECTO:
SharedPreferences prefs = getSharedPreferences("datos", MODE_PRIVATE);
```

---

## 💡 CONSEJOS PROFESIONALES

1. **Usa nombres descriptivos para claves** → `"usuario_email"` mejor que `"ue"`
    
2. **Centraliza los nombres de claves** → evita errores de tipeo
    
    ```java
    public class PrefsKeys {
        public static final String NOMBRE_USUARIO = "nombre_usuario";
        public static final String TEMA = "tema_seleccionado";
    }
    ```
    
3. **apply() vs commit()**:
    
    - `apply()` → Asíncrono, no bloquea, **recomendado**
    - `commit()` → Síncrono, retorna true/false, usar solo si necesitas confirmación
4. **Para datos sensibles** → usar `EncryptedSharedPreferences` (AndroidX Security)
    
5. **Organiza por contexto**:
    
    ```java
    // Login
    SharedPreferences loginPrefs = getSharedPreferences("Login", MODE_PRIVATE);
    
    // Configuración
    SharedPreferences configPrefs = getSharedPreferences("Config", MODE_PRIVATE);
    ```
    
6. **Valores por defecto coherentes**:
    
    ```java
    boolean esVIP = prefs.getBoolean("es_vip", false);  // ✅ false por defecto
    int puntos = prefs.getInt("puntos", 0);  // ✅ 0 por defecto
    ```
    
7. **Documenta tus preferencias** → comenta qué guarda cada clave
    

---

## 🌟 COMPARATIVA: apply() vs commit()

|Característica|apply()|commit()|
|---|---|---|
|**Ejecución**|Asíncrona (en segundo plano)|Síncrona (bloquea hasta guardar)|
|**Retorno**|void|boolean (éxito/fallo)|
|**Rendimiento**|✅ Más rápido|⚠️ Puede ralentizar|
|**Cuándo usar**|99% de los casos|Solo si necesitas saber si falló|

```java
// Uso típico: apply()
editor.putString("nombre", "Ana");
editor.apply();  // ✅ Guarda en segundo plano

// Uso especial: commit() cuando necesitas confirmación
if (editor.commit()) {
    Toast.makeText(this, "Guardado correctamente", Toast.LENGTH_SHORT).show();
} else {
    Toast.makeText(this, "Error al guardar", Toast.LENGTH_SHORT).show();
}
```

---

[🔝 Volver al índice](#-%C3%ADndice-general)

---

📌 **Guardado:** 11/03/2026 - 18:00h  
📌 **Próxima sesión:** Día 14 - Ficheros Internos

---

# 🎯 DÍA 14 - Ficheros Internos

**Fecha:** 13 de Marzo 2026  
**Duración:** 2-3 horas  
**Objetivos:** Dominar la lectura y escritura de archivos en almacenamiento interno

---

## 📖 1. Introducción a Ficheros Internos

Los **ficheros internos** permiten guardar datos más complejos que SharedPreferences en el almacenamiento privado de la app.

### ¿Qué son?

- Archivos guardados en el **almacenamiento interno** del dispositivo
- Ubicación: `/data/data/[paquete.app]/files/`
- **Privados** por defecto (solo la app puede acceder)
- Se eliminan al desinstalar la app
- Útiles para guardar texto, JSON, logs, caches

### ¿Cuándo usar Ficheros Internos?

✅ **SÍ usar para:**

- Guardar texto largo (notas, documentos)
- Datos estructurados en JSON
- Logs de la aplicación
- Caché de datos descargados
- Archivos temporales
- Listas grandes de datos

❌ **NO usar para:**

- Datos clave-valor simples → usar **SharedPreferences**
- Datos relacionales complejos → usar **SQLite**
- Archivos multimedia grandes → usar **almacenamiento externo**
- Datos que el usuario debe ver → usar **almacenamiento externo**

### Comparativa: SharedPreferences vs Ficheros Internos

|Característica|SharedPreferences|Ficheros Internos|
|---|---|---|
|**Estructura**|Clave-valor (XML)|Cualquier formato (TXT, JSON)|
|**Tamaño**|Datos pequeños|Datos medianos/grandes|
|**Complejidad**|Datos simples|Datos complejos|
|**Lectura**|Muy rápida|Depende del tamaño|
|**Uso típico**|Configuración|Documentos, logs, JSON|

---

## 📖 2. Escribir en fichero interno

### Sintaxis básica

```java
String nombreFichero = "datos.txt";
String contenido = "Hola desde Android";

try {
    FileOutputStream fos = openFileOutput(nombreFichero, MODE_PRIVATE);
    fos.write(contenido.getBytes());
    fos.close();
    Toast.makeText(this, "Archivo guardado", Toast.LENGTH_SHORT).show();
} catch (IOException e) {
    e.printStackTrace();
    Toast.makeText(this, "Error al guardar", Toast.LENGTH_SHORT).show();
}
```

### Ejemplo completo

```java
public class MainActivity extends AppCompatActivity {
    
    private EditText etContenido;
    private Button btnGuardar;
    private static final String NOMBRE_ARCHIVO = "notas.txt";
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        etContenido = findViewById(R.id.etContenido);
        btnGuardar = findViewById(R.id.btnGuardar);
        
        btnGuardar.setOnClickListener(v -> guardarArchivo());
    }
    
    private void guardarArchivo() {
        String contenido = etContenido.getText().toString();
        
        if (contenido.isEmpty()) {
            Toast.makeText(this, "Escribe algo primero", Toast.LENGTH_SHORT).show();
            return;
        }
        
        try {
            FileOutputStream fos = openFileOutput(NOMBRE_ARCHIVO, MODE_PRIVATE);
            fos.write(contenido.getBytes());
            fos.close();
            
            Toast.makeText(this, "✅ Guardado correctamente", Toast.LENGTH_SHORT).show();
        } catch (IOException e) {
            e.printStackTrace();
            Toast.makeText(this, "❌ Error al guardar", Toast.LENGTH_SHORT).show();
        }
    }
}
```

---

## 📖 3. Leer desde fichero interno

### Sintaxis básica

```java
String nombreFichero = "datos.txt";

try {
    FileInputStream fis = openFileInput(nombreFichero);
    InputStreamReader isr = new InputStreamReader(fis);
    BufferedReader br = new BufferedReader(isr);
    
    StringBuilder contenido = new StringBuilder();
    String linea;
    
    while ((linea = br.readLine()) != null) {
        contenido.append(linea).append("\n");
    }
    
    br.close();
    
    String textoLeido = contenido.toString();
    Toast.makeText(this, textoLeido, Toast.LENGTH_SHORT).show();
    
} catch (IOException e) {
    e.printStackTrace();
    Toast.makeText(this, "Error al leer", Toast.LENGTH_SHORT).show();
}
```

### Ejemplo completo con validación

```java
private void cargarArchivo() {
    // Verificar si el archivo existe
    File archivo = new File(getFilesDir(), NOMBRE_ARCHIVO);
    
    if (!archivo.exists()) {
        Toast.makeText(this, "No hay datos guardados", Toast.LENGTH_SHORT).show();
        return;
    }
    
    try {
        FileInputStream fis = openFileInput(NOMBRE_ARCHIVO);
        InputStreamReader isr = new InputStreamReader(fis);
        BufferedReader br = new BufferedReader(isr);
        
        StringBuilder contenido = new StringBuilder();
        String linea;
        
        while ((linea = br.readLine()) != null) {
            contenido.append(linea).append("\n");
        }
        
        br.close();
        
        etContenido.setText(contenido.toString());
        Toast.makeText(this, "✅ Cargado correctamente", Toast.LENGTH_SHORT).show();
        
    } catch (IOException e) {
        e.printStackTrace();
        Toast.makeText(this, "❌ Error al cargar", Toast.LENGTH_SHORT).show();
    }
}
```

---

## 📖 4. Listar ficheros internos

```java
private void listarArchivos() {
    File directorio = getFilesDir();
    File[] archivos = directorio.listFiles();
    
    if (archivos == null || archivos.length == 0) {
        Toast.makeText(this, "No hay archivos", Toast.LENGTH_SHORT).show();
        return;
    }
    
    StringBuilder lista = new StringBuilder("Archivos guardados:\n\n");
    
    for (File archivo : archivos) {
        String nombre = archivo.getName();
        long tamano = archivo.length();  // en bytes
        String tamanoKB = String.format("%.2f KB", tamano / 1024.0);
        
        lista.append("📄 ").append(nombre)
             .append(" (").append(tamanoKB).append(")")
             .append("\n");
    }
    
    new AlertDialog.Builder(this)
        .setTitle("Archivos Internos")
        .setMessage(lista.toString())
        .setPositiveButton("OK", null)
        .show();
}
```

### Obtener información de un archivo

```java
private void mostrarInfoArchivo(String nombreArchivo) {
    File archivo = new File(getFilesDir(), nombreArchivo);
    
    if (!archivo.exists()) {
        Toast.makeText(this, "El archivo no existe", Toast.LENGTH_SHORT).show();
        return;
    }
    
    String nombre = archivo.getName();
    long tamanoBytes = archivo.length();
    String tamanoKB = String.format("%.2f KB", tamanoBytes / 1024.0);
    long ultimaModificacion = archivo.lastModified();
    
    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss", Locale.getDefault());
    String fecha = sdf.format(new Date(ultimaModificacion));
    
    String info = "Nombre: " + nombre + "\n" +
                  "Tamaño: " + tamanoKB + "\n" +
                  "Última modificación: " + fecha;
    
    new AlertDialog.Builder(this)
        .setTitle("Información del Archivo")
        .setMessage(info)
        .setPositiveButton("OK", null)
        .show();
}
```

---

## 📖 5. Eliminar ficheros internos

### Eliminar un archivo específico

```java
private void eliminarArchivo(String nombreArchivo) {
    File archivo = new File(getFilesDir(), nombreArchivo);
    
    if (!archivo.exists()) {
        Toast.makeText(this, "El archivo no existe", Toast.LENGTH_SHORT).show();
        return;
    }
    
    if (archivo.delete()) {
        Toast.makeText(this, "✅ Archivo eliminado", Toast.LENGTH_SHORT).show();
    } else {
        Toast.makeText(this, "❌ Error al eliminar", Toast.LENGTH_SHORT).show();
    }
}
```

### Eliminar con confirmación

```java
private void confirmarEliminar(String nombreArchivo) {
    new AlertDialog.Builder(this)
        .setTitle("Confirmar Eliminación")
        .setMessage("¿Estás seguro de eliminar '" + nombreArchivo + "'?")
        .setPositiveButton("Sí, eliminar", (dialog, which) -> {
            deleteFile(nombreArchivo);  // Método directo de Context
            Toast.makeText(this, "Archivo eliminado", Toast.LENGTH_SHORT).show();
        })
        .setNegativeButton("Cancelar", null)
        .setIcon(android.R.drawable.ic_dialog_alert)
        .show();
}
```

### Eliminar todos los archivos

```java
private void eliminarTodosLosArchivos() {
    new AlertDialog.Builder(this)
        .setTitle("⚠️ Eliminar TODO")
        .setMessage("¿Estás seguro de eliminar todos los archivos?")
        .setPositiveButton("Sí, eliminar todo", (dialog, which) -> {
            File directorio = getFilesDir();
            File[] archivos = directorio.listFiles();
            
            if (archivos != null) {
                int contador = 0;
                for (File archivo : archivos) {
                    if (archivo.delete()) {
                        contador++;
                    }
                }
                Toast.makeText(this, contador + " archivos eliminados", Toast.LENGTH_SHORT).show();
            }
        })
        .setNegativeButton("Cancelar", null)
        .show();
}
```

---

## 📖 6. Modos de apertura

Al usar `openFileOutput()`, puedes especificar el **modo de escritura**:

```java
FileOutputStream fos = openFileOutput(nombreArchivo, MODO);
```

|Modo|Descripción|Uso|
|---|---|---|
|`MODE_PRIVATE`|Sobrescribe el archivo existente|✅ Por defecto|
|`MODE_APPEND`|Añade al final del archivo|✅ Para logs|
|`MODE_WORLD_READABLE`|Otras apps pueden leer|❌ DEPRECADO|
|`MODE_WORLD_WRITEABLE`|Otras apps pueden escribir|❌ DEPRECADO|

### Ejemplo: Sobrescribir vs Añadir

```java
// SOBRESCRIBIR (borra contenido anterior)
private void sobrescribirArchivo(String contenido) {
    try {
        FileOutputStream fos = openFileOutput("datos.txt", MODE_PRIVATE);
        fos.write(contenido.getBytes());
        fos.close();
    } catch (IOException e) {
        e.printStackTrace();
    }
}

// AÑADIR al final (mantiene contenido anterior)
private void anadirAlArchivo(String contenido) {
    try {
        FileOutputStream fos = openFileOutput("log.txt", MODE_APPEND);
        
        // Añadir timestamp
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss", Locale.getDefault());
        String timestamp = sdf.format(new Date());
        String linea = "[" + timestamp + "] " + contenido + "\n";
        
        fos.write(linea.getBytes());
        fos.close();
    } catch (IOException e) {
        e.printStackTrace();
    }
}
```

---

## 📖 7. Trabajar con JSON

### Guardar ArrayList como JSON

```java
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

private void guardarListaComoJSON(ArrayList<String> tareas) {
    try {
        // Crear JSONArray
        JSONArray jsonArray = new JSONArray();
        for (String tarea : tareas) {
            jsonArray.put(tarea);
        }
        
        // Crear JSONObject contenedor
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("tareas", jsonArray);
        jsonObject.put("total", tareas.size());
        jsonObject.put("fecha", System.currentTimeMillis());
        
        // Guardar en archivo
        String jsonString = jsonObject.toString(2);  // Identado con 2 espacios
        
        FileOutputStream fos = openFileOutput("tareas.json", MODE_PRIVATE);
        fos.write(jsonString.getBytes());
        fos.close();
        
        Toast.makeText(this, "JSON guardado", Toast.LENGTH_SHORT).show();
        
    } catch (JSONException | IOException e) {
        e.printStackTrace();
        Toast.makeText(this, "Error al guardar JSON", Toast.LENGTH_SHORT).show();
    }
}
```

### Leer ArrayList desde JSON

```java
private ArrayList<String> cargarListaDesdeJSON() {
    ArrayList<String> tareas = new ArrayList<>();
    
    File archivo = new File(getFilesDir(), "tareas.json");
    if (!archivo.exists()) {
        return tareas;
    }
    
    try {
        // Leer archivo completo
        FileInputStream fis = openFileInput("tareas.json");
        InputStreamReader isr = new InputStreamReader(fis);
        BufferedReader br = new BufferedReader(isr);
        
        StringBuilder jsonString = new StringBuilder();
        String linea;
        while ((linea = br.readLine()) != null) {
            jsonString.append(linea);
        }
        br.close();
        
        // Parsear JSON
        JSONObject jsonObject = new JSONObject(jsonString.toString());
        JSONArray jsonArray = jsonObject.getJSONArray("tareas");
        
        // Convertir a ArrayList
        for (int i = 0; i < jsonArray.length(); i++) {
            tareas.add(jsonArray.getString(i));
        }
        
        Toast.makeText(this, "JSON cargado: " + tareas.size() + " tareas", Toast.LENGTH_SHORT).show();
        
    } catch (IOException | JSONException e) {
        e.printStackTrace();
        Toast.makeText(this, "Error al cargar JSON", Toast.LENGTH_SHORT).show();
    }
    
    return tareas;
}
```

### Ejemplo: Guardar objetos personalizados

```java
// Clase Nota
public class Nota {
    private String titulo;
    private String contenido;
    private long fecha;
    
    // Constructor, getters y setters
    
    // Convertir a JSON
    public JSONObject toJSON() throws JSONException {
        JSONObject json = new JSONObject();
        json.put("titulo", titulo);
        json.put("contenido", contenido);
        json.put("fecha", fecha);
        return json;
    }
    
    // Crear desde JSON
    public static Nota fromJSON(JSONObject json) throws JSONException {
        Nota nota = new Nota();
        nota.titulo = json.getString("titulo");
        nota.contenido = json.getString("contenido");
        nota.fecha = json.getLong("fecha");
        return nota;
    }
}

// Guardar lista de notas
private void guardarNotas(ArrayList<Nota> notas) {
    try {
        JSONArray jsonArray = new JSONArray();
        
        for (Nota nota : notas) {
            jsonArray.put(nota.toJSON());
        }
        
        FileOutputStream fos = openFileOutput("notas.json", MODE_PRIVATE);
        fos.write(jsonArray.toString(2).getBytes());
        fos.close();
        
    } catch (JSONException | IOException e) {
        e.printStackTrace();
    }
}

// Cargar lista de notas
private ArrayList<Nota> cargarNotas() {
    ArrayList<Nota> notas = new ArrayList<>();
    
    try {
        FileInputStream fis = openFileInput("notas.json");
        InputStreamReader isr = new InputStreamReader(fis);
        BufferedReader br = new BufferedReader(isr);
        
        StringBuilder jsonString = new StringBuilder();
        String linea;
        while ((linea = br.readLine()) != null) {
            jsonString.append(linea);
        }
        br.close();
        
        JSONArray jsonArray = new JSONArray(jsonString.toString());
        
        for (int i = 0; i < jsonArray.length(); i++) {
            JSONObject jsonObject = jsonArray.getJSONObject(i);
            notas.add(Nota.fromJSON(jsonObject));
        }
        
    } catch (IOException | JSONException e) {
        e.printStackTrace();
    }
    
    return notas;
}
```

---

## 🎯 EJERCICIO 23: Bloc de Notas

Crea una app de **Bloc de Notas** con persistencia en ficheros internos:

**Requisitos:**

1. **MainActivity** con:
    
    - ListView mostrando lista de notas (solo títulos)
    - FloatingActionButton "+" para crear nueva nota
    - Click en nota → abrir NoteActivity para editar
2. **NoteActivity** con:
    
    - EditText: Título
    - EditText: Contenido (multilinea)
    - Button: "Guardar"
    - Button: "Eliminar" (solo si es nota existente)
3. **Persistencia**:
    
    - Cada nota se guarda en un archivo separado: `nota_[timestamp].txt`
    - Formato del archivo:
        
        ```
        TITULO:::Título de la notaCONTENIDO:::Contenido de la notaFECHA:::1234567890
        ```
        
4. **Funcionalidades**:
    
    - Crear nueva nota
    - Editar nota existente
    - Eliminar nota (con confirmación)
    - Listar todas las notas
    - Mostrar fecha de última modificación

**Pistas:**

- Usa `System.currentTimeMillis()` como ID único
- Para listar notas, usa `getFilesDir().listFiles()`
- Parsea el contenido línea por línea buscando ":::"
- Ordena las notas por fecha (más recientes primero)

**Layout sugerido (activity_main.xml):**

```xml
<androidx.coordinatorlayout.widget.CoordinatorLayout
    android:layout_width="match_parent"
    android:layout_height="match_parent">

    <LinearLayout
        android:orientation="vertical"
        android:layout_width="match_parent"
        android:layout_height="match_parent">

        <TextView
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:text="Mis Notas"
            android:textSize="24sp"
            android:textStyle="bold"
            android:padding="16dp"
            android:gravity="center"/>

        <ListView
            android:id="@+id/listViewNotas"
            android:layout_width="match_parent"
            android:layout_height="match_parent"/>

    </LinearLayout>

    <com.google.android.material.floatingactionbutton.FloatingActionButton
        android:id="@+id/fabNuevaNota"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_gravity="bottom|end"
        android:layout_margin="16dp"
        android:src="@android:drawable/ic_input_add"/>

</androidx.coordinatorlayout.widget.CoordinatorLayout>
```

**Layout sugerido (activity_note.xml):**

```xml
<LinearLayout
    android:orientation="vertical"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:padding="16dp">

    <EditText
        android:id="@+id/etTitulo"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:hint="Título"
        android:textSize="20sp"
        android:textStyle="bold"/>

    <EditText
        android:id="@+id/etContenido"
        android:layout_width="match_parent"
        android:layout_height="0dp"
        android:layout_weight="1"
        android:hint="Escribe aquí..."
        android:gravity="top"
        android:inputType="textMultiLine"
        android:layout_marginTop="8dp"/>

    <LinearLayout
        android:orientation="horizontal"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:layout_marginTop="16dp">

        <Button
            android:id="@+id/btnGuardar"
            android:layout_width="0dp"
            android:layout_height="wrap_content"
            android:layout_weight="1"
            android:text="Guardar"
            android:layout_marginEnd="8dp"/>

        <Button
            android:id="@+id/btnEliminar"
            android:layout_width="0dp"
            android:layout_height="wrap_content"
            android:layout_weight="1"
            android:text="Eliminar"
            android:backgroundTint="#d32f2f"
            android:textColor="#ffffff"/>

    </LinearLayout>

</LinearLayout>
```

---

## 🎯 EJERCICIO 24: Historial de Búsquedas

Crea una app de **Historial de Búsquedas** que guarde todas las búsquedas en un archivo JSON:

**Requisitos:**

1. **Interfaz**:
    
    - EditText: Campo de búsqueda
    - Button: "Buscar"
    - ListView: Historial de búsquedas (más recientes primero)
    - Button: "Limpiar Historial"
2. **Funcionalidad**:
    
    - Al buscar → guardar en historial con timestamp
    - Mostrar fecha/hora de cada búsqueda
    - Click en búsqueda → reutilizar en el campo
    - Long click → eliminar esa búsqueda
    - Límite de 50 búsquedas (eliminar las más antiguas)
3. **Persistencia JSON**:
    
    - Archivo: `historial.json`
    - Estructura:
        
        ```json
        [  {    "texto": "Android Studio",    "fecha": 1234567890,    "resultados": 0  },  {    "texto": "Java tutorial",    "fecha": 1234567891,    "resultados": 0  }]
        ```
        
4. **Extras**:
    
    - No repetir búsquedas (si ya existe, actualizar timestamp)
    - Mostrar contador de veces buscado
    - Exportar historial a archivo TXT legible

**Clase sugerida:**

```java
public class Busqueda {
    private String texto;
    private long fecha;
    private int vecesRepetida;
    
    public Busqueda(String texto, long fecha) {
        this.texto = texto;
        this.fecha = fecha;
        this.vecesRepetida = 1;
    }
    
    // Convertir a JSON
    public JSONObject toJSON() throws JSONException {
        JSONObject json = new JSONObject();
        json.put("texto", texto);
        json.put("fecha", fecha);
        json.put("veces", vecesRepetida);
        return json;
    }
    
    // Crear desde JSON
    public static Busqueda fromJSON(JSONObject json) throws JSONException {
        Busqueda b = new Busqueda(
            json.getString("texto"),
            json.getLong("fecha")
        );
        b.vecesRepetida = json.getInt("veces");
        return b;
    }
    
    // Getters y setters
}
```

**Layout sugerido:**

```xml
<LinearLayout
    android:orientation="vertical"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:padding="16dp">

    <TextView
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:text="Historial de Búsquedas"
        android:textSize="24sp"
        android:textStyle="bold"
        android:gravity="center"
        android:layout_marginBottom="16dp"/>

    <LinearLayout
        android:orientation="horizontal"
        android:layout_width="match_parent"
        android:layout_height="wrap_content">

        <EditText
            android:id="@+id/etBusqueda"
            android:layout_width="0dp"
            android:layout_height="wrap_content"
            android:layout_weight="1"
            android:hint="Buscar..."/>

        <Button
            android:id="@+id/btnBuscar"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:text="🔍"/>

    </LinearLayout>

    <TextView
        android:id="@+id/tvContador"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:text="0 búsquedas guardadas"
        android:textSize="12sp"
        android:layout_marginTop="8dp"/>

    <ListView
        android:id="@+id/listViewHistorial"
        android:layout_width="match_parent"
        android:layout_height="0dp"
        android:layout_weight="1"
        android:layout_marginTop="16dp"/>

    <LinearLayout
        android:orientation="horizontal"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:layout_marginTop="8dp">

        <Button
            android:id="@+id/btnLimpiar"
            android:layout_width="0dp"
            android:layout_height="wrap_content"
            android:layout_weight="1"
            android:text="Limpiar Historial"
            android:backgroundTint="#d32f2f"
            android:textColor="#ffffff"
            android:layout_marginEnd="8dp"/>

        <Button
            android:id="@+id/btnExportar"
            android:layout_width="0dp"
            android:layout_height="wrap_content"
            android:layout_weight="1"
            android:text="Exportar TXT"/>

    </LinearLayout>

</LinearLayout>
```

---

## 📝 CHECKLIST DÍA 14

- [ ] Entiendes la diferencia entre SharedPreferences y Ficheros Internos
- [ ] Sabes escribir en archivos con `openFileOutput()`
- [ ] Sabes leer archivos con `openFileInput()`
- [ ] Puedes listar archivos con `getFilesDir().listFiles()`
- [ ] Sabes eliminar archivos con `deleteFile()` o `file.delete()`
- [ ] Entiendes MODE_PRIVATE vs MODE_APPEND
- [ ] Puedes trabajar con JSON (JSONObject, JSONArray)
- [ ] Has completado Ejercicio 23
- [ ] Has completado Ejercicio 24

---

## 🎓 CONCEPTOS CLAVE DEL DÍA 14

|Concepto|Definición|
|---|---|
|**Ficheros Internos**|Archivos privados en `/data/data/[app]/files/`|
|**openFileOutput()**|Crear/escribir archivo interno|
|**openFileInput()**|Leer archivo interno|
|**FileOutputStream**|Stream para escritura de bytes|
|**FileInputStream**|Stream para lectura de bytes|
|**BufferedReader**|Lector eficiente línea por línea|
|**MODE_PRIVATE**|Sobrescribir archivo|
|**MODE_APPEND**|Añadir al final del archivo|
|**getFilesDir()**|Directorio de archivos internos|
|**deleteFile()**|Eliminar archivo interno|
|**JSONObject**|Objeto JSON (clave-valor)|
|**JSONArray**|Array JSON (lista ordenada)|

---

## 🔍 ERRORES COMUNES

```java
// ❌ ERROR 1: No cerrar streams
FileOutputStream fos = openFileOutput("datos.txt", MODE_PRIVATE);
fos.write(contenido.getBytes());
// ❌ Falta: fos.close();

// ✅ CORRECTO: Siempre cerrar
try {
    fos.write(contenido.getBytes());
    fos.close();  // ✅
} catch (IOException e) {
    e.printStackTrace();
}

// ❌ ERROR 2: No verificar si existe
FileInputStream fis = openFileInput("datos.txt");  // ❌ Puede lanzar excepción

// ✅ CORRECTO: Verificar primero
File archivo = new File(getFilesDir(), "datos.txt");
if (archivo.exists()) {
    FileInputStream fis = openFileInput("datos.txt");
}

// ❌ ERROR 3: Confundir rutas
File archivo = new File("/data/data/com.app/files/datos.txt");  // ❌ Hardcodeado

// ✅ CORRECTO: Usar getFilesDir()
File archivo = new File(getFilesDir(), "datos.txt");

// ❌ ERROR 4: No manejar IOException
FileOutputStream fos = openFileOutput("datos.txt", MODE_PRIVATE);  // ❌ Error compilación

// ✅ CORRECTO: try-catch obligatorio
try {
    FileOutputStream fos = openFileOutput("datos.txt", MODE_PRIVATE);
} catch (IOException e) {
    e.printStackTrace();
}

// ❌ ERROR 5: Sobrescribir cuando querías añadir
openFileOutput("log.txt", MODE_PRIVATE);  // ❌ Borra el log anterior

// ✅ CORRECTO: MODE_APPEND para logs
openFileOutput("log.txt", MODE_APPEND);  // ✅ Añade al final
```

---

## 💡 CONSEJOS PROFESIONALES

1. **Siempre usa try-catch** → FileOperations lanzan IOException
    
2. **Cierra streams** → Usa try-with-resources (Java 7+):
    
    ```java
    try (FileOutputStream fos = openFileOutput("datos.txt", MODE_PRIVATE)) {
        fos.write(contenido.getBytes());
    } catch (IOException e) {
        e.printStackTrace();
    }
    // Se cierra automáticamente
    ```
    
3. **Nombres de archivo consistentes** → Define constantes:
    
    ```java
    private static final String ARCHIVO_NOTAS = "notas.json";
    private static final String ARCHIVO_CONFIG = "config.txt";
    ```
    
4. **Para logs** → Usa MODE_APPEND con timestamp:
    
    ```java
    String log = "[" + new Date() + "] " + mensaje + "\n";
    fos.write(log.getBytes());
    ```
    
5. **JSON indentado** → Más legible:
    
    ```java
    jsonObject.toString(2);  // 2 espacios de indentación
    ```
    
6. **Verificar espacio disponible**:
    
    ```java
    File directorio = getFilesDir();
    long espacioLibre = directorio.getFreeSpace();
    ```
    
7. **Gestión de errores clara**:
    
    ```java
    try {
        // Código
    } catch (FileNotFoundException e) {
        Toast.makeText(this, "Archivo no encontrado", Toast.LENGTH_SHORT).show();
    } catch (IOException e) {
        Toast.makeText(this, "Error de lectura/escritura", Toast.LENGTH_SHORT).show();
    }
    ```
    

---

## 🌟 COMPARATIVA: SharedPreferences vs Ficheros vs SQLite

|Característica|SharedPreferences|Ficheros Internos|SQLite|
|---|---|---|---|
|**Estructura**|Clave-valor|Texto/JSON libre|Tablas relacionales|
|**Complejidad**|⭐ Muy simple|⭐⭐ Moderada|⭐⭐⭐ Compleja|
|**Tamaño ideal**|< 1 KB|1 KB - 10 MB|> 10 MB|
|**Velocidad lectura**|⚡⚡⚡ Muy rápido|⚡⚡ Moderado|⚡ Lento (pero optimizable)|
|**Consultas**|❌ No soporta|❌ Leer todo|✅ SQL avanzado|
|**Uso típico**|Config, flags|Documentos, logs|Bases de datos|

---

[🔝 Volver al índice](#-%C3%ADndice-general)

---

📌 **Guardado:** 13/03/2026 - 17:30h  
📌 **Próxima sesión:** Día 15 - Ficheros Externos

---

# 🎯 DÍA 15 - Ficheros Externos

**Fecha:** 16 de Marzo 2026  
**Duración:** 2-3 horas  
**Objetivos:** Dominar el almacenamiento externo y gestión de permisos

---

## 📖 1. Introducción a Ficheros Externos

El **almacenamiento externo** permite guardar archivos accesibles por el usuario y otras apps.

### ¿Qué es el almacenamiento externo?

- **Ubicación**: Tarjeta SD o partición del almacenamiento interno
- **Acceso**: Visible para el usuario y otras apps
- **Persistencia**: Los archivos **NO se eliminan** al desinstalar la app
- **Permisos**: Requiere permisos específicos (desde Android 6.0)

### Diferencias: Interno vs Externo

|Característica|Almacenamiento Interno|Almacenamiento Externo|
|---|---|---|
|**Ubicación**|`/data/data/[app]/files/`|`/sdcard/` o tarjeta SD|
|**Privacidad**|✅ Solo la app|❌ Accesible por otras apps|
|**Permisos**|No requiere|✅ Requiere permisos|
|**Persistencia**|Se borra al desinstalar|Permanece al desinstalar|
|**Visibilidad**|Oculto al usuario|Visible en explorador|
|**Espacio**|Limitado|Normalmente mayor|
|**Uso típico**|Datos privados, cache|Descargas, fotos, documentos|

### ¿Cuándo usar almacenamiento externo?

✅ **SÍ usar para:**

- Archivos que el usuario debe poder ver (fotos, videos, documentos)
- Archivos grandes (multimedia)
- Exportar datos (backups, informes CSV/PDF)
- Compartir archivos entre apps
- Descargas

❌ **NO usar para:**

- Datos sensibles o privados → usar **almacenamiento interno**
- Pequeñas configuraciones → usar **SharedPreferences**
- Datos que deben borrarse con la app → usar **almacenamiento interno**

---

## 📖 2. Permisos necesarios

### Declarar permisos en AndroidManifest.xml

```xml
<manifest xmlns:android="http://schemas.android.com/apk/res/android"
    package="com.ejemplo.miapp">

    <!-- Permiso para LEER archivos externos -->
    <uses-permission android:name="android.permission.READ_EXTERNAL_STORAGE" />
    
    <!-- Permiso para ESCRIBIR archivos externos -->
    <uses-permission android:name="android.permission.WRITE_EXTERNAL_STORAGE" />
    
    <!-- Para Android 10 (API 29) y superior, permitir acceso legacy -->
    <application
        android:requestLegacyExternalStorage="true"
        ...>
    </application>

</manifest>
```

### Solicitar permisos en tiempo de ejecución (Android 6.0+)

```java
import android.Manifest;
import android.content.pm.PackageManager;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

public class MainActivity extends AppCompatActivity {
    
    private static final int REQUEST_CODE_PERMISSIONS = 100;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        // Verificar y solicitar permisos
        verificarPermisos();
    }
    
    private void verificarPermisos() {
        if (ContextCompat.checkSelfPermission(this, 
                Manifest.permission.WRITE_EXTERNAL_STORAGE) 
                != PackageManager.PERMISSION_GRANTED) {
            
            // No tenemos permiso, solicitarlo
            ActivityCompat.requestPermissions(this,
                new String[]{
                    Manifest.permission.READ_EXTERNAL_STORAGE,
                    Manifest.permission.WRITE_EXTERNAL_STORAGE
                },
                REQUEST_CODE_PERMISSIONS);
        } else {
            // Ya tenemos permiso
            Toast.makeText(this, "Permisos concedidos", Toast.LENGTH_SHORT).show();
        }
    }
    
    @Override
    public void onRequestPermissionsResult(int requestCode, String[] permissions, int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        
        if (requestCode == REQUEST_CODE_PERMISSIONS) {
            if (grantResults.length > 0 && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                Toast.makeText(this, "✅ Permisos concedidos", Toast.LENGTH_SHORT).show();
            } else {
                Toast.makeText(this, "❌ Permisos denegados", Toast.LENGTH_SHORT).show();
            }
        }
    }
}
```

---

## 📖 3. Verificar almacenamiento externo

Antes de leer/escribir, verifica que el almacenamiento externo esté disponible.

```java
private boolean isExternalStorageWritable() {
    String state = Environment.getExternalStorageState();
    return Environment.MEDIA_MOUNTED.equals(state);
}

private boolean isExternalStorageReadable() {
    String state = Environment.getExternalStorageState();
    return Environment.MEDIA_MOUNTED.equals(state) || 
           Environment.MEDIA_MOUNTED_READ_ONLY.equals(state);
}
```

### Uso completo

```java
private void guardarEnExterno() {
    // 1. Verificar permisos
    if (ContextCompat.checkSelfPermission(this, 
            Manifest.permission.WRITE_EXTERNAL_STORAGE) 
            != PackageManager.PERMISSION_GRANTED) {
        Toast.makeText(this, "Sin permisos de escritura", Toast.LENGTH_SHORT).show();
        return;
    }
    
    // 2. Verificar disponibilidad
    if (!isExternalStorageWritable()) {
        Toast.makeText(this, "Almacenamiento no disponible", Toast.LENGTH_SHORT).show();
        return;
    }
    
    // 3. Escribir archivo
    escribirArchivo();
}
```

---

## 📖 4. Escribir en almacenamiento externo

### Opción 1: Directorio privado de la app (recomendado)

Archivos que se eliminan al desinstalar la app.

```java
private void escribirArchivoPrivado() {
    // Directorio privado: /sdcard/Android/data/[paquete]/files/
    File directorio = getExternalFilesDir(null);
    File archivo = new File(directorio, "notas.txt");
    
    try {
        FileOutputStream fos = new FileOutputStream(archivo);
        String contenido = "Contenido del archivo";
        fos.write(contenido.getBytes());
        fos.close();
        
        Toast.makeText(this, "Guardado en: " + archivo.getAbsolutePath(), Toast.LENGTH_LONG).show();
        
    } catch (IOException e) {
        e.printStackTrace();
        Toast.makeText(this, "Error al guardar", Toast.LENGTH_SHORT).show();
    }
}
```

### Opción 2: Directorio público

Archivos que **permanecen** al desinstalar la app.

```java
private void escribirArchivoPublico() {
    // Directorio público: /sdcard/Download/
    File directorio = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS);
    
    // Crear directorio si no existe
    if (!directorio.exists()) {
        directorio.mkdirs();
    }
    
    File archivo = new File(directorio, "exportacion.txt");
    
    try {
        FileOutputStream fos = new FileOutputStream(archivo);
        String contenido = "Datos exportados";
        fos.write(contenido.getBytes());
        fos.close();
        
        Toast.makeText(this, "✅ Exportado a Descargas", Toast.LENGTH_SHORT).show();
        
    } catch (IOException e) {
        e.printStackTrace();
        Toast.makeText(this, "❌ Error al exportar", Toast.LENGTH_SHORT).show();
    }
}
```

---

## 📖 5. Leer desde almacenamiento externo

```java
private void leerArchivoExterno() {
    File directorio = getExternalFilesDir(null);
    File archivo = new File(directorio, "notas.txt");
    
    if (!archivo.exists()) {
        Toast.makeText(this, "El archivo no existe", Toast.LENGTH_SHORT).show();
        return;
    }
    
    try {
        FileInputStream fis = new FileInputStream(archivo);
        InputStreamReader isr = new InputStreamReader(fis);
        BufferedReader br = new BufferedReader(isr);
        
        StringBuilder contenido = new StringBuilder();
        String linea;
        
        while ((linea = br.readLine()) != null) {
            contenido.append(linea).append("\n");
        }
        
        br.close();
        
        // Mostrar contenido
        new AlertDialog.Builder(this)
            .setTitle("Contenido del archivo")
            .setMessage(contenido.toString())
            .setPositiveButton("OK", null)
            .show();
        
    } catch (IOException e) {
        e.printStackTrace();
        Toast.makeText(this, "Error al leer", Toast.LENGTH_SHORT).show();
    }
}
```

---

## 📖 6. Directorios públicos

Android proporciona directorios estándar accesibles por todas las apps:

```java
// Descargas
Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS);

// Documentos
Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOCUMENTS);

// Imágenes
Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES);

// Música
Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_MUSIC);

// Videos
Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_MOVIES);

// DCIM (fotos de cámara)
Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DCIM);
```

### Ejemplo: Exportar CSV a Descargas

```java
private void exportarCSV(ArrayList<String> datos) {
    File directorio = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS);
    
    if (!directorio.exists()) {
        directorio.mkdirs();
    }
    
    // Nombre con timestamp
    String nombreArchivo = "datos_" + System.currentTimeMillis() + ".csv";
    File archivo = new File(directorio, nombreArchivo);
    
    try {
        FileOutputStream fos = new FileOutputStream(archivo);
        
        // Cabecera CSV
        String cabecera = "ID,Nombre,Fecha\n";
        fos.write(cabecera.getBytes());
        
        // Datos
        for (int i = 0; i < datos.size(); i++) {
            String linea = (i + 1) + "," + datos.get(i) + "," + System.currentTimeMillis() + "\n";
            fos.write(linea.getBytes());
        }
        
        fos.close();
        
        Toast.makeText(this, "✅ CSV exportado: " + nombreArchivo, Toast.LENGTH_LONG).show();
        
    } catch (IOException e) {
        e.printStackTrace();
        Toast.makeText(this, "❌ Error al exportar", Toast.LENGTH_SHORT).show();
    }
}
```

---

## 📖 7. Scoped Storage (Android 10+)

Desde **Android 10 (API 29)**, el acceso al almacenamiento externo cambió:

### Cambios principales

- Las apps **NO** pueden acceder libremente a `/sdcard/`
- Solo pueden acceder a:
    - Su directorio privado: `getExternalFilesDir()`
    - MediaStore (imágenes, videos, audio)
    - Storage Access Framework (SAF)

### Soluciones

#### 1. Usar directorio privado (recomendado)

```java
// Esto SIEMPRE funciona (Android 4.4+)
File directorio = getExternalFilesDir(null);
File archivo = new File(directorio, "datos.txt");
```

#### 2. Usar MediaStore para multimedia

```java
// Para guardar imágenes visibles en la galería
ContentValues values = new ContentValues();
values.put(MediaStore.Images.Media.DISPLAY_NAME, "foto.jpg");
values.put(MediaStore.Images.Media.MIME_TYPE, "image/jpeg");
values.put(MediaStore.Images.Media.RELATIVE_PATH, Environment.DIRECTORY_PICTURES);

Uri uri = getContentResolver().insert(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, values);
```

#### 3. Storage Access Framework (SAF)

```java
// Permitir al usuario elegir ubicación
Intent intent = new Intent(Intent.ACTION_CREATE_DOCUMENT);
intent.addCategory(Intent.CATEGORY_OPENABLE);
intent.setType("text/plain");
intent.putExtra(Intent.EXTRA_TITLE, "documento.txt");
startActivityForResult(intent, REQUEST_CODE_CREATE_FILE);
```

### Compatibilidad con versiones antiguas

```java
// AndroidManifest.xml
<application
    android:requestLegacyExternalStorage="true"  <!-- Android 10 -->
    ...>
</application>
```

---

## 🎯 EJERCICIO 25: Exportar Datos

Crea una app de **Gestión de Contactos con Exportación** a CSV:

**Requisitos:**

1. **MainActivity** con:
    
    - ListView de contactos (nombre, teléfono)
    - FloatingActionButton "+" para añadir contacto
    - Botón "Exportar a CSV"
2. **Funcionalidad de exportación**:
    
    - Exportar todos los contactos a archivo CSV
    - Guardar en carpeta Descargas
    - Nombre: `contactos_[fecha].csv`
    - Formato CSV:
        
        ```csv
        Nombre,Teléfono,EmailJuan Pérez,612345678,juan@email.comMaría López,687654321,maria@email.com
        ```
        
3. **Gestión de permisos**:
    
    - Solicitar permiso de escritura al exportar
    - Mostrar diálogo si permiso denegado
    - Verificar disponibilidad del almacenamiento
4. **Extras**:
    
    - Botón "Importar CSV" (leer archivo y cargar contactos)
    - Mostrar diálogo de confirmación antes de exportar
    - Abrir el archivo CSV después de exportar (Intent)

**Clase sugerida:**

```java
public class Contacto {
    private String nombre;
    private String telefono;
    private String email;
    
    public Contacto(String nombre, String telefono, String email) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.email = email;
    }
    
    public String toCSV() {
        return nombre + "," + telefono + "," + email;
    }
    
    public static Contacto fromCSV(String linea) {
        String[] partes = linea.split(",");
        if (partes.length == 3) {
            return new Contacto(partes[0], partes[1], partes[2]);
        }
        return null;
    }
    
    // Getters y setters
}
```

**Pistas:**

- Usa `SimpleDateFormat` para el nombre del archivo
- Recuerda añadir cabecera CSV
- Usa `ActivityCompat.requestPermissions()` para permisos
- Para abrir CSV: `Intent.ACTION_VIEW` con tipo MIME `text/csv`

---

## 🎯 EJERCICIO 26: Galería de Imágenes

Crea una app de **Galería Simple** que muestre imágenes del almacenamiento externo:

**Requisitos:**

1. **MainActivity** con:
    
    - GridView mostrando miniaturas de imágenes
    - Cada imagen con nombre del archivo
2. **Funcionalidad**:
    
    - Listar todas las imágenes de la carpeta Pictures
    - Mostrar miniaturas (usar BitmapFactory con inSampleSize)
    - Click en imagen → abrir en pantalla completa
3. **ImageViewActivity** (pantalla completa):
    
    - ImageView con la imagen
    - Botones: "Compartir", "Eliminar", "Volver"
4. **Gestión de permisos**:
    
    - Solicitar permiso de lectura al iniciar
    - Si no hay permiso, mostrar mensaje
5. **Extras**:
    
    - Botón "Tomar Foto" (abrir cámara)
    - Filtrar por extensión (.jpg, .png)
    - Ordenar por fecha (más recientes primero)
    - Implementar caché de miniaturas

**Pistas:**

- Para listar imágenes:
    
    ```java
    File directorio = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES);
    File[] archivos = directorio.listFiles();
    ```
    
- Para crear miniatura eficiente:
    
    ```java
    BitmapFactory.Options options = new BitmapFactory.Options();
    options.inSampleSize = 4;  // Reducir a 1/4 del tamaño
    Bitmap bitmap = BitmapFactory.decodeFile(archivo.getAbsolutePath(), options);
    ```
    
- Para compartir imagen:
    
    ```java
    Intent shareIntent = new Intent(Intent.ACTION_SEND);
    shareIntent.setType("image/*");
    shareIntent.putExtra(Intent.EXTRA_STREAM, Uri.fromFile(archivo));
    startActivity(Intent.createChooser(shareIntent, "Compartir imagen"));
    ```
    

**Layout sugerido (activity_main.xml):**

```xml
<LinearLayout
    android:orientation="vertical"
    android:layout_width="match_parent"
    android:layout_height="match_parent">

    <TextView
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:text="Galería de Imágenes"
        android:textSize="24sp"
        android:textStyle="bold"
        android:gravity="center"
        android:padding="16dp"/>

    <GridView
        android:id="@+id/gridViewImagenes"
        android:layout_width="match_parent"
        android:layout_height="0dp"
        android:layout_weight="1"
        android:numColumns="3"
        android:verticalSpacing="4dp"
        android:horizontalSpacing="4dp"
        android:padding="4dp"/>

</LinearLayout>
```

---

## 📝 CHECKLIST DÍA 15

- [ ] Entiendes la diferencia entre almacenamiento interno y externo
- [ ] Sabes declarar y solicitar permisos de almacenamiento
- [ ] Puedes verificar disponibilidad con `Environment.getExternalStorageState()`
- [ ] Conoces la diferencia entre `getExternalFilesDir()` y directorios públicos
- [ ] Sabes escribir y leer archivos en almacenamiento externo
- [ ] Entiendes Scoped Storage (Android 10+)
- [ ] Puedes exportar datos a CSV
- [ ] Has completado Ejercicio 25
- [ ] Has completado Ejercicio 26

---

## 🎓 CONCEPTOS CLAVE DEL DÍA 15

|Concepto|Definición|
|---|---|
|**Almacenamiento Externo**|Espacio accesible por usuario y apps, tarjeta SD|
|**WRITE_EXTERNAL_STORAGE**|Permiso para escribir en almacenamiento externo|
|**READ_EXTERNAL_STORAGE**|Permiso para leer almacenamiento externo|
|**getExternalFilesDir()**|Directorio privado de la app en almacenamiento externo|
|**Environment.DIRECTORY_DOWNLOADS**|Carpeta Descargas pública|
|**Environment.getExternalStorageState()**|Verificar disponibilidad del almacenamiento|
|**isExternalStorageWritable()**|Verificar si se puede escribir|
|**Scoped Storage**|Restricción de acceso desde Android 10|
|**MediaStore**|API para acceder a multimedia en Android 10+|
|**requestPermissions()**|Solicitar permisos en tiempo de ejecución|

---

## 🔍 ERRORES COMUNES

```java
// ❌ ERROR 1: No solicitar permisos
File archivo = new File(Environment.getExternalStorageDirectory(), "datos.txt");
// ❌ Lanza SecurityException sin permisos

// ✅ CORRECTO: Verificar permisos primero
if (ContextCompat.checkSelfPermission(this, Manifest.permission.WRITE_EXTERNAL_STORAGE) 
        == PackageManager.PERMISSION_GRANTED) {
    // Entonces escribir
}

// ❌ ERROR 2: No verificar disponibilidad
FileOutputStream fos = new FileOutputStream(archivo);  // ❌ Puede fallar

// ✅ CORRECTO: Verificar primero
if (isExternalStorageWritable()) {
    FileOutputStream fos = new FileOutputStream(archivo);
}

// ❌ ERROR 3: Usar ruta hardcodeada
File archivo = new File("/sdcard/miapp/datos.txt");  // ❌ No portable

// ✅ CORRECTO: Usar métodos del sistema
File directorio = getExternalFilesDir(null);
File archivo = new File(directorio, "datos.txt");

// ❌ ERROR 4: No crear directorio
File directorio = new File(Environment.getExternalStorageDirectory(), "MiCarpeta");
File archivo = new File(directorio, "datos.txt");  // ❌ Falla si directorio no existe

// ✅ CORRECTO: Crear directorio
if (!directorio.exists()) {
    directorio.mkdirs();
}

// ❌ ERROR 5: Olvidar requestLegacyExternalStorage en Android 10
// Sin esto, no funciona en Android 10

// ✅ CORRECTO: Añadir en AndroidManifest.xml
<application android:requestLegacyExternalStorage="true">
```

---

## 💡 CONSEJOS PROFESIONALES

1. **Prioriza almacenamiento privado** → Usa `getExternalFilesDir()` siempre que sea posible
    
2. **Verifica permisos ANTES de cada operación**:
    
    ```java
    if (ContextCompat.checkSelfPermission(...) != PackageManager.PERMISSION_GRANTED) {
        // Solicitar permiso
        return;
    }
    ```
    
3. **Nombres únicos con timestamp**:
    
    ```java
    String nombre = "backup_" + System.currentTimeMillis() + ".json";
    ```
    
4. **Usa try-catch específicos**:
    
    ```java
    try {
        // ...
    } catch (FileNotFoundException e) {
        Toast.makeText(this, "Archivo no encontrado", Toast.LENGTH_SHORT).show();
    } catch (SecurityException e) {
        Toast.makeText(this, "Sin permisos", Toast.LENGTH_SHORT).show();
    } catch (IOException e) {
        Toast.makeText(this, "Error E/S", Toast.LENGTH_SHORT).show();
    }
    ```
    
5. **Para Android 10+**, considera:
    
    - Usar `getExternalFilesDir()` (no requiere permisos)
    - MediaStore para multimedia
    - Storage Access Framework para documentos
6. **Informar al usuario** sobre ubicación del archivo:
    
    ```java
    Toast.makeText(this, "Guardado en: " + archivo.getAbsolutePath(), Toast.LENGTH_LONG).show();
    ```
    
7. **Para exportar, usa Intent para abrir**:
    
    ```java
    Intent intent = new Intent(Intent.ACTION_VIEW);
    intent.setDataAndType(Uri.fromFile(archivo), "text/csv");
    startActivity(intent);
    ```
    

---

## 🌟 COMPARATIVA: Interno vs Externo

|Aspecto|Interno|Externo Privado|Externo Público|
|---|---|---|---|
|**Ubicación**|`/data/data/[app]/`|`/sdcard/Android/data/[app]/`|`/sdcard/Downloads/` etc.|
|**Permisos**|❌ No requiere|⚠️ No requiere (Android 4.4+)|✅ Sí requiere|
|**Visibilidad**|Oculto|Oculto para usuario|✅ Visible|
|**Persistencia**|Se borra|Se borra|Permanece|
|**Espacio**|Limitado|Mayor|Mayor|
|**Uso típico**|Datos privados|Cache grande|Descargas, exports|

**Recomendación general:**

1. **Datos privados** → Almacenamiento interno
2. **Cache/temp grande** → Externo privado (`getExternalFilesDir()`)
3. **Archivos para usuario** → Externo público (con permisos)

---

[🔝 Volver al índice](#-%C3%ADndice-general)

---

📌 **Guardado:** 16/03/2026 - 18:00h  
📌 **Próxima sesión:** Día 17 - MediaPlayer (Audio)

---

# 🎯 DÍA 17 - MediaPlayer (Audio)

**Fecha:** 18 de Marzo 2026  
**Duración:** 2-3 horas  
**Objetivos:** Dominar la reproducción de audio con MediaPlayer

---

## 📖 1. Introducción a MediaPlayer

**MediaPlayer** es la clase de Android para reproducir archivos de audio y video.

### ¿Qué es MediaPlayer?

- Clase nativa de Android para reproducir multimedia
- Soporta formatos: MP3, WAV, AAC, OGG, FLAC, etc.
- Puede reproducir desde:
    - Recursos de la app (`res/raw/`)
    - Almacenamiento interno/externo
    - URLs de internet
    - Assets

### Características principales

✅ Reproducción, pausa, stop ✅ Control de volumen ✅ Avance/retroceso (seek) ✅ Modo bucle (loop) ✅ Eventos (inicio, finalización, errores)

---

## 📖 2. Reproducir audio desde recursos (raw)

### Preparación

1. Crea la carpeta `res/raw/` (si no existe)
2. Añade archivos de audio (por ejemplo: `cancion.mp3`)

### Código básico

```java
public class MainActivity extends AppCompatActivity {
    
    private MediaPlayer mediaPlayer;
    private Button btnPlay, btnPause, btnStop;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        btnPlay = findViewById(R.id.btnPlay);
        btnPause = findViewById(R.id.btnPause);
        btnStop = findViewById(R.id.btnStop);
        
        // Crear MediaPlayer desde recurso raw
        mediaPlayer = MediaPlayer.create(this, R.raw.cancion);
        
        btnPlay.setOnClickListener(v -> reproducir());
        btnPause.setOnClickListener(v -> pausar());
        btnStop.setOnClickListener(v -> detener());
    }
    
    private void reproducir() {
        if (mediaPlayer != null && !mediaPlayer.isPlaying()) {
            mediaPlayer.start();
            Toast.makeText(this, "▶ Reproduciendo", Toast.LENGTH_SHORT).show();
        }
    }
    
    private void pausar() {
        if (mediaPlayer != null && mediaPlayer.isPlaying()) {
            mediaPlayer.pause();
            Toast.makeText(this, "⏸ Pausado", Toast.LENGTH_SHORT).show();
        }
    }
    
    private void detener() {
        if (mediaPlayer != null) {
            mediaPlayer.stop();
            mediaPlayer.prepareAsync(); // Preparar para reproducir de nuevo
            Toast.makeText(this, "⏹ Detenido", Toast.LENGTH_SHORT).show();
        }
    }
    
    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (mediaPlayer != null) {
            mediaPlayer.release();  // ⚠️ IMPORTANTE: liberar recursos
            mediaPlayer = null;
        }
    }
}
```

---

## 📖 3. Reproducir audio desde almacenamiento

### Desde almacenamiento interno

```java
private void reproducirDesdeInterno() {
    try {
        File archivo = new File(getFilesDir(), "audio.mp3");
        
        if (!archivo.exists()) {
            Toast.makeText(this, "Archivo no encontrado", Toast.LENGTH_SHORT).show();
            return;
        }
        
        // Liberar MediaPlayer anterior si existe
        if (mediaPlayer != null) {
            mediaPlayer.release();
        }
        
        mediaPlayer = new MediaPlayer();
        mediaPlayer.setDataSource(archivo.getAbsolutePath());
        mediaPlayer.prepare();  // Preparación síncrona
        mediaPlayer.start();
        
        Toast.makeText(this, "Reproduciendo desde interno", Toast.LENGTH_SHORT).show();
        
    } catch (IOException e) {
        e.printStackTrace();
        Toast.makeText(this, "Error al reproducir", Toast.LENGTH_SHORT).show();
    }
}
```

### Desde almacenamiento externo

```java
private void reproducirDesdeExterno() {
    // Verificar permiso
    if (ContextCompat.checkSelfPermission(this, Manifest.permission.READ_EXTERNAL_STORAGE)
            != PackageManager.PERMISSION_GRANTED) {
        Toast.makeText(this, "Sin permiso de lectura", Toast.LENGTH_SHORT).show();
        return;
    }
    
    try {
        File directorio = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_MUSIC);
        File archivo = new File(directorio, "cancion.mp3");
        
        if (!archivo.exists()) {
            Toast.makeText(this, "Archivo no encontrado", Toast.LENGTH_SHORT).show();
            return;
        }
        
        if (mediaPlayer != null) {
            mediaPlayer.release();
        }
        
        mediaPlayer = new MediaPlayer();
        mediaPlayer.setDataSource(archivo.getAbsolutePath());
        mediaPlayer.prepare();
        mediaPlayer.start();
        
    } catch (IOException e) {
        e.printStackTrace();
        Toast.makeText(this, "Error al reproducir", Toast.LENGTH_SHORT).show();
    }
}
```

### Desde URL (internet)

```java
private void reproducirDesdeURL() {
    String url = "https://www.soundhelix.com/examples/mp3/SoundHelix-Song-1.mp3";
    
    try {
        if (mediaPlayer != null) {
            mediaPlayer.release();
        }
        
        mediaPlayer = new MediaPlayer();
        mediaPlayer.setDataSource(url);
        
        // Preparación ASÍNCRONA (recomendado para URLs)
        mediaPlayer.prepareAsync();
        
        mediaPlayer.setOnPreparedListener(mp -> {
            mp.start();
            Toast.makeText(this, "Reproduciendo desde internet", Toast.LENGTH_SHORT).show();
        });
        
        mediaPlayer.setOnErrorListener((mp, what, extra) -> {
            Toast.makeText(this, "Error al cargar audio", Toast.LENGTH_SHORT).show();
            return true;
        });
        
    } catch (IOException e) {
        e.printStackTrace();
    }
}
```

---

## 📖 4. Controles básicos (Play, Pause, Stop)

### Métodos principales

```java
// ▶ PLAY / REANUDAR
mediaPlayer.start();

// ⏸ PAUSAR
mediaPlayer.pause();

// ⏹ DETENER (necesita preparar de nuevo)
mediaPlayer.stop();
mediaPlayer.prepare();  // o prepareAsync()

// ⏮ REINICIAR (volver al inicio)
mediaPlayer.seekTo(0);
mediaPlayer.start();

// 🔁 MODO BUCLE
mediaPlayer.setLooping(true);  // Repetir indefinidamente

// 🔊 VOLUMEN (0.0 a 1.0)
mediaPlayer.setVolume(0.5f, 0.5f);  // (izquierdo, derecho)
```

### Ejemplo completo con estados

```java
private void togglePlayPause() {
    if (mediaPlayer == null) {
        Toast.makeText(this, "No hay audio cargado", Toast.LENGTH_SHORT).show();
        return;
    }
    
    if (mediaPlayer.isPlaying()) {
        mediaPlayer.pause();
        btnPlayPause.setText("▶ Play");
    } else {
        mediaPlayer.start();
        btnPlayPause.setText("⏸ Pause");
    }
}

private void reiniciar() {
    if (mediaPlayer != null) {
        mediaPlayer.seekTo(0);
        mediaPlayer.start();
    }
}

private void adelantar10Segundos() {
    if (mediaPlayer != null) {
        int posicionActual = mediaPlayer.getCurrentPosition();
        int nuevaPosicion = posicionActual + 10000;  // +10 segundos
        int duracion = mediaPlayer.getDuration();
        
        if (nuevaPosicion < duracion) {
            mediaPlayer.seekTo(nuevaPosicion);
        } else {
            mediaPlayer.seekTo(duracion);
        }
    }
}

private void retroceder10Segundos() {
    if (mediaPlayer != null) {
        int posicionActual = mediaPlayer.getCurrentPosition();
        int nuevaPosicion = posicionActual - 10000;  // -10 segundos
        
        if (nuevaPosicion > 0) {
            mediaPlayer.seekTo(nuevaPosicion);
        } else {
            mediaPlayer.seekTo(0);
        }
    }
}
```

---

## 📖 5. SeekBar y progreso

Mostrar el progreso de reproducción con un SeekBar.

```java
private SeekBar seekBar;
private TextView tvTiempoActual, tvDuracionTotal;
private Handler handler = new Handler();
private Runnable updateSeekBar;

@Override
protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    
    seekBar = findViewById(R.id.seekBar);
    tvTiempoActual = findViewById(R.id.tvTiempoActual);
    tvDuracionTotal = findViewById(R.id.tvDuracionTotal);
    
    mediaPlayer = MediaPlayer.create(this, R.raw.cancion);
    
    // Configurar SeekBar
    configurarSeekBar();
}

private void configurarSeekBar() {
    int duracion = mediaPlayer.getDuration();
    seekBar.setMax(duracion);
    
    // Mostrar duración total
    tvDuracionTotal.setText(formatearTiempo(duracion));
    
    // Listener para cuando el usuario arrastra el SeekBar
    seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
        @Override
        public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
            if (fromUser) {
                mediaPlayer.seekTo(progress);
            }
        }
        
        @Override
        public void onStartTrackingTouch(SeekBar seekBar) {}
        
        @Override
        public void onStopTrackingTouch(SeekBar seekBar) {}
    });
    
    // Actualizar SeekBar continuamente
    updateSeekBar = new Runnable() {
        @Override
        public void run() {
            if (mediaPlayer != null && mediaPlayer.isPlaying()) {
                int posicionActual = mediaPlayer.getCurrentPosition();
                seekBar.setProgress(posicionActual);
                tvTiempoActual.setText(formatearTiempo(posicionActual));
            }
            handler.postDelayed(this, 100);  // Actualizar cada 100ms
        }
    };
    
    handler.post(updateSeekBar);
}

private String formatearTiempo(int milisegundos) {
    int segundos = (milisegundos / 1000) % 60;
    int minutos = (milisegundos / 1000) / 60;
    return String.format("%02d:%02d", minutos, segundos);
}

@Override
protected void onDestroy() {
    super.onDestroy();
    handler.removeCallbacks(updateSeekBar);
    if (mediaPlayer != null) {
        mediaPlayer.release();
        mediaPlayer = null;
    }
}
```

---

## 📖 6. Estados del MediaPlayer

MediaPlayer tiene diferentes estados que debes gestionar correctamente:

```
    ┌─────────────┐
    │    IDLE     │ ← Estado inicial
    └──────┬──────┘
           │ setDataSource()
    ┌──────▼──────┐
    │ INITIALIZED │
    └──────┬──────┘
           │ prepare() / prepareAsync()
    ┌──────▼──────┐
    │  PREPARED   │
    └──────┬──────┘
           │ start()
    ┌──────▼──────┐
    │  STARTED    │ ← Reproduciendo
    └──────┬──────┘
           │ pause()
    ┌──────▼──────┐
    │   PAUSED    │
    └──────┬──────┘
           │ stop()
    ┌──────▼──────┐
    │  STOPPED    │
    └──────┬──────┘
           │ release()
    ┌──────▼──────┐
    │     END     │
    └─────────────┘
```

### Buenas prácticas

```java
// ✅ CORRECTO: Verificar estado antes de operar
if (mediaPlayer != null && mediaPlayer.isPlaying()) {
    mediaPlayer.pause();
}

// ❌ MAL: No verificar
mediaPlayer.pause();  // Puede lanzar IllegalStateException

// ✅ CORRECTO: Liberar recursos
@Override
protected void onDestroy() {
    super.onDestroy();
    if (mediaPlayer != null) {
        if (mediaPlayer.isPlaying()) {
            mediaPlayer.stop();
        }
        mediaPlayer.release();
        mediaPlayer = null;
    }
}
```

---

## 📖 7. Listeners y eventos

### OnCompletionListener (cuando termina)

```java
mediaPlayer.setOnCompletionListener(mp -> {
    Toast.makeText(this, "🎵 Canción finalizada", Toast.LENGTH_SHORT).show();
    btnPlayPause.setText("▶ Play");
    seekBar.setProgress(0);
});
```

### OnErrorListener (errores)

```java
mediaPlayer.setOnErrorListener((mp, what, extra) -> {
    String error = "Error desconocido";
    
    if (what == MediaPlayer.MEDIA_ERROR_SERVER_DIED) {
        error = "Error del servidor";
    } else if (what == MediaPlayer.MEDIA_ERROR_UNKNOWN) {
        error = "Error desconocido";
    }
    
    Toast.makeText(this, "❌ " + error, Toast.LENGTH_SHORT).show();
    return true;  // true = error manejado
});
```

### OnPreparedListener (para prepareAsync)

```java
mediaPlayer.setOnPreparedListener(mp -> {
    Toast.makeText(this, "✅ Audio listo", Toast.LENGTH_SHORT).show();
    mp.start();
});
```

### OnSeekCompleteListener

```java
mediaPlayer.setOnSeekCompleteListener(mp -> {
    Toast.makeText(this, "Posición actualizada", Toast.LENGTH_SHORT).show();
});
```

---

## 🎯 EJERCICIO 27: Reproductor de Audio

Crea un **Reproductor de Audio Simple** con controles completos:

**Requisitos:**

1. **Interfaz**:
    
    - ImageView: Carátula del álbum
    - TextView: Título de la canción
    - TextView: Artista
    - SeekBar: Barra de progreso
    - TextView: Tiempo actual (00:00)
    - TextView: Duración total (00:00)
    - Botones: Anterior | Play/Pause | Siguiente
    - Botones: -10s | +10s
    - Button: Modo shuffle
    - Button: Modo repeat
2. **Funcionalidad**:
    
    - Reproducir audio desde `res/raw/`
    - Play/Pause con mismo botón
    - Actualizar SeekBar en tiempo real
    - Arrastrar SeekBar para cambiar posición
    - Adelantar/retroceder 10 segundos
    - Siguiente/anterior canción (mínimo 3 canciones)
3. **Modos especiales**:
    
    - Shuffle: reproducción aleatoria
    - Repeat: repetir canción actual
    - Auto-play: al terminar, reproducir siguiente
4. **Extras**:
    
    - Notificación con controles de reproducción
    - Servicio en segundo plano
    - Persistir estado con SharedPreferences

**Layout sugerido:**

```xml
<LinearLayout
    android:orientation="vertical"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:padding="16dp"
    android:gravity="center">

    <!-- Carátula -->
    <ImageView
        android:id="@+id/ivCaratula"
        android:layout_width="250dp"
        android:layout_height="250dp"
        android:src="@drawable/album_placeholder"
        android:scaleType="centerCrop"/>

    <!-- Info canción -->
    <TextView
        android:id="@+id/tvTitulo"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:text="Título de la canción"
        android:textSize="20sp"
        android:textStyle="bold"
        android:gravity="center"
        android:layout_marginTop="24dp"/>

    <TextView
        android:id="@+id/tvArtista"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:text="Artista"
        android:textSize="16sp"
        android:gravity="center"
        android:layout_marginTop="4dp"/>

    <!-- SeekBar -->
    <SeekBar
        android:id="@+id/seekBar"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:layout_marginTop="24dp"/>

    <!-- Tiempos -->
    <LinearLayout
        android:orientation="horizontal"
        android:layout_width="match_parent"
        android:layout_height="wrap_content">

        <TextView
            android:id="@+id/tvTiempoActual"
            android:layout_width="0dp"
            android:layout_height="wrap_content"
            android:layout_weight="1"
            android:text="00:00"
            android:gravity="start"/>

        <TextView
            android:id="@+id/tvDuracionTotal"
            android:layout_width="0dp"
            android:layout_height="wrap_content"
            android:layout_weight="1"
            android:text="00:00"
            android:gravity="end"/>

    </LinearLayout>

    <!-- Controles principales -->
    <LinearLayout
        android:orientation="horizontal"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:gravity="center"
        android:layout_marginTop="24dp">

        <Button
            android:id="@+id/btnAnterior"
            android:layout_width="60dp"
            android:layout_height="60dp"
            android:text="⏮"/>

        <Button
            android:id="@+id/btnPlayPause"
            android:layout_width="80dp"
            android:layout_height="80dp"
            android:text="▶"
            android:textSize="24sp"
            android:layout_marginStart="16dp"
            android:layout_marginEnd="16dp"/>

        <Button
            android:id="@+id/btnSiguiente"
            android:layout_width="60dp"
            android:layout_height="60dp"
            android:text="⏭"/>

    </LinearLayout>

    <!-- Controles secundarios -->
    <LinearLayout
        android:orientation="horizontal"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:gravity="center"
        android:layout_marginTop="16dp">

        <Button
            android:id="@+id/btnMenos10"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:text="-10s"/>

        <Button
            android:id="@+id/btnShuffle"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:text="🔀"
            android:layout_marginStart="8dp"/>

        <Button
            android:id="@+id/btnRepeat"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:text="🔁"
            android:layout_marginStart="8dp"/>

        <Button
            android:id="@+id/btnMas10"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:text="+10s"
            android:layout_marginStart="8dp"/>

    </LinearLayout>

</LinearLayout>
```

---

## 🎯 EJERCICIO 28: Lista de Reproducción

Crea una app de **Lista de Reproducción** con múltiples canciones:

**Requisitos:**

1. **ListView** con canciones (título, artista, duración)
    
2. **Funcionalidad**:
    
    - Click en canción → reproducir
    - Canción actual resaltada en la lista
    - Controles en parte inferior de la pantalla
    - Auto-avanzar a siguiente al terminar
3. **Datos de canciones**:
    
    - Clase `Cancion` con: título, artista, archivo, duración
    - ArrayList\<Cancion> con mínimo 5 canciones
    - Guardar lista en JSON (fichero interno)
4. **Extras**:
    
    - Crear playlist personalizada
    - Eliminar canción de playlist
    - Ordenar por: título, artista, duración
    - Buscar canciones

**Clase sugerida:**

```java
public class Cancion {
    private String titulo;
    private String artista;
    private int recursoAudio;  // R.raw.cancion1
    private int duracion;      // en milisegundos
    
    public Cancion(String titulo, String artista, int recursoAudio) {
        this.titulo = titulo;
        this.artista = artista;
        this.recursoAudio = recursoAudio;
    }
    
    @Override
    public String toString() {
        return titulo + "\n" + artista;
    }
    
    // Getters y setters
}
```

---

## 📝 CHECKLIST DÍA 17

- [ ] Entiendes qué es MediaPlayer y sus usos
- [ ] Sabes crear MediaPlayer desde recursos raw
- [ ] Puedes reproducir audio desde almacenamiento
- [ ] Conoces los controles básicos (play, pause, stop, seek)
- [ ] Sabes implementar SeekBar con progreso en tiempo real
- [ ] Entiendes los estados del MediaPlayer
- [ ] Puedes usar listeners (OnCompletion, OnError, OnPrepared)
- [ ] Sabes liberar recursos con release()
- [ ] Has completado Ejercicio 27
- [ ] Has completado Ejercicio 28

---

## 🎓 CONCEPTOS CLAVE DEL DÍA 17

|Concepto|Definición|
|---|---|
|**MediaPlayer**|Clase para reproducir audio y video|
|**MediaPlayer.create()**|Crear y preparar MediaPlayer desde recurso|
|**start()**|Iniciar/reanudar reproducción|
|**pause()**|Pausar reproducción|
|**stop()**|Detener reproducción completamente|
|**seekTo()**|Ir a posición específica (milisegundos)|
|**getCurrentPosition()**|Obtener posición actual|
|**getDuration()**|Obtener duración total|
|**isPlaying()**|Verificar si está reproduciendo|
|**setLooping()**|Activar/desactivar modo bucle|
|**release()**|Liberar recursos (OBLIGATORIO)|
|**prepareAsync()**|Preparación asíncrona (para URLs)|
|**setOnCompletionListener()**|Evento al terminar|

---

## 🔍 ERRORES COMUNES

```java
// ❌ ERROR 1: No liberar recursos
@Override
protected void onDestroy() {
    super.onDestroy();
    // ❌ Olvidar release() causa memory leak
}

// ✅ CORRECTO:
@Override
protected void onDestroy() {
    super.onDestroy();
    if (mediaPlayer != null) {
        mediaPlayer.release();
        mediaPlayer = null;
    }
}

// ❌ ERROR 2: Llamar métodos sin verificar estado
mediaPlayer.pause();  // ❌ IllegalStateException si no está playing

// ✅ CORRECTO:
if (mediaPlayer != null && mediaPlayer.isPlaying()) {
    mediaPlayer.pause();
}

// ❌ ERROR 3: Usar prepare() con URLs
mediaPlayer.setDataSource(url);
mediaPlayer.prepare();  // ❌ Bloquea UI thread

// ✅ CORRECTO: prepareAsync para URLs
mediaPlayer.setDataSource(url);
mediaPlayer.prepareAsync();
mediaPlayer.setOnPreparedListener(mp -> mp.start());

// ❌ ERROR 4: No detener Handler en onDestroy
// El Handler sigue actualizando UI aunque Activity esté destruida

// ✅ CORRECTO:
@Override
protected void onDestroy() {
    super.onDestroy();
    handler.removeCallbacks(updateSeekBar);
}

// ❌ ERROR 5: Reutilizar MediaPlayer sin reset
mediaPlayer.setDataSource(nuevaCancion);  // ❌ IllegalStateException

// ✅ CORRECTO:
mediaPlayer.reset();
mediaPlayer.setDataSource(nuevaCancion);
mediaPlayer.prepare();
```

---

## 💡 CONSEJOS PROFESIONALES

1. **Siempre libera recursos**:
    
    ```java
    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (mediaPlayer != null) {
            mediaPlayer.release();
            mediaPlayer = null;
        }
    }
    ```
    
2. **Para URLs, usa prepareAsync**:
    
    ```java
    mediaPlayer.prepareAsync();  // No bloquea
    mediaPlayer.setOnPreparedListener(mp -> mp.start());
    ```
    
3. **Pausar en onPause()** para mejor UX:
    
    ```java
    @Override
    protected void onPause() {
        super.onPause();
        if (mediaPlayer != null && mediaPlayer.isPlaying()) {
            mediaPlayer.pause();
            estabaPausado = true;
        }
    }
    ```
    
4. **Gestionar errores**:
    
    ```java
    mediaPlayer.setOnErrorListener((mp, what, extra) -> {
        Log.e("MediaPlayer", "Error: " + what);
        return true;
    });
    ```
    
5. **Para reproducción en segundo plano**, usa un **Service**
    
6. **Formato de tiempo legible**:
    
    ```java
    private String formatearTiempo(int ms) {
        return String.format("%02d:%02d", 
            (ms / 1000) / 60,  // minutos
            (ms / 1000) % 60); // segundos
    }
    ```
    
7. **Evitar memory leaks** con Handler:
    
    ```java
    private static class MiHandler extends Handler {
        private final WeakReference<MainActivity> activityRef;
        
        MiHandler(MainActivity activity) {
            this.activityRef = new WeakReference<>(activity);
        }
    }
    ```
    

---

[🔝 Volver al índice](#-%C3%ADndice-general)

---

📌 **Guardado:** 18/03/2026 - 17:00h  
📌 **Próxima sesión:** Día 18 - VideoView