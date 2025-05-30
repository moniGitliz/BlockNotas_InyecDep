//package com.ClaseDI.ClaseDI_AppBlock.repository;
//
//import com.ClaseDI.ClaseDI_AppBlock.model.Nota;
//import org.springframework.stereotype.Repository;
//
//import java.util.ArrayList;
//import java.util.Iterator;
//import java.util.List;
//
//
//@Repository
//public class NotaRepository implements iNotaRepository {
//    private List<Nota> notas = new ArrayList<>();
//
//    public NotaRepository(){
//        notas.add(new Nota(1L,"Estudiar SpringBoot", "Revisar MVC, ID y IoC","30-05-2025"));
//        notas.add(new Nota(2L,"Recordatorio","Comprar comida para mis gatocitas", "28-05-2025"));
//
//    }
//
//
//    @Override
//    public List<Nota> findAll() {
//        return notas;
//    }
//
//    @Override
//    public Nota findById(Long id) {
//        for (Nota nota : notas){
//            if(nota.getId_Nota().equals(id)){
//                return nota;
//            }
//        }
//        return null;
//    }
//
//    @Override
//    public void save(Nota nota) {
//        notas.add(nota);
//
//    }
//
//    @Override
//    public void delete(Long id) {
//        Iterator<Nota> iterator = notas.iterator();
//        while (iterator.hasNext()) {
//            Nota nota = iterator.next();
//            if (nota.getId_Nota().equals(id)) {
//                iterator.remove();
//                break;
//            }
//        }
//
//    }
//}
//
//
//// {
////        "id_Nota": 1,
////        "titulo": "Estudiar SpringBoot",
////        "contenido": "Revisar MVC, ID y IoC"
////    },
////    {
////        "id_Nota": 2,
////        "titulo": "Recordatorio",
////        "contenido": "Comprar comida para mis gatocitas"
////    },
////    {
////        "id_Nota": 4,
////        "titulo": "Receta",
////        "contenido": "Buscar receta para lasaña"
////    }