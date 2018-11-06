package com.ups.entidades;

import com.ups.entidades.TbProduccionPecuario;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-10-08T22:47:48")
@StaticMetamodel(TbAnimalPecuario.class)
public class TbAnimalPecuario_ { 

    public static volatile SingularAttribute<TbAnimalPecuario, Integer> idAnimalPecuario;
    public static volatile SingularAttribute<TbAnimalPecuario, String> nomAnimal;
    public static volatile ListAttribute<TbAnimalPecuario, TbProduccionPecuario> tbProduccionPecuarioList;

}