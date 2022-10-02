package com.umldesigner.submodules.UmlDesignerShared.schema.table_item.dto;

import com.umldesigner.submodules.UmlDesignerShared.infrastructure.pojo.pojos.BasePojo;
import com.umldesigner.submodules.UmlDesignerShared.infrastructure.pojo.utils.MyCloneable;
import com.umldesigner.submodules.UmlDesignerShared.schema.item_info.SItemInfoPojo;
import com.umldesigner.submodules.UmlDesignerShared.schema.table.dto.STablePojo;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class SItemPojo extends BasePojo implements MyCloneable<SItemPojo> {

    protected String type;

    protected String value;

    protected Integer size;
    
    protected SItemInfoPojo itemInfo;

    protected String tableUuid_;

    protected STablePojo table;

    @Override
    public SItemPojo clone() {
        try {
            SItemPojo clone = (SItemPojo) super.clone();
            STablePojo tableData = clone.getTable();
            if (tableData != null) {
                clone.setTable(tableData.clone());
            }

            return clone;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}