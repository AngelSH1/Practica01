
package com.tienda.dao;
import com.tienda.domain.Arbol;
import org.springframework.data.jpa.repository.JpaRepository;
////trallendonos la info de la clase arbol
///
public interface ArbolDao extends JpaRepository <Arbol, Long>{
    
}
