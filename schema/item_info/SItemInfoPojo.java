package com.umldesigner.submodules.UmlDesignerShared.schema.item_info;

import java.util.Set;

import com.umldesigner.submodules.UmlDesignerShared.infrastructure.pojo.pojos.BasePojo;
import com.umldesigner.submodules.UmlDesignerShared.infrastructure.pojo.utils.MyCloneable;
import com.umldesigner.submodules.UmlDesignerShared.schema.foreign_key.dto.SFKPojo;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
public class SItemInfoPojo extends BasePojo implements MyCloneable<SItemInfoPojo> {

    protected Boolean primaryKey;

    protected Boolean allowNull;

    protected Boolean uniqueKey;

    protected Boolean autoIncrement;

    protected Boolean unsigned;

    protected SFKPojo foreignKey;

    protected Set<SFKPojo> referencedForeignKeys;

    // protected SItemPojo item;

    @Override
    public SItemInfoPojo clone() {
        try {
            return (SItemInfoPojo) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
