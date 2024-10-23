# Taller3POO
Desarrollador: Joaquin Villa
Este programa es un sistema de gestión para un club que organiza actividades deportivas.
Clases: 
-Club (Agregación con clase Deporte, Equipos)
-Deporte (Asociación con clase Partido)
-Deportistas (Composición con clase Equipo)
-Entrenador (Composicion con clase Equipo)
-Equipos (Relacion con clase deportista: Composición)
-Partido (Composicion con clase Cancha, Equipos)
-Cancha (Asociacion con clase Partido)

Atributos:
-Club: Deportes, equipos y tipo de partidos, nombre del club
-Deporte: nombreDeporte
-Entrenador: nombre, experiecnia y deporte de especialización
-Deportistas: nombre, apellido, contacto y deporte que practica
-Equipo: deportistas(de un mismo tipo de deporte), entrenadorActivo
-Partido: Cancha, fechaPartido, resultadoPartido, Equipos
-Cancha: tipoCancha, ubiCancha, capacidadEspectadores

Este programa ayudara a solucionar la gestión de los partidos
para verificar que cada equipo tenga solo un entrenador activo y la cantidad
de jugadores que se requieren, que la hora reservada para el partido este disponible
y definir cosas como que cancha se ocupará, la ubicación de esta y la cantidad
de espectadores que esta puede alojar.