package com.ups.entidades;

import com.ups.entidades.TbAnimalPecuario;
import com.ups.entidades.TbFamilia;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-10-08T22:47:48")
@StaticMetamodel(TbProduccionPecuario.class)
public class TbProduccionPecuario_ { 

    public static volatile SingularAttribute<TbProduccionPecuario, Integer> numAnimal;
    public static volatile SingularAttribute<TbProduccionPecuario, TbFamilia> idFamilia;
    public static volatile SingularAttribute<TbProduccionPecuario, TbAnimalPecuario> idAnimalPecuario;
    public static volatile SingularAttribute<TbProduccionPecuario, Date> fechaReg;
    public static volatile SingularAttribute<TbProduccionPecuario, Integer> idProduccionPecuario;

}