package com.example.petsapp.data;

import android.provider.BaseColumns;

public final class PetContract {
    private PetContract(){}

    public static final class PetEntry implements BaseColumns{

        public final static String TABLE_NAME = "pets";

        public final static String _ID = "pets";
        public final static String COLUMN_PET_NAME = "pets";
        public final static String COLUMN_PET_BREED = "name";
        public final static String COLUMN_PET_GENDER = "gender";
        public final static String COLUMN_PET_WEIGHT = "weight";

        public static final int GENDER_UNKNOWN = 0;
        public static final int GENDER_MALE = 1;
        public static final int GENDER_FEMALE = 2;

    }

}
