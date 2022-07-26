package com.umldesigner.submodules.UmlDesignerShared.infrastructure.pojo.pojos;

import lombok.Getter;
import lombok.Setter;

/*
 * @implNote this is used for uml objects that can be moved around in the
 * diagram
 */
@Getter
@Setter
public abstract class UmlObjectPojo extends BasePojo {
    protected Float x;
    protected Float y;
}