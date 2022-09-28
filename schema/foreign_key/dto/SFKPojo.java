package com.umldesigner.submodules.UmlDesignerShared.schema.foreign_key.dto;

import com.umldesigner.submodules.UmlDesignerShared.infrastructure.pojo.pojos.BasePojo;
import com.umldesigner.submodules.UmlDesignerShared.infrastructure.pojo.utils.MyCloneable;
import com.umldesigner.submodules.UmlDesignerShared.schema.item_info.SItemInfoPojo;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @apiNote value1 and value2 in the identity refer to id's of SItems
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class SFKPojo extends BasePojo implements MyCloneable<SFKPojo> {

    protected String referencedUuid;

    protected String onDelete = "ca";

    protected String onUpdate = "ca";

    // protected SItemInfoPojo itemInfo;

    @Override
    public SFKPojo clone() {
        try {
            return (SFKPojo) super.clone();
        } catch (CloneNotSupportedException e){
            throw new AssertionError();
        }
    }
}