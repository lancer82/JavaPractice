package com.thinlk.factory;

import com.thinlk.dao.BaseStudentDao;
import com.thinlk.dao.OtherStudentDao;

public class StudentDatafactory {

    public static BaseStudentDao getStudentDao() {
        return new OtherStudentDao();
    }
}
