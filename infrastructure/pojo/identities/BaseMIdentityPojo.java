package com.umldesigner.submodules.UmlDesignerShared.infrastructure.pojo.identities;

import java.util.Objects;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class BaseMIdentityPojo {

    protected String firstUuid;
    protected String secondUuid;

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;

        BaseMIdentityPojo that = (BaseMIdentityPojo) o;

        if (!firstUuid.equals(that.firstUuid))
            return false;
        return secondUuid.equals(that.secondUuid);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstUuid, secondUuid);
    }
}