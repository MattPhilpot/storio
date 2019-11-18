package com.pushtorefresh.storio3.sqlite.operations.put;

import androidx.annotation.NonNull;

class TestItem {
    static final String TABLE = "test_items";

    private TestItem() {

    }

    @NonNull
    static TestItem newInstance() {
        return new TestItem();
    }
}
