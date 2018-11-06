package com.ups.entidades;

import com.ups.entidades.TbUsuario;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-10-08T22:47:49")
@StaticMetamodel(TbRegistroUsuario.class)
public class TbRegistroUsuario_ { 

    public static volatile SingularAttribute<TbRegistroUsuario, Integer> idRegistroUsuario;
    public static volatile SingularAttribute<TbRegistroUsuario, String> cedulaUsuario;
    public static volatile SingularAttribute<TbRegistroUsuario, String> apellidoUsuario;
    public static volatile ListAttribute<TbRegistroUsuario, TbUsuario> tbUsuarioList;
    public static volatile SingularAttribute<TbRegistroUsuario, String> nombreUsuario;
    public static volatile SingularAttribute<TbRegistroUsuario, String> eMail;

}