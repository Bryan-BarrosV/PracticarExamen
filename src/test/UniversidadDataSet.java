package test;
import models.Carrera;
import models.Estudiante;
import models.Universidad;

public class UniversidadDataSet {

        public static Universidad[] getUniversidades() {
                return new Universidad[] {
                new Universidad("Universidad Alpha", new Carrera[] {
                                                new Carrera("Ingeniería", new Estudiante[] {
                                                                new Estudiante("Ana", true),
                                                                new Estudiante("Luis", false),
                                                                new Estudiante("Sofía", true),
                                                                new Estudiante("Mario", true)
                                                }),
                                                new Carrera("Medicina", new Estudiante[] {
                                                                new Estudiante("Jorge", true),
                                                                new Estudiante("Claudia", false)
                                                }),
                                                new Carrera("Derecho", new Estudiante[] {
                                                                new Estudiante("Felipe", true),
                                                                new Estudiante("Teresa", true),
                                                                new Estudiante("Valeria", false),
                                                                new Estudiante("Javier", true),
                                                                new Estudiante("Martina", true),
                                                                new Estudiante("Emilio", false),
                                                                new Estudiante("Camila", true)
                                                }),
                                                new Carrera("Arquitectura", new Estudiante[] {
                                                                new Estudiante("Nicolás", false),
                                                                new Estudiante("Teresa", true),
                                                                new Estudiante("Ana", true),
                                                                new Estudiante("Luis", false),
                                                                new Estudiante("Sofía", true),
                                                                new Estudiante("Mario", true)

                                                })
                                }),

                                new Universidad("Universidad Beta", new Carrera[] {
                                                new Carrera("Ciencias", new Estudiante[] {
                                                                new Estudiante("Elena", true),
                                                                new Estudiante("Lucas", true),
                                                                new Estudiante("Gabriela", false)
                                                }),
                                                new Carrera("Artes", new Estudiante[] {
                                                                new Estudiante("Andrés", true),
                                                                new Estudiante("Diana", true)
                                                }),
                                                new Carrera("Filosofía", new Estudiante[] {
                                                                new Estudiante("Camilo", false)
                                                }),
                                                new Carrera("Psicología", new Estudiante[] {
                                                                new Estudiante("Natalia", true),
                                                                new Estudiante("Bruno", false)
                                                }),
                                                new Carrera("Biología", new Estudiante[] {
                                                                new Estudiante("Patricia", true)
                                                })
                                }),

                                new Universidad("Universidad Gamma", new Carrera[] {
                                                new Carrera("Administración", new Estudiante[] {
                                                                new Estudiante("Carlos", true),
                                                                new Estudiante("Lorena", true)
                                                }),
                                                new Carrera("Economía", new Estudiante[] {
                                                                new Estudiante("Iván", false),
                                                                new Estudiante("Daniela", true)
                                                }),
                                                new Carrera("Contabilidad", new Estudiante[] {
                                                                new Estudiante("Verónica", true),
                                                                new Estudiante("Paula", true),
                                                                new Estudiante("Sergio", true),
                                                                new Estudiante("Luciana", false),
                                                                new Estudiante("Joaquín", true),
                                                                new Estudiante("Mónica", false),
                                                                new Estudiante("Gabriel", false),
                                                                new Estudiante("Fernanda", false)
                                                }),
                                                new Carrera("Marketing", new Estudiante[] {
                                                                new Estudiante("Marco", false),
                                                                new Estudiante("Lucía", false)
                                                })
                                }),

                                new Universidad("Universidad Delta", new Carrera[] {
                                                new Carrera("Informática", new Estudiante[] {
                                                                new Estudiante("Thiago", true),
                                                                new Estudiante("Ángela", false)
                                                }),
                                                new Carrera("Robótica", new Estudiante[] {
                                                                new Estudiante("Fabián", true),
                                                                new Estudiante("Pablo", true),
                                                                new Estudiante("Andrea", false)
                                                }),
                                                new Carrera("Astronomía", new Estudiante[] {
                                                                new Estudiante("Marta", true)
                                                }),
                                                new Carrera("Geología", new Estudiante[] {
                                                                new Estudiante("David", true),
                                                                new Estudiante("Karina", true)
                                                }),
                                                new Carrera("Estadística", new Estudiante[] {
                                                                new Estudiante("Álvaro", false),
                                                                new Estudiante("Gabriel", true),
                                                                new Estudiante("Renata", false),
                                                                new Estudiante("Tomás", true),
                                                                new Estudiante("Julieta", true),
                                                                new Estudiante("Santiago", false),
                                                                new Estudiante("Valeria", true),
                                                                new Estudiante("Emilia", false),
                                                                new Estudiante("Mateo", true)
                                                }),
                                                new Carrera("Mecatrónica", new Estudiante[] {
                                                                new Estudiante("Esteban", true)
                                                })
                                }),

                                new Universidad("Universidad Epsilon", new Carrera[] {
                                                new Carrera("Lingüística", new Estudiante[] {
                                                                new Estudiante("Luisa", true),
                                                                new Estudiante("Ximena", false)
                                                }),
                                                new Carrera("Educación", new Estudiante[] {
                                                                new Estudiante("Valentina", true),
                                                                new Estudiante("Martín", false),
                                                                new Estudiante("Paula", true),
                                                                new Estudiante("Sergio", true),
                                                                new Estudiante("Luciana", false),
                                                                new Estudiante("Joaquín", true),
                                                                new Estudiante("Mónica", true),
                                                                new Estudiante("Gabriel", false),
                                                                new Estudiante("Fernanda", true)
                                                }),
                                                new Carrera("Sociología", new Estudiante[] {
                                                                new Estudiante("Hugo", false),
                                                                new Estudiante("Raúl", false)
                                                }),
                                                new Carrera("Historia", new Estudiante[] {
                                                                new Estudiante("Cristina", true)
                                                }),
                                                new Carrera("Trabajo Social", new Estudiante[] {
                                                                new Estudiante("Ángel", false),
                                                                new Estudiante("Isabel", true)
                                                }),
                                                new Carrera("Antropología", new Estudiante[] {
                                                                new Estudiante("Benjamín", true)
                                                }),
                                                new Carrera("Literatura", new Estudiante[] {
                                                                new Estudiante("Rosa", true),
                                                                new Estudiante("Emilio", false),
                                                                new Estudiante("Paula", true),
                                                                new Estudiante("Sergio", true),
                                                                new Estudiante("Luciana", false),
                                                                new Estudiante("Joaquín", true),
                                                                new Estudiante("Mónica", true),
                                                                new Estudiante("Gabriel", false),
                                                                new Estudiante("Fernanda", true)
                                                })
                                })
                };
        }
}
