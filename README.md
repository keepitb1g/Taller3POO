# Taller3POO
Desarrollador: Joaquin Villa
Este programa es un sistema de gestión para un club que organiza actividades deportivas.
Clases:
-Deportistas (Asociación con clase Equipo)
-Entrenador (Asociación con clase Equipo)
-Equipos (Agregación con clase Partido )
-Partido (Asociación con clase Cancha)
-Cancha (Composición con clase Partido)

Atributos:
-Entrenador: nombre, experiecnia y deporte de especialización
-Deportistas: nombre, apellido, contacto y deporte que practica
-Equipo: deportistas(de un mismo tipo de deporte), entrenadorActivo, partidosRegistrado
-Partido: Cancha, fechaPartido, resultadoPartido, Equipos
-Cancha: tipoCancha, ubiCancha, capacidadEspectadores

Este programa ayudara a solucionar la gestión de los partidos
para verificar que cada equipo tenga solo un entrenador activo y la cantidad
de jugadores que se requieren, que la hora reservada para el partido este disponible
y definir cosas como que cancha se ocupará, la ubicación de esta y la cantidad
de espectadores que esta puede alojar.