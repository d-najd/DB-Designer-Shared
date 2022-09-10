package com.umldesigner.submodules.UmlDesignerShared.schema.table.dto;

import com.umldesigner.submodules.UmlDesignerShared.infrastructure.pojo.pojos.UmlObjectPojo;
import com.umldesigner.submodules.UmlDesignerShared.infrastructure.pojo.utils.MyCloneable;
import com.umldesigner.submodules.UmlDesignerShared.schema.table_item.dto.SItemPojo;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.ArrayList;
import java.util.List;

@Data
@EqualsAndHashCode(callSuper = true)
public class STablePojo extends UmlObjectPojo implements MyCloneable<STablePojo> {

    protected String title;

    protected List<? extends SItemPojo> items = new ArrayList<>();

    @Override
    public STablePojo clone() {
        try {
            STablePojo clone = (STablePojo) super.clone();

            // ? extends ... means that it F****** EXTENDS IT WHICH MEANS IT'S INSTANCE OF IT SHUT THE F*** UP
            @SuppressWarnings("unchecked")
            List<SItemPojo> items1 = (List<SItemPojo>) clone.getItems();
            List<SItemPojo> clonedItems = new ArrayList<>();

            for (SItemPojo item : items1) {
                //TODO Umm EXCUSE ME the table is set to null yet it is not? what? the hell?

                item.setTable(null);
                if(item.getTable() != null){
                    item = item;
                }

                SItemPojo clonedItem = item.clone();

                clonedItem.setTable(clone);
                item.setTable(clone);

                clonedItems.add(clonedItem);
            }
            clone.setItems(clonedItems);
            
            return clone;
        } catch (CloneNotSupportedException e){
            throw new AssertionError();
        }
    }
}