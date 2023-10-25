package com.tienda.service;

import com.tienda.domain.Arbol;
import java.util.List;

public interface ArbolService {
    
    // Se obtiene un listado de arbols en un List
    public List<Arbol> getArbol(boolean activos);
    
   // Se obtiene un Arbol, a partir del id de un arbol
    public Arbol getArbol(Arbol arbol);
    
    // Se inserta un nuevo arbol si el id del arbol esta vacío
    // Se actualiza un arbol si el id del arbol NO esta vacío
    public void save(Arbol arbol);
    
    // Se elimina el arbol que tiene el id pasado por parámetro
    public void delete(Arbol arbol);
}
