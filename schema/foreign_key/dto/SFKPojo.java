package com.umldesigner.submodules.UmlDesignerShared.schema.foreign_key.dto;

import com.umldesigner.submodules.UmlDesignerShared.infrastructure.pojo.pojos.BaseMPojo;

import com.umldesigner.submodules.UmlDesignerShared.infrastructure.pojo.utils.MyCloneable;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
/**
 * @apiNote value1 and value2 in the identity refer to id's of SItems
 */
public class SFKPojo extends BaseMPojo implements MyCloneable<SFKPojo> {

    protected String firstTableUuid;
    
    protected String secondTableUuid;

    protected String onDelete = "ca";

    protected String onUpdate = "ca";

    @Override
    public SFKPojo clone() {
        try {
            return (SFKPojo) super.clone();
        } catch (CloneNotSupportedException e){
            throw new AssertionError();
        }
    }
}