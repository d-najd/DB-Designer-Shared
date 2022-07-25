package com.umldesigner.submodules.UmlDesignerShared.schema.table_item.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class SItemPojo extends BasePojo {

    // the pojo has no need to know positions
    // private Integer position;

    private String type;

    private String tableUuid_;

    private String value;

    private STablePojo table;

    private Boolean isPrimaryKey = false;

}