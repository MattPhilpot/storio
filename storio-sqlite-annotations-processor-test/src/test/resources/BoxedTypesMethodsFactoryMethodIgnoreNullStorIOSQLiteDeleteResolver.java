package com.pushtorefresh.storio3.sqlite.annotations;

import androidx.annotation.NonNull;
import com.pushtorefresh.storio3.sqlite.operations.delete.DefaultDeleteResolver;
import com.pushtorefresh.storio3.sqlite.queries.DeleteQuery;
import java.lang.Override;

/**
 * Generated resolver for Delete Operation.
 */
public class BoxedTypesMethodsFactoryMethodIgnoreNullStorIOSQLiteDeleteResolver extends DefaultDeleteResolver<BoxedTypesMethodsFactoryMethodIgnoreNull> {
    /**
     * {@inheritDoc}
     */
    @Override
    @NonNull
    public DeleteQuery mapToDeleteQuery(@NonNull BoxedTypesMethodsFactoryMethodIgnoreNull object) {
        return DeleteQuery.builder()
            .table("table")
            .where("field4 = ?")
            .whereArgs(object.getField4())
            .build();
    }
}